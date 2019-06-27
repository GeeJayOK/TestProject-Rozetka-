import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    private WebDriver driver;

    private By SPACE_GRAY_COLOR = By.xpath("//li[3]//pp-item-color[1]//a[1]");
    private By BYE_BUTTON = By.xpath("//button[contains(text(),'Купить')]");
    private By BASKET_ADD = By.xpath("//h2[contains(text(),'Вы добавили товар в корзину')]");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public ProductPage userSelectSpaceGrayColor() {
        Assert.assertTrue(driver.findElement(SPACE_GRAY_COLOR).isDisplayed());
        driver.findElement(SPACE_GRAY_COLOR).click();
        return this;
    }

    public ProductPage clickByeButton() {
        Assert.assertTrue(driver.findElement(BYE_BUTTON).isDisplayed());
        driver.findElement(BYE_BUTTON).click();
        return this;
    }

    public ProductPage basketOpened() {
        Assert.assertTrue(driver.findElement(BASKET_ADD).isDisplayed());
        return this;
    }
}


