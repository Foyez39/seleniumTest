package pages.methi;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AngularChartsPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav\"]/section/div/ul/li/button/i")
    private WebElement hoverOverAccount;

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav-dash\"]/div/div/div[2]/div[1]/div[1]/div[1]/a[3]")
    private WebElement UIForAngular;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[4]")
    private WebElement componentsModernAngular;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C1101_Col01\"]/a")
    private WebElement angularCharts;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[1]")
    private WebElement angularChartsOverview;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[2]")
    private WebElement angularChartsHighlights;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[3]")
    private WebElement angularChartsBenefits;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[4]")
    private WebElement angularChartsFeatures;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[5]")
    private WebElement angularChartsResources;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[6]")
    private WebElement angularChartsFAQs;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[7]")
    private WebElement angularChartsComponents;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[8]")
    private WebElement freeTrialCharts;

    public AngularChartsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //Reusable steps

    public void hoverOver(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverOverAccount).build().perform();
    }

    public void UIforAngularClick(){
        click(UIForAngular);
        waitFor(2);
    }

    public void setExploreComponents(){
        click(componentsModernAngular);
        waitFor(2);
    }

    public void angularChartsClick(){
        click(angularCharts);
        waitFor(2);
    }

    public void clickAngularChartsOverview(){
        click(angularChartsOverview);
        waitFor(2);
    }

    public void clickAngularChartsHighlights(){
        click(angularChartsHighlights);
        waitFor(2);
    }

    public void clickAngularChartsBenefits(){
        click(angularChartsBenefits);
        waitFor(2);
    }

    public void clickAngularChartsFeatures(){
        click(angularChartsFeatures);
        waitFor(2);
    }

    public void clickAngularChartsResources(){
        click(angularChartsResources);
        waitFor(2);
    }

    public void clickAngularChartsFAQs(){
        click(angularChartsFAQs);
        waitFor(2);
    }

    public void clickAngularChartsComponents(){
        click(angularChartsComponents);
        waitFor(2);
    }

    public void clickFreeChartsTrial(){
        click(freeTrialCharts);
        waitFor(2);
    }
}
