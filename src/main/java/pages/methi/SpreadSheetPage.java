package pages.methi;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpreadSheetPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav\"]/section/div/ul/li/button/i")
    private WebElement hoverOverAccount;

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav-dash\"]/div/div/div[2]/div[1]/div[1]/div[1]/a[6]")
    private WebElement UIForASP_Ajax;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C446_Col00\"]/div/div/div[1]/div[2]/div")
    private WebElement demo;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C446_Col00\"]/div/div/div[1]/div[1]/a[2]")
    private WebElement listOfControls;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C417_Col00\"]/div/div[2]/ul/li[1]/a")
    private WebElement dataManagement;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C417_Col00\"]/div/div[1]/ul/li[1]/div/div[10]/div/a")
    private WebElement spreadSheetHover;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C417_Col00\"]/div/div[1]/ul/li[1]/div/div[10]/div/a")
    private WebElement spreadsheet;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C057_Col01\"]/div[3]/div/a")
    private WebElement allAjaxComponentsHover;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[1]/a")
    private WebElement comments;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[2]/a")
    private WebElement exportImport;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[3]/a")
    private WebElement formulas;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[4]/a")
    private WebElement excelExperience;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[5]/a")
    private WebElement imageSupport;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C057_Col01\"]/div[3]/div/a")
    private WebElement allAjaxComponents;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/section[3]")
    private WebElement nextSteps;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C051_Col02\"]/a")
    private WebElement startFreeTrial;

    public SpreadSheetPage(WebDriver driver){
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

    public void dataManagementPresent(){isPresent(dataManagement);}

    public void hoverOverSpreadsheetBtn(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(spreadSheetHover).build().perform();
    }

    public void spreadsheetClick(){click(spreadsheet);}

    public void hoverOverAllAjaxComponents(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(allAjaxComponentsHover).build().perform();
    }

    public void commentsClick(){click(comments);}

    public void exportImportClick(){click(exportImport);}

    public void formulasClick(){click(formulas);}

    public void excelExperienceClick(){click(excelExperience);}

    public void imageSupportClick(){click(imageSupport);}

    public void allAjaxComponentsClick(){click(allAjaxComponents);}

    public void hoverOverNextSteps(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(nextSteps).build().perform();
    }

    public void startFreeTrialClick(){click(startFreeTrial);}
}
