import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By SEARCH_FIELD = By.xpath("//input[@name='search']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage typeWordInSearchField() {
        driver.findElement(SEARCH_FIELD).sendKeys("iphone");
        return this;
    }

    public SearchPage clickEnteredWord() {
        driver.findElement(By.linkText("iphone xs")).click();
        return new SearchPage(driver);
    }
}
