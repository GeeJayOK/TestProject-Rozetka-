import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    private WebDriver driver;


    private By SEARCH_LIST = By.xpath("//div[@name='search_list']");
    private By SELECT_PRODUCT = By.xpath("//a[contains(text(),'Apple iPhone XS Max 64GB (Gold) Dual SIM')]");

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public ProductPage productSearch() {
        Assert.assertTrue(driver.findElement(SEARCH_LIST).isDisplayed());
        driver.findElement(SELECT_PRODUCT).click();
        return new ProductPage(driver);
    }
}
