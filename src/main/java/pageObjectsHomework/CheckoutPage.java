package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    public WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }
    private By name = By.id("first-name");

    private By lastname = By.id("last-name");

    private By zipCode = By.id("postal-code");

    private By checkoutButton = By.id("checkout");

    public void pressCheckoutButton(){
        driver.findElement(By.id("checkout"));
    }
    private void setName() {
        driver.findElement(By.id("first-name"));
    }
    private void setLastname() {
        driver.findElement(By.id("last-name"));
    }
    private void setZipCode() {
        driver.findElement(By.id("postal-code"));
    }

}
