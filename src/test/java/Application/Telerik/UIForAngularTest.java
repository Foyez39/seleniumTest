package Application.Telerik;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.methi.AngularChartsPage;
import pages.methi.AngularDataGridPage;
import pages.methi.AngularSchedulerPage;
import pages.methi.LoginPage;
import utility.ExcelReader;

import static utility.Utility.currentDir;

public class UIForAngularTest extends CommonAPI {

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
    public void angularDataGridTelerik(){
        AngularDataGridPage angularDataGrid = new AngularDataGridPage(getDriver());
        waitFor(2);
        angularDataGrid.hoverOver(getDriver());
        waitFor(2);
        angularDataGrid.clickWithActionsUIForAngular(getDriver());
        waitFor(2);
        angularDataGrid.clickWithActionsComponentsModernAngular(getDriver());
        waitFor(2);
        angularDataGrid.clickWithActionsAngularDataGrid(getDriver());
        waitFor(2);
        angularDataGrid.clickWithActionsAngularGridOverview(getDriver());
        waitFor(2);
        angularDataGrid.clickWithActionsAngularGridHighlights(getDriver());
        angularDataGrid.clickWithActionsAngularGridBenefits(getDriver());
        angularDataGrid.clickWithActionsAngularGridFeatures(getDriver());
        angularDataGrid.clickWithActionsAngularGridResources(getDriver());
        angularDataGrid.clickWithActionsAngularGridFAQs(getDriver());
        angularDataGrid.clickWithActionsAngularGridComponents(getDriver());
        angularDataGrid.clickWithActionsFreeTrialGrid(getDriver());
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/kendo-angular-ui";
        Assert.assertEquals(expectedResult, getPageUrl());
    }

    @Test
    public void angularChartsTelerik(){
        AngularChartsPage angularCharts = new AngularChartsPage(getDriver());
        angularCharts.hoverOver(getDriver());
        angularCharts.UIforAngularClick();
        angularCharts.setExploreComponents();
        angularCharts.angularChartsClick();
        angularCharts.clickAngularChartsOverview();
        angularCharts.clickAngularChartsHighlights();
        angularCharts.clickAngularChartsBenefits();
        angularCharts.clickAngularChartsFeatures();
        angularCharts.clickAngularChartsResources();
        angularCharts.clickAngularChartsFAQs();
        angularCharts.clickAngularChartsComponents();
        angularCharts.clickFreeChartsTrial();
        String expectedResult = "https://www.telerik.com/try/kendo-angular-ui";
        Assert.assertEquals(expectedResult, getPageUrl());
    }

    @Test
    public void angularScheduler() {
        AngularSchedulerPage angularScheduler = new AngularSchedulerPage(getDriver());
        angularScheduler.hoverOver(getDriver());
        angularScheduler.setUIForAngular();
        angularScheduler.setExploreComponents();
        waitFor(2);
        angularScheduler.setScheduler();
        angularScheduler.hoverSchedulerTable(getDriver());
        angularScheduler.schedulerOverviewClick();
        angularScheduler.setSchedulerEvents();
        angularScheduler.setSchedulerEdit();
        angularScheduler.setSchedulerResources();
        angularScheduler.setSchedulerRecurrence();
        angularScheduler.setSchedulerTimeZones();
        angularScheduler.setSchedulerAgendaView();
        angularScheduler.setSchedulerDayView();
        angularScheduler.setSchedulerMonthView();
        angularScheduler.setSchedulerTimeLineView();
        angularScheduler.setSchedulerWeekViews();
        angularScheduler.setSchedulerRealTime();
        angularScheduler.setSchedulerDataBinding();
        angularScheduler.setSchedulerPDFExport();
        angularScheduler.setSchedulerTemplates();
        angularScheduler.setSchedulerGlobalization();
        angularScheduler.setSchedulerKeyboard();
        angularScheduler.setSchedulerAccessibility();
        angularScheduler.clickAllAngularComponents();
        angularScheduler.scrollToViewGetStarted(getDriver());
        waitFor(2);
        angularScheduler.clickFreeTrial();
        String expectedResult = "https://www.telerik.com/try/kendo-angular-ui";
        Assert.assertEquals(expectedResult, getPageUrl());
    }

}
