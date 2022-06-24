package Application.Amazon;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.Amazon.HomePage;

public class DropDownListTest extends CommonAPI {


    @Test
    public void getDropDownList() {
        HomePage homePage = new HomePage(getDriver());
        for (String str : homePage.getHomePageDropDownOptions()) {
            System.out.println(str);


            System.out.println(homePage.getHomePageDropDownOptions());
        }
    }


    @Test
    public void selectGiftCards(){
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromMenuDropDown("Gift Cards");
        waitFor(5);
    }

    }
