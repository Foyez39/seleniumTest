package pages.methi;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JQuerySchedulerPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav\"]/section/div/ul/li/button/i")
    private WebElement hoverOverAccount;

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav-dash\"]/div/div/div[2]/div[1]/div[1]/div[1]/a[2]")
    private WebElement UIForJquery;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[4]")
    private WebElement exploreComponents3;

    @FindBy(xpath=  "//*[@id=\"ContentPlaceholder1_C1070_Col02\"]/a")
    private WebElement scheduler;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C061_Col01\"]/div[3]/h4/a")
    private WebElement allJQueryComponentsHover;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[1]/a")
    private WebElement schedulerOverview;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[2]/a")
    private WebElement schedulerDataBinding;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[3]/a")
    private WebElement schedulerTimezone;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[4]/a")
    private WebElement schedulerAppointmentViews;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[5]/a")
    private WebElement schedulerAppointmentEdit;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[6]/a")
    private WebElement schedulerResources;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[7]/a")
    private WebElement schedulerHierarchical;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[8]/a")
    private WebElement schedulerVertical;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[9]/a")
    private WebElement schedulerICal;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[10]/a")
    private WebElement schedulerExport;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[11]/a")
    private WebElement schedulerTemplates;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[12]/a")
    private WebElement schedulerSearchEvents;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[13]/a")
    private WebElement schedulerWorkingDays;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[14]/a")
    private WebElement schedulerRTL;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[15]/a")
    private WebElement schedulerKeyboard;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C061_Col01\"]/div[3]/h4/a")
    private WebElement allJQueryComponents;

    @FindBy(xpath = "//*[@id=\"telerik\"]/footer/div")
    private WebElement nextSteps;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/div[2]/div[2]/div/div[3]/a")
    private WebElement startFreeTrial;

    public JQuerySchedulerPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //reusable steps

    public void hoverOverJQuery(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverOverAccount).build().perform();
    }

    public void kendoUiJQueryClick(){click(UIForJquery);}

    public void setExploreComponents3(){click(exploreComponents3);}

    public void schedulerClick(){click(scheduler);}

    public void hoverAllJQueryComponents(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(allJQueryComponentsHover).build().perform();
    }

    public void schedulerOverviewClick(){click(schedulerOverview);}

    public void schedulerDataBindingClick(){click(schedulerDataBinding);}

    public void schedulerTimeZoneClick(){click(schedulerTimezone);}

    public void schedulerAppointmentViewsClick(){click(schedulerAppointmentViews);}

    public void schedulerAppointmentEditClick(){click(schedulerAppointmentEdit);}

    public void schedulerResourcesClick(){click(schedulerResources);}

    public void schedulerHierarchicalClick(){click(schedulerHierarchical);}

    public void schedulerVerticalClick(){click(schedulerVertical);}

    public void schedulerICalClick(){click(schedulerICal);}

    public void schedulerExportClick(){click(schedulerExport);}

    public void schedulerTemplatesClick(){click(schedulerTemplates);}

    public void schedulerSearchEventsClick(){click(schedulerSearchEvents);}

    public void schedulerWorkingDaysClick(){click(schedulerWorkingDays);}

    public void schedulerRTLClick(){click(schedulerRTL);}

    public void schedulerKeyboardClick(){click(schedulerKeyboard);}

    public void clickAllJQueryComponents(){click(allJQueryComponents);}

    public void scrollToViewNextSteps(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);", nextSteps);
    }

    public void startFreeTrialClick(){click(startFreeTrial);}

}
