package Application.Telerik;

import base.CommonAPI;
import org.openqa.selenium.devtools.v85.page.Page;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.methi.*;
import utility.ExcelReader;

import static utility.Utility.currentDir;

public class AjaxLayoutTest extends CommonAPI {

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
    public void cardTelerik() {
        CardPage card = new CardPage(getDriver());
        card.hoverOver(getDriver());
        waitFor(2);
        card.UIForAjaxClick();
        waitFor(2);
        card.hoverOverDemo(getDriver());
        waitFor(2);
        card.listOfControlsClick();
        waitFor(2);
        card.layoutClick();
        waitFor(2);
        card.hoverOverCardBtn(getDriver());
        waitFor(2);
        card.cardClick();
        waitFor(2);
        card.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        card.overviewClick();
        waitFor(2);
        card.cardSubcomponentsClick();
        waitFor(2);
        card.stylesClick();
        waitFor(2);
        card.contentCustomizationClick();
        waitFor(2);
        card.orientationClick();
        waitFor(2);
        card.multipleSkinsClick();
        waitFor(2);
        card.rightToLeftSupportClick();
        waitFor(2);
        card.allAjaxComponentsClick();
        waitFor(2);
        card.hoverOverNextSteps(getDriver());
        waitFor(2);
        card.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }

    @Test
    public void deviceDetectionFrameworkTelerik() {
        DeviceDetectionFrameWorkPage deviceDetectionFramework = new DeviceDetectionFrameWorkPage(getDriver());
        deviceDetectionFramework.hoverOver(getDriver());
        waitFor(2);
        deviceDetectionFramework.UIForAjaxClick();
        waitFor(2);
        deviceDetectionFramework.hoverOverDemo(getDriver());
        waitFor(2);
        deviceDetectionFramework.listOfControlsClick();
        waitFor(2);
        deviceDetectionFramework.layoutClick();
        waitFor(2);
        deviceDetectionFramework.hoverOverDeviceDetectionFrameworkBtn(getDriver());
        waitFor(2);
        deviceDetectionFramework.deviceDetectionFrameworkClick();
        waitFor(2);
        deviceDetectionFramework.detectScreenSizeClick();
        waitFor(2);
        deviceDetectionFramework.integrationWithTelerikClick();
        waitFor(2);
        deviceDetectionFramework.allAjaxComponentsClick();
        waitFor(2);
        deviceDetectionFramework.hoverOverNextSteps(getDriver());
        waitFor(2);
        deviceDetectionFramework.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }

    @Test
    public void dockTelerik() {
        DockPage dock = new DockPage(getDriver());
        dock.hoverOver(getDriver());
        waitFor(2);
        dock.UIForAjaxClick();
        waitFor(2);
        dock.hoverOverDemo(getDriver());
        waitFor(2);
        dock.listOfControlsClick();
        waitFor(2);
        dock.layoutClick();
        waitFor(2);
        dock.hoverOverDockBtn(getDriver());
        waitFor(2);
        dock.dockClick();
        waitFor(2);
        dock.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        dock.interactionsClick();
        waitFor(2);
        dock.saveLoadLayoutsClick();
        waitFor(2);
        dock.preventDockingClick();
        waitFor(2);
        dock.clientSideAPIClick();
        waitFor(2);
        dock.dockingClick();
        waitFor(2);
        dock.allAjaxComponentsClick();
        waitFor(2);
        dock.hoverOverNextSteps(getDriver());
        waitFor(2);
        dock.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }

    @Test
    public void multiviewTelerik() {
        MultiviewPage multiview = new MultiviewPage(getDriver());
        multiview.hoverOver(getDriver());
        waitFor(2);
        multiview.UIForAjaxClick();
        waitFor(2);
        multiview.hoverOverDemo(getDriver());
        waitFor(2);
        multiview.listOfControlsClick();
        waitFor(2);
        multiview.layoutClick();
        waitFor(2);
        multiview.hoverOverMultiviewBtn(getDriver());
        waitFor(2);
        multiview.multiViewClick();
        waitFor(2);
        multiview.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        multiview.organizeContentClick();
        waitFor(2);
        multiview.renderingPageClick();
        waitFor(2);
        multiview.dynamicContentClick();
        waitFor(2);
        multiview.builtInIntegrationClick();
        waitFor(2);
        multiview.wizardCreationClick();
        waitFor(2);
        multiview.allAjaxComponentsClick();
        waitFor(2);
        multiview.hoverOverNextSteps(getDriver());
        waitFor(2);
        multiview.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }

    @Test
    public void notificationsTelerik() {
        NotificationsPage notifications = new NotificationsPage(getDriver());
        notifications.hoverOver(getDriver());
        waitFor(2);
        notifications.UIForAjaxClick();
        waitFor(2);
        notifications.hoverOverDemo(getDriver());
        waitFor(2);
        notifications.listOfControlsClick();
        waitFor(2);
        notifications.layoutClick();
        waitFor(2);
        notifications.hoverOverNotificationsBtn(getDriver());
        waitFor(2);
        notifications.notificationsClick();
        waitFor(2);
        notifications.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        notifications.simpleNotificationsClick();
        waitFor(2);
        notifications.settingContentClick();
        waitFor(2);
        notifications.bindToWebServicesClick();
        waitFor(2);
        notifications.clientSideAPIClick();
        waitFor(2);
        notifications.updateIntervalsClick();
        waitFor(2);
        notifications.allAjaxComponentsClick();
        waitFor(2);
        notifications.hoverOverNextSteps(getDriver());
        waitFor(2);
        notifications.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }

    @Test
    public void pageLayoutTelerik() {
        PageLayoutPage pageLayout = new PageLayoutPage(getDriver());
        pageLayout.hoverOver(getDriver());
        waitFor(2);
        pageLayout.UIForAjaxClick();
        waitFor(2);
        pageLayout.hoverOverDemo(getDriver());
        waitFor(2);
        pageLayout.listOfControlsClick();
        waitFor(2);
        pageLayout.layoutClick();
        waitFor(2);
        pageLayout.hoverOverPageLayoutBtn(getDriver());
        waitFor(2);
        pageLayout.pageLayoutClick();
        waitFor(2);
        pageLayout.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        pageLayout.quicklyBuildPageLayoutsClick();
        waitFor(2);
        pageLayout.appsResponsiveClick();
        waitFor(2);
        pageLayout.reduceBandwidthClick();
        waitFor(2);
        pageLayout.semanticMutableRenderingClick();
        waitFor(2);
        pageLayout.fixedFluidLayoutsClick();
        waitFor(2);
        pageLayout.rapidPrototypingClick();
        waitFor(2);
        pageLayout.crossBrowserSupportClick();
        waitFor(2);
        pageLayout.allAjaxComponentsClick();
        waitFor(2);
        pageLayout.hoverOverNextSteps(getDriver());
        waitFor(2);
        pageLayout.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }

    @Test
    public void splitterTelerik() {
        SplitterPage splitter = new SplitterPage(getDriver());
        splitter.hoverOver(getDriver());
        waitFor(2);
        splitter.UIForAjaxClick();
        waitFor(2);
        splitter.hoverOverDemo(getDriver());
        waitFor(2);
        splitter.listOfControlsClick();
        waitFor(2);
        splitter.layoutClick();
        waitFor(2);
        splitter.hoverOverSplitterBtn(getDriver());
        waitFor(2);
        splitter.splitterClick();
        waitFor(2);
        splitter.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        splitter.splitContentsClick();
        waitFor(2);
        splitter.splitterOrientationClick();
        waitFor(2);
        splitter.slidingPanesClick();
        waitFor(2);
        splitter.externalContentClick();
        waitFor(2);
        splitter.nestedSplittersClick();
        waitFor(2);
        splitter.allAjaxComponentsClick();
        waitFor(2);
        splitter.hoverOverNextSteps(getDriver());
        waitFor(2);
        splitter.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }

    @Test
    public void toolTipTelerik(){
        ToolTipPage tooltip = new ToolTipPage(getDriver());
        tooltip.hoverOver(getDriver());
        waitFor(2);
        tooltip.UIForAjaxClick();
        waitFor(2);
        tooltip.hoverOverDemo(getDriver());
        waitFor(2);
        tooltip.listOfControlsClick();
        waitFor(2);
        tooltip.layoutClick();
        waitFor(2);
        tooltip.hoverOverToolTipBtn(getDriver());
        waitFor(2);
        tooltip.toolTipClick();
        waitFor(2);
        tooltip.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        tooltip.contextualTooltipsClick();
        waitFor(2);
        tooltip.automaticTooltipsClick();
        waitFor(2);
        tooltip.loadOnDemandClick();
        waitFor(2);
        tooltip.webServiceSupportClick();
        waitFor(2);
        tooltip.controlIntegrationClick();
        waitFor(2);
        tooltip.allAjaxComponentsClick();
        waitFor(2);
        tooltip.hoverOverNextSteps(getDriver());
        waitFor(2);
        tooltip.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }
}
