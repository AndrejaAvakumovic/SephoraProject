package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class HomePage extends BasePage {
    String homePageURl = "https://www.sephora.com/";

    public HomePage(ChromeDriver driver) {
        super(driver);
        driver.get(homePageURl);
    }

    public Skincare clickOnSkincareButton(){
       Hover(driver,skincareButton);
        Actions actions = new Actions(driver);
        actions.doubleClick(skincareButton).build();
        skincareButton.click();
       return new Skincare(driver);
    }

    public Products clickOnFaceSerums(){
        Hover(driver,skincareButton);
        Actions actions = new Actions(driver);
        waitUntilClickable(skincareButton,7000);
        actions.moveToElement(skincareButton).moveToElement(faceSerumsButton).click().build().perform();
        return new Products(driver);

    }


}
