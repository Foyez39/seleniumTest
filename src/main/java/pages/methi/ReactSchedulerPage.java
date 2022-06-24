package pages.methi;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReactSchedulerPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav\"]/section/div/ul/li/button/i")
    private WebElement hoverOverAccount;

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav-dash\"]/div/div/div[2]/div[1]/div[1]/div[1]/a[4]")
    private WebElement UIForReact;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[3]/div[5]/a")
    private WebElement componentsReact;

    @FindBy(xpath = "//*[@id=\"explore-all-components-section\"]/div/div[2]/div/div/div[2]/a")
    private WebElement reactScheduler;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/a[2]")
    private WebElement reactSchedulerTable;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[1]/a")
    private WebElement reactSchedulerOverview;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[2]/a")
    private WebElement reactSchedulerDayView;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[3]/a")
    private WebElement reactSchedulerWorkWeek;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[4]/a")
    private WebElement reactSchedulerMonthView;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[5]/a")
    private WebElement reactSchedulerTimeLine;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[6]/a")
    private WebElement reactSchedulerAgendaView;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[7]/a")
    private WebElement reactSchedulerMultipleEvent;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[8]/a")
    private WebElement reactSchedulerDataBinding;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[9]/a")
    private WebElement reactSchedulerEvents;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[10]/a")
    private WebElement reactSchedulerRecurrence;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[11]/a")
    private WebElement reactSchedulerResources;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[12]/a")
    private WebElement reactSchedulerTasks;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[13]/a")
    private WebElement reactSchedulerSlots;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[14]/a")
    private WebElement reactSchedulerEditing;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[15]/a")
    private WebElement reactSchedulerEditorForm;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[16]/a")
    private WebElement reactSchedulerGrouping;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[17]/a")
    private WebElement reactSchedulerTimeZones;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[18]/a")
    private WebElement reactSchedulerRendering;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[19]/a")
    private WebElement reactSchedulerSlotHeight;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[20]/a")
    private WebElement reactSchedulerItemHeight;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[21]/a")
    private WebElement reactSchedulerTimeMarker;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[22]/a")
    private WebElement reactSchedulerGlobalization;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[23]/a")
    private WebElement reactSchedulerKeyboardNav;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[24]/a")
    private WebElement reactSchedulerAccessibility;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/a[2]")
    private WebElement allReactComponents;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[6]")
    private WebElement nextSteps;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[6]/div/div/div[1]/a")
    private WebElement visitOurDemos;

    public ReactSchedulerPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void hoverOver(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverOverAccount).build().perform();
    }

    public void setUIForReact(){click(UIForReact);}

    public void setExploreComponents(){click(componentsReact);}

    public void setScheduler(){click(reactScheduler);}

    public void hoverSchedulerTable(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(reactSchedulerTable).build().perform();
    }

    public void schedulerOverviewClick(){click(reactSchedulerOverview);}

    public void setSchedulerDayViewClick(){click(reactSchedulerDayView);}

    public void setReactSchedulerWorkWeek(){click(reactSchedulerWorkWeek);}

    public void setReactSchedulerMonthView(){click(reactSchedulerMonthView);}

    public void setReactSchedulerTimeLine(){click(reactSchedulerTimeLine);}

    public void setReactSchedulerAgendaView(){click(reactSchedulerAgendaView);}

    public void setReactSchedulerMultipleEvent(){click(reactSchedulerMultipleEvent);}

    public void setReactSchedulerDataBinding(){click(reactSchedulerDataBinding);}

    public void setReactSchedulerEvents(){click(reactSchedulerEvents);}

    public void setReactSchedulerRecurrence(){click(reactSchedulerRecurrence);}

    public void setReactSchedulerResources(){click(reactSchedulerResources);}

    public void setReactSchedulerTasks(){click(reactSchedulerTasks);}

    public void setReactSchedulerSlots(){click(reactSchedulerSlots);}

    public void setReactSchedulerEditing(){click(reactSchedulerEditing);}

    public void setReactSchedulerEditorForm(){click(reactSchedulerEditorForm);}

    public void setReactSchedulerGrouping(){click(reactSchedulerGrouping);}

    public void setReactSchedulerTimeZones(){click(reactSchedulerTimeZones);}

    public void setReactSchedulerRendering(){click(reactSchedulerRendering);}

    public void setReactSchedulerSlotHeight(){click(reactSchedulerSlotHeight);}

    public void setReactSchedulerItemHeight(){click(reactSchedulerItemHeight);}

    public void setReactSchedulerTimeMarker(){click(reactSchedulerTimeMarker);}

    public void setReactSchedulerGlobalization(){click(reactSchedulerGlobalization);}

    public void setReactSchedulerKeyboardNav(){click(reactSchedulerKeyboardNav);}

    public void setReactSchedulerAccessibility(){click(reactSchedulerAccessibility);}

    public void clickWithActionsAllComponents(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.click(allReactComponents).build().perform();
    }

    public void scrollToViewComponents(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);", nextSteps);
    }

    public void clickVisitDemos(){click(visitOurDemos);}

}
