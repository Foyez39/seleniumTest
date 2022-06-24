package pages.Amazon;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInWithValidEmail extends CommonAPI {


    @FindBy(css = "#ap_email")
    private WebElement emailAddressField;


    @FindBy(css = "#continue")
    private WebElement ContinueBtn;

    @FindBy(css = "#ap_password")
    private WebElement PasswordField;

    @FindBy(css = "#signInSubmit")
    private WebElement SignInBtn;


    public SignInWithValidEmail(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    public void clickEmailAddressField(){type(emailAddressField,"Salouaamy093@gmail.com");}
    public void clickContinueBtn(){clickContinueBtn();}




}
