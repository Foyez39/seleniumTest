package Application.Telerik;

import base.CommonAPI;
import org.apache.logging.log4j.core.script.ScriptManager;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.methi.*;
import utility.ExcelReader;

import static utility.Utility.currentDir;

public class AjaxPerformanceTest extends CommonAPI {

    @BeforeMethod
    public void telerikLogin(){
        LoginPage loginPage = new LoginPage(getDriver());
        ExcelReader excelReader = new ExcelReader(currentDir + "/data/TestData.xlsx");
        String userEmail = excelReader.getDataFromCell("Sheet1", 0, 0);
        String userPassword = excelReader.getDataFromCell("Sheet1", 1,0);
        loginPage.clickYourAccount();
        loginPage.clickWithActionsCookies(getDriver());
        loginPage.typeEmail(userEmail);
        loginPage.typePassword(userPassword);
        loginPage.clickLoginBtn();
        loginPage.mainAccountName();
        String expectedResult = "https://www.telerik.com/account/";
        Assert.assertEquals(expectedResult, getPageUrl());
    }


    @Test
    public void compressionTelerik() {
        CompressionPage compression = new CompressionPage(getDriver());
        waitFor(2);
        compression.hoverOver(getDriver());
        waitFor(2);
        compression.UIForAjaxClick();
        waitFor(2);
        compression.hoverOverDemo(getDriver());
        waitFor(2);
        compression.listOfControlsClick();
        waitFor(2);
        compression.scrollToViewFileUploadManagementScroll(getDriver());
        waitFor(2);
        compression.performanceClick();
        waitFor(2);
        compression.hoverOverCompressionBtn(getDriver());
        waitFor(2);
        compression.compressionClick();
        waitFor(2);
        compression.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        compression.compressionAreasClick();
        waitFor(2);
        compression.viewStateCompressionClick();
        waitFor(2);
        compression.typesOfCompressionClick();
        waitFor(2);
        compression.allAjaxComponentsClick();
        waitFor(2);
        compression.hoverOverNextSteps(getDriver());
        waitFor(2);
        compression.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }

    @Test
    public void scriptManagerTelerik() {
        ScriptManagerPage scriptManager = new ScriptManagerPage(getDriver());
        waitFor(2);
        scriptManager.hoverOver(getDriver());
        waitFor(2);
        scriptManager.UIForAjaxClick();
        waitFor(2);
        scriptManager.hoverOverDemo(getDriver());
        waitFor(2);
        scriptManager.listOfControlsClick();
        waitFor(2);
        scriptManager.scrollToViewFileUploadManagementScroll(getDriver());
        waitFor(2);
        scriptManager.performanceClick();
        waitFor(2);
        scriptManager.hoverOverScriptManagerBtn(getDriver());
        waitFor(2);
        scriptManager.scriptManagerClick();
        waitFor(2);
        scriptManager.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        scriptManager.minimizingPageTrafficClick();
        waitFor(2);
        scriptManager.cachingSupportClick();
        waitFor(2);
        scriptManager.easyConfigurationClick();
        waitFor(2);
        scriptManager.allAjaxComponentsClick();
        waitFor(2);
        scriptManager.hoverOverNextSteps(getDriver());
        waitFor(2);
        scriptManager.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }

    @Test
    public void styleSheetManagerTelerik() {
        StyleSheetManagerPage styleSheetManager = new StyleSheetManagerPage(getDriver());
        waitFor(2);
        styleSheetManager.hoverOver(getDriver());
        waitFor(2);
        styleSheetManager.UIForAjaxClick();
        waitFor(2);
        styleSheetManager.hoverOverDemo(getDriver());
        waitFor(2);
        styleSheetManager.listOfControlsClick();
        waitFor(2);
        styleSheetManager.scrollToViewFileUploadManagementScroll(getDriver());
        waitFor(2);
        styleSheetManager.performanceClick();
        waitFor(2);
        styleSheetManager.hoverOverStyleSheetManagerBtn(getDriver());
        waitFor(2);
        styleSheetManager.styleSheetManagerClick();
        waitFor(2);
        styleSheetManager.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        styleSheetManager.easyConfigurationClick();
        waitFor(2);
        styleSheetManager.cachingSupportClick();
        waitFor(2);
        styleSheetManager.minimizingPageTrafficClick();
        waitFor(2);
        styleSheetManager.allAjaxComponentsClick();
        waitFor(2);
        styleSheetManager.hoverOverNextSteps(getDriver());
        waitFor(2);
        styleSheetManager.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }

}
