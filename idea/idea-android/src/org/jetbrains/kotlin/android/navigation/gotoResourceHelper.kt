/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.android.navigation

import org.jetbrains.android.util.AndroidResourceUtil
import com.intellij.psi.PsiElement
import org.jetbrains.android.facet.AndroidFacet
import org.jetbrains.kotlin.psi.KtSimpleNameExpression
import com.intellij.psi.util.PsiTreeUtil
import com.intellij.psi.PsiClass
import org.jetbrains.android.util.AndroidUtils
import com.android.SdkConstants
import com.intellij.openapi.module.ModuleUtil
import org.jetbrains.android.augment.AndroidPsiElementFinder
import org.jetbrains.kotlin.idea.references.mainReference
import org.jetbrains.kotlin.psi.KtDotQualifiedExpression
import org.jetbrains.kotlin.psi.psiUtil.getReceiverExpression
import org.jetbrains.kotlin.psi.KtExpression

fun getReferenceExpression(element: PsiElement?): KtSimpleNameExpression? {
    return PsiTreeUtil.getParentOfType<KtSimpleNameExpression>(element, KtSimpleNameExpression::class.java)
}

// given 'R.a.b' returns info for all three parts of the expression 'a', 'b', 'R'
fun getInfo(
    referenceExpression: KtSimpleNameExpression,
    facet: AndroidFacet
): AndroidResourceUtil.MyReferredResourceFieldInfo? {
    val info = getReferredInfo(referenceExpression, facet)
    if (info != null) return info

    val topMostQualified = referenceExpression.getParentQualified().getParentQualified() ?: return null
    val selectorCandidate = topMostQualified.selectorExpression as? KtSimpleNameExpression ?: return null
    return getReferredInfo(selectorCandidate, facet)
}

private fun KtExpression?.getParentQualified(): KtDotQualifiedExpression? {
    return this?.parent as? KtDotQualifiedExpression
}

// returns info if passed expression is 'b' in 'R.a.b'
private fun getReferredInfo(
    lastPart: KtSimpleNameExpression,
    facet: AndroidFacet
): AndroidResourceUtil.MyReferredResourceFieldInfo? {
    val resFieldName = lastPart.getReferencedName()
    if (resFieldName.isEmpty()) return null

    val middlePart = getReceiverAsSimpleNameExpression(lastPart) ?: return null

    val resClassName = middlePart.getReferencedName()
    if (resClassName.isEmpty()) return null

    val firstPart = getReceiverAsSimpleNameExpression(middlePart) ?: return null

    val resolvedClass = firstPart.mainReference.resolve() as? PsiClass ?: return null
    val resolvedModule = ModuleUtil.findModuleForPsiElement(resolvedClass)

    //the following code is copied from
    // org.jetbrains.android.util.AndroidResourceUtil.getReferredResourceOrManifestField
    // (org.jetbrains.android.facet.AndroidFacet, com.intellij.psi.PsiReferenceExpression, java.lang.String, boolean)
    val classShortName = resolvedClass.name

    val fromManifest = AndroidUtils.MANIFEST_CLASS_NAME == classShortName

    if (!fromManifest && AndroidUtils.R_CLASS_NAME != classShortName) {
        return null
    }
    val qName = resolvedClass.qualifiedName

    if (SdkConstants.CLASS_R == qName || AndroidPsiElementFinder.INTERNAL_R_CLASS_QNAME == qName) {
        return AndroidResourceUtil.MyReferredResourceFieldInfo(resClassName, resFieldName, resolvedModule, true, false)
    }
    val containingFile = resolvedClass.containingFile ?: return null

    val isFromCorrectFile = if (fromManifest)
        AndroidResourceUtil.isManifestJavaFile(facet, containingFile)
    else
        AndroidResourceUtil.isRJavaFile(facet, containingFile)

    if (!isFromCorrectFile) {
        return null
    }

    return AndroidResourceUtil.MyReferredResourceFieldInfo(resClassName, resFieldName, resolvedModule, false, fromManifest)
}

private fun getReceiverAsSimpleNameExpression(exp: KtSimpleNameExpression): KtSimpleNameExpression? =
    when (val receiver = exp.getReceiverExpression()) {
        is KtSimpleNameExpression -> {
            receiver
        }
        is KtDotQualifiedExpression -> {
            receiver.selectorExpression as? KtSimpleNameExpression
        }
        else -> null
    }
