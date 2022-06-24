package pages.methi;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AngularDataGridPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav\"]/section/div/ul/li/button/i")
    private WebElement hoverOverAccount;

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav-dash\"]/div/div/div[2]/div[1]/div[1]/div[1]/a[3]")
    private WebElement UIForAngular;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[4]")
    private WebElement componentsModernAngular;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C1101_Col00\"]/a")
    private WebElement angularDataGrid;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[1]")
    private WebElement angularGridOverview;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[2]")
    private WebElement angularGridHighlights;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[3]")
    private WebElement angularGridBenefits;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[4]")
    private WebElement angularGridFeatures;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[5]")
    private WebElement angularGridResources;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[6]")
    private WebElement angularGridFAQs;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[7]")
    private WebElement angularGridComponents;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[8]")
    private WebElement FreeTrialGrid;

    public AngularDataGridPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //Reusable steps

    public void hoverOver(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverOverAccount).build().perform();
    }

    public void clickWithActionsUIForAngular(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.click(UIForAngular).build().perform();
    }

    public void clickWithActionsComponentsModernAngular(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.click(componentsModernAngular).build().perform();
    }

    public void clickWithActionsAngularDataGrid(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.click(angularDataGrid).build().perform();
    }

    public void clickWithActionsAngularGridOverview(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.click(angularDataGrid).build().perform();
    }

    public void clickWithActionsAngularGridHighlights(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.click(angularGridHighlights).build().perform();
    }

    public void clickWithActionsAngularGridBenefits(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.click(angularGridBenefits).build().perform();
    }

    public void clickWithActionsAngularGridFeatures(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.click(angularGridFeatures).build().perform();
    }

    public void clickWithActionsAngularGridResources(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.click(angularGridResources).build().perform();
    }

    public void clickWithActionsAngularGridFAQs(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.click(angularGridFAQs).build().perform();
    }

    public void clickWithActionsAngularGridComponents(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.click(angularDataGrid).build().perform();
    }

    public void clickWithActionsFreeTrialGrid(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.click(FreeTrialGrid).build().perform();
    }

}
