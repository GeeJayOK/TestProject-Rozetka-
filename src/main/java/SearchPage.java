import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    private WebDriver driver;

    private By SELECT_PRODUCT = By.xpath("//a[@href='https://rozetka.com.ua/apple_iphone_xs_max_512_gb_gold/p54189216/']");

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public ProductPage productSearch() {
        driver.findElement(SELECT_PRODUCT).click();
        return new ProductPage(driver);
    }
}
