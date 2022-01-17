package Tests;

import Pages.HomePage;
import Pages.Products;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchProduct extends BaseTest{
    @Test
    public void testSearchProduct()  {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        HomePage homePage = new HomePage(driver);
        Products products = search("LAWLESS", driver);
        homePage.cancelSignIn(driver);
        driver.quit();
    }
}
