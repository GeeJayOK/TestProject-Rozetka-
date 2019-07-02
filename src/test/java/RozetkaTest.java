import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class RozetkaTest {

    private WebDriver driver;
    private HomePage homePage;
    private SearchPage searchPage;
    private ProductPage productPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/resources/webdriver/linux/chromedriver");
        //System.setProperty("webdriver.chrome.driver", "src/resources/webdriver/windows/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setHeadless(true);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://rozetka.com.ua/");
        homePage = new HomePage(driver);
    }

    @Test
    public void searchIphoneTest() {
        Assert.assertTrue(driver.findElement(By.xpath("//input[@name='search']")).isDisplayed());
        homePage.typeWordInSearchField();
        Assert.assertTrue(driver.findElement(By.linkText("iphone xs")).isDisplayed());
        homePage.clickEnteredWord();
        Assert.assertTrue(driver.findElement(By.xpath("//div[@name='search_list']")).isDisplayed());
        searchPage = new SearchPage(driver);
        searchPage.productSearch();
        productPage = new ProductPage(driver);
        Assert.assertTrue(driver.findElement(By.xpath("//li[3]//pp-item-color[1]//a[1]")).isDisplayed());
        productPage.userSelectSpaceGrayColor();
        Assert.assertTrue(driver.findElement(By.xpath("//button[contains(text(),'Купить')]")).isDisplayed());
        productPage.clickByeButton();
        Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(),'Вы добавили товар в корзину')]")).isDisplayed());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
