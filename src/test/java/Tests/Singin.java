package Tests;

import Pages.HomePage;
import Pages.Products;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Singin extends BaseTest{
    @Test
    public void testSignin () throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        HomePage homePage = new HomePage(driver);
        homePage.clickOnSignin();
        homePage.signIn(driver);
        driver.quit();
//        Thread.sleep(4000);
//        homePage.clickOnFaceSerums();
//        Products products = new Products(driver);
//        products.scrollOnDescendingOrder();




    }
}
