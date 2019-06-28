import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    private WebDriver driver;


    private By SEARCH_LIST = By.xpath("//div[@name='search_list']");
    private By SELECT_PRODUCT1 = By.xpath("//a[@href='https://rozetka.com.ua/apple_iphone_xs_max_512_gb_gold/p54189216/']");


    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public ProductPage productSearch() {
        Assert.assertTrue(driver.findElement(SEARCH_LIST).isDisplayed());
        driver.findElement(SELECT_PRODUCT1).click();
        return new ProductPage(driver);
    }
}
