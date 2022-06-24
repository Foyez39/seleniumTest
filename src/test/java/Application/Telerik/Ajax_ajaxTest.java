package Application.Telerik;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.methi.AjaxManagerPage;
import pages.methi.AjaxPanelPage;
import pages.methi.LoginPage;
import utility.ExcelReader;

import static utility.Utility.currentDir;

public class Ajax_ajaxTest extends CommonAPI {

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
    public void ajaxMangerTelerik() {
        AjaxManagerPage ajaxManager = new AjaxManagerPage(getDriver());
        waitFor(2);
        ajaxManager.hoverOver(getDriver());
        waitFor(2);
        ajaxManager.UIForAjaxClick();
        waitFor(2);
        ajaxManager.hoverOverDemo(getDriver());
        waitFor(2);
        ajaxManager.listOfControlsClick();
        waitFor(2);
        ajaxManager.scrollToViewFileUploadManagementScroll(getDriver());
        waitFor(2);
        ajaxManager.ajaxClick();
        waitFor(2);
        ajaxManager.hoverOverAjaxManagerBtn(getDriver());
        waitFor(2);
        ajaxManager.ajaxManagerClick();
        waitFor(2);
        ajaxManager.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        ajaxManager.radAjaxManagerClick();
        waitFor(2);
        ajaxManager.radAjaxPanelClick();
        waitFor(2);
        ajaxManager.radAjaxLoadingPanelClick();
        waitFor(2);
        ajaxManager.partialAjaxificationClick();
        waitFor(2);
        ajaxManager.clientSideAPIClick();
        waitFor(2);
        ajaxManager.allAjaxComponentsClick();
        waitFor(2);
        ajaxManager.hoverOverNextSteps(getDriver());
        waitFor(2);
        ajaxManager.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }

    @Test
    public void ajaxPanelTelerik() {
        AjaxPanelPage ajaxPanel = new AjaxPanelPage(getDriver());
        waitFor(2);
        ajaxPanel.hoverOver(getDriver());
        waitFor(2);
        ajaxPanel.UIForAjaxClick();
        waitFor(2);
        ajaxPanel.hoverOverDemo(getDriver());
        waitFor(2);
        ajaxPanel.listOfControlsClick();
        waitFor(2);
        ajaxPanel.scrollToViewFileUploadManagementScroll(getDriver());
        waitFor(2);
        ajaxPanel.ajaxClick();
        waitFor(2);
        ajaxPanel.hoverOverAjaxPanelBtn(getDriver());
        waitFor(2);
        ajaxPanel.ajaxPanelClick();
        waitFor(2);
        ajaxPanel.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        ajaxPanel.webServiceBindingClick();
        waitFor(2);
        ajaxPanel.efficientlyLoadDataClick();
        waitFor(2);
        ajaxPanel.dynamicallyLoadContentClick();
        waitFor(2);
        ajaxPanel.allAjaxComponentsClick();
        waitFor(2);
        ajaxPanel.hoverOverNextSteps(getDriver());
        waitFor(2);
        ajaxPanel.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }
}
