package Application.Telerik;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.methi.JQueryChartsPage;
import pages.methi.JQueryDataGridPage;
import pages.methi.JQuerySchedulerPage;
import pages.methi.LoginPage;
import utility.ExcelReader;

import static utility.Utility.currentDir;

public class UIForJQueryTest extends CommonAPI {

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
    public void jQueryDataGridTelerik(){
        JQueryDataGridPage jQueryDataGrid = new JQueryDataGridPage(getDriver());
        waitFor(2);
        jQueryDataGrid.hoverOverJQuery(getDriver());
        waitFor(2);
        jQueryDataGrid.kendoUiJQueryClick();
        waitFor(2);
        jQueryDataGrid.setExploreComponents();
        waitFor(2);
        jQueryDataGrid.dataGridClick();
        jQueryDataGrid.hoverAllJQueryComponents(getDriver());
        jQueryDataGrid.overviewGridClick();
        jQueryDataGrid.renderingGridClick();
        jQueryDataGrid.interactionsGridClick();
        jQueryDataGrid.hierarchicalGridClick();
        jQueryDataGrid.frozenGridClick();
        jQueryDataGrid.filterGridClick();
        jQueryDataGrid.editingGridClick();
        jQueryDataGrid.bindingGridClick();
        jQueryDataGrid.virtualizationGridClick();
        jQueryDataGrid.excelGridClick();
        jQueryDataGrid.templatesGridClick();
        jQueryDataGrid.globalizationGridClick();
        jQueryDataGrid.keyboardGridClick();
        jQueryDataGrid.accessibilityGridClick();
        jQueryDataGrid.clickAllJQueryComponents();
        jQueryDataGrid.scrollToViewNextSteps(getDriver());
        waitFor(2);
        jQueryDataGrid.startFreeTrialClick();
        String expectedResult = "https://www.telerik.com/try/kendo-ui";
        Assert.assertEquals(expectedResult, getPageUrl());
        System.out.println("Test Successful!");
    }

    @Test
    public void jQueryChartsTelerik(){
        JQueryChartsPage jQueryCharts = new JQueryChartsPage(getDriver());
        waitFor(2);
        jQueryCharts.hoverOverJQuery(getDriver());
        waitFor(2);
        jQueryCharts.kendoUiJQueryClick();
        waitFor(2);
        jQueryCharts.setExploreComponents();
        waitFor(2);
        jQueryCharts.chartsClick();
        jQueryCharts.hoverAllJQueryComponents(getDriver());
        jQueryCharts.chartsOverviewClick();
        jQueryCharts.chartsTypeClick();
        jQueryCharts.chartsAxesClick();
        jQueryCharts.multipleChartsAxesClick();
        jQueryCharts.errorBarsClick();
        jQueryCharts.panningZoomingClick();
        jQueryCharts.chartsDataBindingClick();
        jQueryCharts.chartsRenderingClick();
        jQueryCharts.chartsNotesClick();
        jQueryCharts.chartsPanesClick();
        jQueryCharts.chartsToolTipsClick();
        jQueryCharts.chartsExportClick();
        jQueryCharts.chartsAppearanceClick();
        jQueryCharts.chartsAnimationClick();
        jQueryCharts.chartsPlotBandsClick();
        jQueryCharts.clickAllJQueryComponents();
        jQueryCharts.scrollToViewNextSteps(getDriver());
        waitFor(2);
        jQueryCharts.startFreeTrialClick();
        String expectedResult = "https://www.telerik.com/try/kendo-ui";
        Assert.assertEquals(expectedResult, getPageUrl());
        System.out.println("Test Successful!");
    }

    @Test
    public void jQuerySchedulerTelerik(){
        JQuerySchedulerPage jQueryScheduler = new JQuerySchedulerPage(getDriver());
        waitFor(2);
        jQueryScheduler.hoverOverJQuery(getDriver());
        waitFor(2);
        jQueryScheduler.kendoUiJQueryClick();
        waitFor(1);
        jQueryScheduler.setExploreComponents3();
        waitFor(2);
        jQueryScheduler.schedulerClick();
        jQueryScheduler.hoverAllJQueryComponents(getDriver());
        jQueryScheduler.schedulerOverviewClick();
        jQueryScheduler.schedulerDataBindingClick();
        jQueryScheduler.schedulerTimeZoneClick();
        jQueryScheduler.schedulerAppointmentViewsClick();
        jQueryScheduler.schedulerAppointmentEditClick();
        jQueryScheduler.schedulerResourcesClick();
        jQueryScheduler.schedulerHierarchicalClick();
        jQueryScheduler.schedulerVerticalClick();
        jQueryScheduler.schedulerICalClick();
        jQueryScheduler.schedulerExportClick();
        jQueryScheduler.schedulerTemplatesClick();
        jQueryScheduler.schedulerSearchEventsClick();
        jQueryScheduler.schedulerWorkingDaysClick();
        jQueryScheduler.schedulerRTLClick();
        jQueryScheduler.schedulerKeyboardClick();
        jQueryScheduler.clickAllJQueryComponents();
        jQueryScheduler.scrollToViewNextSteps(getDriver());
        waitFor(2);
        jQueryScheduler.startFreeTrialClick();
        String expectedResult = "https://www.telerik.com/try/kendo-ui";
        Assert.assertEquals(expectedResult, getPageUrl());
        System.out.println("Test Successful!");
    }
}
