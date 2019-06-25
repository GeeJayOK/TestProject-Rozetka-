import pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/webdriver/linux/chromedriver");
        System.setProperty("webdriver.gecko.driver", "src/resources/webdriver/linux/geckodriver");
        HomePage homePage = new HomePage();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get(homePage.URL);

        driver.quit();

    }
}
