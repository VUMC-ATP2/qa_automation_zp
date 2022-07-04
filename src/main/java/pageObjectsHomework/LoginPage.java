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

    public void authorize(String login, String pw) {
        driver.findElement(username).sendKeys(login);
        driver.findElement(password).sendKeys(pw);
        driver.findElement(clickLoginButton).click();
    }

    public WebElement getUsernameElement() {
        return driver.findElement(username);
    }

    public void setUserName(String login) {
        driver.findElement(username).sendKeys(login);
    }

    public void clickOnLoginButton() {
        driver.findElement(clickLoginButton).click();
    }
}
