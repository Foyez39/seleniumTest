package pages.dell_Pages;


import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Dropdown_SignIn_DellFinancialServicesPage extends CommonAPI {

    public Dropdown_SignIn_DellFinancialServicesPage(WebDriver driver){PageFactory.initElements(driver, this);}
    @FindBy(xpath = "//h1[@class='sc-bqGHjH gIHfsz']")
    private WebElement dellFinancialServiceText;


    public boolean dellFinancialServiceTextIsPresent() {
        return isPresent(dellFinancialServiceText);
    }
}