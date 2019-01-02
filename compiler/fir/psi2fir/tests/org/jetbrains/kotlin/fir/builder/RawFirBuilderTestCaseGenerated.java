/*
 * Copyright 2010-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.builder;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/fir/psi2fir/testData/rawBuilder")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class RawFirBuilderTestCaseGenerated extends AbstractRawFirBuilderTestCase {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doRawFirTest, TargetBackend.ANY, testDataFilePath);
    }

    public void testAllFilesPresentInRawBuilder() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/fir/psi2fir/testData/rawBuilder"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("compiler/fir/psi2fir/testData/rawBuilder/declarations")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Declarations extends AbstractRawFirBuilderTestCase {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doRawFirTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInDeclarations() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/fir/psi2fir/testData/rawBuilder/declarations"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("complexTypes.kt")
        public void testComplexTypes() throws Exception {
            runTest("compiler/fir/psi2fir/testData/rawBuilder/declarations/complexTypes.kt");
        }

        @TestMetadata("derivedClass.kt")
        public void testDerivedClass() throws Exception {
            runTest("compiler/fir/psi2fir/testData/rawBuilder/declarations/derivedClass.kt");
        }

        @TestMetadata("enums.kt")
        public void testEnums() throws Exception {
            runTest("compiler/fir/psi2fir/testData/rawBuilder/declarations/enums.kt");
        }

        @TestMetadata("enums2.kt")
        public void testEnums2() throws Exception {
            runTest("compiler/fir/psi2fir/testData/rawBuilder/declarations/enums2.kt");
        }

        @TestMetadata("expectActual.kt")
        public void testExpectActual() throws Exception {
            runTest("compiler/fir/psi2fir/testData/rawBuilder/declarations/expectActual.kt");
        }

        @TestMetadata("F.kt")
        public void testF() throws Exception {
            runTest("compiler/fir/psi2fir/testData/rawBuilder/declarations/F.kt");
        }

        @TestMetadata("functionTypes.kt")
        public void testFunctionTypes() throws Exception {
            runTest("compiler/fir/psi2fir/testData/rawBuilder/declarations/functionTypes.kt");
        }

        @TestMetadata("genericFunctions.kt")
        public void testGenericFunctions() throws Exception {
            runTest("compiler/fir/psi2fir/testData/rawBuilder/declarations/genericFunctions.kt");
        }

        @TestMetadata("nestedClass.kt")
        public void testNestedClass() throws Exception {
            runTest("compiler/fir/psi2fir/testData/rawBuilder/declarations/nestedClass.kt");
        }

        @TestMetadata("NestedOfAliasedType.kt")
        public void testNestedOfAliasedType() throws Exception {
            runTest("compiler/fir/psi2fir/testData/rawBuilder/declarations/NestedOfAliasedType.kt");
        }

        @TestMetadata("NestedSuperType.kt")
        public void testNestedSuperType() throws Exception {
            runTest("compiler/fir/psi2fir/testData/rawBuilder/declarations/NestedSuperType.kt");
        }

        @TestMetadata("noPrimaryConstructor.kt")
        public void testNoPrimaryConstructor() throws Exception {
            runTest("compiler/fir/psi2fir/testData/rawBuilder/declarations/noPrimaryConstructor.kt");
        }

        @TestMetadata("simpleClass.kt")
        public void testSimpleClass() throws Exception {
            runTest("compiler/fir/psi2fir/testData/rawBuilder/declarations/simpleClass.kt");
        }

        @TestMetadata("simpleFun.kt")
        public void testSimpleFun() throws Exception {
            runTest("compiler/fir/psi2fir/testData/rawBuilder/declarations/simpleFun.kt");
        }

        @TestMetadata("simpleTypeAlias.kt")
        public void testSimpleTypeAlias() throws Exception {
            runTest("compiler/fir/psi2fir/testData/rawBuilder/declarations/simpleTypeAlias.kt");
        }

        @TestMetadata("typeAliasWithGeneric.kt")
        public void testTypeAliasWithGeneric() throws Exception {
            runTest("compiler/fir/psi2fir/testData/rawBuilder/declarations/typeAliasWithGeneric.kt");
        }

        @TestMetadata("typeParameterVsNested.kt")
        public void testTypeParameterVsNested() throws Exception {
            runTest("compiler/fir/psi2fir/testData/rawBuilder/declarations/typeParameterVsNested.kt");
        }

        @TestMetadata("typeParameters.kt")
        public void testTypeParameters() throws Exception {
            runTest("compiler/fir/psi2fir/testData/rawBuilder/declarations/typeParameters.kt");
        }
    }
}
