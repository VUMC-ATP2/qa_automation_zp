package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutSuccsessPage {

    public WebDriver driver;

    public CheckoutSuccsessPage(WebDriver driver) {
        this.driver = driver;
    }

    private By backHomeButton = By.id("back-to-products");

    public void pressFinishButton() {
        driver.findElement(By.id("back-to-products"));
    }
}
