import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class GetDriver {

    static WebDriver driver;

    public WebDriver driverInit() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdriver/linux/chromedriver");
        //System.setProperty("webdriver.chrome.driver", "src/test/resources/webdriver/windows/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setHeadless(false);
        driver = new ChromeDriver(chromeOptions);
        return driver;
    }

    public WebDriver driverSett(WebDriver driver) {
        this.driver = driver;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }

    public void driverOff(WebDriver driver) {
        this.driver = driver;
        driver.quit();
    }
}
