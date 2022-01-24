package Tests;

import Pages.HomePage;
import Pages.NightCreams;
import Pages.Products;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import zipkin2.Call;

public class SearchProductsAndSortByTopRated extends BaseTest {
    //This test should search and sort products by top rated.

    @Test
    public void searchAndSortProducts(){
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        HomePage homePage = new HomePage(driver);
        Products products = search("night creams", driver);
        homePage.cancelSignIn(driver);
        NightCreams nightCreams = new NightCreams(driver);
        nightCreams.scrollOnTopRated();
        Assert.assertTrue("Products are not sorted by top rated order",  nightCreams.isElementPresent(nightCreams.topratedSelectedScroll));
        driver.quit();
    }
}
