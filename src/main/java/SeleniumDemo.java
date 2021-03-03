import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumDemo {
    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "/Users/ferhanali/IdeaProjects/WebAutomation_2003/driver/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com");
        //driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.quit();
    }
}