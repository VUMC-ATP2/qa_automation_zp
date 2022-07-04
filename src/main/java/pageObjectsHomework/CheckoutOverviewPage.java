package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOverviewPage {
    public WebDriver driver;

    public CheckoutOverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    private By finishButton = By.id("finish");

    public void pressFinishButton() {
        driver.findElement(By.id("finish"));
    }
}
