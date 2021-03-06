package pages.foyez;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ContactPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(ContactPage.class);
@FindBy(css = "a[title='Contact Us']")
private WebElement contact;

@FindBy(css = "#id_contact")
private WebElement subjectDropdown;

@FindBy(css = "#message")
private WebElement message;

@FindBy(css = "#submitMessage")
private WebElement submitMessage;


@FindBy(css = "#email")
private WebElement email;


@FindBy(xpath = " //div/h1")
private WebElement customerAssertion;


    public ContactPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }


//reusable steps

    public void clickOnContact(){
        click(contact);
        LOG.info("click on contact is success");
    }



    public void selectOptionFromSubjectDropdown(String option){
        selectFromDropdown(subjectDropdown,option);
        LOG.info("click on Dropdown option success");
    }

    public void typeEmail(String text){
        type(email,text);
        LOG.info("Typing email success");
    }
    public void writeMessage(String text){
        type(message,text);
        LOG.info("Writing message success");
    }

    public void clickOnSubmitMessage(){
        click(submitMessage);
        LOG.info("click on submit message success");
}


public String contactHeader(){
    return getElementText(customerAssertion);


}

}
