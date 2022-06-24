package pages.methi;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.Keys.ARROW_DOWN;
import static org.openqa.selenium.Keys.ENTER;

public class SearchCheckoutPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav-search-link\"]")
    private WebElement search;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C006_Col00\"]/section[1]/div/div/div/tk-site-search/div/div/input")
    private WebElement searchBox;

    @FindBy(xpath = "//*[@id=\"js-results-wrapper\"]/div[3]/ul/li[1]/h4/a")
    private WebElement angularComponent;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C1035_Col01\"]/a")
    private WebElement buyNowBtn;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C140_Col00\"]/div/div/div[1]/table/thead/tr[1]/th[2]/div/h4")
    private WebElement viewKendoUI;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C140_Col00\"]/div/div/div[1]/table/thead/tr[5]/th[1]/div/a")
    private WebElement buyNowBtnPurchase;

    @FindBy(xpath = "//*[@id=\"autobill-5293\"]")
    private WebElement autoRenew;

    @FindBy(xpath = "//*[@id=\"5293\"]/td[2]/div[2]/quantity-select/div[1]/kendo-dropdownlist")
    private WebElement licenseQuantity;

    @FindBy(xpath = "//*[@id=\"5293\"]/td[4]/div[2]/period-select/div/kendo-dropdownlist")
    private WebElement supportQuantity;

    @FindBy(xpath = "/html/body/div[1]/div/shopping-cart-app/section/your-order/div/div/div[6]/button/span")
    private WebElement continueBtn;

    @FindBy(xpath = "/html/body/div[1]/div/shopping-cart-app/section/ng-component/div/div/div[2]/div[1]/form/h2")
    private WebElement billingInformation;

    @FindBy (css = "#onetrust-accept-btn-handler")
    private WebElement cookiesBtn;

    @FindBy(xpath = "//*[@id=\"siSameAsBilling\"]")
    private WebElement sameAsBilling;

    @FindBy(xpath = "//*[@id=\"biFirstName\"]")
    private WebElement firstName;

    @FindBy(xpath = "//*[@id=\"biLastName\"]")
    private WebElement lastName;

    @FindBy(xpath = "//*[@id=\"biEmail\"]")
    private WebElement email;

    @FindBy(xpath = "//*[@id=\"biCompany\"]")
    private WebElement company;

    @FindBy(xpath = "//*[@id=\"biPhone\"]")
    private WebElement phoneNumber;

    @FindBy(xpath = "//*[@id=\"biAddress\"]")
    private WebElement address;

    @FindBy(xpath = "//*[@id=\"biCountry\"]/span/span")
    private WebElement country;

    @FindBy(xpath = "//*[@id=\"biState\"]/span/span")
    private WebElement state;

    @FindBy(xpath = "//*[@id=\"biCity\"]")
    private WebElement city;

    @FindBy(xpath = "//*[@id=\"biZipCode\"]")
    private WebElement zipCode;

    @FindBy(xpath = "/html/body/div[1]/div/shopping-cart-app/section/ng-component/div/div/div[4]/button/span")
    private WebElement continueBtn2;

    public SearchCheckoutPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    //Reusable steps

    public void hoverOverSearch(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.moveToElement(search).build().perform();
    }

    public void clickWithJSSearch(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", search);
    }

    public void typeSearchBox(){
        typeAndEnter(searchBox, "Angular Component");
    }

    public void angularComponentClick(){
        click(angularComponent);
    }

    public void buyNowBtnClick(){
        click(buyNowBtn);
    }

    public void scrollToViewKendoUI(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);", viewKendoUI);
    }

    public void buyNowBtnPurchaseClick(){
        click(buyNowBtnPurchase);
    }

    public void checkBoxUnclicked(){
        click(autoRenew);
    }

    public void checkBoxClicked(){
        click(autoRenew);
    }

    public boolean checkBoxIsCheckedAutoRenew(){
        return autoRenew.isSelected();
    }

    public void clickWithActionsLicenseQuantity(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.click(licenseQuantity).pause(java.time.Duration.ofSeconds(2)).sendKeys(Keys.ARROW_DOWN, ENTER).build().perform();
    }

    public void clickWithActionsSupportQuantity(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.click(supportQuantity).pause(java.time.Duration.ofSeconds(2)).sendKeys(Keys.ARROW_DOWN, ARROW_DOWN, ENTER).build().perform();
    }

    public void clickWithActionsContinueBtn(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.click(continueBtn).build().perform();
    }

    public void clickWithJSContinueBtn(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", continueBtn);
    }

    public void sameAsBillingClick(){
        click(sameAsBilling);
        waitFor(1);
    }

    public void scrollToViewBillingInformation(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);", billingInformation);
    }

    public void clickWithActionsCookies(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.click(cookiesBtn).build().perform();
    }

    public void firstNameType(){
        type(firstName, "John");
    }

    public void lastNameType(){
        type(lastName, "Smith");
    }

    public void emailType(){
        type(email, "facebooktester1089@gmail.com");
    }

    public void companyType(){
        type(company, "Facebook.com");
    }

    public void phoneNumberType(){
        type(phoneNumber, "555-555-5555");
    }

    public void addressType(){
        type(address, "123 Fake Street");
    }

    public void clickWithActionsCountry(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.click(country).pause(java.time.Duration.ofSeconds(2)).sendKeys("United States", Keys.ENTER).perform();
    }

    public void clickWithActionsState(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.click(state).pause(java.time.Duration.ofSeconds(2)).sendKeys("New York", Keys.ENTER).build().perform();
    }

    public void cityType(){
        type(city,"New York");
    }

    public void zipCode(){
        type(zipCode, "11417");
    }

    public void clickWithJSContinueBtn2(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", continueBtn2);
    }

    public void clickWithActionsContinueBtn2(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.click(continueBtn2).build().perform();
    }
}
