/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.codegen.debugInformation;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/debug/stepping")
@TestDataPath("$PROJECT_ROOT")
@RunWith(BlockJUnit4ClassRunner.class)
public class SteppingTestGenerated extends AbstractSteppingTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM, testDataFilePath);
    }

    @Test
    public void testAllFilesPresentInStepping() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/debug/stepping"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM, true);
    }

    @Test
    @TestMetadata("anonymousFunction.kt")
    public void testAnonymousFunction() throws Exception {
        runTest("compiler/testData/debug/stepping/anonymousFunction.kt");
    }

    @Test
    @TestMetadata("assertion.kt")
    public void testAssertion() throws Exception {
        runTest("compiler/testData/debug/stepping/assertion.kt");
    }

    @Test
    @TestMetadata("beforeGotoToWhileStart.kt")
    public void testBeforeGotoToWhileStart() throws Exception {
        runTest("compiler/testData/debug/stepping/beforeGotoToWhileStart.kt");
    }

    @Test
    @TestMetadata("callWithCallInArguments.kt")
    public void testCallWithCallInArguments() throws Exception {
        runTest("compiler/testData/debug/stepping/callWithCallInArguments.kt");
    }

    @Test
    @TestMetadata("callWithReceiver.kt")
    public void testCallWithReceiver() throws Exception {
        runTest("compiler/testData/debug/stepping/callWithReceiver.kt");
    }

    @Test
    @TestMetadata("callableReference.kt")
    public void testCallableReference() throws Exception {
        runTest("compiler/testData/debug/stepping/callableReference.kt");
    }

    @Test
    @TestMetadata("chainCall.kt")
    public void testChainCall() throws Exception {
        runTest("compiler/testData/debug/stepping/chainCall.kt");
    }

    @Test
    @TestMetadata("class.kt")
    public void testClass() throws Exception {
        runTest("compiler/testData/debug/stepping/class.kt");
    }

    @Test
    @TestMetadata("classObject.kt")
    public void testClassObject() throws Exception {
        runTest("compiler/testData/debug/stepping/classObject.kt");
    }

    @Test
    @TestMetadata("compileTimeConstant.kt")
    public void testCompileTimeConstant() throws Exception {
        runTest("compiler/testData/debug/stepping/compileTimeConstant.kt");
    }

    @Test
    @TestMetadata("conjunction.kt")
    public void testConjunction() throws Exception {
        runTest("compiler/testData/debug/stepping/conjunction.kt");
    }

    @Test
    @TestMetadata("constructorCall.kt")
    public void testConstructorCall() throws Exception {
        runTest("compiler/testData/debug/stepping/constructorCall.kt");
    }

    @Test
    @TestMetadata("constructors.kt")
    public void testConstructors() throws Exception {
        runTest("compiler/testData/debug/stepping/constructors.kt");
    }

    @Test
    @TestMetadata("defaultParameter.kt")
    public void testDefaultParameter() throws Exception {
        runTest("compiler/testData/debug/stepping/defaultParameter.kt");
    }

    @Test
    @TestMetadata("enum.kt")
    public void testEnum() throws Exception {
        runTest("compiler/testData/debug/stepping/enum.kt");
    }

    @Test
    @TestMetadata("for.kt")
    public void testFor() throws Exception {
        runTest("compiler/testData/debug/stepping/for.kt");
    }

    @Test
    @TestMetadata("functionCallWithDefault.kt")
    public void testFunctionCallWithDefault() throws Exception {
        runTest("compiler/testData/debug/stepping/functionCallWithDefault.kt");
    }

    @Test
    @TestMetadata("functionCallWithInlinedLambdaParam.kt")
    public void testFunctionCallWithInlinedLambdaParam() throws Exception {
        runTest("compiler/testData/debug/stepping/functionCallWithInlinedLambdaParam.kt");
    }

    @Test
    @TestMetadata("functionCallWithLambdaParam.kt")
    public void testFunctionCallWithLambdaParam() throws Exception {
        runTest("compiler/testData/debug/stepping/functionCallWithLambdaParam.kt");
    }

    @Test
    @TestMetadata("functionInAnotherFile.kt")
    public void testFunctionInAnotherFile() throws Exception {
        runTest("compiler/testData/debug/stepping/functionInAnotherFile.kt");
    }

    @Test
    @TestMetadata("if.kt")
    public void testIf() throws Exception {
        runTest("compiler/testData/debug/stepping/if.kt");
    }

    @Test
    @TestMetadata("if2.kt")
    public void testIf2() throws Exception {
        runTest("compiler/testData/debug/stepping/if2.kt");
    }

    @Test
    @TestMetadata("ifThen.kt")
    public void testIfThen() throws Exception {
        runTest("compiler/testData/debug/stepping/ifThen.kt");
    }

    @Test
    @TestMetadata("ifThenElse.kt")
    public void testIfThenElse() throws Exception {
        runTest("compiler/testData/debug/stepping/ifThenElse.kt");
    }

    @Test
    @TestMetadata("ifThenElseFalse.kt")
    public void testIfThenElseFalse() throws Exception {
        runTest("compiler/testData/debug/stepping/ifThenElseFalse.kt");
    }

    @Test
    @TestMetadata("IfTrueThenFalse.kt")
    public void testIfTrueThenFalse() throws Exception {
        runTest("compiler/testData/debug/stepping/IfTrueThenFalse.kt");
    }

    @Test
    @TestMetadata("ifWithInlineInCondition.kt")
    public void testIfWithInlineInCondition() throws Exception {
        runTest("compiler/testData/debug/stepping/ifWithInlineInCondition.kt");
    }

    @Test
    @TestMetadata("iincStepping.kt")
    public void testIincStepping() throws Exception {
        runTest("compiler/testData/debug/stepping/iincStepping.kt");
    }

    @Test
    @TestMetadata("inTheEndOfLambdaArgumentOfInlineCall.kt")
    public void testInTheEndOfLambdaArgumentOfInlineCall() throws Exception {
        runTest("compiler/testData/debug/stepping/inTheEndOfLambdaArgumentOfInlineCall.kt");
    }

    @Test
    @TestMetadata("initBlocks.kt")
    public void testInitBlocks() throws Exception {
        runTest("compiler/testData/debug/stepping/initBlocks.kt");
    }

    @Test
    @TestMetadata("initBlocksCompanion.kt")
    public void testInitBlocksCompanion() throws Exception {
        runTest("compiler/testData/debug/stepping/initBlocksCompanion.kt");
    }

    @Test
    @TestMetadata("inlineCallableReference.kt")
    public void testInlineCallableReference() throws Exception {
        runTest("compiler/testData/debug/stepping/inlineCallableReference.kt");
    }

    @Test
    @TestMetadata("inlineNamedCallableReference.kt")
    public void testInlineNamedCallableReference() throws Exception {
        runTest("compiler/testData/debug/stepping/inlineNamedCallableReference.kt");
    }

    @Test
    @TestMetadata("inlineSimpleCall.kt")
    public void testInlineSimpleCall() throws Exception {
        runTest("compiler/testData/debug/stepping/inlineSimpleCall.kt");
    }

    @Test
    @TestMetadata("lambdaStepInline.kt")
    public void testLambdaStepInline() throws Exception {
        runTest("compiler/testData/debug/stepping/lambdaStepInline.kt");
    }

    @Test
    @TestMetadata("lambdaStepInlineWithDefaults.kt")
    public void testLambdaStepInlineWithDefaults() throws Exception {
        runTest("compiler/testData/debug/stepping/lambdaStepInlineWithDefaults.kt");
    }

    @Test
    @TestMetadata("lineNumberAfterInline.kt")
    public void testLineNumberAfterInline() throws Exception {
        runTest("compiler/testData/debug/stepping/lineNumberAfterInline.kt");
    }

    @Test
    @TestMetadata("localFunction.kt")
    public void testLocalFunction() throws Exception {
        runTest("compiler/testData/debug/stepping/localFunction.kt");
    }

    @Test
    @TestMetadata("multilineFunctionCall.kt")
    public void testMultilineFunctionCall() throws Exception {
        runTest("compiler/testData/debug/stepping/multilineFunctionCall.kt");
    }

    @Test
    @TestMetadata("multilineInfixCall.kt")
    public void testMultilineInfixCall() throws Exception {
        runTest("compiler/testData/debug/stepping/multilineInfixCall.kt");
    }

    @Test
    @TestMetadata("namedCallableReference.kt")
    public void testNamedCallableReference() throws Exception {
        runTest("compiler/testData/debug/stepping/namedCallableReference.kt");
    }

    @Test
    @TestMetadata("nestedInline.kt")
    public void testNestedInline() throws Exception {
        runTest("compiler/testData/debug/stepping/nestedInline.kt");
    }

    @Test
    @TestMetadata("noParametersArgumentCallInExpression.kt")
    public void testNoParametersArgumentCallInExpression() throws Exception {
        runTest("compiler/testData/debug/stepping/noParametersArgumentCallInExpression.kt");
    }

    @Test
    @TestMetadata("primitiveNullChecks.kt")
    public void testPrimitiveNullChecks() throws Exception {
        runTest("compiler/testData/debug/stepping/primitiveNullChecks.kt");
    }

    @Test
    @TestMetadata("propertyAccessor.kt")
    public void testPropertyAccessor() throws Exception {
        runTest("compiler/testData/debug/stepping/propertyAccessor.kt");
    }

    @Test
    @TestMetadata("psvm.kt")
    public void testPsvm() throws Exception {
        runTest("compiler/testData/debug/stepping/psvm.kt");
    }

    @Test
    @TestMetadata("recursion.kt")
    public void testRecursion() throws Exception {
        runTest("compiler/testData/debug/stepping/recursion.kt");
    }

    @Test
    @TestMetadata("simpleDefaultArg.kt")
    public void testSimpleDefaultArg() throws Exception {
        runTest("compiler/testData/debug/stepping/simpleDefaultArg.kt");
    }

    @Test
    @TestMetadata("simpleDefaultArgWithInline.kt")
    public void testSimpleDefaultArgWithInline() throws Exception {
        runTest("compiler/testData/debug/stepping/simpleDefaultArgWithInline.kt");
    }

    @Test
    @TestMetadata("simpleInlineDefaultArg.kt")
    public void testSimpleInlineDefaultArg() throws Exception {
        runTest("compiler/testData/debug/stepping/simpleInlineDefaultArg.kt");
    }

    @Test
    @TestMetadata("simpleSmap.kt")
    public void testSimpleSmap() throws Exception {
        runTest("compiler/testData/debug/stepping/simpleSmap.kt");
    }

    @Test
    @TestMetadata("smapInlineAsArgument.kt")
    public void testSmapInlineAsArgument() throws Exception {
        runTest("compiler/testData/debug/stepping/smapInlineAsArgument.kt");
    }

    @Test
    @TestMetadata("smapInlineAsInfixArgument.kt")
    public void testSmapInlineAsInfixArgument() throws Exception {
        runTest("compiler/testData/debug/stepping/smapInlineAsInfixArgument.kt");
    }

    @Test
    @TestMetadata("smapInlineAsInlineArgument.kt")
    public void testSmapInlineAsInlineArgument() throws Exception {
        runTest("compiler/testData/debug/stepping/smapInlineAsInlineArgument.kt");
    }

    @Test
    @TestMetadata("smapInlineInIntrinsicArgument.kt")
    public void testSmapInlineInIntrinsicArgument() throws Exception {
        runTest("compiler/testData/debug/stepping/smapInlineInIntrinsicArgument.kt");
    }

    @Test
    @TestMetadata("stringSwitches.kt")
    public void testStringSwitches() throws Exception {
        runTest("compiler/testData/debug/stepping/stringSwitches.kt");
    }

    @Test
    @TestMetadata("stringSwitchesSmall.kt")
    public void testStringSwitchesSmall() throws Exception {
        runTest("compiler/testData/debug/stepping/stringSwitchesSmall.kt");
    }

    @Test
    @TestMetadata("throwException.kt")
    public void testThrowException() throws Exception {
        runTest("compiler/testData/debug/stepping/throwException.kt");
    }

    @Test
    @TestMetadata("topLevel.kt")
    public void testTopLevel() throws Exception {
        runTest("compiler/testData/debug/stepping/topLevel.kt");
    }

    @Test
    @TestMetadata("trait.kt")
    public void testTrait() throws Exception {
        runTest("compiler/testData/debug/stepping/trait.kt");
    }

    @Test
    @TestMetadata("tryCatch.kt")
    public void testTryCatch() throws Exception {
        runTest("compiler/testData/debug/stepping/tryCatch.kt");
    }

    @Test
    @TestMetadata("tryCatchExpression.kt")
    public void testTryCatchExpression() throws Exception {
        runTest("compiler/testData/debug/stepping/tryCatchExpression.kt");
    }

    @Test
    @TestMetadata("tryCatchFinally.kt")
    public void testTryCatchFinally() throws Exception {
        runTest("compiler/testData/debug/stepping/tryCatchFinally.kt");
    }

    @Test
    @TestMetadata("tryFinally.kt")
    public void testTryFinally() throws Exception {
        runTest("compiler/testData/debug/stepping/tryFinally.kt");
    }

    @Test
    @TestMetadata("variablesWithoutInitializer.kt")
    public void testVariablesWithoutInitializer() throws Exception {
        runTest("compiler/testData/debug/stepping/variablesWithoutInitializer.kt");
    }

    @Test
    @TestMetadata("voidLambdaStepInline.kt")
    public void testVoidLambdaStepInline() throws Exception {
        runTest("compiler/testData/debug/stepping/voidLambdaStepInline.kt");
    }

    @Test
    @TestMetadata("when.kt")
    public void testWhen() throws Exception {
        runTest("compiler/testData/debug/stepping/when.kt");
    }

    @Test
    @TestMetadata("whenComplicatedSubject.kt")
    public void testWhenComplicatedSubject() throws Exception {
        runTest("compiler/testData/debug/stepping/whenComplicatedSubject.kt");
    }

    @Test
    @TestMetadata("whenConstant.kt")
    public void testWhenConstant() throws Exception {
        runTest("compiler/testData/debug/stepping/whenConstant.kt");
    }

    @Test
    @TestMetadata("whenIsChecks.kt")
    public void testWhenIsChecks() throws Exception {
        runTest("compiler/testData/debug/stepping/whenIsChecks.kt");
    }

    @Test
    @TestMetadata("whenMultiLine.kt")
    public void testWhenMultiLine() throws Exception {
        runTest("compiler/testData/debug/stepping/whenMultiLine.kt");
    }

    @Test
    @TestMetadata("whenMultiLineSubject.kt")
    public void testWhenMultiLineSubject() throws Exception {
        runTest("compiler/testData/debug/stepping/whenMultiLineSubject.kt");
    }

    @Test
    @TestMetadata("whenNullalbeSubject.kt")
    public void testWhenNullalbeSubject() throws Exception {
        runTest("compiler/testData/debug/stepping/whenNullalbeSubject.kt");
    }

    @Test
    @TestMetadata("whenSubject.kt")
    public void testWhenSubject() throws Exception {
        runTest("compiler/testData/debug/stepping/whenSubject.kt");
    }

    @Test
    @TestMetadata("whenSubject2.kt")
    public void testWhenSubject2() throws Exception {
        runTest("compiler/testData/debug/stepping/whenSubject2.kt");
    }

    @Test
    @TestMetadata("whenWithInlineInCondition.kt")
    public void testWhenWithInlineInCondition() throws Exception {
        runTest("compiler/testData/debug/stepping/whenWithInlineInCondition.kt");
    }

    @Test
    @TestMetadata("while.kt")
    public void testWhile() throws Exception {
        runTest("compiler/testData/debug/stepping/while.kt");
    }
}
