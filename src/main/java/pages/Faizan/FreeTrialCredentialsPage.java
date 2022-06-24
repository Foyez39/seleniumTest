package pages.Faizan;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FreeTrialCredentialsPage extends CommonAPI {
    @FindBy(css = "a[class='btn btn-independent btn-nav form-modal-show']")
    private WebElement Freetrialbtn;
    @FindBy(css = "#Email")
    private WebElement Workemail;
    @FindBy(css = "#FirstName")
    private WebElement Firstname;
    @FindBy(css = "#LastName")
    private WebElement Lastname;
    @FindBy(css = "#Company")
    private WebElement Company;
    @FindBy(css = "#Phone")
    private WebElement PhoneNumber;
    @FindBy(css = "#mktoForm_5555 > div.mktoButtonRow > span > button")
    private WebElement StartTrialbtn;
    @FindBy(css = "#Email")
    private WebElement invalidWORKEMAIL;
    public FreeTrialCredentialsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void clickONFREETRIALBTN(){
        click(Freetrialbtn);
    }
    public void clickandtypeonWorkEmail(){
        click(Workemail);
        type(Workemail,"ElonMusk@gmail.com");
    }
    public void clickandtypeonFirstname(){
        click(Firstname);
        type(Firstname,"Elon");
    }
    public void clickandtypeonLastname(){
        click(Lastname);
        type(Lastname,"Musk");
    }
    public void clickandtypeonCompanyname(){
        click(Company);
        type(Company,"SpaceX");
    }
    public void clickandtypeonPhonenumber(){
        click(PhoneNumber);
        type(PhoneNumber,"929-397-5234");
    }
    public void clickONSTARTTRIALBTN(){
        click(StartTrialbtn);
    }
    public void typeONinvalidWORKEMAIL(){
        type(invalidWORKEMAIL,"ElonMusk@");
    }
}
