package pages.methi;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToolBarPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav\"]/section/div/ul/li/button/i")
    private WebElement hoverOverAccount;

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav-dash\"]/div/div/div[2]/div[1]/div[1]/div[1]/a[6]")
    private WebElement UIForASP_Ajax;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C446_Col00\"]/div/div/div[1]/div[2]/div")
    private WebElement demo;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C446_Col00\"]/div/div/div[1]/div[1]/a[2]")
    private WebElement listOfControls;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C417_Col00\"]/div/div[2]/ul/li[11]/a")
    private WebElement navigation;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C417_Col00\"]/div/div[1]/ul/li[11]/div/div[12]/div/a")
    private WebElement toolBarHover;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C417_Col00\"]/div/div[1]/ul/li[11]/div/div[12]/div/a")
    private WebElement toolBar;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C057_Col01\"]/div[3]/div/a")
    private WebElement allAjaxComponentsHover;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[1]/a")
    private WebElement dataBinding;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[2]/a")
    private WebElement itemTypes;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[3]/a")
    private WebElement flexibleToolbars;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[4]/a")
    private WebElement clientSideAPI;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[5]/a")
    private WebElement templates;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C057_Col01\"]/div[3]/div/a")
    private WebElement allAjaxComponents;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/section[3]")
    private WebElement nextSteps;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C051_Col02\"]/a")
    private WebElement startFreeTrial;

    public ToolBarPage(WebDriver driver){
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

    public void navigationClick(){click(navigation);}

    public void hoverOverToolBarBtn(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(toolBarHover).build().perform();
    }

    public void toolBarClick(){click(toolBar);}

    public void hoverOverAllAjaxComponents(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(allAjaxComponentsHover).build().perform();
    }

    public void dataBindingClick(){click(dataBinding);}

    public void itemTypesClick(){click(itemTypes);}

    public void flexibleToolbarsClick(){click(flexibleToolbars);}

    public void clientSideAPIClick(){click(clientSideAPI);}

    public void templatesClick(){click(templates);}

    public void allAjaxComponentsClick(){click(allAjaxComponents);}

    public void hoverOverNextSteps(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(nextSteps).build().perform();
    }

    public void startFreeTrialClick(){click(startFreeTrial);}

}
