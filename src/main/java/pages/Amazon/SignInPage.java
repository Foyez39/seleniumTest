package pages.Amazon;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends CommonAPI {

@FindBy(xpath = "//input[@id='ap_email']")
    private WebElement invalidEmailField;

@FindBy(css = "#continue")
    private WebElement ContinueBtn;

public SignInPage(WebDriver driver){
    PageFactory.initElements(driver, this);}





}

