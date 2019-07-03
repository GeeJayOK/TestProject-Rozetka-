import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

public class GetDriver {

    private WebDriver driver;

    public WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "src/resources/webdriver/linux/chromedriver");
        //System.setProperty("webdriver.chrome.driver", "src/resources/webdriver/windows/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setHeadless(false);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
        System.setProperty("webdriver.chrome.driver", "src/resources/webdriver/linux/chromedriver");
        //System.setProperty("webdriver.chrome.driver", "src/resources/webdriver/windows/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setHeadless(false);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
}
