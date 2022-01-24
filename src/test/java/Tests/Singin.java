package Tests;

import Pages.HomePage;
import Pages.Products;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Singin extends BaseTest{

    //Test should verify that:
    //User is signed in with correct username and correct password.

// Preconditions:
    // User already has a registered account on this website.

    @Test
    public void testSignin () throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        HomePage homePage = new HomePage(driver);
        homePage.clickOnSignin();
        homePage.signIn(driver);
        Assert.assertTrue("Sign in button is not present",
                homePage.isElementPresent(homePage.signInButton));
        driver.quit();






    }
}
