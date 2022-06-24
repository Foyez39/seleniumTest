package Application.Telerik;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.methi.*;
import utility.ExcelReader;

import static utility.Utility.currentDir;

public class AjaxDataVisualizationTest extends CommonAPI {

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
    public void barcodeTelerik() {
        BarcodePage barcode = new BarcodePage(getDriver());
        waitFor(2);
        barcode.hoverOver(getDriver());
        waitFor(2);
        barcode.UIForAjaxClick();
        waitFor(2);
        barcode.hoverOverDemo(getDriver());
        waitFor(2);
        barcode.listOfControlsClick();
        waitFor(2);
        barcode.dataVisualizationClick();
        waitFor(2);
        barcode.hoverOverBarcodeBtn(getDriver());
        waitFor(2);
        barcode.barcodeClick();
        waitFor(2);
        barcode.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        barcode.barcodeGenerationClick();
        waitFor(2);
        barcode.barcodeTypesClick();
        waitFor(2);
        barcode.qrCodeGenerationClick();
        waitFor(2);
        barcode.integrationClick();
        waitFor(2);
        barcode.allAjaxComponentsClick();
        waitFor(2);
        barcode.hoverOverNextSteps(getDriver());
        waitFor(2);
        barcode.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }

    @Test
    public void binaryImageTelerik() {
        BinaryImagePage binaryImage = new BinaryImagePage(getDriver());
        waitFor(2);
        binaryImage.hoverOver(getDriver());
        waitFor(2);
        binaryImage.UIForAjaxClick();
        waitFor(2);
        binaryImage.hoverOverDemo(getDriver());
        waitFor(2);
        binaryImage.listOfControlsClick();
        waitFor(2);
        binaryImage.dataVisualizationClick();
        waitFor(2);
        binaryImage.hoverOverBinaryImageBtn(getDriver());
        waitFor(2);
        binaryImage.binaryImageClick();
        waitFor(2);
        binaryImage.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        binaryImage.displayImagesClick();
        waitFor(2);
        binaryImage.integrateIntoDataBoundControlsClick();
        waitFor(2);
        binaryImage.allAjaxComponentsClick();
        waitFor(2);
        binaryImage.hoverOverNextSteps(getDriver());
        waitFor(2);
        binaryImage.startFreeTrialClick();
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }

    @Test
    public void diagramTelerik() {
        DiagramPage diagram = new DiagramPage(getDriver());
        waitFor(2);
        diagram.hoverOver(getDriver());
        waitFor(2);
        diagram.UIForAjaxClick();
        waitFor(2);
        diagram.hoverOverDemo(getDriver());
        waitFor(2);
        diagram.listOfControlsClick();
        waitFor(2);
        diagram.dataVisualizationClick();
        waitFor(2);
        diagram.hoverOverDiagramBtn(getDriver());
        waitFor(2);
        diagram.diagramClick();
        waitFor(2);
        diagram.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        diagram.serverSideDataBindingClick();
        waitFor(2);
        diagram.richEndUserInteractionsClick();
        waitFor(2);
        diagram.customizeElementsTemplatesSupportClick();
        waitFor(2);
        diagram.predefinedLayoutsClick();
        waitFor(2);
        diagram.exportImportJSONDataClick();
        waitFor(2);
        diagram.zoomPanZindexClick();
        waitFor(2);
        diagram.HTML5RenderingPerformanceClick();
        waitFor(2);
        diagram.visualStudioIntegrationClick();
        waitFor(2);
        diagram.builtInSkinsClick();
        waitFor(2);
        diagram.allAjaxComponentsClick();
        waitFor(2);
        diagram.hoverOverNextSteps(getDriver());
        waitFor(2);
        diagram.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }

    @Test
    public void gaugeTelerik() {
        GaugePage gauge = new GaugePage(getDriver());
        waitFor(2);
        gauge.hoverOver(getDriver());
        waitFor(2);
        gauge.UIForAjaxClick();
        waitFor(2);
        gauge.hoverOverDemo(getDriver());
        waitFor(2);
        gauge.listOfControlsClick();
        waitFor(2);
        gauge.dataVisualizationClick();
        waitFor(2);
        gauge.hoverOverGaugeBtn(getDriver());
        waitFor(2);
        gauge.gaugeClick();
        waitFor(2);
        gauge.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        gauge.linearRadialGaugesClick();
        waitFor(2);
        gauge.animationClick();
        waitFor(2);
        gauge.designTimeSupportClick();
        waitFor(2);
        gauge.clientSideRenderingClick();
        waitFor(2);
        gauge.richServerSideAPIClick();
        waitFor(2);
        gauge.richClientSideAPIClick();
        waitFor(2);
        gauge.allAjaxComponentsClick();
        waitFor(2);
        gauge.hoverOverNextSteps(getDriver());
        waitFor(2);
        gauge.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }

    @Test
    public void mapTelerik() {
        MapPage map = new MapPage(getDriver());
        waitFor(2);
        map.hoverOver(getDriver());
        waitFor(2);
        map.UIForAjaxClick();
        waitFor(2);
        map.hoverOverDemo(getDriver());
        waitFor(2);
        map.listOfControlsClick();
        waitFor(2);
        map.dataVisualizationClick();
        waitFor(2);
        map.hoverOverMapBtn(getDriver());
        waitFor(2);
        map.mapClick();
        waitFor(2);
        map.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        map.geoDataVisualizationClick();
        waitFor(2);
        map.geoJSONDataVisualizationClick();
        waitFor(2);
        map.markersClick();
        waitFor(2);
        map.crossLayerIntegrationClick();
        waitFor(2);
        map.mobileTouchSupportClick();
        waitFor(2);
        map.dataBindingClick();
        waitFor(2);
        map.clientSideServerSideAPIClick();
        waitFor(2);
        map.accessibilityInternationalizationClick();
        waitFor(2);
        map.allAjaxComponentsClick();
        waitFor(2);
        map.hoverOverNextSteps(getDriver());
        waitFor(2);
        map.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }

    @Test
    public void orgChartTelerik() {
        OrgChartPage orgChart = new OrgChartPage(getDriver());
        waitFor(2);
        orgChart.hoverOver(getDriver());
        waitFor(2);
        orgChart.UIForAjaxClick();
        waitFor(2);
        orgChart.hoverOverDemo(getDriver());
        waitFor(2);
        orgChart.listOfControlsClick();
        waitFor(2);
        orgChart.dataVisualizationClick();
        waitFor(2);
        orgChart.hoverOverOrgChartBtn(getDriver());
        waitFor(2);
        orgChart.orgChartClick();
        waitFor(2);
        orgChart.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        orgChart.organizationLayoutClick();
        waitFor(2);
        orgChart.templatesClick();
        waitFor(2);
        orgChart.dataBindingClick();
        waitFor(2);
        orgChart.dragDropClick();
        waitFor(2);
        orgChart.expandCollapseItemSupportClick();
        waitFor(2);
        orgChart.allAjaxComponentsClick();
        waitFor(2);
        orgChart.hoverOverNextSteps(getDriver());
        waitFor(2);
        orgChart.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }

    @Test
    public void rotatorTelerik() {
        RotatorPage rotatorPage = new RotatorPage(getDriver());
        waitFor(2);
        rotatorPage.hoverOver(getDriver());
        waitFor(2);
        rotatorPage.UIForAjaxClick();
        waitFor(2);
        rotatorPage.hoverOverDemo(getDriver());
        waitFor(2);
        rotatorPage.listOfControlsClick();
        waitFor(2);
        rotatorPage.dataVisualizationClick();
        waitFor(2);
        rotatorPage.hoverOverRotatorBtn(getDriver());
        waitFor(2);
        rotatorPage.rotatorClick();
        waitFor(2);
        rotatorPage.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        rotatorPage.rotatingItemsClick();
        waitFor(2);
        rotatorPage.coverFlowModeClick();
        waitFor(2);
        rotatorPage.carouselModeClick();
        waitFor(2);
        rotatorPage.radTickerClick();
        waitFor(2);
        rotatorPage.dataBindingClick();
        waitFor(2);
        rotatorPage.allAjaxComponentsClick();
        waitFor(2);
        rotatorPage.hoverOverNextSteps(getDriver());
        waitFor(2);
        rotatorPage.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }

    @Test
    public void timelineTelerik() {
        TimelinePage timeline = new TimelinePage(getDriver());
        waitFor(2);
        timeline.hoverOver(getDriver());
        waitFor(2);
        timeline.UIForAjaxClick();
        waitFor(2);
        timeline.hoverOverDemo(getDriver());
        waitFor(2);
        timeline.listOfControlsClick();
        waitFor(2);
        timeline.dataVisualizationClick();
        waitFor(2);
        timeline.hoverOverTimelineBtn(getDriver());
        waitFor(2);
        timeline.timelineClick();
        waitFor(2);
        timeline.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        timeline.overviewClick();
        waitFor(2);
        timeline.orientationClick();
        waitFor(2);
        timeline.templatesClick();
        waitFor(2);
        timeline.supportsDataBindingClick();
        waitFor(2);
        timeline.allAjaxComponentsClick();
        waitFor(2);
        timeline.hoverOverNextSteps(getDriver());
        waitFor(2);
        timeline.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }
}
