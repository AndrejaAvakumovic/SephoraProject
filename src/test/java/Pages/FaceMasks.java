package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

public class FaceMasks extends BasePage {
    public FaceMasks(ChromeDriver driver) {
        super(driver);
    }

    public ArrayList<String> getListOfFaceMasks() {
        ArrayList<WebElement> listOfFaceMasks = new ArrayList<>(driver.findElements(By.xpath("//div[@class='css-1322gsb']")));
        ArrayList<String> titles = new ArrayList<>();
        for (int i = 0; i < listOfFaceMasks.size(); i++) {
            String title = listOfFaceMasks.get(i).getText();
            titles.add(title);
        }
        return titles;
    }

}
