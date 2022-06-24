package pages.methi;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JQueryDataGridPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav\"]/section/div/ul/li/button/i")
    private WebElement hoverOverAccount;

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav-dash\"]/div/div/div[2]/div[1]/div[1]/div[1]/a[2]")
    private WebElement UIForJquery;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[4]")
    private WebElement exploreComponents;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C1070_Col00\"]/a")
    private WebElement dataGrid;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C061_Col01\"]/div[3]/h4/a")
    private WebElement allJQueryComponentsHover;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[1]/a")
    private WebElement dataGridOverview;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[2]/a")
    private WebElement dataGridRendering;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[3]/a")
    private WebElement dataGridInteractions;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[4]/a")
    private WebElement dataGridHierarchical;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[5]/a")
    private WebElement dataGridFrozen;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[6]/a")
    private WebElement dataGridFilter;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[7]/a")
    private WebElement dataGridEditing;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[8]/a")
    private WebElement dataGridDataBinding;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[9]/a")
    private WebElement dataGridVirtualization;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[10]/a")
    private WebElement dataGridExcel;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[11]/a")
    private WebElement dataGridTemplates;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[12]/a")
    private WebElement dataGridGlobalization;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[13]/a")
    private WebElement dataGridKeyboard;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[14]/a")
    private WebElement dataGridAccessibility;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C061_Col01\"]/div[3]/h4/a")
    private WebElement allJQueryComponents;

    @FindBy(xpath = "//*[@id=\"telerik\"]/footer/div")
    private WebElement nextSteps;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/div[2]/div[2]/div/div[3]/a")
    private WebElement startFreeTrial;

    public JQueryDataGridPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //reusable elements

    public void hoverOverJQuery(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverOverAccount).build().perform();
    }

    public void kendoUiJQueryClick(){click(UIForJquery);}

    public void setExploreComponents(){click(exploreComponents);}

    public void dataGridClick(){click(dataGrid);}

    public void hoverAllJQueryComponents(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(allJQueryComponentsHover).build().perform();
    }

    public void overviewGridClick(){click(dataGridOverview);}

    public void renderingGridClick(){click(dataGridRendering);}

    public void interactionsGridClick(){click(dataGridInteractions);}

    public void hierarchicalGridClick(){click(dataGridHierarchical);}

    public void frozenGridClick(){click(dataGridFrozen);}

    public void filterGridClick(){click(dataGridFilter);}

    public void editingGridClick(){click(dataGridEditing);}

    public void bindingGridClick(){click(dataGridDataBinding);}

    public void virtualizationGridClick(){click(dataGridVirtualization);}

    public void excelGridClick(){click(dataGridExcel);}

    public void templatesGridClick(){click(dataGridTemplates);}

    public void globalizationGridClick(){click(dataGridGlobalization);}

    public void keyboardGridClick(){click(dataGridKeyboard);}

    public void accessibilityGridClick(){click(dataGridAccessibility);}

    public void clickAllJQueryComponents(){click(allJQueryComponents);}

    public void scrollToViewNextSteps(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);", nextSteps);
    }

    public void startFreeTrialClick(){click(startFreeTrial);}

}
