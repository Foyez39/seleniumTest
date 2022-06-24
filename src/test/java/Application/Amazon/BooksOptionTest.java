package Application.Amazon;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Amazon.HomePage;

public class BooksOptionTest extends CommonAPI {


    @Test
    public void BooksCategoryTest() {

        HomePage homePage = new HomePage(getDriver());
        homePage.clickBooksBtn();
        String expectedBooksPageTitle = "Books";
        Assert.assertEquals(expectedBooksPageTitle, getPageTitle());
    }
}
