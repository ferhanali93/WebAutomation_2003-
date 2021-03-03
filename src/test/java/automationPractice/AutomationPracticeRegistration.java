package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationPracticeRegistration  {
    public static void main(String[] args) throws Exception {
        // Set Driver
        System.setProperty("webdriver.chrome.driver","/Users/ferhanali/IdeaProjects/WebAutomation_2003/driver/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com");
        driver.findElement(By.className("login")).click();
        driver.findElement(By.id("email_create")).sendKeys("ferhanali93@gmail.com");
        driver.findElement(By.id("SubmitCreate")).click();
        // Wait for next page
        Thread.sleep(3000);
        String pageHeading = driver.findElement(By.className("page-heading")).getText();
        System.out.println("Page Heading: " + pageHeading);


       // driver.findElement(By.className("class=radio-inline").findElement("M").click());


        WebElement eleState = driver.findElement(By.id("id_state"));
        Select selectState = new Select(eleState);
        selectState.selectByVisibleText("New York");
        driver.quit();
    }
}
