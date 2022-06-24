package pages.methi;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AngularSchedulerPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav\"]/section/div/ul/li/button/i")
    private WebElement hoverOverAccount;

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav-dash\"]/div/div/div[2]/div[1]/div[1]/div[1]/a[3]")
    private WebElement UIForAngular;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[4]")
    private WebElement exploreComponents;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C1101_Col02\"]/a")
    private WebElement scheduler;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C061_Col01\"]/div[3]/h4/a")
    private WebElement schedulerTable;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[1]/a")
    private WebElement schedulerOverview;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[2]/a")
    private WebElement schedulerEvents;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[3]/a")
    private WebElement schedulerEdit;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[4]/a")
    private WebElement schedulerResources;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[5]/a")
    private WebElement schedulerRecurrence;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[6]/a")
    private WebElement schedulerTimeZones;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[7]/a")
    private WebElement schedulerAgendaView;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[8]/a")
    private WebElement schedulerDayView;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[9]/a")
    private WebElement schedulerMonthView;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[10]/a")
    private WebElement schedulerTimeLineView;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[11]/a")
    private WebElement schedulerWeekViews;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[12]/a")
    private WebElement schedulerRealTime;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[13]/a")
    private WebElement schedulerDataBinding;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[14]/a")
    private WebElement schedulerPDFExport;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[15]/a")
    private WebElement schedulerTemplates;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[16]/a")
    private WebElement schedulerGlobalization;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[17]/a")
    private WebElement schedulerKeyboard;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[18]/a")
    private WebElement schedulerAccessibility;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C061_Col01\"]/div[3]/h4/a")
    private WebElement allAngularComponents;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/div[2]/div[2]")
    private WebElement getStarted;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/div[2]/div[2]/div/div[1]/div/div/div/a")
    private WebElement freeTrial;

    public AngularSchedulerPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void hoverOver(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverOverAccount).build().perform();
    }

    public void setUIForAngular(){click(UIForAngular);}

    public void setExploreComponents(){click(exploreComponents);}

    public void setScheduler(){click(scheduler);}

    public void hoverSchedulerTable(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(schedulerTable).build().perform();
    }

    public void schedulerOverviewClick(){click(schedulerOverview);}

    public void setSchedulerEvents(){click(schedulerEvents);}

    public void setSchedulerEdit(){click(schedulerEdit);}

    public void setSchedulerResources(){click(schedulerResources);}

    public void setSchedulerRecurrence(){click(schedulerRecurrence);}

    public void setSchedulerTimeZones(){click(schedulerTimeZones);}

    public void setSchedulerAgendaView(){click(schedulerAgendaView);}

    public void setSchedulerDayView(){click(schedulerDayView);}

    public void setSchedulerMonthView(){click(schedulerMonthView);}

    public void setSchedulerTimeLineView(){click(schedulerTimeLineView);}

    public void setSchedulerWeekViews(){click(schedulerWeekViews);}

    public void setSchedulerRealTime(){click(schedulerRealTime);}

    public void setSchedulerDataBinding(){click(schedulerDataBinding);}

    public void setSchedulerPDFExport(){click(schedulerPDFExport);}

    public void setSchedulerTemplates(){click(schedulerTemplates);}

    public void setSchedulerGlobalization(){click(schedulerGlobalization);}

    public void setSchedulerKeyboard(){click(schedulerKeyboard);}

    public void setSchedulerAccessibility(){click(schedulerAccessibility);}

    public void clickAllAngularComponents(){click(allAngularComponents);}

    public void scrollToViewGetStarted(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);", getStarted);
    }

    public void clickFreeTrial(){click(freeTrial);}

}
