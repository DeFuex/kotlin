/*
 * Copyright 2010-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.idea.inspections.collections

import com.intellij.codeInspection.LocalQuickFix
import com.intellij.codeInspection.ProblemDescriptor
import com.intellij.openapi.project.Project
import org.jetbrains.kotlin.idea.core.ShortenReferences
import org.jetbrains.kotlin.idea.core.replaced
import org.jetbrains.kotlin.name.Name
import org.jetbrains.kotlin.psi.*
import org.jetbrains.kotlin.psi.psiUtil.PsiChildRange

class SimplifyCallChainFix(private val newCallText: String) : LocalQuickFix {
    private val shortenedText = newCallText.split("(").joinToString(separator = "(") {
        it.substringAfterLast(".")
    }

    override fun getName() = "Merge call chain to '$shortenedText'"

    override fun getFamilyName() = name

    private fun apply(secondQualifiedExpression: KtQualifiedExpression) {
        val factory = KtPsiFactory(secondQualifiedExpression)
        val firstExpression = secondQualifiedExpression.receiverExpression

        val operationSign = when (firstExpression) {
            is KtSafeQualifiedExpression -> "?."
            is KtQualifiedExpression -> "."
            else -> ""
        }

        val receiverExpression = (firstExpression as? KtQualifiedExpression)?.receiverExpression

        val firstCallExpression = AbstractCallChainChecker.getCallExpression(firstExpression) ?: return
        val secondCallExpression = secondQualifiedExpression.selectorExpression as? KtCallExpression ?: return

        val lastArgumentName = if (newCallText.startsWith("joinTo")) Name.identifier("transform") else null
        if (lastArgumentName != null) {
            val lastArgument = firstCallExpression.valueArgumentList?.arguments?.singleOrNull()
            val argumentExpression = lastArgument?.getArgumentExpression()
            if (argumentExpression != null) {
                lastArgument.replace(factory.createArgument(argumentExpression, lastArgumentName))
            }
        }
        val firstCallArgumentList = firstCallExpression.valueArgumentList
        val secondCallArgumentList = secondCallExpression.valueArgumentList

        fun KtValueArgumentList.getTextInsideParentheses(): String {
            val range = PsiChildRange(leftParenthesis?.nextSibling ?: firstChild, rightParenthesis?.prevSibling ?: lastChild)
            return range.joinToString(separator = "") { it.text }
        }

        val lambdaExpression = firstCallExpression.lambdaArguments.singleOrNull()?.getLambdaExpression()
        val argumentsText = listOfNotNull(
            secondCallArgumentList.takeIf { it?.arguments?.isNotEmpty() == true },
            firstCallArgumentList.takeIf { it?.arguments?.isNotEmpty() == true }
        ).let {
            if (it.isEmpty()) ""
            else it.joinToString(
                separator = ", ",
                prefix = "(",
                postfix = ")"
            ) { callArgumentList ->
                callArgumentList.getTextInsideParentheses()
            }
        }

        val newQualifiedExpression = if (lambdaExpression != null) factory.createExpressionByPattern(
            "$0$1$2 $3 $4",
            receiverExpression ?: "",
            operationSign,
            newCallText,
            argumentsText,
            lambdaExpression.text
        )
        else factory.createExpressionByPattern(
            "$0$1$2 $3",
            receiverExpression ?: "",
            operationSign,
            newCallText,
            argumentsText
        )

        val result = secondQualifiedExpression.replaced(newQualifiedExpression)
        ShortenReferences.DEFAULT.process(result)
    }

    override fun applyFix(project: Project, descriptor: ProblemDescriptor) {
        (descriptor.psiElement as? KtQualifiedExpression)?.let(this::apply)
    }
}