package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {
    public WebDriver driver;

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    private By productButton = By.id("add-to-cart-sauce-labs-backpack");

    public void addProductToCart(){
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
    }

}
