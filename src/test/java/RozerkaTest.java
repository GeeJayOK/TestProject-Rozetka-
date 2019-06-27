import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RozerkaTest {

    private WebDriver driver;
    private HomePage homePage;
    private SearchPage searchPage;
    private ProductPage productPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/resources/webdriver/linux/chromedriver");
        //System.setProperty("webdriver.chrome.driver", "src/resources/webdriver/windows/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://rozetka.com.ua/");

        homePage = new HomePage(driver);
    }

    @Test
    public void searchIphoneTest() {
        homePage.typeWordInSearchField();
        homePage.checkEnteredWord();
        searchPage = new SearchPage(driver);
        searchPage.productSearch();
        productPage = new ProductPage(driver);
        productPage.userSelectSpaceGrayColor();
        productPage.clickByeButton();
        productPage.basketOpened();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
