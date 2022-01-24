package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;

import javax.swing.*;
import java.security.interfaces.XECPrivateKey;
import java.util.ArrayList;
import java.util.List;

public class Products extends BasePage{
    public Products(ChromeDriver driver) {
        super(driver);
    }

    @FindBy (className = "css-1yu4v6k")
    public WebElement faceSerumsButton;

//    @FindBy (xpath = "//button[@aria-label='Sign in to love Dr. Lara Devgan Scientific Beauty - Hyaluronic Serum']//*[name()='svg']")
//    public WebElement addToFavButton;

    @FindBy (xpath = "//button[@data-at='add_to_basket_btn']")
    public WebElement addToBasketButton;
    @FindBy (xpath = "(//a[@class='css-1y56zzp eanm77i0'])[1]")
    public WebElement viewBasketButton;


    public Basket clickAddToBasket(){
    addToBasketButton.click();
    return new Basket(driver);
    }
    public Basket clickViewBasket(){
        waitUntilVisible(viewBasketButton,6000);
        viewBasketButton.click();
        return new Basket(driver);
    }
//    public Basket clickAddToFav(){
//     scrollIntoView(addToFavButton);
//       waitUntilVisible(addToFavButton,10000);
//       waitUntilClickable(addToFavButton,4000);
//        addToFavButton.click();
//        return new Basket(driver);
//    }

    public ArrayList<WebElement> getListOfProducts() {
        ArrayList<WebElement> listOfProducts = new ArrayList<>(driver.findElements(By.xpath("//div[@class='css-1322gsb']")));
        return listOfProducts;
    }
    public ArrayList<String> getTitlesOfAllProducts() {
        ArrayList<WebElement> listOfProducts = new ArrayList<>(driver.findElements(By.xpath("//div[@class='css-1322gsb']")));
        ArrayList<String> titles = new ArrayList<>();
        for (int i = 0; i < listOfProducts.size(); i++) {
            String title = listOfProducts.get(i).getText();
            titles.add(title);
        }
        return titles;
    }

}
