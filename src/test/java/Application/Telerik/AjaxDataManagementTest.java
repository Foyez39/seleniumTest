package Application.Telerik;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.methi.*;
import utility.ExcelReader;

import static utility.Utility.currentDir;

public class AjaxDataManagementTest extends CommonAPI {

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
    public void clientDataSourceTelerik() {
        ClientDataSourcePage clientDataSource = new ClientDataSourcePage(getDriver());
        waitFor(2);
        clientDataSource.hoverOver(getDriver());
        waitFor(2);
        clientDataSource.UIforAjaxClick();
        waitFor(2);
        clientDataSource.listOfControlsClick();
        waitFor(2);
        clientDataSource.controlsPresent();
        waitFor(2);
        clientDataSource.dataManagementPresent();
        waitFor(2);
        clientDataSource.clientDataSourceClick();
        waitFor(2);
        clientDataSource.clientAPI_EventsClick();
        waitFor(2);
        clientDataSource.clientIntegrationsClick();
        waitFor(2);
        clientDataSource.clientCRUD_OperationsClick();
        waitFor(2);
        clientDataSource.clientDataPopulationClick();
        waitFor(2);
        clientDataSource.clientWebServicesClick();
        waitFor(2);
        clientDataSource.clientDataOperationsClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/products/aspnet-ajax/client-data-source.aspx";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }

    @Test
    public void dataPagerTelerik(){
        DataPagerPage dataPager = new DataPagerPage(getDriver());
        waitFor(2);
        dataPager.hoverOver(getDriver());
        waitFor(2);
        dataPager.UIforAjaxClick();
        waitFor(2);
        dataPager.listOfControlsClick();
        waitFor(2);
        dataPager.controlsPresent();
        waitFor(2);
        dataPager.dataManagementPresent();
        waitFor(2);
        dataPager.dataPagerClick();
        waitFor(2);
        dataPager.utilizeControlsClick();
        waitFor(2);
        dataPager.integrationsWithASPControlsClick();
        waitFor(2);
        String expectedURL = "https://www.telerik.com/products/aspnet-ajax/datapager.aspx";
        Assert.assertEquals(expectedURL, getPageUrl());
        waitFor(2);
    }

    @Test
    public void dataFormTelerik(){
        DataFormPage dataForm = new DataFormPage(getDriver());
        waitFor(2);
        dataForm.hoverOver(getDriver());
        waitFor(2);
        dataForm.UIforAjaxClick();
        waitFor(2);
        dataForm.listOfControlsClick();
        waitFor(2);
        dataForm.controlsPresent();
        waitFor(2);
        dataForm.dataManagementPresent();
        waitFor(2);
        dataForm.dataFormClick();
        waitFor(2);
        dataForm.presentDataClick();
        waitFor(2);
        dataForm.insert_Update_DeleteOperationsClick();
        waitFor(2);
        dataForm.serverSideDataBindingClick();
        waitFor(2);
        dataForm.builtInValidationClick();
        waitFor(2);
        dataForm.scalableAndFluidBehaviorClick();
        waitFor(2);
        dataForm.lightweightRenderingClick();
        waitFor(2);
        dataForm.studioIntegrationDesignSupportClick();
        waitFor(2);
        dataForm.builtInSkinsClick();
        waitFor(2);
        dataForm.crossBrowserSupportClick();
        waitFor(2);
        String expectedURL = "https://www.telerik.com/products/aspnet-ajax/dataform.aspx";
        Assert.assertEquals(expectedURL, getPageUrl());
        waitFor(2);
    }

    @Test
    public void filterTelerik(){
        FilterPage filterPage = new FilterPage(getDriver());
        waitFor(2);
        filterPage.hoverOver(getDriver());
        waitFor(2);
        filterPage.UIforAjaxClick();
        waitFor(2);
        filterPage.listOfControlsClick();
        waitFor(2);
        filterPage.controlsPresent();
        waitFor(2);
        filterPage.dataManagementPresent();
        waitFor(2);
        filterPage.filterClick();
        waitFor(2);
        filterPage.filteringAbilites();
        waitFor(2);
        filterPage.customFieldsClick();
        waitFor(2);
        filterPage.filterIntegrationClick();
        waitFor(2);
        filterPage.saveAndLoadFiltersClick();
        waitFor(2);
        String expectedURL = "https://www.telerik.com/products/aspnet-ajax/filter.aspx";
        Assert.assertEquals(expectedURL, getPageUrl());
        waitFor(2);
    }


    @Test
    public void gridTelerik(){
        GridPage grid = new GridPage(getDriver());
        grid.hoverOver(getDriver());
        grid.UIForAjaxClick();
        grid.hoverOverControlsList(getDriver());
        grid.listOfControlsClick();
        waitFor(2);
        grid.dataManagementPresent();
        grid.hoverOverGridBtn(getDriver());
        grid.gridClick();
        grid.hoverOverAllAjaxComponents(getDriver());
        grid.insertUpdateDeleteEditClick();
        grid.dataBindingServerClientWebserviceSideClick();
        grid.filteringClick();
        grid.groupingDragToGroupClick();
        grid.hierarchyNestedViewTemplateClick();
        grid.responsiveBehaviorMobileSupportClick();
        grid.exportPDFWordExcelCSVClick();
        grid.pagingClick();
        grid.sortingSingleMultiColumnClick();
        grid.scrollingStaticHeadersClick();
        grid.performanceClick();
        grid.selectingCellsColumnsRowsClick();
        grid.columnResizeReorderClick();
        grid.multiColumnHeadersClick();
        grid.autoFitColumnWidthClick();
        grid.workSheetNamePropertyClick();
        grid.enhancedCustomStylingClick();
        grid.rowResizeDragDropClick();
        grid.builtInColumnTypesClick();
        grid.commandItemClick();
        grid.templatesClick();
        grid.keyboardSupportClick();
        grid.contextMenusClick();
        grid.richClientSideServerSideAPIClick();
        grid.accessibilityInternationalizationClick();
        grid.builtInSkinsClick();
        grid.visualStudioIntegrationsClick();
        grid.easyToEnableClick();
        grid.crossBrowserSupportClick();
        grid.easyMigrationClick();
        grid.allAjaxComponentsClick();
        grid.hoverOverNextSteps(getDriver());
        waitFor(2);
        grid.startFreeTrialClick();
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
    }


    @Test
    public void listBoxTelerik() {
        ListBoxPage listBox = new ListBoxPage(getDriver());
        waitFor(2);
        listBox.hoverOver(getDriver());
        waitFor(2);
        listBox.UIforAjaxClick();
        waitFor(2);
        listBox.listOfControlsClick();
        waitFor(2);
        listBox.controlsPresent();
        waitFor(2);
        listBox.dataManagementPresent();
        waitFor(2);
        listBox.listBoxClick();
        waitFor(2);
        listBox.listingItemsClick();
        waitFor(2);
        listBox.dataBindingClick();
        waitFor(2);
        listBox.checkBoxesClick();
        waitFor(2);
        listBox.dragDropClick();
        waitFor(2);
        listBox.templatesClick();
        waitFor(2);
        listBox.loadDemandClick();
        waitFor(2);
        listBox.clientAPIClick();
        waitFor(2);
        String expectedURL = "https://www.telerik.com/products/aspnet-ajax/listbox.aspx";
        Assert.assertEquals(expectedURL, getPageUrl());
        waitFor(2);
    }
    @Test
    public void listViewTelerik() {
        ListViewPage listView = new ListViewPage(getDriver());
        waitFor(2);
        listView.hoverOver(getDriver());
        waitFor(2);
        listView.UIforAjaxClick();
        waitFor(2);
        listView.listOfControlsClick();
        waitFor(2);
        listView.controlsPresent();
        waitFor(2);
        listView.dataManagementPresent();
        waitFor(2);
        listView.listViewClick();
        waitFor(2);
        listView.insertUpdateDeleteClick();
        waitFor(2);
        listView.sortingPagingGroupingSelectionClick();
        waitFor(2);
        listView.filteringClick();
        waitFor(2);
        listView.dragDropClick();
        waitFor(2);
        listView.clientSideTemplatesClick();
        waitFor(2);
        listView.serverSideDataBindingClick();
        waitFor(2);
        listView.templatesClick();
        waitFor(2);
        String expectedURL = "https://www.telerik.com/products/aspnet-ajax/listview.aspx";
        Assert.assertEquals(expectedURL, getPageUrl());
        waitFor(2);
    }


    @Test
    public void OdataSourceTelerik() {
        OData_DataSourcePage OdataSource = new OData_DataSourcePage(getDriver());
        waitFor(2);
        OdataSource.hoverOver(getDriver());
        waitFor(2);
        OdataSource.UIforAjaxClick();
        waitFor(2);
        OdataSource.listOfControlsClick();
        waitFor(2);
        OdataSource.controlsPresent();
        waitFor(2);
        OdataSource.dataManagementPresent();
        waitFor(2);
        OdataSource.OdataClick();
        waitFor(2);
        OdataSource.OdataBindingClick();
        waitFor(2);
        OdataSource.schemaGenerationClick();
        waitFor(2);
        String expectedURL = "https://www.telerik.com/products/aspnet-ajax/odatadatasource.aspx";
        Assert.assertEquals(expectedURL, getPageUrl());
        waitFor(2);
    }

    @Test
    public void spreadSheetTelerik(){
        SpreadSheetPage spreadSheet = new SpreadSheetPage(getDriver());
        waitFor(2);
        spreadSheet.hoverOver(getDriver());
        waitFor(2);
        spreadSheet.UIForAjaxClick();
        waitFor(2);
        spreadSheet.hoverOverDemo(getDriver());
        waitFor(2);
        spreadSheet.listOfControlsClick();
        waitFor(2);
        spreadSheet.dataManagementPresent();
        waitFor(2);
        spreadSheet.hoverOverSpreadsheetBtn(getDriver());
        waitFor(2);
        spreadSheet.spreadsheetClick();
        waitFor(2);
        spreadSheet.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        spreadSheet.commentsClick();
        waitFor(2);
        spreadSheet.exportImportClick();
        waitFor(2);
        spreadSheet.formulasClick();
        waitFor(2);
        spreadSheet.excelExperienceClick();
        waitFor(2);
        spreadSheet.imageSupportClick();
        waitFor(2);
        spreadSheet.allAjaxComponentsClick();
        waitFor(2);
        spreadSheet.hoverOverNextSteps(getDriver());
        waitFor(2);
        spreadSheet.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }

    @Test
    public void treeListTelerik(){
        TreeListPage treeList = new TreeListPage(getDriver());
        waitFor(2);
        treeList.hoverOver(getDriver());
        waitFor(2);
        treeList.UIForAjaxClick();
        waitFor(2);
        treeList.hoverOverDemo(getDriver());
        waitFor(2);
        treeList.listOfControlsClick();
        waitFor(2);
        treeList.dataManagementPresent();
        waitFor(2);
        treeList.hoverOverTreeListBtn(getDriver());
        waitFor(2);
        treeList.treeListClick();
        waitFor(2);
        treeList.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        treeList.insertUpdateDeleteClick();
        waitFor(2);
        treeList.dataBindingClick();
        waitFor(2);
        treeList.pagingSortingSelectionClick();
        waitFor(2);
        treeList.columnInteractionsClick();
        waitFor(2);
        treeList.keyboardSupportClick();
        waitFor(2);
        treeList.viewComplexHierarchicalDataClick();
        waitFor(2);
        treeList.excelPDFExportClick();
        waitFor(2);
        treeList.allAjaxComponentsClick();
        waitFor(2);
        treeList.hoverOverNextSteps(getDriver());
        waitFor(2);
        treeList.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }
}
