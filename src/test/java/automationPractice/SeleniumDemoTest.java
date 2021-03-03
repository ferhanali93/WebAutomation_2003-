package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class SeleniumDemoTest {
    WebDriver driver = null;

    @BeforeTest
    public void setDriver() throws InterruptedException {
        // Set Driver Path to the system
        System.setProperty("webdriver.chrome.driver", "/Users/ferhanali/IdeaProjects/WebAutomation_2003/driver/chromedriver");
        // Created a driver object
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // Interact with chrome browser
        // Getting Home page of the Website
        // Open Chrome Browser
        driver.get("http://automationpractice.com");
        By locator = new ByIdOrName("search_query_top:");
        WebElement searchBox = driver.findElement(locator);
    }
    @Test (enabled = false)
    public void doSomething() throws InterruptedException {
     driver.findElement(By.id("search_query_top")).sendKeys("dress", Keys.ENTER);
        String actualValue = driver.findElement(By.className("heading-counter")).getText();
        Assert.assertEquals(actualValue,"7 results have been found." );
        Thread.sleep(3000);

    }

    @Test(enabled = false)
    public void womenDressDetails() throws InterruptedException {
        driver.findElement(By.linkText("Women")).click();
        Thread.sleep(3000);
    }
    @Test (enabled = false) // Click on Contact US button
    public void contactUsTest() throws InterruptedException {
        driver.findElement(By.linkText("Contact us")).click();
        Thread.sleep(2000);
    }
    @Test(enabled = false)
    public void signInButtonTest() throws InterruptedException {
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("email_create")).sendKeys("Ferhanali93@gmail.com",Keys.ENTER,Keys.TAB);
        driver.findElement(By.className("icon-user left")).click();
        driver.findElement(By.tagName("input")).findElement(By.id("id_gender")).click();
        Thread.sleep(2000);
    }

    @AfterTest
    public void cleanUp(){
        // Closing browser
        driver.quit();
    }
}