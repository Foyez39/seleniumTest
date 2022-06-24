package pages.methi;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginExcelReaderPage extends CommonAPI {

    @FindBy(css = "#js-tlrk-nav-not-auth-container > a")
    private WebElement yourAccount;

    @FindBy(css = "#username")
    private WebElement Email;

    @FindBy(css = "#password")
    private WebElement Password;

    @FindBy(css = "#LoginButton-1")
    private WebElement loginBtn;

    @FindBy (css = "#onetrust-accept-btn-handler")
    private WebElement cookiesBtn;

    @FindBy(xpath = "//*[@id=\"ya-app-content\"]/ng-component/div/div/div/profile-card/div/div[2]/div[1]/div[1]/h4")
    private WebElement accountName;

    public LoginExcelReaderPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //reusable steps

    public void clickYourAccount(){click(yourAccount);}

//    public void typeEmail(){type(email, "facebooktester1089@gmail.com");}
//
//    public void typePassword() {type(password, "10241989Mk$");}

    public void clickLoginBtn(){
        click(loginBtn);
        System.out.println("Test Successful");
    }

    public void clickWithActionsCookies(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.click(cookiesBtn).build().perform();
    }

    public void mainAccountName(){ isPresent(accountName); }

    public void typeEmail(String email) {
        type(Email, email);
    }

    public void typePassword(String password) {
        type(Password, password);
    }
}
