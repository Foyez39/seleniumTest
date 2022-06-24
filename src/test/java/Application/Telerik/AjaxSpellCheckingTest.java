package Application.Telerik;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.methi.LoginPage;
import pages.methi.SpellPage;
import utility.ExcelReader;

import static utility.Utility.currentDir;

public class AjaxSpellCheckingTest extends CommonAPI {

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
    public void spellTelerik() {
        SpellPage spell = new SpellPage(getDriver());
        waitFor(2);
        spell.hoverOver(getDriver());
        waitFor(2);
        spell.UIForAjaxClick();
        waitFor(2);
        spell.hoverOverDemo(getDriver());
        waitFor(2);
        spell.listOfControlsClick();
        waitFor(2);
        spell.SpellCheckingClick();
        waitFor(2);
        spell.hoverOverSpellBtn(getDriver());
        waitFor(2);
        spell.spellClick();
        waitFor(2);
        spell.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        spell.spellCheckingClick();
        waitFor(2);
        spell.multipleLanguagesClick();
        waitFor(2);
        spell.customDictionariesClick();
        waitFor(2);
        spell.allAjaxComponentsClick();
        waitFor(2);
        spell.hoverOverNextSteps(getDriver());
        waitFor(2);
        spell.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }
}
