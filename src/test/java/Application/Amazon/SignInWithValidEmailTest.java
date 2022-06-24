package Application.Amazon;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.Amazon.HomePage;

public class SignInWithValidEmailTest extends CommonAPI {



    @Test
    public void SignInWithValidEmail(){
        HomePage homePage = new HomePage(getDriver());
        homePage.HoverOverFloatingMenu();
        homePage.clickSignInBtn();



    }
}
