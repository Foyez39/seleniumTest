package pages.methi;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JQueryChartsPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav\"]/section/div/ul/li/button/i")
    private WebElement hoverOverAccount;

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav-dash\"]/div/div/div[2]/div[1]/div[1]/div[1]/a[2]")
    private WebElement UIForJquery;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[4]")
    private WebElement exploreComponents;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C1070_Col01\"]/a")
    private WebElement charts;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C061_Col01\"]/div[3]/h4/a")
    private WebElement allJQueryComponentsHover;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[1]/a")
    private WebElement chartsOverview;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[2]/a")
    private WebElement chartsChartType;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[3]/a")
    private WebElement chartsAxes;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[4]/a")
    private WebElement chartsMultipleAxes;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[5]/a")
    private WebElement chartsErrorBars;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[6]/a")
    private WebElement chartsPanningZooming;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[7]/a")
    private WebElement chartsDataBinding;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[8]/a")
    private WebElement chartsCanvasRendering;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[9]/a")
    private WebElement chartsNotes;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[10]/a")
    private WebElement chartsPanes;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[11]/a")
    private WebElement chartsTooltips;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[12]/a")
    private WebElement chartsExport;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[13]/a")
    private WebElement chartsAppearance;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[14]/a")
    private WebElement chartsAnimation;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[15]/a")
    private WebElement chartsPlotBands;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C061_Col01\"]/div[3]/h4/a")
    private WebElement allJQueryComponents;

    @FindBy(xpath = "//*[@id=\"telerik\"]/footer/div")
    private WebElement nextSteps;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/div[2]/div[2]/div/div[3]/a")
    private WebElement startFreeTrial;

    public JQueryChartsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void hoverOverJQuery(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverOverAccount).build().perform();
    }

    public void kendoUiJQueryClick(){click(UIForJquery);}

    public void setExploreComponents(){click(exploreComponents);}

    public void chartsClick(){click(charts);}

    public void hoverAllJQueryComponents(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(allJQueryComponentsHover).build().perform();
    }

    public void chartsOverviewClick(){click(chartsOverview);}

    public void chartsTypeClick(){click(chartsChartType);}

    public void chartsAxesClick(){click(chartsAxes);}

    public void multipleChartsAxesClick(){click(chartsMultipleAxes);}

    public void errorBarsClick(){click(chartsErrorBars);}

    public void panningZoomingClick(){click(chartsPanningZooming);}

    public void chartsDataBindingClick(){click(chartsDataBinding);}

    public void chartsRenderingClick(){click(chartsCanvasRendering);}

    public void chartsNotesClick(){click(chartsNotes);}

    public void chartsPanesClick(){click(chartsPanes);}

    public void chartsToolTipsClick(){click(chartsTooltips);}

    public void chartsExportClick(){click(chartsExport);}

    public void chartsAppearanceClick(){click(chartsAppearance);}

    public void chartsAnimationClick(){click(chartsAnimation);}

    public void chartsPlotBandsClick(){click(chartsPlotBands);}

    public void clickAllJQueryComponents(){click(allJQueryComponents);}

    public void scrollToViewNextSteps(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);", nextSteps);
    }

    public void startFreeTrialClick(){click(startFreeTrial);}

}
