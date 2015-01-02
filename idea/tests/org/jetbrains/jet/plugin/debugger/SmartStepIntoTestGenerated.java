/*
 * Copyright 2010-2015 JetBrains s.r.o.
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

package org.jetbrains.jet.plugin.debugger;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.jet.JUnit3RunnerWithInners;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/debugger/smartStepInto")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class SmartStepIntoTestGenerated extends AbstractSmartStepIntoTest {
    public void testAllFilesPresentInSmartStepInto() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/debugger/smartStepInto"), Pattern.compile("^(.+)\\.kt$"), true);
    }

    @TestMetadata("annotation.kt")
    public void testAnnotation() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/debugger/smartStepInto/annotation.kt");
        doTest(fileName);
    }

    @TestMetadata("arrayAccess.kt")
    public void testArrayAccess() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/debugger/smartStepInto/arrayAccess.kt");
        doTest(fileName);
    }

    @TestMetadata("callChain.kt")
    public void testCallChain() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/debugger/smartStepInto/callChain.kt");
        doTest(fileName);
    }

    @TestMetadata("conventionMethod.kt")
    public void testConventionMethod() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/debugger/smartStepInto/conventionMethod.kt");
        doTest(fileName);
    }

    @TestMetadata("delegatedPropertyGetter.kt")
    public void testDelegatedPropertyGetter() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/debugger/smartStepInto/delegatedPropertyGetter.kt");
        doTest(fileName);
    }

    @TestMetadata("doWhile.kt")
    public void testDoWhile() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/debugger/smartStepInto/doWhile.kt");
        doTest(fileName);
    }

    @TestMetadata("dotQualified.kt")
    public void testDotQualified() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/debugger/smartStepInto/dotQualified.kt");
        doTest(fileName);
    }

    @TestMetadata("dotQualifiedInParam.kt")
    public void testDotQualifiedInParam() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/debugger/smartStepInto/dotQualifiedInParam.kt");
        doTest(fileName);
    }

    @TestMetadata("empty.kt")
    public void testEmpty() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/debugger/smartStepInto/empty.kt");
        doTest(fileName);
    }

    @TestMetadata("for.kt")
    public void testFor() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/debugger/smartStepInto/for.kt");
        doTest(fileName);
    }

    @TestMetadata("funLiteral.kt")
    public void testFunLiteral() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/debugger/smartStepInto/funLiteral.kt");
        doTest(fileName);
    }

    @TestMetadata("if.kt")
    public void testIf() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/debugger/smartStepInto/if.kt");
        doTest(fileName);
    }

    @TestMetadata("infixCall.kt")
    public void testInfixCall() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/debugger/smartStepInto/infixCall.kt");
        doTest(fileName);
    }

    @TestMetadata("invoke.kt")
    public void testInvoke() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/debugger/smartStepInto/invoke.kt");
        doTest(fileName);
    }

    @TestMetadata("multiline.kt")
    public void testMultiline() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/debugger/smartStepInto/multiline.kt");
        doTest(fileName);
    }

    @TestMetadata("multilineCallChain.kt")
    public void testMultilineCallChain() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/debugger/smartStepInto/multilineCallChain.kt");
        doTest(fileName);
    }

    @TestMetadata("object.kt")
    public void testObject() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/debugger/smartStepInto/object.kt");
        doTest(fileName);
    }

    @TestMetadata("param.kt")
    public void testParam() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/debugger/smartStepInto/param.kt");
        doTest(fileName);
    }

    @TestMetadata("parantesized.kt")
    public void testParantesized() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/debugger/smartStepInto/parantesized.kt");
        doTest(fileName);
    }

    @TestMetadata("propertyGetter.kt")
    public void testPropertyGetter() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/debugger/smartStepInto/propertyGetter.kt");
        doTest(fileName);
    }

    @TestMetadata("simple.kt")
    public void testSimple() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/debugger/smartStepInto/simple.kt");
        doTest(fileName);
    }

    @TestMetadata("stringTemplate.kt")
    public void testStringTemplate() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/debugger/smartStepInto/stringTemplate.kt");
        doTest(fileName);
    }

    @TestMetadata("unary.kt")
    public void testUnary() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/debugger/smartStepInto/unary.kt");
        doTest(fileName);
    }

    @TestMetadata("when.kt")
    public void testWhen() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/debugger/smartStepInto/when.kt");
        doTest(fileName);
    }

    @TestMetadata("while.kt")
    public void testWhile() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/debugger/smartStepInto/while.kt");
        doTest(fileName);
    }
}
