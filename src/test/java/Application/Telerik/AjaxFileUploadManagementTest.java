package Application.Telerik;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.methi.*;
import utility.ExcelReader;

import static utility.Utility.currentDir;

public class AjaxFileUploadManagementTest extends CommonAPI {

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
    public void clientExportManagerTelerik() {
        ClientExportManagerPage clientExportManager = new ClientExportManagerPage(getDriver());
        waitFor(2);
        clientExportManager.hoverOver(getDriver());
        waitFor(2);
        clientExportManager.UIForAjaxClick();
        waitFor(2);
        clientExportManager.hoverOverDemo(getDriver());
        waitFor(2);
        clientExportManager.listOfControlsClick();
        waitFor(2);
        clientExportManager.fileUploadManagementClick();
        waitFor(2);
        clientExportManager.hoverOverClientExportManagerBtn(getDriver());
        waitFor(2);
        clientExportManager.clientExportManagerClick();
        waitFor(2);
        clientExportManager.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        clientExportManager.exportWholePagesClick();
        waitFor(2);
        clientExportManager.allAjaxComponentsClick();
        waitFor(2);
        clientExportManager.hoverOverNextSteps(getDriver());
        waitFor(2);
        clientExportManager.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }


    @Test
    public void fileExplorerTelerik() {
        FileExplorerPage fileExplorer = new FileExplorerPage(getDriver());
        waitFor(2);
        fileExplorer.hoverOver(getDriver());
        waitFor(2);
        fileExplorer.UIForAjaxClick();
        waitFor(2);
        fileExplorer.hoverOverDemo(getDriver());
        waitFor(2);
        fileExplorer.listOfControlsClick();
        waitFor(2);
        fileExplorer.fileUploadManagementClick();
        waitFor(2);
        fileExplorer.hoverOverFileExplorerBtn(getDriver());
        waitFor(2);
        fileExplorer.fileExplorerClick();
        waitFor(2);
        fileExplorer.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        fileExplorer.explorerInterfaceClick();
        waitFor(2);
        fileExplorer.uploadPreviewFilesClick();
        waitFor(2);
        fileExplorer.fileDownloadClick();
        waitFor(2);
        fileExplorer.keyboardSupportClick();
        waitFor(2);
        fileExplorer.clientSideAPIClick();
        waitFor(2);
        fileExplorer.allAjaxComponentsClick();
        waitFor(2);
        fileExplorer.hoverOverNextSteps(getDriver());
        waitFor(2);
        fileExplorer.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }

    @Test
    public void pdfViewerTelerik() {
        PDFViewerPage pdfViewer = new PDFViewerPage(getDriver());
        waitFor(2);
        pdfViewer.hoverOver(getDriver());
        waitFor(2);
        pdfViewer.UIForAjaxClick();
        waitFor(2);
        pdfViewer.hoverOverDemo(getDriver());
        waitFor(2);
        pdfViewer.listOfControlsClick();
        waitFor(2);
        pdfViewer.fileUploadManagementClick();
        waitFor(2);
        pdfViewer.hoverOverPdfViewerBtn(getDriver());
        waitFor(2);
        pdfViewer.pdfViewerClick();
        waitFor(2);
        pdfViewer.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        pdfViewer.overviewClick();
        waitFor(2);
        pdfViewer.responsiveAdaptiveCapabilitiesClick();
        waitFor(2);
        pdfViewer.toolbarClick();
        waitFor(2);
        pdfViewer.virtualizationClick();
        waitFor(2);
        pdfViewer.skinsClick();
        waitFor(2);
        pdfViewer.keyboardSupportClick();
        waitFor(2);
        pdfViewer.accessibility();
        waitFor(2);
        pdfViewer.allAjaxComponentsClick();
        waitFor(2);
        pdfViewer.hoverOverNextSteps(getDriver());
        waitFor(2);
        pdfViewer.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }

    @Test
    public void zipLibraryTelerik() {
        ZipLibraryPage zipLibrary = new ZipLibraryPage(getDriver());
        waitFor(2);
        zipLibrary.hoverOver(getDriver());
        waitFor(2);
        zipLibrary.UIForAjaxClick();
        waitFor(2);
        zipLibrary.hoverOverDemo(getDriver());
        waitFor(2);
        zipLibrary.listOfControlsClick();
        waitFor(2);
        zipLibrary.fileUploadManagementClick();
        waitFor(2);
        zipLibrary.hoverOverZipLibraryBtn(getDriver());
        waitFor(2);
        zipLibrary.zipLibraryClick();
        waitFor(2);
        zipLibrary.hoverOverAllAjaxComponents(getDriver());
        waitFor(2);
        zipLibrary.zipLibraryOverviewClick();
        waitFor(2);
        zipLibrary.flexibleAPICreateZipFilesClick();
        waitFor(2);
        zipLibrary.loadDataZipFilesClick();
        waitFor(2);
        zipLibrary.compressDecompressClick();
        waitFor(2);
        zipLibrary.deflateLZMACompressionClick();
        waitFor(2);
        zipLibrary.supportLargeFilesClick();
        waitFor(2);
        zipLibrary.encryptionClick();
        waitFor(2);
        zipLibrary.allAjaxComponentsClick();
        waitFor(2);
        zipLibrary.hoverOverNextSteps(getDriver());
        waitFor(2);
        zipLibrary.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
    }
}
