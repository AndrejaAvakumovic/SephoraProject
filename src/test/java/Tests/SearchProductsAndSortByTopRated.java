package Tests;

import Pages.HomePage;
import Pages.NightCreams;
import Pages.Products;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import zipkin2.Call;

public class SearchProductsAndSortByTopRated extends BaseTest {
    @Test
    public void searchAndSortProducts(){
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        HomePage homePage = new HomePage(driver);
        Products products = search("night creams", driver);
        homePage.cancelSignIn(driver);
        NightCreams nightCreams = new NightCreams(driver);
        nightCreams.scrollOnTopRated();
        driver.quit();
    }
}
