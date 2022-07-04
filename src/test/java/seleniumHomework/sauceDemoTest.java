package seleniumHomework;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import pageObjectsHomework.*;

@Log4j
@Slf4j
public class sauceDemoTest {

    ChromeDriver driver;
    LoginPage loginPage;
    InventoryPage inventoryPage;
    CartPage cartPage;
    CheckoutPage checkoutPage;
    CheckoutOverviewPage checkoutOverviewPage;
    CheckoutSuccsessPage checkoutSuccsessPage;

    WebDriverWait webDriverWait;

//    1. Navigēt uz saiti https://www.saucedemo.com/
//    2. Ielogoties ar pareizu lietotāja vārdu/paroli
//3. Pārbaudīt, ka lietotājs ir ielogojies
//4. Ievietot Grozā 1 produktu
//5. Doties uz grozu
//6. Pārbaudīt, kā šī prece ir grozā
//7. Doties uz Checkout
//8. Ievadīt vārdu/uzvārdu/pasta indeksu
//9. Doties uz Checkout overview lapu, pārbaudīt datus
//10. Doties uz finish lapu un pārbaudīt vai viss bija veiksmīgi
//11. Doties atpakaļ uz pirmo lapu ar pogu 'Back Home'


    @BeforeMethod(alwaysRun = true)
    public void openBrowser() {
        this.driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);
        webDriverWait = new WebDriverWait(driver, 5);
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void firstScenario() {
        loginPage.authorize("standard_user", "secret_sauce");
        webDriverWait.until(ExpectedConditions.visibilityOf(inventoryPage.getProductButton()));
        Assert.assertTrue(inventoryPage.getProductButton().isDisplayed());


//        loginPage.getUsernameElement().sendKeys("standard_user");
//        loginPage.setUserName("standard_user");


//        WebElement username = driver.findElement(By.id("user-name"));
//        WebElement password = driver.findElement(By.id("password"));
//        WebElement clickLoginButton = driver.findElement(By.id("login-button"));
//        username.sendKeys("standard_user");
//        password.sendKeys("secret_sauce");
//        clickLoginButton.click();
//        String actualUrl = "https://www.saucedemo.com/inventory.html";
//        String expectedUrl = driver.getCurrentUrl();
//        Assert.assertEquals(actualUrl, expectedUrl);
//        System.out.println("Data is correct!You are logged in!");
    }

    @Test
    public void secondScenario() {
        loginPage.authorize("standard_user", "secret_sauce2");
    }

//    @Test
//    public void testAddProductToCart() {
//        WebElement productButton = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
//        productButton.click();
//        WebElement cartButton = driver.findElement(By.id("shopping_cart_container"));
//        cartButton.click();
//        String actualUrl2 = "https://www.saucedemo.com/cart.html";
//        String expectedUrl2 = driver.getCurrentUrl();
//        Assert.assertEquals(actualUrl2, expectedUrl2);
//
//    }
//
//    @Test
//    public void testCheckoutPage() {
//        WebElement checkoutButton = driver.findElement(By.id("checkout"));
//        checkoutButton.click();
//
//        WebElement name = driver.findElement(By.id("first-name"));
//        WebElement lastName = driver.findElement(By.id("last-name"));
//        WebElement zipCode = driver.findElement(By.id("postal-code"));
//        name.sendKeys("Zane");
//        lastName.sendKeys("Paike");
//        zipCode.sendKeys("LV-3101");
//
//        WebElement continueButton = driver.findElement(By.id("continue"));
//        continueButton.click();
//    }
//
//    @Test
//    public void testOverviewPage() {
//        String actualUrl3 = "https://www.saucedemo.com/checkout-step-two.html";
//        String expectedUrl3 = driver.getCurrentUrl();
//        Assert.assertEquals(actualUrl3, expectedUrl3);
//        WebElement finishButton = driver.findElement(By.id("finish"));
//        finishButton.click();
//    }
//
//    @Test
//    public void backHome() {
//        WebElement backHomeButton = driver.findElement(By.id("back-to-products"));
//        backHomeButton.click();
//    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        driver.close();
        driver.quit();
    }
}
