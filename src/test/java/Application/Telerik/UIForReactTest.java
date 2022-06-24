package Application.Telerik;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.methi.LoginPage;
import pages.methi.ReactChartsPage;
import pages.methi.ReactDataGridPage;
import pages.methi.ReactSchedulerPage;
import utility.ExcelReader;

import static utility.Utility.currentDir;

public class UIForReactTest extends CommonAPI {

    @BeforeMethod
    public void telerikLogin(){
        LoginPage loginPage = new LoginPage(getDriver());
        ExcelReader excelReader = new ExcelReader(currentDir + "/data/TestData.xlsx");
        String userEmail = excelReader.getDataFromCell("Sheet1", 0, 0);
        String userPassword = excelReader.getDataFromCell("Sheet1", 1,0);
        loginPage.clickYourAccount();
        loginPage.clickWithActionsCookies(getDriver());
        loginPage.typeEmail(userEmail);
        loginPage.typePassword(userPassword);
        loginPage.clickLoginBtn();
        loginPage.mainAccountName();
        String expectedResult = "https://www.telerik.com/account/";
        Assert.assertEquals(expectedResult, getPageUrl());
    }

    @Test
    public void reactDataGridTelerik(){
        ReactDataGridPage reactDataGrid = new ReactDataGridPage(getDriver());
        waitFor(2);
        reactDataGrid.hoverOver(getDriver());
        waitFor(2);
        reactDataGrid.UIforReactClick();
        waitFor(2);
        reactDataGrid.componentsReactClick();
        waitFor(2);
        reactDataGrid.reactDataGridClick();
        reactDataGrid.reactHighlightsClick();
        reactDataGrid.reactFilterSortLink();
        reactDataGrid.reactExportClick();
        reactDataGrid.reactCellSelectionClick();
        reactDataGrid.reactCustomEditingClick();
        reactDataGrid.reactInteractionsClick();
        reactDataGrid.reactVirtualizationClick();
        reactDataGrid.scrollToViewComponents(getDriver());
        waitFor(2);
        String expectedResult = "More React Data Grid Features";
        Assert.assertEquals(expectedResult, "More React Data Grid Features");
    }

    @Test
    public void reactScheduler(){
        ReactSchedulerPage reactScheduler = new ReactSchedulerPage(getDriver());
        waitFor(2);
        reactScheduler.hoverOver(getDriver());
        waitFor(2);
        reactScheduler.setUIForReact();
        reactScheduler.setExploreComponents();
        waitFor(2);
        reactScheduler.setScheduler();
        reactScheduler.hoverSchedulerTable(getDriver());
        reactScheduler.schedulerOverviewClick();
        reactScheduler.setSchedulerDayViewClick();
        reactScheduler.setReactSchedulerWorkWeek();
        reactScheduler.setReactSchedulerMonthView();
        reactScheduler.setReactSchedulerTimeLine();
        reactScheduler.setReactSchedulerAgendaView();
        reactScheduler.setReactSchedulerMultipleEvent();
        reactScheduler.setReactSchedulerDataBinding();
        reactScheduler.setReactSchedulerEvents();
        reactScheduler.setReactSchedulerRecurrence();
        reactScheduler.setReactSchedulerResources();
        reactScheduler.setReactSchedulerTasks();
        reactScheduler.setReactSchedulerSlots();
        reactScheduler.setReactSchedulerEditing();
        reactScheduler.setReactSchedulerEditorForm();
        reactScheduler.setReactSchedulerGrouping();
        reactScheduler.setReactSchedulerTimeZones();
        reactScheduler.setReactSchedulerRendering();
        reactScheduler.setReactSchedulerSlotHeight();
        reactScheduler.setReactSchedulerItemHeight();
        reactScheduler.setReactSchedulerTimeMarker();
        reactScheduler.setReactSchedulerGlobalization();
        reactScheduler.setReactSchedulerKeyboardNav();
        reactScheduler.setReactSchedulerAccessibility();
        reactScheduler.clickWithActionsAllComponents(getDriver());
        reactScheduler.scrollToViewComponents(getDriver());
        waitFor(2);
        reactScheduler.clickVisitDemos();
        String expectedResult = "https://www.telerik.com/kendo-react-ui/components/";
        Assert.assertEquals(expectedResult, getPageUrl());
    }


    @Test
    public void reactChartTelerik(){
        ReactChartsPage reactChartPage = new ReactChartsPage(getDriver());
        waitFor(2);
        reactChartPage.hoverOver(getDriver());
        waitFor(2);
        reactChartPage.setUIForReact();
        waitFor(2);
        reactChartPage.setExploreComponents();
        waitFor(2);
        reactChartPage.setReactCharts();
        reactChartPage.hoverReactTable(getDriver());
        reactChartPage.reactOverviewClick();
        reactChartPage.setReactChartTypesClick();
        reactChartPage.setReactChartDataTypes();
        reactChartPage.setReactChartSeriesSamePlot();
        reactChartPage.setReactChartAnimations();
        reactChartPage.setReactChartPanningZooming();
        reactChartPage.setReactChartElements();
        reactChartPage.setReactChartToolTips();
        reactChartPage.setReactChartLabels();
        reactChartPage.setReactChartErrorBars();
        reactChartPage.setReactChartCrossHairs();
        reactChartPage.setReactChartLegends();
        reactChartPage.setReactChartPlotBands();
        reactChartPage.setReactChartSelection();
        reactChartPage.setReactChartDesignSupport();
        reactChartPage.setReactChartCanvas();
        reactChartPage.setReactChartExportOptions();
        reactChartPage.setReactChartRendering();
        reactChartPage.setReactChartTutorial();
        reactChartPage.clickWithActionsAllComponents(getDriver());
        reactChartPage.scrollToViewComponents(getDriver());
        waitFor(2);
        reactChartPage.clickVisitDemos();
        String expectedResult = "https://www.telerik.com/kendo-react-ui/components/";
        Assert.assertEquals(expectedResult, getPageUrl());
    }
}
