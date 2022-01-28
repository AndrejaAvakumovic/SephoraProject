package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Masks extends BasePage{
    public Masks(ChromeDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'Face Masks (')]")
    public WebElement faceMasks;

    public FaceMasks clickOnFaceMasks (){
        waitUntilVisible(faceMasks,6);
        waitUntilClickable(faceMasks,6);
        faceMasks.click();
        return new FaceMasks(driver);
    }

}
