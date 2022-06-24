package pages.methi;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.openqa.selenium.Keys.ARROW_DOWN;
import static org.openqa.selenium.Keys.ENTER;

public class UpdateProfilePage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"ya-app-content\"]/ng-component/div/div/div[2]/div[1]/div/div/div[2]/div[2]/a")
    private WebElement requestEmailChange;

    @FindBy(css = "#job_title")
    private WebElement jobTitle;

    @FindBy(css = "#interests")
    private WebElement interests;

    @FindBy(css = "#phone")
    private WebElement phoneNumber;

    @FindBy(css = "#company_url")
    private WebElement companyURL;

    @FindBy(xpath = "//*[@id=\"company_industry\"]/span/kendo-searchbar")
    private WebElement industry;

    @FindBy(xpath = "//*[@id=\"company_size\"]/span/kendo-searchbar")
    private WebElement companySize;

    @FindBy(xpath = "//*[@id=\"company_developers\"]/span/kendo-searchbar")
    private WebElement developers;

    @FindBy(xpath = "//*[@id=\"blog_webpage_url\"]")
    private WebElement blogWebpageURL;

    @FindBy(xpath = "//*[@id=\"twitter_name\"]")
    private WebElement twitterName;

    @FindBy(xpath = "//*[@id=\"public_profile\"]")
    private WebElement profilePublicCheckBox;

    @FindBy(xpath = "//*[@id=\"ya-app-content\"]/ng-component/div/div/div[2]/div[2]/div/form/div[2]/button")
    private WebElement updateProfileBtn;


    public UpdateProfilePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //reusable steps

    public void scrollToView(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);", requestEmailChange);
    }

    public void typeJobTitle(){type(jobTitle,"Quality Assurance Engineer");}

    public void typeInterests(){type(interests, "Video Games");}

    public void typePhoneNumber(){type(phoneNumber, "012-345-6789");}

    public void typeCompanyURL(){type(companyURL, "https://www.facebook.com/");}

    public void clickWithActionsIndustry(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.click(industry).pause(java.time.Duration.ofSeconds(2)).sendKeys("Technology",ENTER).perform();
    }

    public void clickWithActionsCompanySize(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.click(industry).pause(java.time.Duration.ofSeconds(2)).sendKeys("51 - 100 Employees",Keys.ENTER).perform();
    }

    public void clickWithActionsDevelopers(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.click(industry).pause(java.time.Duration.ofSeconds(2)).sendKeys("31 - 50 Developers",Keys.ENTER).perform();
    }


    public void typeBlogWebPageURL(){type(blogWebpageURL, "https://www.JohnSmith1089.com/");}

    public void typeTwitterName(){type(twitterName, "JohnSmith1089");}

    public void clickCheckBoxPublicProfile(){click(profilePublicCheckBox);}

    public void clickUpdateProfileBtn(){click(updateProfileBtn);}

}
