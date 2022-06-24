package Application.Amazon;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Amazon.HomePage;

public class CustomerServiceTest extends CommonAPI {

    @Test
    public void CustomerServiceTest(){
        HomePage homePage = new HomePage(getDriver());
        homePage.clickCustomerService();
        String expectedCustomerServiceTitle = "Customer service";
        Assert.assertEquals(expectedCustomerServiceTitle, getPageTitle());
    }
}
