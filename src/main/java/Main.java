import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "src/resources/webdriver/linux/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://rozetka.com.ua/");

        HomePage homePage = new HomePage(driver);
        homePage.typeWordInSearchField();
        homePage.clickEnteredWord();
        SearchPage searchPage = new SearchPage(driver);
        searchPage.productSearch();
        ProductPage productPage = new ProductPage(driver);
        productPage.userSelectSpaceGrayColor();
        productPage.clickByeButton();
        driver.quit();
    }
}