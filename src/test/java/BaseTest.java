import locators.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected static WebDriver driver;

    public WebDriver getDriver() {
        try {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/webdriver/linux/chromedriver");
            //System.setProperty("webdriver.chrome.driver", "src/test/resources/webdriver/windows/chromedriver.exe");
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setHeadless(true);
            driver = new ChromeDriver(chromeOptions);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(160, TimeUnit.SECONDS);
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return driver;
    }

    public void tearDown() {
        driver.quit();
    }

    public HomePage openHomePage() {
        driver.get(Locators.BASE_URL);
        return new HomePage(driver);
    }
}