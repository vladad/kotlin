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

package org.jetbrains.jet.resolve;

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
@TestMetadata("idea/testData/resolve/partialBodyResolve")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class PartialBodyResolveTestGenerated extends AbstractPartialBodyResolveTest {
    public void testAllFilesPresentInPartialBodyResolve() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/resolve/partialBodyResolve"), Pattern.compile("^(.+)\\.kt$"), true);
    }

    @TestMetadata("AnonymousObjects.kt")
    public void testAnonymousObjects() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/AnonymousObjects.kt");
        doTest(fileName);
    }

    @TestMetadata("As.kt")
    public void testAs() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/As.kt");
        doTest(fileName);
    }

    @TestMetadata("BangBang.kt")
    public void testBangBang() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/BangBang.kt");
        doTest(fileName);
    }

    @TestMetadata("BangBangInIfCondition.kt")
    public void testBangBangInIfCondition() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/BangBangInIfCondition.kt");
        doTest(fileName);
    }

    @TestMetadata("DeclarationsBefore.kt")
    public void testDeclarationsBefore() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/DeclarationsBefore.kt");
        doTest(fileName);
    }

    @TestMetadata("DoWhile.kt")
    public void testDoWhile() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/DoWhile.kt");
        doTest(fileName);
    }

    @TestMetadata("ExpressionBodyExplicitType.kt")
    public void testExpressionBodyExplicitType() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/ExpressionBodyExplicitType.kt");
        doTest(fileName);
    }

    @TestMetadata("For1.kt")
    public void testFor1() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/For1.kt");
        doTest(fileName);
    }

    @TestMetadata("For2.kt")
    public void testFor2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/For2.kt");
        doTest(fileName);
    }

    @TestMetadata("IfBranchesAutoCasts.kt")
    public void testIfBranchesAutoCasts() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/IfBranchesAutoCasts.kt");
        doTest(fileName);
    }

    @TestMetadata("IfBranchesAutoCasts2.kt")
    public void testIfBranchesAutoCasts2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/IfBranchesAutoCasts2.kt");
        doTest(fileName);
    }

    @TestMetadata("IfBranchesSmartCast.kt")
    public void testIfBranchesSmartCast() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/IfBranchesSmartCast.kt");
        doTest(fileName);
    }

    @TestMetadata("IfEqAutoCast.kt")
    public void testIfEqAutoCast() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/IfEqAutoCast.kt");
        doTest(fileName);
    }

    @TestMetadata("IfNotIsError.kt")
    public void testIfNotIsError() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/IfNotIsError.kt");
        doTest(fileName);
    }

    @TestMetadata("IfNotIsErrorQualifier.kt")
    public void testIfNotIsErrorQualifier() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/IfNotIsErrorQualifier.kt");
        doTest(fileName);
    }

    @TestMetadata("IfNotIsErrorVariable.kt")
    public void testIfNotIsErrorVariable() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/IfNotIsErrorVariable.kt");
        doTest(fileName);
    }

    @TestMetadata("IfNotIsMyError.kt")
    public void testIfNotIsMyError() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/IfNotIsMyError.kt");
        doTest(fileName);
    }

    @TestMetadata("IfNotIsNothingProp.kt")
    public void testIfNotIsNothingProp() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/IfNotIsNothingProp.kt");
        doTest(fileName);
    }

    @TestMetadata("IfNotIsReturn.kt")
    public void testIfNotIsReturn() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/IfNotIsReturn.kt");
        doTest(fileName);
    }

    @TestMetadata("IfNotIsReturn2.kt")
    public void testIfNotIsReturn2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/IfNotIsReturn2.kt");
        doTest(fileName);
    }

    @TestMetadata("IfNotIsThrow.kt")
    public void testIfNotIsThrow() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/IfNotIsThrow.kt");
        doTest(fileName);
    }

    @TestMetadata("IfNotNullElseReturn.kt")
    public void testIfNotNullElseReturn() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/IfNotNullElseReturn.kt");
        doTest(fileName);
    }

    @TestMetadata("IfNullAlwaysExits.kt")
    public void testIfNullAlwaysExits() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/IfNullAlwaysExits.kt");
        doTest(fileName);
    }

    @TestMetadata("IfNullBreak.kt")
    public void testIfNullBreak() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/IfNullBreak.kt");
        doTest(fileName);
    }

    @TestMetadata("IfNullConditionalReturn.kt")
    public void testIfNullConditionalReturn() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/IfNullConditionalReturn.kt");
        doTest(fileName);
    }

    @TestMetadata("IfNullConditionalReturnWithElse.kt")
    public void testIfNullConditionalReturnWithElse() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/IfNullConditionalReturnWithElse.kt");
        doTest(fileName);
    }

    @TestMetadata("IfNullContinue.kt")
    public void testIfNullContinue() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/IfNullContinue.kt");
        doTest(fileName);
    }

    @TestMetadata("IfNullDoWhileWithBreak.kt")
    public void testIfNullDoWhileWithBreak() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/IfNullDoWhileWithBreak.kt");
        doTest(fileName);
    }

    @TestMetadata("IfNullElvisReturn.kt")
    public void testIfNullElvisReturn() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/IfNullElvisReturn.kt");
        doTest(fileName);
    }

    @TestMetadata("IfNullForWithReturn.kt")
    public void testIfNullForWithReturn() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/IfNullForWithReturn.kt");
        doTest(fileName);
    }

    @TestMetadata("IfNullPrint.kt")
    public void testIfNullPrint() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/IfNullPrint.kt");
        doTest(fileName);
    }

    @TestMetadata("IfNullReturn.kt")
    public void testIfNullReturn() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/IfNullReturn.kt");
        doTest(fileName);
    }

    @TestMetadata("IfNullWhileTrueWithBreak.kt")
    public void testIfNullWhileTrueWithBreak() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/IfNullWhileTrueWithBreak.kt");
        doTest(fileName);
    }

    @TestMetadata("IfNullWhileWithReturn.kt")
    public void testIfNullWhileWithReturn() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/IfNullWhileWithReturn.kt");
        doTest(fileName);
    }

    @TestMetadata("IfReturn.kt")
    public void testIfReturn() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/IfReturn.kt");
        doTest(fileName);
    }

    @TestMetadata("InIfExpressionElse.kt")
    public void testInIfExpressionElse() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/InIfExpressionElse.kt");
        doTest(fileName);
    }

    @TestMetadata("LabeledBreak.kt")
    public void testLabeledBreak() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/LabeledBreak.kt");
        doTest(fileName);
    }

    @TestMetadata("LabeledContinue.kt")
    public void testLabeledContinue() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/LabeledContinue.kt");
        doTest(fileName);
    }

    @TestMetadata("Lambda.kt")
    public void testLambda() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/Lambda.kt");
        doTest(fileName);
    }

    @TestMetadata("LambdaInCurrentStatement.kt")
    public void testLambdaInCurrentStatement() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/LambdaInCurrentStatement.kt");
        doTest(fileName);
    }

    @TestMetadata("LambdaReturnsNothing2.kt")
    public void testLambdaReturnsNothing2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/LambdaReturnsNothing2.kt");
        doTest(fileName);
    }

    @TestMetadata("LocalClass.kt")
    public void testLocalClass() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/LocalClass.kt");
        doTest(fileName);
    }

    @TestMetadata("LocalFun.kt")
    public void testLocalFun() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/LocalFun.kt");
        doTest(fileName);
    }

    @TestMetadata("LocalNothingFun.kt")
    public void testLocalNothingFun() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/LocalNothingFun.kt");
        doTest(fileName);
    }

    @TestMetadata("MutliDeclaration.kt")
    public void testMutliDeclaration() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/MutliDeclaration.kt");
        doTest(fileName);
    }

    @TestMetadata("NestedLoop.kt")
    public void testNestedLoop() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/NestedLoop.kt");
        doTest(fileName);
    }

    @TestMetadata("OutOfBodyResolve.kt")
    public void testOutOfBodyResolve() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/OutOfBodyResolve.kt");
        doTest(fileName);
    }

    @TestMetadata("PropertyAccessorBody.kt")
    public void testPropertyAccessorBody() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/PropertyAccessorBody.kt");
        doTest(fileName);
    }

    @TestMetadata("PropertyByDelegate.kt")
    public void testPropertyByDelegate() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/PropertyByDelegate.kt");
        doTest(fileName);
    }

    @TestMetadata("ReturnLambda.kt")
    public void testReturnLambda() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/ReturnLambda.kt");
        doTest(fileName);
    }

    @TestMetadata("Simple.kt")
    public void testSimple() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/Simple.kt");
        doTest(fileName);
    }

    @TestMetadata("SmartCastInTheSameStatement.kt")
    public void testSmartCastInTheSameStatement() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/SmartCastInTheSameStatement.kt");
        doTest(fileName);
    }

    @TestMetadata("SmartCastPointsResolveRequired1.kt")
    public void testSmartCastPointsResolveRequired1() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/SmartCastPointsResolveRequired1.kt");
        doTest(fileName);
    }

    @TestMetadata("SmartCastPointsResolveRequired2.kt")
    public void testSmartCastPointsResolveRequired2() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/SmartCastPointsResolveRequired2.kt");
        doTest(fileName);
    }

    @TestMetadata("ThisQualifiedAutoCast.kt")
    public void testThisQualifiedAutoCast() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/ThisQualifiedAutoCast.kt");
        doTest(fileName);
    }

    @TestMetadata("While.kt")
    public void testWhile() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/While.kt");
        doTest(fileName);
    }

    @TestMetadata("WhileTrue.kt")
    public void testWhileTrue() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/WhileTrue.kt");
        doTest(fileName);
    }

    @TestMetadata("WhileTrueCondition.kt")
    public void testWhileTrueCondition() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/resolve/partialBodyResolve/WhileTrueCondition.kt");
        doTest(fileName);
    }
}
