import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/webdriver/linux/chromedriver");
        HomePage homePage = new HomePage();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.get(homePage.URL);


        WebElement searchField = driver.findElement(By.xpath(homePage.SEARCH_FIELD));

        Assert.assertTrue(searchField.isDisplayed());

        searchField.sendKeys("iPhone");

        Assert.assertTrue(driver.findElement(By.linkText("iphone xs")).isDisplayed());

        driver.findElement(By.linkText("iphone xs")).click();

        Assert.assertTrue(driver.findElement(By.xpath(homePage.SEARCH_RESULT)).isDisplayed());


        driver.quit();

        //List<WebElement> searchResultelements = driver.findElements(By.tagName("a"));


    }
}
