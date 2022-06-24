package Application.Telerik;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.methi.*;
import utility.ExcelReader;

import static utility.Utility.currentDir;

public class AjaxSocialTest extends CommonAPI {

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
    public void captchaTelerik() {
        CaptchaPage captcha = new CaptchaPage(getDriver());
        waitFor(2);
        captcha.hoverOver(getDriver());
        waitFor(2);
        captcha.UIForAjaxClick();
        waitFor(2);
        captcha.hoverOverDemo(getDriver());
        waitFor(2);
        captcha.listOfControlsClick();
        waitFor(2);
        captcha.scrollToViewFileUploadManagementScroll(getDriver());
        waitFor(2);
        captcha.socialClick();
        waitFor(2);
        captcha.hoverOverCaptchaBtn(getDriver());
        waitFor(2);
        captcha.captchaClick();
        waitFor(2);
        captcha.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        captcha.variousProtectionModesClick();
        waitFor(2);
        captcha.audioSupportClick();
        waitFor(2);
        captcha.validationSummaryClick();
        waitFor(2);
        captcha.customCharacterSetClick();
        waitFor(2);
        captcha.localizationAccessibilityClick();
        waitFor(2);
        captcha.allAjaxComponentsClick();
        waitFor(2);
        captcha.hoverOverNextSteps(getDriver());
        waitFor(2);
        captcha.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }

    @Test
    public void ratingTelerik() {
        RatingPage rating = new RatingPage(getDriver());
        waitFor(2);
        rating.hoverOver(getDriver());
        waitFor(2);
        rating.UIForAjaxClick();
        waitFor(2);
        rating.hoverOverDemo(getDriver());
        waitFor(2);
        rating.listOfControlsClick();
        waitFor(2);
        rating.scrollToViewFileUploadManagementScroll(getDriver());
        waitFor(2);
        rating.socialClick();
        waitFor(2);
        rating.hoverOverRatingBtn(getDriver());
        waitFor(2);
        rating.ratingClick();
        waitFor(2);
        rating.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        rating.dataBindingClick();
        waitFor(2);
        rating.controlIntegrationClick();
        waitFor(2);
        rating.ratingMechanismClick();
        waitFor(2);
        rating.allAjaxComponentsClick();
        waitFor(2);
        rating.hoverOverNextSteps(getDriver());
        waitFor(2);
        rating.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }

    @Test
    public void socialShareTelerik() {
        SocialSharePage socialShare = new SocialSharePage(getDriver());
        waitFor(2);
        socialShare.hoverOver(getDriver());
        waitFor(2);
        socialShare.UIForAjaxClick();
        waitFor(2);
        socialShare.hoverOverDemo(getDriver());
        waitFor(2);
        socialShare.listOfControlsClick();
        waitFor(2);
        socialShare.scrollToViewFileUploadManagementScroll(getDriver());
        waitFor(2);
        socialShare.socialClick();
        waitFor(2);
        socialShare.hoverOverSocialShareBtn(getDriver());
        waitFor(2);
        socialShare.socialShareClick();
        waitFor(2);
        socialShare.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        socialShare.socialSharingClick();
        waitFor(2);
        socialShare.commonButtonsClick();
        waitFor(2);
        socialShare.popupButtonClick();
        waitFor(2);
        socialShare.allAjaxComponentsClick();
        waitFor(2);
        socialShare.hoverOverNextSteps(getDriver());
        waitFor(2);
        socialShare.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }
}
