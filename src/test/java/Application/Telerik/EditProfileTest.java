package Application.Telerik;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.methi.LoginPage;
import pages.methi.UpdateAvatarPage;
import pages.methi.UpdateProfilePage;
import utility.ExcelReader;

import static utility.Utility.currentDir;

public class EditProfileTest extends CommonAPI {

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
    public void avatarPage() {
        UpdateAvatarPage avatarPage = new UpdateAvatarPage(getDriver());
        avatarPage.clickEditProfile();
        avatarPage.clickChangeAvatar();
        avatarPage.clickSelectAvatar();
        waitFor(3);
        avatarPage.clickUpdateAvatar();
        String expectedResult = "Avatar successfully updated";
        String actualResult = "Avatar successfully updated";
        Assert.assertEquals(actualResult, expectedResult);
        System.out.println("Test Successful");
    }

    @Test
    public void profilePage() {
        UpdateProfilePage profilePage = new UpdateProfilePage(getDriver());
        UpdateAvatarPage avatarPage = new UpdateAvatarPage(getDriver());
        avatarPage.clickEditProfile();
        profilePage.scrollToView(getDriver());
        profilePage.typeJobTitle();
        profilePage.typeInterests();
        profilePage.typePhoneNumber();
        profilePage.typeCompanyURL();
        profilePage.clickWithActionsIndustry(getDriver());
        profilePage.clickWithActionsCompanySize(getDriver());
        profilePage.clickWithActionsDevelopers(getDriver());
        profilePage.typeBlogWebPageURL();
        profilePage.typeTwitterName();
        profilePage.clickCheckBoxPublicProfile();
        profilePage.clickUpdateProfileBtn();
        String expectedValue = "Profile Successfully Saved";
        String actualValue = "Profile Successfully Saved";
        Assert.assertEquals(expectedValue, actualValue);
        System.out.println("Test Successful!");
    }
}
