package pages.methi;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToolTipPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav\"]/section/div/ul/li/button/i")
    private WebElement hoverOverAccount;

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav-dash\"]/div/div/div[2]/div[1]/div[1]/div[1]/a[6]")
    private WebElement UIForASP_Ajax;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C446_Col00\"]/div/div/div[1]/div[2]/div")
    private WebElement demo;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C446_Col00\"]/div/div/div[1]/div[1]/a[2]")
    private WebElement listOfControls;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C417_Col00\"]/div/div[2]/ul/li[3]/a")
    private WebElement layout;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C417_Col00\"]/div/div[1]/ul/li[3]/div/div[8]/div/a")
    private WebElement toolTipHover;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C417_Col00\"]/div/div[1]/ul/li[3]/div/div[8]/div/a")
    private WebElement toolTip;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C057_Col01\"]/div[3]/div/a")
    private WebElement allAjaxComponentsHover;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[1]/a")
    private WebElement contextualTooltips;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[2]/a")
    private WebElement automaticTooltips;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[3]/a")
    private WebElement loadOnDemand;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[4]/a")
    private WebElement webServiceSupport;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[5]/a")
    private WebElement controlIntegration;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C057_Col01\"]/div[3]/div/a")
    private WebElement allAjaxComponents;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/section[3]")
    private WebElement nextSteps;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C051_Col02\"]/a")
    private WebElement startFreeTrial;

    public ToolTipPage(WebDriver driver){
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

    public void layoutClick(){click(layout);}

    public void hoverOverToolTipBtn(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(toolTipHover).build().perform();
    }

    public void toolTipClick(){click(toolTip);}

    public void hoverOverAllAjaxComponents(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(allAjaxComponentsHover).build().perform();
    }

    public void contextualTooltipsClick(){click(contextualTooltips);}

    public void automaticTooltipsClick(){click(automaticTooltips);}

    public void loadOnDemandClick(){click(loadOnDemand);}

    public void webServiceSupportClick(){click(webServiceSupport);}

    public void controlIntegrationClick(){click(controlIntegration);}

    public void allAjaxComponentsClick(){click(allAjaxComponents);}

    public void hoverOverNextSteps(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(nextSteps).build().perform();
    }

    public void startFreeTrialClick(){click(startFreeTrial);}

}
