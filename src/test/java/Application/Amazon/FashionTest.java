package Application.Amazon;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Amazon.HomePage;

public class FashionTest extends CommonAPI {


   @Test
    public void FashionTest() {

    HomePage homePage = new HomePage(getDriver());
    homePage.clickFashionBtn();
    String expectedFashionPageTitle = "Fashion";
    Assert.assertEquals(expectedFashionPageTitle, getPageTitle());


}
   @Test
    public void HandMadeTest2(){

       HomePage homePage = new HomePage(getDriver());
       homePage.clickHandmadeBtn();
       String expectedHandMadePageTitle = "HandMade";
       Assert.assertEquals(expectedHandMadePageTitle, getPageTitle());


       }

}



