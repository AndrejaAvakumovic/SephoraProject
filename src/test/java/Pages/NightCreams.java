package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;

public class NightCreams extends BasePage{
    public NightCreams(ChromeDriver driver) {
        super(driver);
    }

    public ArrayList<WebElement> getListOfProducts() {
        ArrayList<WebElement> listOfProducts = new ArrayList<>(driver.findElements(By.xpath("//div[@class='css-zwibo9 eanm77i0']")));
        return listOfProducts;
    }
    public ArrayList<String> getTitlesOfAllProducts() {
        ArrayList<WebElement> listOfProducts = new ArrayList<>(driver.findElements(By.xpath("//div[@class='css-zwibo9 eanm77i0']")));
        ArrayList<String> titles = new ArrayList<>();
        for (int i = 0; i < listOfProducts.size(); i++) {
            String title = listOfProducts.get(i).getText();
            titles.add(title);
        }
        return titles;
    }
}
