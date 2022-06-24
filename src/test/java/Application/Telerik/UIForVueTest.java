package Application.Telerik;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.methi.LoginPage;
import pages.methi.VueChartsPage;
import pages.methi.VueDataGridPage;
import pages.methi.VueDatePickerPage;
import utility.ExcelReader;

import static utility.Utility.currentDir;

public class UIForVueTest extends CommonAPI {

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
    public void vueDataGridTelerik(){
        VueDataGridPage vueDataGridPage = new VueDataGridPage(getDriver());
        waitFor(2);
        vueDataGridPage.hoverOver(getDriver());
        vueDataGridPage.UIforVueClick();
        waitFor(2);
        vueDataGridPage.componentsVueClick();
        waitFor(2);
        vueDataGridPage.vueDataGridClick();
        vueDataGridPage.setVueTable();
        vueDataGridPage.reactOverviewClick();
        vueDataGridPage.vueIntegrationsClick();
        vueDataGridPage.vueOperationsClick();
        vueDataGridPage.scrollToViewComponents(getDriver());
        waitFor(2);
        String expectedResult = "Native Vue Components";
        Assert.assertEquals(expectedResult, "Native Vue Components");
        System.out.println("Test Successful!");
    }

    @Test
    public void vueChartsTelerik(){
        VueChartsPage vueCharts = new VueChartsPage(getDriver());
        vueCharts.hoverOver(getDriver());
        vueCharts.UIforVueClick();
        vueCharts.componentsVueClick();
        waitFor(2);
        vueCharts.vueChartsClick();
        vueCharts.setVueTable();
        vueCharts.vueOverviewClick();
        vueCharts.vueDataBondingClick();
        vueCharts.vueChartTypeClick();
        vueCharts.vueChartElementsClick();
        vueCharts.vueChartSeriesClick();
        vueCharts.vueChartPanningClick();
        vueCharts.vueChartAnimationsClick();
        vueCharts.vueChartRenderingClick();
        vueCharts.vueChartDesignClick();
        vueCharts.vueChartGlobalizationClick();
        vueCharts.scrollToViewComponents(getDriver());
        waitFor(2);
        String expectedResult = "Native Vue Components";
        Assert.assertEquals(expectedResult, "Native Vue Components");
        System.out.println("Test Successful!");
    }

    @Test
    public void vueDatePickerTelerik(){
        VueDatePickerPage vueDatePicker = new VueDatePickerPage(getDriver());
        waitFor(2);
        vueDatePicker.hoverOver(getDriver());
        waitFor(2);
        vueDatePicker.UIforVueClick();
        vueDatePicker.componentsVueClick();
        waitFor(2);
        vueDatePicker.vueDatePickerClick();
        vueDatePicker.setVueTable();
        vueDatePicker.vueOverviewClick();
        vueDatePicker.vueDefaultValueClick();
        vueDatePicker.vueFocusedDateClick();
        vueDatePicker.vueDisabledDatePickersClick();
        vueDatePicker.vueDateLimitsClick();
        vueDatePicker.vueFormatsClick();
        vueDatePicker.vuePlaceHoldersClick();
        vueDatePicker.vueNumberColumnClick();
        vueDatePicker.vueRenderingClick();
        vueDatePicker.vueFormsSupportClick();
        vueDatePicker.vueGlobalizationClick();
        vueDatePicker.vueKeyboardNavClick();
        vueDatePicker.scrollToViewComponents(getDriver());
        waitFor(2);
        String expectedResult = "Native Vue Components";
        Assert.assertEquals(expectedResult, "Native Vue Components");
        System.out.println("Test Successful!");
    }
}
