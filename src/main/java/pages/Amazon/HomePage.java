package pages.Amazon;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends CommonAPI {


    @FindBy(xpath = "//header/div[@id='navbar']/div[@id='nav-belt']/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]")
    public WebElement menuDropDown;

    @FindBy(css = "#nav-search-submit-button")
    private WebElement SearchBtn;

    @FindBy(css = "#twotabsearchtextbox")
    private WebElement SearchField;

    @FindBy(css = "#nav-cart-count")
    private WebElement CartBtn;

    @FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
    private WebElement HoverOverSignInBtn;

    @FindBy(xpath = "//header/div[@id='navbar']/div[@id='nav-flyout-anchor']/div[@id='nav-flyout-accountList']/div[2]/div[1]/div[1]/div[1]/a[1]/span[1]")
    private WebElement SignInBtn;

    @FindBy(xpath = "//header/div[@id='navbar']/div[@id='nav-flyout-anchor']/div[@id='nav-flyout-accountList']/div[2]/div[1]/div[1]/div[1]/a[1]/span[1]")
    private WebElement BestSellerBtn;

    @FindBy(xpath = "//a[contains(text(),'Customer Service')]")
    private WebElement CustomerServiceBtn;

    @FindBy(xpath = "//header/div[@id='navbar']/div[@id='nav-main']/div[2]/div[2]/div[1]/a[12]")
    private WebElement FashionBtn;

    @FindBy(xpath = "//header/div[@id='navbar']/div[@id='nav-main']/div[2]/div[2]/div[1]/a[9]")
    private WebElement BooksBtn;

    @FindBy(xpath = "//a[contains(text(),\"Today's Deals\")]")
    private WebElement DealsBtn;

    @FindBy(xpath = "//a[contains(text(),'Handmade')]")
    private WebElement HandmadeBtn;

    @FindBy(xpath = "//header/div[@id='navbar']/div[@id='nav-belt']/div[3]/div[1]/a[2]/span[1]")
    private WebElement FloatingMenu;

    @FindBy(css = "#searchDropdownBox option")
    private List<WebElement> menuDropDownOptions;


    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    // reusable steps
    public void clickOptionFromMenuDropDown() {
        click(menuDropDown);
    }

    public void clickSearchBtn() {
        click(SearchBtn);
    }

    public void clickSearchField() {
        typeAndEnter(SearchField, "Laptop");
    }

    public void clickCartBtn() {
        click(CartBtn);
    }

    public void clickSignInBtn() {
        click(SignInBtn);
    }

    public void clickBestSeller() {
        click(BestSellerBtn);
    }

    public void clickCustomerService() {
        click(CustomerServiceBtn);
    }

    public void clickFashionBtn() {
        click(FashionBtn);
    }

    public void clickBooksBtn() {
        click(BooksBtn);
    }


    public void clickHandmadeBtn() {
        clickHandmadeBtn();
    }

    public void HoverOverFloatingMenu() {
        click(FloatingMenu);
    }

    public void clickHoverOverSignInBtn() {
        click(HoverOverSignInBtn);
    }

    public void selectOptionFromMenuDropDown() {
        click(menuDropDown);
    }

    public void clickSearchFields() {
        typeAndEnter(SearchField, "phones");
    }

    public void selectOptionFromMenuDropDown(String option) {
        selectFromDropdown(menuDropDown, option);
    }

    public List<String> getHomePageDropDownOptions() {
        List<String> options = new ArrayList<>();
        List<WebElement> elements = getDropDownOptions(menuDropDown);
        for (WebElement element : elements) {
            options.add(element.getText());

        }
        return options;

    }
    public void clickSearchField1(){
        typeAndEnter(SearchField, "Women shoes");


            }
        }
