package mavenTestNGHomework;

import lombok.extern.log4j.Log4j;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

@Log4j

public class HomePageTest {
    ChromeDriver driver;

  @BeforeTest
    public void browserOpen() {
            this.driver = new ChromeDriver();
            driver.get("https://edu.lu.lv/");
    }

    @Test
    public void chromePageTest(){
        System.out.println("First page test");
        Assert.assertEquals(driver.getTitle(),"E-izglītība");
        driver.close();
    }

    @Test
    public void chromePageTest2(){
        this.driver = new ChromeDriver();
        driver.get("https://hugo.lv/");
        System.out.println("Secound page test");
        Assert.assertEquals(driver.getTitle(),"Tulkot tekstu");
        driver.close();
    }

}

