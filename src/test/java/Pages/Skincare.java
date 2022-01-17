package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Skincare extends BasePage{
    public Skincare(ChromeDriver driver) {super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'Masks (209)')]")
    public WebElement maskMenuItem;

    public Masks clickOnMasksMenuItem(){
        maskMenuItem.click();
        return new Masks(driver);
    }
}
