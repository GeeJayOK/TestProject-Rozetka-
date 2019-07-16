import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import java.util.concurrent.TimeUnit;

import locators.Locators;
import pages.HomePage;
import pages.ProductPage;
import pages.SearchPage;

public class RozetkaTest {

    private WebDriver driver;
    private HomePage homePage;
    private SearchPage searchPage;
    private ProductPage productPage;

    @Before
    public void setUp() {

        try {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/webdriver/linux/chromedriver");
            //System.setProperty("webdriver.chrome.driver", "src/test/resources/webdriver/windows/chromedriver.exe");
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setHeadless(true);
            driver = new ChromeDriver(chromeOptions);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
            driver.get(Locators.BASE_URL);
            homePage = new HomePage(driver);
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    @Test
    public void searchIphoneTest() {
        Assert.assertTrue(driver.findElement(By.xpath(Locators.SEARCH_FIELD)).isDisplayed());
        homePage.typeWordInSearchField("iphone xs");
        Assert.assertTrue(driver.findElement(By.linkText("iphone xs max")).isDisplayed());
        homePage.clickEnteredWord("iphone xs max");
        Assert.assertTrue(driver.findElement(By.xpath(Locators.SEARCH_LIST)).isDisplayed());
        searchPage = new SearchPage(driver);
        searchPage.productSearch();
        productPage = new ProductPage(driver);
        Assert.assertTrue(driver.findElement(By.xpath(Locators.IPHONEXS_PAGE)).isDisplayed());
        productPage.userSelectSpaceGrayColor();
        Assert.assertTrue(driver.findElement(By.xpath(Locators.BUTTON_BUY)).isDisplayed());
        productPage.clickBuyButton();
        Assert.assertTrue(driver.findElement(By.xpath(Locators.BASKET)).isDisplayed());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
