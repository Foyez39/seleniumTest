package pages.methi;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReactChartsPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav\"]/section/div/ul/li/button/i")
    private WebElement hoverOverAccount;

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav-dash\"]/div/div/div[2]/div[1]/div[1]/div[1]/a[4]")
    private WebElement UIForReact;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[3]/div[5]/a")
    private WebElement componentsReact;

    @FindBy(xpath = "//*[@id=\"explore-all-components-section\"]/div/div[2]/div/div/div[3]/a")
    private WebElement reactCharts;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/a[2]")
    private WebElement reactChartTable;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[1]/a")
    private WebElement reactChartOverview;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[2]")
    private WebElement reactChartTypes;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[3]/a")
    private WebElement reactChartDataTypes;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[4]/a")
    private WebElement reactChartSeriesSamePlot;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[5]/a")
    private WebElement reactChartAnimations;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[6]/a")
    private WebElement reactChartPanningZooming;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[7]/a")
    private WebElement reactChartElements;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[8]/a")
    private WebElement reactChartToolTips;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[9]/a")
    private WebElement reactChartLabels;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[10]/a")
    private WebElement reactChartErrorBars;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[11]/a")
    private WebElement reactChartCrossHairs;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[12]/a")
    private WebElement reactChartLegends;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[13]/a")
    private WebElement reactChartPlotBands;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[14]/a")
    private WebElement reactChartSelection;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[15]/a")
    private WebElement reactChartDesignSupport;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[16]/a")
    private WebElement reactChartCanvas;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[17]/a")
    private WebElement reactChartExportOptions;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[18]/a")
    private WebElement reactChartRendering;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[19]/a")
    private WebElement reactChartTutorial;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/a[2]")
    private WebElement allReactComponents;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[6]")
    private WebElement nextSteps;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[6]/div/div/div[1]/a")
    private WebElement visitOurDemos;

    public ReactChartsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void hoverOver(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverOverAccount).build().perform();
    }

    public void setUIForReact(){click(UIForReact);}

    public void setExploreComponents(){click(componentsReact);}

    public void setReactCharts(){click(reactCharts);}

    public void hoverReactTable(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(reactChartTable).build().perform();
    }

    public void reactOverviewClick(){click(reactChartOverview);}

    public void setReactChartTypesClick(){click(reactChartTypes);}

    public void setReactChartDataTypes(){click(reactChartDataTypes);}

    public void setReactChartSeriesSamePlot(){click(reactChartSeriesSamePlot);}

    public void setReactChartAnimations(){click(reactChartAnimations);}

    public void setReactChartPanningZooming(){click(reactChartPanningZooming);}

    public void setReactChartElements(){click(reactChartElements);}

    public void setReactChartToolTips(){click(reactChartToolTips);}

    public void setReactChartLabels(){click(reactChartLabels);}

    public void setReactChartErrorBars(){click(reactChartErrorBars);}

    public void setReactChartCrossHairs(){click(reactChartCrossHairs);}

    public void setReactChartLegends(){click(reactChartLegends);}

    public void setReactChartPlotBands(){click(reactChartPlotBands);}

    public void setReactChartSelection(){click(reactChartSelection);}

    public void setReactChartDesignSupport(){click(reactChartDesignSupport);}

    public void setReactChartCanvas(){click(reactChartCanvas);}

    public void setReactChartExportOptions(){click(reactChartExportOptions);}

    public void setReactChartRendering(){click(reactChartRendering);}

    public void setReactChartTutorial(){click(reactChartTutorial);}

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
