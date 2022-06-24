package Application.Telerik;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.methi.CalenderPage;
import pages.methi.DateRangePickerPage;
import pages.methi.GanttChartPage;
import pages.methi.LoginPage;
import utility.ExcelReader;

import static utility.Utility.currentDir;

public class AjaxSchedulingTest extends CommonAPI {

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
    public void calenderTelerik() {
        CalenderPage calender = new CalenderPage(getDriver());
        calender.hoverOver(getDriver());
        waitFor(2);
        calender.UIForAjaxClick();
        waitFor(2);
        calender.hoverOverDemo(getDriver());
        waitFor(2);
        calender.listOfControlsClick();
        waitFor(2);
        calender.schedulingClick();
        waitFor(2);
        calender.hoverOverCalenderBtn(getDriver());
        waitFor(2);
        calender.calenderClick();
        waitFor(2);
        calender.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        calender.simpleCalenderFunctionsClick();
        waitFor(2);
        calender.datePickerClick();
        waitFor(2);
        calender.timePickerClick();
        waitFor(2);
        calender.monthYearPickerClick();
        waitFor(2);
        calender.keyboardSupportClick();
        waitFor(2);
        calender.clientSideAPIClick();
        waitFor(2);
        calender.templatesClick();
        waitFor(2);
        calender.allAjaxComponentsClick();
        waitFor(2);
        calender.hoverOverNextSteps(getDriver());
        waitFor(2);
        calender.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }

    @Test
    public void dateRangePickerTelerik() {
        DateRangePickerPage dateRangePicker = new DateRangePickerPage(getDriver());
        dateRangePicker.hoverOver(getDriver());
        waitFor(2);
        dateRangePicker.UIForAjaxClick();
        waitFor(2);
        dateRangePicker.hoverOverDemo(getDriver());
        waitFor(2);
        dateRangePicker.listOfControlsClick();
        waitFor(2);
        dateRangePicker.schedulingClick();
        waitFor(2);
        dateRangePicker.hoverOverDateRangePickerBtn(getDriver());
        waitFor(2);
        dateRangePicker.dateRangePickerClick();
        waitFor(2);
        dateRangePicker.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        dateRangePicker.overviewClick();
        waitFor(2);
        dateRangePicker.dataBindingClick();
        waitFor(2);
        dateRangePicker.dateRangeSelectionClick();
        waitFor(2);
        dateRangePicker.customizationClick();
        waitFor(2);
        dateRangePicker.monthYearPopupClick();
        waitFor(2);
        dateRangePicker.eventsClick();
        waitFor(2);
        dateRangePicker.globalizationLocalizationClick();
        waitFor(2);
        dateRangePicker.accessibilityClick();
        waitFor(2);
        dateRangePicker.keyboardNavigationClick();
        waitFor(2);
        dateRangePicker.appearanceStylingClick();
        waitFor(2);
        dateRangePicker.allAjaxComponentsClick();
        waitFor(2);
        dateRangePicker.hoverOverNextSteps(getDriver());
        waitFor(2);
        dateRangePicker.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }

    @Test
    public void ganttChartTelerik() {
        GanttChartPage ganttChart = new GanttChartPage(getDriver());
        ganttChart.hoverOver(getDriver());
        waitFor(2);
        ganttChart.UIForAjaxClick();
        waitFor(2);
        ganttChart.hoverOverDemo(getDriver());
        waitFor(2);
        ganttChart.listOfControlsClick();
        waitFor(2);
        ganttChart.schedulingClick();
        waitFor(2);
        ganttChart.hoverOverGanttChartBtn(getDriver());
        waitFor(2);
        ganttChart.ganttChartClick();
        waitFor(2);
        ganttChart.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        ganttChart.richUITaskManagementClick();
        waitFor(2);
        ganttChart.treeListViewClick();
        waitFor(2);
        ganttChart.timeLineViewClick();
        waitFor(2);
        ganttChart.plannedActualClick();
        waitFor(2);
        ganttChart.dataBindingClick();
        waitFor(2);
        ganttChart.clientTemplatesClick();
        waitFor(2);
        ganttChart.clientTemplatesClick();
        waitFor(2);
        ganttChart.richClientSideAPIServerSideAPIClick();
        waitFor(2);
        ganttChart.accessibilityInternationalizationClick();
        waitFor(2);
        ganttChart.allAjaxComponentsClick();
        waitFor(2);
        ganttChart.hoverOverNextSteps(getDriver());
        waitFor(2);
        ganttChart.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }
}
