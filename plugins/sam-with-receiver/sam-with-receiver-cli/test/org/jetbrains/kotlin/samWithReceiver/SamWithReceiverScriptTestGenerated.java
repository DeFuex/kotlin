/*
 * Copyright 2010-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.samWithReceiver;

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
@TestMetadata("plugins/sam-with-receiver/sam-with-receiver-cli/testData/script")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class SamWithReceiverScriptTestGenerated extends AbstractSamWithReceiverScriptTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
    }

    public void testAllFilesPresentInScript() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("plugins/sam-with-receiver/sam-with-receiver-cli/testData/script"), Pattern.compile("^(.+)\\.kts$"), TargetBackend.ANY, true);
    }

    @TestMetadata("samConversionSimple.kts")
    public void testSamConversionSimple() throws Exception {
        runTest("plugins/sam-with-receiver/sam-with-receiver-cli/testData/script/samConversionSimple.kts");
    }
}
