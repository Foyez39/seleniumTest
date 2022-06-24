package Application.Amazon;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Amazon.HomePage;

public class BestSellersTest extends CommonAPI {



    @Test
    public void BestSellers(){

        HomePage homePage = new HomePage(getDriver());
        homePage.clickBestSeller();
        String expectedBestSellersPageTitle = "Best Sellers";
        Assert.assertEquals(expectedBestSellersPageTitle, getPageTitle());
    }
}
