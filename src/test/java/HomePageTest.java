import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HomePageTest {
    WebDriver driver;
    HomePage homePage = new HomePage(driver);

    @Before
    public void setUp() {
        //System.setProperty("webdriver.chrome.driver", "src/resources/webdriver/linux/chromedriver");
        System.setProperty("webdriver.chrome.driver", "src/resources/webdriver/windows/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void userOpensHomepage() {
        driver.get("https://rozetka.com.ua/");
    }

    @Test
    public void checkSearchField() {
    }


}