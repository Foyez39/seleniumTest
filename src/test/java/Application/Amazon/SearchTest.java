package Application.Amazon;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Amazon.HomePage;

public class SearchTest extends CommonAPI {


    @Test
    public void SearchTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickSearchField();
        homePage.clickSearchBtn();


    }

        @Test
    public void SearchTest1(){

            HomePage homePage = new HomePage(getDriver());
            homePage.clickSearchField();
            String expectedPhonesPageTitle = "Amazon.com : phones";
            Assert.assertEquals(expectedPhonesPageTitle, getPageTitle());

        }




    }

