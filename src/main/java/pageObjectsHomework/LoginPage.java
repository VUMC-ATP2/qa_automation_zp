package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {
    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private By username = By.id("user-name");

    private By password = By.id("password");
    private By clickLoginButton = By.id("login-button");

    private void setUsername() {
        driver.findElement(By.id("user-name"));
    }

    private void setPassword() {
        driver.findElement(By.id("password"));
    }

    public void clickOnLoginButton() {
        driver.findElement(clickLoginButton).click();
    }
}
