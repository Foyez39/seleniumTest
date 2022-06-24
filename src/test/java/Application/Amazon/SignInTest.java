package Application.Amazon;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.Amazon.HomePage;

public class SignInTest extends CommonAPI {


    @Test
    public void SignInBtn(){
        HomePage homePage = new HomePage(getDriver());
        homePage.HoverOverFloatingMenu();
        homePage.clickSignInBtn();

    }
}
