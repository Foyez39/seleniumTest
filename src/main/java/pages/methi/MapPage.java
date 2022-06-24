package pages.methi;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MapPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav\"]/section/div/ul/li/button/i")
    private WebElement hoverOverAccount;

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav-dash\"]/div/div/div[2]/div[1]/div[1]/div[1]/a[6]")
    private WebElement UIForASP_Ajax;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C446_Col00\"]/div/div/div[1]/div[2]/div")
    private WebElement demo;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C446_Col00\"]/div/div/div[1]/div[1]/a[2]")
    private WebElement listOfControls;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C417_Col00\"]/div/div[2]/ul/li[8]/a")
    private WebElement dataVisualization;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C417_Col00\"]/div/div[1]/ul/li[8]/div/div[6]/div/a")
    private WebElement mapHover;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C417_Col00\"]/div/div[1]/ul/li[8]/div/div[6]/div/a")
    private WebElement map;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C057_Col01\"]/div[3]/div/a")
    private WebElement allAjaxComponentsHover;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[1]/a")
    private WebElement geoDataVisualization;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[2]/a")
    private WebElement geoJSONDataVisualization;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[3]/a")
    private WebElement markers;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[4]/a")
    private WebElement crossLayerIntegration;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[5]/a")
    private WebElement mobileTouchSupport;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[6]/a")
    private WebElement dataBinding;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[7]/a")
    private WebElement clientSideServerSideAPI;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[8]/a")
    private WebElement accessibilityInternationalization;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C057_Col01\"]/div[3]/div/a")
    private WebElement allAjaxComponents;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/section[3]")
    private WebElement nextSteps;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C051_Col02\"]/a")
    private WebElement startFreeTrial;

    public MapPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //Reusable Steps

    public void hoverOver(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverOverAccount).build().perform();
    }

    public void UIForAjaxClick(){click(UIForASP_Ajax);}

    public void hoverOverDemo(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(demo).build().perform();
    }

    public void listOfControlsClick(){click(listOfControls);}

    public void dataVisualizationClick(){click(dataVisualization);}

    public void hoverOverMapBtn(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(mapHover).build().perform();
    }

    public void mapClick(){click(map);}

    public void hoverOverAllAjaxComponents(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(allAjaxComponentsHover).build().perform();
    }

    public void geoDataVisualizationClick(){click(geoDataVisualization);}

    public void geoJSONDataVisualizationClick(){click(geoJSONDataVisualization);}

    public void markersClick(){click(markers);}

    public void crossLayerIntegrationClick(){click(crossLayerIntegration);}

    public void mobileTouchSupportClick(){click(mobileTouchSupport);}

    public void dataBindingClick(){click(dataBinding);}

    public void clientSideServerSideAPIClick(){click(clientSideServerSideAPI);}

    public void accessibilityInternationalizationClick(){click(accessibilityInternationalization);}

    public void allAjaxComponentsClick(){click(allAjaxComponents);}

    public void hoverOverNextSteps(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(nextSteps).build().perform();
    }

    public void startFreeTrialClick(){click(startFreeTrial);}

}


