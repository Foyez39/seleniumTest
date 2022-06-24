package Application.Telerik;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.methi.*;
import utility.ExcelReader;

import static utility.Utility.currentDir;

public class AjaxInteractivityUXTest extends CommonAPI {

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
    public void conversationalUITelerik() {
        ConversationalUIPage conversationUI = new ConversationalUIPage(getDriver());
        conversationUI.hoverOver(getDriver());
        waitFor(2);
        conversationUI.UIForAjaxClick();
        waitFor(2);
        conversationUI.hoverOverDemo(getDriver());
        waitFor(2);
        conversationUI.listOfControlsClick();
        waitFor(2);
        conversationUI.interactivityUXClick();
        waitFor(2);
        conversationUI.hoverOverConversationalUIBtn(getDriver());
        waitFor(2);
        conversationUI.conversationalUIClick();
        waitFor(2);
        conversationUI.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        conversationUI.radChatClick();
        waitFor(2);
        conversationUI.toolBarClick();
        waitFor(2);
        conversationUI.allAjaxComponentsClick();
        waitFor(2);
        conversationUI.hoverOverNextSteps(getDriver());
        waitFor(2);
        conversationUI.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }

    @Test
    public void dragDropManagerTelerik() {
        DragDropManagerPage dragDropManager = new DragDropManagerPage(getDriver());
        dragDropManager.hoverOver(getDriver());
        waitFor(2);
        dragDropManager.UIForAjaxClick();
        waitFor(2);
        dragDropManager.hoverOverDemo(getDriver());
        waitFor(2);
        dragDropManager.listOfControlsClick();
        waitFor(2);
        dragDropManager.interactivityUXClick();
        waitFor(2);
        dragDropManager.hoverOverDragDropManagerBtn(getDriver());
        waitFor(2);
        dragDropManager.dragDropManagerClick();
        waitFor(2);
        dragDropManager.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        dragDropManager.overviewClick();
        waitFor(2);
        dragDropManager.dragDropBuildingBlocksClick();
        waitFor(2);
        dragDropManager.customDragDropClick();
        waitFor(2);
        dragDropManager.allAjaxComponentsClick();
        waitFor(2);
        dragDropManager.hoverOverNextSteps(getDriver());
        waitFor(2);
        dragDropManager.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
    }

    @Test
    public void persistenceFrameworkTelerik() {
        PersistenceFrameworkPage persistenceFramework = new PersistenceFrameworkPage(getDriver());
        persistenceFramework.hoverOver(getDriver());
        waitFor(2);
        persistenceFramework.UIForAjaxClick();
        waitFor(2);
        persistenceFramework.hoverOverDemo(getDriver());
        waitFor(2);
        persistenceFramework.listOfControlsClick();
        waitFor(2);
        persistenceFramework.interactivityUXClick();
        waitFor(2);
        persistenceFramework.hoverOverPersistenceFrameworkBtn(getDriver());
        waitFor(2);
        persistenceFramework.persistenceFrameworkClick();
        waitFor(2);
        persistenceFramework.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        persistenceFramework.saveSettingsAnywhereClick();
        waitFor(2);
        persistenceFramework.getFullControlClick();
        waitFor(2);
        persistenceFramework.persistCustomKeyValueSettingsClick();
        waitFor(2);
        persistenceFramework.visualStudioIntegrationClick();
        waitFor(2);
        persistenceFramework.highPerformanceClick();
        waitFor(2);
        persistenceFramework.saveLoadSettingsClick();
        waitFor(2);
        persistenceFramework.allAjaxComponentsClick();
        waitFor(2);
        persistenceFramework.hoverOverNextSteps(getDriver());
        waitFor(2);
        persistenceFramework.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }

    @Test
    public void progressBarTelerik() {
        ProgressBarPage progressBar = new ProgressBarPage(getDriver());
        progressBar.hoverOver(getDriver());
        waitFor(2);
        progressBar.UIForAjaxClick();
        waitFor(2);
        progressBar.hoverOverDemo(getDriver());
        waitFor(2);
        progressBar.listOfControlsClick();
        waitFor(2);
        progressBar.interactivityUXClick();
        waitFor(2);
        progressBar.hoverOverProgressBarBtn(getDriver());
        waitFor(2);
        progressBar.progressBarClick();
        waitFor(2);
        progressBar.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        progressBar.progressMonitoringClick();
        waitFor(2);
        progressBar.fileUploadProcessClick();
        waitFor(2);
        progressBar.templatesEasyCustomizationClick();
        waitFor(2);
        progressBar.builtInSkinsClick();
        waitFor(2);
        progressBar.crossBrowserSupportClick();
        waitFor(2);
        progressBar.allAjaxComponentsClick();
        waitFor(2);
        progressBar.hoverOverNextSteps(getDriver());
        waitFor(2);
        progressBar.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }

    @Test
    public void sliderTelerik() {
        SliderPage slider = new SliderPage(getDriver());
        slider.hoverOver(getDriver());
        waitFor(2);
        slider.UIForAjaxClick();
        waitFor(2);
        slider.hoverOverDemo(getDriver());
        waitFor(2);
        slider.listOfControlsClick();
        waitFor(2);
        slider.interactivityUXClick();
        waitFor(2);
        slider.hoverOverSliderBtn(getDriver());
        waitFor(2);
        slider.sliderClick();
        waitFor(2);
        slider.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        slider.sliderConfigurationClick();
        waitFor(2);
        slider.rangeSelectionClick();
        waitFor(2);
        slider.variousTickMarkersClick();
        waitFor(2);
        slider.keyboardSupportClick();
        waitFor(2);
        slider.clientSideAPIClick();
        waitFor(2);
        slider.allAjaxComponentsClick();
        waitFor(2);
        slider.hoverOverNextSteps(getDriver());
        waitFor(2);
        slider.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }
}
