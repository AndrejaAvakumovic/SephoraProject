package Tests;

import Pages.BasePage;
import Pages.Products;
import Pages.SignInPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
//    public Basket clickBasketLogo (ChromeDriver driver){
//        BasePage page = new BasePage(driver);
//        page.basketLogo.click();
//        return new Basket(driver);
//    }

    public SignInPage clickSignInIcon (ChromeDriver driver){
        BasePage page = new BasePage(driver);
        page.signInButton.click();
        return new SignInPage(driver);
    }

    public Products search (String item, ChromeDriver driver){
        BasePage page = new BasePage(driver);
        page.searchInput.sendKeys(item);
        page.waitUntilClickable(page.searchInput,2);
        page.searchInput.sendKeys(Keys.ENTER);
        return new Products(driver);
    }
    public SignInPage clickSigninIcon (ChromeDriver driver){
        BasePage page = new BasePage(driver);
        page.waitUntilVisible(page.signInButton, 6);
        page.waitUntilClickable(page.signInButton, 6);
        page.signInButton.click();
        return new SignInPage(driver);
    }

}
