package pages.Faizan;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StorePage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[1]/div[2]/div/button/div/div/div")
    WebElement ChooseYourLicenseSelectField;

    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[1]/div[2]/div/div/div/ul/li[2]/a/span/strong")
    WebElement NamedLicenseOption;

    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[2]/div[2]/div/button/div/div/div")
    WebElement ChooseYourPackageSelectField;

    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[2]/div[2]/div/div/div/ul/li[2]/a/span/strong")
    WebElement CollaboratorTeamOption;

    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[1]/div[2]/div/div/div/ul/li[3]/a/span/strong")
    WebElement ConcurrentLicense;

    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[2]/div[2]/div/div/div/ul/li[3]/a/span/strong")
    WebElement CollaboratorEnterprise;

    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[1]/div[2]/div/button/div/div/div")
    WebElement QaCompleteSelectfield;

    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[1]/div[2]/div/div/div/ul/li[2]/a/span/strong")
    WebElement QaCompletesaas;

    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[1]/div[2]/div/div/div/ul/li[3]/a/span/strong")
    WebElement QaCompleteoption;
    //Ready API Store page
    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[1]/div[2]/div/button/div/div/div")
    WebElement APIChooseYourLicenseselectfield;

    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[1]/div[2]/div/div/div/ul/li[2]/a/span/strong")
    WebElement FixedLicenseoption;

    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[2]/div[2]/div/button/div/div/div")
    WebElement APIChooseyourpackageselectfield;

    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[2]/div[2]/div/div/div/ul/li[2]/a/span/strong")
    WebElement PerformanceSmalloption;

    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[2]/div[2]/div/div/div/ul/li[3]/a/span/strong")
    WebElement Performancemediumoption;

    @FindBy (xpath = "//*[@id=\"Buy\"]/div/div[1]/div[2]/div[2]/div/div/div/ul/li[4]/a/span/strong")
    WebElement PerformanceUnlimitedoption;

    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[1]/div[2]/div/div/div/ul/li[3]/a/span/strong")
    WebElement FloatingLicenseoption;
    //ReadyAPI Test Module
    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[1]/div[2]/div/button/div/div/div")
    WebElement APItestmoduleselectfield;

    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[2]/div[2]/div/div/div/ul/li[2]/a/span/strong")
    WebElement Firstyearlicenseoption;

    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[2]/div[2]/div/div/div/ul/li[3]/a/span")
    WebElement Secondyearlicenseoption;

    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[2]/div[2]/div/div/div/ul/li[4]/a/span/strong")
    WebElement Thirdyearlicenseoption;

    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[2]/div[2]/div/div/div/ul/li[2]/a/span/strong")
    WebElement ReadyAPIVirtualizationbtn;

    //TestComplete
    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[1]/div[2]/div/button/div/div/div")
    WebElement LicenseSelectField;

    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[1]/div[2]/div/div/div/ul/li[2]/a/span/strong")
    WebElement NodeLockedoption;

    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[2]/div[2]/div/button/div/div/div")
    WebElement PackageSelectField;

    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[2]/div[2]/div/div/div/ul/li[2]/a/span/strong")
    WebElement TestCompleteprobundleoption;

    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[2]/div[2]/div/div/div/ul/li[3]/a/span/strong")
    WebElement TestCompletePlatformoption;

    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[3]/div[2]/div/button/div/div/div")
    WebElement ModuleSelectField;

    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[3]/div[2]/div/div/div/ul/li[2]/a/span/strong")
    WebElement DesktopModuleOption;

    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[3]/div[2]/div/div/div/ul/li[3]/a/span/strong")
    WebElement WebModuleOption;

    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[3]/div[2]/div/div/div/ul/li[4]/a/span/strong")
    WebElement MobileModuleoption;

    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[3]/div[2]/div/div/div/ul/li[5]/a/span/strong")
    WebElement Desktopplusmobileoption;

    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[3]/div[2]/div/div/div/ul/li[6]/a/span/strong")
    WebElement DesktopplusWeboption;

    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[3]/div[2]/div/div/div/ul/li[7]/a/span/strong")
    WebElement Desktoppluswebplusmobilemodules;

    public StorePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    //Reusable Steps
    public void clickonChooseYourLicenseSelectField(){
        click(ChooseYourLicenseSelectField);
    }

    public void clickonNamedLicenseOption(){
        click(NamedLicenseOption);
    }

    public void clickonChooseYourPackageSelectField(){
        click(ChooseYourPackageSelectField);
    }

    public void clickonCollaboratorTeamOption(){
        click(CollaboratorTeamOption);
    }

    public void clickonConcurrentLicense(){
        click(ConcurrentLicense);
    }

    public void clickonCollaboratorEnterprise(){
        click(CollaboratorEnterprise);
    }

    public void clickonQaCompleteSelectfield(){
        click(QaCompleteSelectfield);
    }

    public void clickonQaCompletesaas(){
        click(QaCompletesaas);
    }

    public void clickonQaComplete(){
        click(QaCompleteoption);
    }

    public void clickonAPIChooseYourLicenseselectfield(){
        click(APIChooseYourLicenseselectfield);
    }

    public void clickonFixedLicenseoption(){
        click(FixedLicenseoption);
    }

    public void clickonAPIChooseyourpackagefield(){
        click(APIChooseyourpackageselectfield);
    }

    public void clickonPerformanceSmalloption(){
        click(PerformanceSmalloption);
    }

    public void clickonPerformanceMediumoption(){
        click(Performancemediumoption);
    }

    public void clickonPerformanceUnlimitedoption(){
        click(PerformanceUnlimitedoption);
    }

    public void clickonFloatingLicenseoption(){
        click(FloatingLicenseoption);
    }

    public void clickonAPItestmoduleselectfield(){
        click(APItestmoduleselectfield);
    }

    public void clickonFirstyearlicenseoption(){
        click(Firstyearlicenseoption);
    }
    public void clickonSecondyearlicenseoption(){
        click(Secondyearlicenseoption);
    }
    public void clickonThirdyearlicenseoption(){
        click(Thirdyearlicenseoption);
    }
    public void clickonReadyAPIVirtualizationbtn(){
        click(ReadyAPIVirtualizationbtn);
    }
    public void clickonLicenseSelectField(){
        click(LicenseSelectField);
    }
    public void clickonPackageSelectField(){
        click(PackageSelectField);
    }
    public void clickonTestCompleteprobundleoption(){
        click(TestCompleteprobundleoption);
    }
    public void clickonNodeLockedoption(){
        click(NodeLockedoption);
    }
    public void clickonTestCompletePlatformoption(){
        click(TestCompletePlatformoption);
    }
    public void clickonModuleSelectField(){
        click(ModuleSelectField);
    }
    public void clickonDesktopModuleOption(){
        click(DesktopModuleOption);
    }

    public void clickonWebModuleOption(){
        click(WebModuleOption);
    }

    public void clickonMobileModuleOption(){
        click(MobileModuleoption);
    }

    public void clickonDesktopplusmobileoption(){
        click(Desktopplusmobileoption);
    }

    public void clickonDesktopplusWeboption(){
        click(DesktopplusWeboption);
    }

    public void clickonDesktoppluswebplusmobilemodules(){
        click(Desktoppluswebplusmobilemodules);
    }



}
