package pages.methi;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GridPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav\"]/section/div/ul/li/button/i")
    private WebElement hoverOverAccount;

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav-dash\"]/div/div/div[2]/div[1]/div[1]/div[1]/a[6]")
    private WebElement UIForASP_Ajax;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C446_Col00\"]/div/div/div[1]/div[1]/a[2]")
    private WebElement listOfControls;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C417_Col00\"]/div/div[2]/ul/li[1]/a")
    private WebElement dataManagement;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C417_Col00\"]/div/div[1]/ul/li[1]/div/div[5]/div/a")
    private WebElement gridHover;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C417_Col00\"]/div/div[1]/ul/li[1]/div/div[5]/div/a")
    private WebElement grid;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C057_Col01\"]/div[3]/div/a")
    private WebElement allAjaxComponentsHover;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[1]/a")
    private WebElement insertUpdateDeleteEdit;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[2]/a")
    private WebElement dataBindingServerClientWebserviceSide;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[3]/a")
    private WebElement filtering;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[4]/a")
    private WebElement groupingDragToGroup;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[5]/a")
    private WebElement hierarchyNestedViewTemplate;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[6]/a")
    private WebElement responsiveBehaviorMobileSupport;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[7]/a")
    private WebElement exportPDFWordExcelCSV;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[8]/a")
    private WebElement paging;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[9]/a")
    private WebElement sortingSingleMultiColumn;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[10]/a")
    private WebElement scrollingStaticHeaders;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[11]/a")
    private WebElement performance;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[12]/a")
    private WebElement selectingCellsColumnsRows;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[13]/a")
    private WebElement columnResizeReorder;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[14]/a")
    private WebElement multiColumnHeaders;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[15]/a")
    private WebElement autoFitColumnWidth;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[16]/a")
    private WebElement workSheetNameProperty;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[17]/a")
    private WebElement enhancedCustomStyling;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[18]/a")
    private WebElement rowResizeDragDrop;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[19]/a")
    private WebElement builtInColumnTypes;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[20]/a")
    private WebElement commandItem;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[21]/a")
    private WebElement templates;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[22]/a")
    private WebElement keyboardSupport;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[23]/a")
    private WebElement contextMenus;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[24]/a")
    private WebElement richClientSideServerSideAPI;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[25]/a")
    private WebElement accessibilityInternationalization;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[26]/a")
    private WebElement builtInSkins;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[27]/a")
    private WebElement visualStudioIntegrations;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[28]/a")
    private WebElement easyToEnable;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[29]/a")
    private WebElement crossBrowserSupport;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[30]/a")
    private WebElement easyMigration;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C057_Col01\"]/div[3]/div/a")
    private WebElement allAjaxComponents;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C050_Col00\"]/h2")
    private WebElement nextSteps;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C051_Col02\"]/a")
    private WebElement startFreeTrial;

    public GridPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //Reusable Steps

    public void hoverOver(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverOverAccount).build().perform();
    }

    public void UIForAjaxClick(){click(UIForASP_Ajax);}

    public void hoverOverControlsList(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(listOfControls).build().perform();
    }

    public void listOfControlsClick(){click(listOfControls);}

    public void dataManagementPresent(){isPresent(dataManagement);}

    public void gridClick(){click(grid);}

    public void hoverOverAllAjaxComponents(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(allAjaxComponentsHover).build().perform();
    }

    public void hoverOverGridBtn(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(gridHover).build().perform();
    }

    public void insertUpdateDeleteEditClick(){click(insertUpdateDeleteEdit);}

    public void dataBindingServerClientWebserviceSideClick(){click(dataBindingServerClientWebserviceSide);}

    public void filteringClick(){click(filtering);}

    public void groupingDragToGroupClick(){click(groupingDragToGroup);}

    public void hierarchyNestedViewTemplateClick(){click(hierarchyNestedViewTemplate);}

    public void responsiveBehaviorMobileSupportClick(){click(responsiveBehaviorMobileSupport);}

    public void exportPDFWordExcelCSVClick(){click(exportPDFWordExcelCSV);}

    public void pagingClick(){click(paging);}

    public void sortingSingleMultiColumnClick(){click(sortingSingleMultiColumn);}

    public void scrollingStaticHeadersClick(){click(scrollingStaticHeaders);}

    public void performanceClick(){click(performance);}

    public void selectingCellsColumnsRowsClick(){click(selectingCellsColumnsRows);}

    public void columnResizeReorderClick(){click(columnResizeReorder);}

    public void multiColumnHeadersClick(){click(multiColumnHeaders);}

    public void autoFitColumnWidthClick(){click(autoFitColumnWidth);}

    public void workSheetNamePropertyClick(){click(workSheetNameProperty);}

    public void enhancedCustomStylingClick(){click(enhancedCustomStyling);}

    public void rowResizeDragDropClick(){click(rowResizeDragDrop);}

    public void builtInColumnTypesClick(){click(builtInColumnTypes);}

    public void commandItemClick(){click(commandItem);}

    public void templatesClick(){click(templates);}

    public void keyboardSupportClick(){click(keyboardSupport);}

    public void contextMenusClick(){click(contextMenus);}

    public void richClientSideServerSideAPIClick(){click(richClientSideServerSideAPI);}

    public void accessibilityInternationalizationClick(){click(accessibilityInternationalization);}

    public void builtInSkinsClick(){click(builtInSkins);}

    public void visualStudioIntegrationsClick(){click(visualStudioIntegrations);}

    public void easyToEnableClick(){click(easyToEnable);}

    public void crossBrowserSupportClick(){click(crossBrowserSupport);}

    public void easyMigrationClick(){click(easyMigration);}

    public void allAjaxComponentsClick(){click(allAjaxComponents);}

    public void hoverOverNextSteps(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(nextSteps).build().perform();
    }

    public void startFreeTrialClick(){click(startFreeTrial);}

}
