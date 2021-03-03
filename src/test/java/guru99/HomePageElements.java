package guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomePageElements {
    WebDriver driver;
    @BeforeTest
    public void setDriver(){
        System.setProperty("webdriver.chrome.driver","/Users/ferhanali/IdeaProjects/WebAutomation_2003/driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       // driver.get("http://demo.guru99.com/test/facebook.html");
        driver.get("http://demo.guru99.com/test/newtours/");
    }
    @Test(enabled = false)   // <-- Skipped this test
    public void locateById() throws InterruptedException {
        driver.findElement(By.id("email")).sendKeys("Tester123@gmail.com", Keys.TAB);
        driver.findElement(By.id("pass")).sendKeys("Test123",Keys.TAB, Keys.TAB, Keys.ENTER);
        Thread.sleep(2000);
    }

    @Test
    public void locateByName() throws InterruptedException {
        driver.findElement(By.name("userName")).sendKeys("Test123",Keys.TAB);
        Thread.sleep(2000);

        driver.findElement(By.name("password")).sendKeys("Test123",Keys.TAB, Keys.ENTER);
        Thread.sleep(3000);
    }

    @AfterTest
    public void cleanUp(){
        driver.quit();
    }
}
