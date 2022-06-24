package Application.Telerik;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.methi.LoginPage;
import utility.ExcelReader;

import static utility.Utility.currentDir;

public class LoginTest extends CommonAPI {

    @Test
    public void telerikLogin(){
        LoginPage loginPage = new LoginPage(getDriver());
        ExcelReader excelReader = new ExcelReader(currentDir + "/data/TestData.xlsx");
        String userEmail = excelReader.getDataFromCell("MethiSheet1", 0, 0);
        String userPassword = excelReader.getDataFromCell("MethiSheet1", 1,0);
        loginPage.clickYourAccount();
        waitFor(2);
        loginPage.clickWithActionsCookies(getDriver());
        loginPage.typeEmail(userEmail);
        loginPage.typePassword(userPassword);
        loginPage.clickLoginBtn();
        loginPage.mainAccountName();
        String expectedResult = "https://www.telerik.com/account/";
        Assert.assertEquals(expectedResult, getPageUrl());
    }
}
