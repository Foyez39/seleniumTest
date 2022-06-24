package pages.Amazon;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DropDownPage extends CommonAPI {

    public DropDownPage(WebDriver driver) {
        PageFactory.initElements(driver, this); }
    }

