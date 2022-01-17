package Tests;

import Pages.*;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilterSkincare extends BaseTest{
    @Test
    public void testFilterSkincare()  {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        HomePage homePage = new HomePage(driver);
        Skincare skincare = homePage.clickOnSkincareButton();
        skincare.cancelSignIn(driver);
        Masks masks = skincare.clickOnMasksMenuItem();
        FaceMasks faceMasks = masks.clickOnFaceMasks();
        driver.quit();
    }
}
