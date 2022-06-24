package pages.Faizan;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearOnlineStorePage extends CommonAPI {
    @FindBy(xpath = "//div[contains(text(),'Shop Collaborator')]")
    WebElement ShopCollaboratorbtn;

    @FindBy(xpath = "//*[@id=\"form\"]/div[5]/div[1]/div[2]/div/div/div[3]/a/div/div[3]")
    WebElement ShopQACompletebtn;

    @FindBy(xpath = "//*[@id=\"form\"]/div[5]/div[1]/div[2]/div/div/div[4]/a/div/div[3]")
    WebElement ShopReadyAPIbtn;

    @FindBy(xpath = "//*[@id=\"form\"]/div[3]/div[1]/div[2]/div/div/div[5]/a")
    WebElement ReadyAPITestModulebtn;

    @FindBy(xpath = "//*[@id=\"form\"]/div[3]/div[1]/div[2]/div/div/div[6]/a/div/div[3]")
    WebElement ReadyAPIVirtualizationModulebtn;

    @FindBy(xpath = "//*[@id=\"form\"]/div[5]/div[1]/div[2]/div/div/div[7]/a/div/div[3]")
    WebElement TestCompleteoption;


    public SmartBearOnlineStorePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    //Reusable Steps
    public void clickonShopCollaboratorbtn(){
        click(ShopCollaboratorbtn);
    }

    public void clickonShopQACompletebtn(){
        click(ShopQACompletebtn);
    }

    public void clickonShopReadyAPIbtn(){
        click(ShopReadyAPIbtn);
    }

    public void clickonReadyAPITestModulebtn(){
        click(ReadyAPITestModulebtn);
    }

    public void clickonReadyAPIVirtualizationModulebtn(){
        click(ReadyAPIVirtualizationModulebtn);
    }

    public void clickonTestCompleteoption(){
        click(TestCompleteoption);
    }




}

