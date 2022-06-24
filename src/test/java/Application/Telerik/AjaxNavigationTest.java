package Application.Telerik;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.methi.*;
import utility.ExcelReader;

import static utility.Utility.currentDir;

public class AjaxNavigationTest extends CommonAPI {

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
    public void breadcrumbTelerik() {
        BreadCrumbPage breadcrumb = new BreadCrumbPage(getDriver());
        waitFor(2);
        breadcrumb.hoverOver(getDriver());
        waitFor(2);
        breadcrumb.UIForAjaxClick();
        waitFor(2);
        breadcrumb.hoverOverDemo(getDriver());
        waitFor(2);
        breadcrumb.listOfControlsClick();
        waitFor(2);
        breadcrumb.navigationClick();
        waitFor(2);
        breadcrumb.hoverOverBreadcrumbBtn(getDriver());
        waitFor(2);
        breadcrumb.breadcrumbClick();
        waitFor(2);
        breadcrumb.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        breadcrumb.navigationSupportClick();
        waitFor(2);
        breadcrumb.RTLSupportClick();
        waitFor(2);
        breadcrumb.builtInSkinsClick();
        waitFor(2);
        breadcrumb.overviewClick();
        waitFor(2);
        breadcrumb.builtInIconsClick();
        waitFor(2);
        breadcrumb.editingClick();
        waitFor(2);
        breadcrumb.flexibleClientSideAPIClick();
        waitFor(2);
        breadcrumb.accessibilityKeyboardNavigationClick();
        waitFor(2);
        breadcrumb.allAjaxComponentsClick();
        waitFor(2);
        breadcrumb.hoverOverNextSteps(getDriver());
        waitFor(2);
        breadcrumb.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }

    @Test
    public void buttonTelerik() {
        ButtonPage button = new ButtonPage(getDriver());
        waitFor(2);
        button.hoverOver(getDriver());
        waitFor(2);
        button.UIForAjaxClick();
        waitFor(2);
        button.hoverOverDemo(getDriver());
        waitFor(2);
        button.listOfControlsClick();
        waitFor(2);
        button.navigationClick();
        waitFor(2);
        button.hoverOverButtonBtn(getDriver());
        waitFor(2);
        button.buttonClick();
        waitFor(2);
        button.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        button.expandedButtonBehaviorClick();
        waitFor(2);
        button.imageButtonsClick();
        waitFor(2);
        button.toggleButtonsClick();
        waitFor(2);
        button.contentButtonsClick();
        waitFor(2);
        button.accessibilityClick();
        waitFor(2);
        button.clientSideAPIClick();
        waitFor(2);
        button.embeddedIconsClick();
        waitFor(2);
        button.allAjaxComponentsClick();
        waitFor(2);
        button.hoverOverNextSteps(getDriver());
        waitFor(2);
        button.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }

    @Test
    public void panelBarTelerik() {
        PanelBarPage panelBar = new PanelBarPage(getDriver());
        waitFor(2);
        panelBar.hoverOver(getDriver());
        waitFor(2);
        panelBar.UIForAjaxClick();
        waitFor(2);
        panelBar.hoverOverDemo(getDriver());
        waitFor(2);
        panelBar.listOfControlsClick();
        waitFor(2);
        panelBar.navigationClick();
        waitFor(2);
        panelBar.hoverOverPanelBarBtn(getDriver());
        waitFor(2);
        panelBar.panelBarClick();
        waitFor(2);
        panelBar.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        panelBar.easyNavigationClick();
        waitFor(2);
        panelBar.dataBindingClick();
        waitFor(2);
        panelBar.hierarchyClick();
        waitFor(2);
        panelBar.templatesClick();
        waitFor(2);
        panelBar.keyboardSupportClick();
        waitFor(2);
        panelBar.allAjaxComponentsClick();
        waitFor(2);
        panelBar.hoverOverNextSteps(getDriver());
        waitFor(2);
        panelBar.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }

    @Test
    public void ribbonBarTelerik() {
        RibbonBarPage ribbonBar = new RibbonBarPage(getDriver());
        waitFor(2);
        ribbonBar.hoverOver(getDriver());
        waitFor(2);
        ribbonBar.UIForAjaxClick();
        waitFor(2);
        ribbonBar.hoverOverDemo(getDriver());
        waitFor(2);
        ribbonBar.listOfControlsClick();
        waitFor(2);
        ribbonBar.navigationClick();
        waitFor(2);
        ribbonBar.hoverOverRibbonBarBtn(getDriver());
        waitFor(2);
        ribbonBar.ribbonBarClick();
        waitFor(2);
        ribbonBar.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        ribbonBar.uniqueNavigationClick();
        waitFor(2);
        ribbonBar.templatesClick();
        waitFor(2);
        ribbonBar.keyboardSupportClick();
        waitFor(2);
        ribbonBar.quickAccessToolbarClick();
        waitFor(2);
        ribbonBar.contextualTabsClick();
        waitFor(2);
        ribbonBar.allAjaxComponentsClick();
        waitFor(2);
        ribbonBar.hoverOverNextSteps(getDriver());
        waitFor(2);
        ribbonBar.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }

    @Test
    public void siteMapTelerik() {
        SiteMapPage siteMap = new SiteMapPage(getDriver());
        waitFor(2);
        siteMap.hoverOver(getDriver());
        waitFor(2);
        siteMap.UIForAjaxClick();
        waitFor(2);
        siteMap.hoverOverDemo(getDriver());
        waitFor(2);
        siteMap.listOfControlsClick();
        waitFor(2);
        siteMap.navigationClick();
        waitFor(2);
        siteMap.hoverOverSitemapBtn(getDriver());
        waitFor(2);
        siteMap.sitemapClick();
        waitFor(2);
        siteMap.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        siteMap.dataBindingClick();
        waitFor(2);
        siteMap.nodeLinesClick();
        waitFor(2);
        siteMap.siteMapDataSourceClick();
        waitFor(2);
        siteMap.semanticRenderingClick();
        waitFor(2);
        siteMap.allAjaxComponentsClick();
        waitFor(2);
        siteMap.hoverOverNextSteps(getDriver());
        waitFor(2);
        siteMap.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }

    @Test
    public void splitButtonTelerik() {
        SplitButtonPage splitButton = new SplitButtonPage(getDriver());
        waitFor(2);
        splitButton.hoverOver(getDriver());
        waitFor(2);
        splitButton.UIForAjaxClick();
        waitFor(2);
        splitButton.hoverOverDemo(getDriver());
        waitFor(2);
        splitButton.listOfControlsClick();
        waitFor(2);
        splitButton.navigationClick();
        waitFor(2);
        splitButton.hoverOverSplitButtonBtn(getDriver());
        waitFor(2);
        splitButton.splitButtonClick();
        waitFor(2);
        splitButton.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        splitButton.overviewClick();
        waitFor(2);
        splitButton.splitButtonContextMenuClick();
        waitFor(2);
        splitButton.singleClickFunctionalityClick();
        waitFor(2);
        splitButton.splitButtonIconsClick();
        waitFor(2);
        splitButton.splitButtonContentTemplatesClick();
        waitFor(2);
        splitButton.builtInAccessibilityClick();
        waitFor(2);
        splitButton.keyboardNavigationClick();
        waitFor(2);
        splitButton.appearanceStylingClick();
        waitFor(2);
        splitButton.allAjaxComponentsClick();
        waitFor(2);
        splitButton.hoverOverNextSteps(getDriver());
        waitFor(2);
        splitButton.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }

    @Test
    public void stepperTelerik() {
        StepperPage stepper = new StepperPage(getDriver());
        waitFor(2);
        stepper.hoverOver(getDriver());
        waitFor(2);
        stepper.UIForAjaxClick();
        waitFor(2);
        stepper.hoverOverDemo(getDriver());
        waitFor(2);
        stepper.listOfControlsClick();
        waitFor(2);
        stepper.navigationClick();
        waitFor(2);
        stepper.hoverOverStepperBtn(getDriver());
        waitFor(2);
        stepper.stepperClick();
        waitFor(2);
        stepper.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        stepper.overviewClick();
        waitFor(2);
        stepper.operationsModelsClick();
        waitFor(2);
        stepper.orientationLayoutCustomizationClick();
        waitFor(2);
        stepper.keyboardNavigationAccessibilityClick();
        waitFor(2);
        stepper.allAjaxComponentsClick();
        waitFor(2);
        stepper.hoverOverNextSteps(getDriver());
        waitFor(2);
        stepper.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }

    @Test
    public void switchTelerik() {
        SwitchPage Switch = new SwitchPage(getDriver());
        waitFor(2);
        Switch.hoverOver(getDriver());
        waitFor(2);
        Switch.UIForAjaxClick();
        waitFor(2);
        Switch.hoverOverDemo(getDriver());
        waitFor(2);
        Switch.listOfControlsClick();
        waitFor(2);
        Switch.navigationClick();
        waitFor(2);
        Switch.hoverOverSwitchBtn(getDriver());
        waitFor(2);
        Switch.SwitchClick();
        waitFor(2);
        Switch.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        Switch.overviewClick();
        waitFor(2);
        Switch.appearanceClick();
        waitFor(2);
        Switch.eventsClick();
        waitFor(2);
        Switch.accessibilityKeyboardNavigationClick();
        waitFor(2);
        Switch.RTLSupportClick();
        waitFor(2);
        Switch.themesClick();
        waitFor(2);
        Switch.allAjaxComponentsClick();
        waitFor(2);
        Switch.hoverOverNextSteps(getDriver());
        waitFor(2);
        Switch.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }

    @Test
    public void toolBarTelerik() {
        ToolBarPage toolBar = new ToolBarPage(getDriver());
        waitFor(2);
        toolBar.hoverOver(getDriver());
        waitFor(2);
        toolBar.UIForAjaxClick();
        waitFor(2);
        toolBar.hoverOverDemo(getDriver());
        waitFor(2);
        toolBar.listOfControlsClick();
        waitFor(2);
        toolBar.navigationClick();
        waitFor(2);
        toolBar.hoverOverToolBarBtn(getDriver());
        waitFor(2);
        toolBar.toolBarClick();
        waitFor(2);
        toolBar.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        toolBar.dataBindingClick();
        waitFor(2);
        toolBar.itemTypesClick();
        waitFor(2);
        toolBar.flexibleToolbarsClick();
        waitFor(2);
        toolBar.clientSideAPIClick();
        waitFor(2);
        toolBar.templatesClick();
        waitFor(2);
        toolBar.allAjaxComponentsClick();
        waitFor(2);
        toolBar.hoverOverNextSteps(getDriver());
        waitFor(2);
        toolBar.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }
}
