package Application.Telerik;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.methi.FormDecoratorPage;
import pages.methi.LoginPage;
import pages.methi.SkinManagerPage;
import utility.ExcelReader;

import static utility.Utility.currentDir;

public class AjaxThemingTest extends CommonAPI {

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
    public void formDecoratorTelerik() {
        FormDecoratorPage formDecorator = new FormDecoratorPage(getDriver());
        formDecorator.hoverOver(getDriver());
        waitFor(2);
        formDecorator.UIForAjaxClick();
        waitFor(2);
        formDecorator.hoverOverDemo(getDriver());
        waitFor(2);
        formDecorator.listOfControlsClick();
        waitFor(2);
        formDecorator.themingClick();
        waitFor(2);
        formDecorator.hoverOverFormDecoratorBtn(getDriver());
        waitFor(2);
        formDecorator.formDecoratorClick();
        waitFor(2);
        formDecorator.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        formDecorator.regularControlsClick();
        waitFor(2);
        formDecorator.validationLoginControlsClick();
        waitFor(2);
        formDecorator.allAjaxComponentsClick();
        waitFor(2);
        formDecorator.hoverOverNextSteps(getDriver());
        waitFor(2);
        formDecorator.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }

    @Test
    public void skinManagerTelerik() {
        SkinManagerPage skinManager = new SkinManagerPage(getDriver());
        skinManager.hoverOver(getDriver());
        waitFor(2);
        skinManager.UIForAjaxClick();
        waitFor(2);
        skinManager.hoverOverDemo(getDriver());
        waitFor(2);
        skinManager.listOfControlsClick();
        waitFor(2);
        skinManager.themingClick();
        waitFor(2);
        skinManager.hoverOverSkinManagerHoverBtn(getDriver());
        waitFor(2);
        skinManager.skinManagerClick();
        waitFor(2);
        skinManager.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        skinManager.themeSelectionClick();
        waitFor(2);
        skinManager.intuitiveConfigurationClick();
        waitFor(2);
        skinManager.persistenceClick();
        waitFor(2);
        skinManager.allAjaxComponentsClick();
        waitFor(2);
        skinManager.hoverOverNextSteps(getDriver());
        waitFor(2);
        skinManager.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
    }
}
