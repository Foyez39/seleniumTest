package Application.Telerik;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.methi.*;
import utility.ExcelReader;

import static utility.Utility.currentDir;

public class AjaxEditorsTest extends CommonAPI {

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
    public void colorPickerTelerik() {
        ColorPickerPage colorPicker = new ColorPickerPage(getDriver());
        colorPicker.hoverOver(getDriver());
        colorPicker.UIForAjaxClick();
        colorPicker.hoverOverDemo(getDriver());
        colorPicker.listOfControlsClick();
        waitFor(2);
        colorPicker.editorsClick();
        colorPicker.hoverOverColorPickerBtn(getDriver());
        colorPicker.colorPickerClick();
        colorPicker.hoverOverAllAjaxComponents(getDriver());
        colorPicker.colorSelectionClick();
        colorPicker.keyboardSupportClick();
        colorPicker.allAjaxComponentsClick();
        colorPicker.hoverOverNextSteps(getDriver());
        waitFor(2);
        colorPicker.startFreeTrialClick();
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        System.out.println("Test Successful!");
    }

    @Test
    public void imageEditorTelerik() {
        ImageEditorPage imageEditor = new ImageEditorPage(getDriver());
        imageEditor.hoverOver(getDriver());
        imageEditor.UIForAjaxClick();
        waitFor(2);
        imageEditor.hoverOverDemo(getDriver());
        waitFor(2);
        imageEditor.listOfControlsClick();
        waitFor(2);
        imageEditor.editorsClick();
        imageEditor.hoverOverImageEditorBtn(getDriver());
        imageEditor.imageEditorClick();
        imageEditor.hoverOverAllAjaxComponents(getDriver());
        imageEditor.toolBarModesClick();
        imageEditor.HTML5CanvasTagSupportClick();
        imageEditor.keyboardSupportClick();
        imageEditor.controlIntegrationClick();
        imageEditor.clientSideAPIClick();
        imageEditor.imageEditingClick();
        imageEditor.allAjaxComponentsClick();
        imageEditor.hoverOverNextSteps(getDriver());
        waitFor(2);
        imageEditor.startFreeTrialClick();
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        System.out.println("Test Successful!");
    }

    @Test
    public void inputTelerik() {
        InputPage input = new InputPage(getDriver());
        input.hoverOver(getDriver());
        input.UIForAjaxClick();
        input.hoverOverDemo(getDriver());
        input.listOfControlsClick();
        waitFor(2);
        input.editorsClick();
        input.hoverOverInputBtn(getDriver());
        input.inputClick();
        input.hoverOverAllAjaxComponents(getDriver());
        input.radTextBoxClick();
        input.radNumericTextBoxClick();
        input.radDateInputClick();
        input.radMaskedTextBoxClick();
        input.validationClick();
        input.extendRegularInputsClick();
        input.HTML5InputTypesClick();
        input.allAjaxComponentsClick();
        input.hoverOverNextSteps(getDriver());
        waitFor(2);
        input.startFreeTrialClick();
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        System.out.println("Test Successful!");
    }

    @Test
    public void multiColumnComboBoxTelerik() {
        MultiColumnComboBoxPage multiColumnComboBox = new MultiColumnComboBoxPage(getDriver());
        multiColumnComboBox.hoverOver(getDriver());
        multiColumnComboBox.UIForAjaxClick();
        multiColumnComboBox.hoverOverDemo(getDriver());
        multiColumnComboBox.listOfControlsClick();
        waitFor(2);
        multiColumnComboBox.editorsClick();
        multiColumnComboBox.hoverOverMultiColumnComboBtn(getDriver());
        multiColumnComboBox.multiColumnComboClick();
        multiColumnComboBox.hoverOverAllAjaxComponents(getDriver());
        multiColumnComboBox.overviewClick();
        multiColumnComboBox.allAjaxComponentsClick();
        multiColumnComboBox.hoverOverNextSteps(getDriver());
        waitFor(2);
        multiColumnComboBox.startFreeTrialClick();
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        System.out.println("Test Successful!");
    }

    @Test
    public void multiSelectTelerik() {
        MultiSelectTestPage multiSelect = new MultiSelectTestPage(getDriver());
        waitFor(2);
        multiSelect.hoverOver(getDriver());
        waitFor(2);
        multiSelect.UIForAjaxClick();
        multiSelect.hoverOverDemo(getDriver());
        multiSelect.listOfControlsClick();
        waitFor(2);
        multiSelect.editorsClick();
        multiSelect.hoverOverMultiSelectBtn(getDriver());
        multiSelect.multiSelectClick();
        multiSelect.hoverOverAllAjaxComponents(getDriver());
        multiSelect.overviewClick();
        multiSelect.serverSideBindingClick();
        multiSelect.clientSideBindingClick();
        multiSelect.virtualizationClick();
        multiSelect.templatesClick();
        multiSelect.groupingClick();
        waitFor(2);
        multiSelect.clientSideAPIClick();
        waitFor(2);
        multiSelect.multipleSkinOptionsClick();
        multiSelect.rightLeftSupportClick();
        multiSelect.accessibilityClick();
        multiSelect.allAjaxComponentsClick();
        multiSelect.hoverOverNextSteps(getDriver());
        waitFor(2);
        multiSelect.startFreeTrialClick();
        waitFor(2);
        String expectedResult = "https://www.telerik.com/try/ui-for-asp.net-ajax";
        Assert.assertEquals(expectedResult, getPageUrl());
        System.out.println("Test Successful!");
        waitFor(2);
    }
}
