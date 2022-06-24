package pages.Amazon;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends CommonAPI {

    public SearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}

