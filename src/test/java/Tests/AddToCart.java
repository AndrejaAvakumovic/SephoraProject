package Tests;

import Pages.HomePage;
import Pages.Products;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart extends BaseTest{
    @Test
    public void testAddToCart() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        HomePage homePage = new HomePage(driver);
        homePage.clickOnSignin();
        homePage.signIn(driver);
        Thread.sleep(5000);
        Products products = search("RESIST Barrier Repair",driver);
        products.clickAddToBasket();
        products.clickViewBasket();
        driver.quit();





}}

