package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {
    public ChromeDriver driver;

    String email = "andreja.avakumovic@gmail.com";
    String password = "sephorasifra";

    @FindBy(xpath ="//button[@id='account_drop_trigger']")
    public WebElement signInButton;

    @FindBy (id="site_search_input")
    public WebElement searchInput;

    @FindBy (id = "inline_basket_trigger")
    public  WebElement basketLogo;

    @FindBy (id = "modal0Dialog")
    public WebElement modalDialog;

    @FindBy (xpath = "//a[@id='top_nav_drop_3_trigger']")
    public WebElement skincareButton;

    @FindBy (id= "cat_sort_menu_trigger")
    public WebElement sortScrolldown;

    @FindBy (xpath = "//button[contains(text(), 'Top Rated')]")
    public WebElement topRatedSection;

    @FindBy(id = "top_nav_drop_1_trigger")
    public WebElement brandsButton;

    @FindBy(xpath ="//a[contains(text(),'Face Serums')]" )
    public WebElement faceSerumsButton;

    @FindBy (xpath = "//button[contains(text(), 'Price High to Low')]")
    public WebElement descendingOrder;

    public BasePage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void signIn (ChromeDriver driver) {
        this.driver = driver;

        WebElement signInInput = driver.findElement(By.id("signin_username"));
        signInInput.sendKeys(email);
        WebElement passwordInput = driver.findElement(By.id("signin_password"));
        passwordInput.sendKeys(password);
        WebElement signinButton = driver.findElement(By.xpath("//button[@type='submit'][normalize-space()='Sign In']"));
        waitUntilVisible(signinButton,3);
        waitUntilClickable(signinButton, 3);
        signinButton.click();
    }

    public static void Hover(WebDriver driver, WebElement element){
        Actions a = new Actions(driver);
        a.moveToElement(element).perform();
    }

    public void waitUntilVisible (WebElement webElement, int timeOutInSeconds){
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public void waitUntilClickable (WebElement webElement, int timeOutInSeconds){
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public boolean isElementPresent(WebElement webElement){
        try {
            return webElement.isDisplayed();
        } catch (final Exception e) {
            return false;
        }
    }
    public void scrollIntoView(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void browserRefresh (){
        driver.navigate().refresh();
    }

    public void cancelSignIn (ChromeDriver driver) {
        this.driver = driver;
        WebElement cancelSingInButton = driver.findElement(By.xpath("//button[@class='css-1kna575']"));
        cancelSingInButton.click();
    }
    public NightCreams scrollOnTopRated(){
        Hover(driver,sortScrolldown);
        Actions actions = new Actions(driver);
        actions.moveToElement(sortScrolldown).click().moveToElement(topRatedSection).click().build().perform();
        return new NightCreams(driver);
    }
    public SignInPage clickOnSignin(){
        Hover(driver,signInButton);
        Actions actions = new Actions(driver);
        actions.moveToElement(signInButton).click().build().perform();
        return new SignInPage(driver);
    }
//    public Products scrollOnDescendingOrder(){
//        Hover(driver,sortScrolldown);
//        Actions actions = new Actions(driver);
//        actions.moveToElement(sortScrolldown).click().moveToElement(descendingOrder).click().build().perform();
//        return new Products(driver);
//    }



//    public void acceptCookies (){
//        WebElement acceptCookiesButton = driver.findElementById("ctl53_Header1_CookiesEuBox_btnAcceptAll");
//        if (isElementPresent(acceptCookiesButton)){
//            acceptCookiesButton.click();
//        }
//    }
}
