package Application.Telerik;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.methi.LoginPage;
import pages.methi.SearchCheckoutPage;
import utility.ExcelReader;

import static utility.Utility.currentDir;

public class SearchAndCheckoutTest extends CommonAPI {

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
    public void searchAddToCartTelerik(){
        SearchCheckoutPage searchAddToCart = new SearchCheckoutPage(getDriver());
        searchAddToCart.hoverOverSearch(getDriver());
        searchAddToCart.clickWithJSSearch(getDriver());
        searchAddToCart.typeSearchBox();
        searchAddToCart.angularComponentClick();
        searchAddToCart.buyNowBtnClick();
        searchAddToCart.scrollToViewKendoUI(getDriver());
        searchAddToCart.buyNowBtnPurchaseClick();
        waitFor(2);
        searchAddToCart.checkBoxUnclicked();
        searchAddToCart.checkBoxClicked();
        searchAddToCart.checkBoxIsCheckedAutoRenew();
        searchAddToCart.clickWithActionsLicenseQuantity(getDriver());
        searchAddToCart.clickWithActionsSupportQuantity(getDriver());
        searchAddToCart.clickWithActionsContinueBtn(getDriver());
        searchAddToCart.clickWithJSContinueBtn(getDriver());
        searchAddToCart.sameAsBillingClick();
        searchAddToCart.scrollToViewBillingInformation(getDriver());
        searchAddToCart.clickWithActionsCookies(getDriver());
        searchAddToCart.firstNameType();
        searchAddToCart.lastNameType();
        searchAddToCart.emailType();
        searchAddToCart.companyType();
        searchAddToCart.phoneNumberType();
        searchAddToCart.addressType();
        searchAddToCart.clickWithActionsCountry(getDriver());
        searchAddToCart.clickWithActionsState(getDriver());
        searchAddToCart.cityType();
        searchAddToCart.zipCode();
        searchAddToCart.clickWithActionsContinueBtn2(getDriver());
        searchAddToCart.clickWithJSContinueBtn2(getDriver());
        waitFor(2);
        String expectedResult = "https://store.progress.com/review-order";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(1);
    }
}
