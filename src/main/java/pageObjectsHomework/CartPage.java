package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    public WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    private By cartButton = By.id("shopping_cart_container");

    public void openCart(){
        driver.findElement(By.id("shopping_cart_container"));
    }
}
