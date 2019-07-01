import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    private WebDriver driver;

    private By SPACE_GRAY_COLOR = By.xpath("//li[2]//pp-item-color[1]//a[1]//span[1]");
    private By BYE_BUTTON = By.xpath("//button[contains(text(),'Купить')]");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public ProductPage userSelectSpaceGrayColor() {
        driver.findElement(SPACE_GRAY_COLOR).click();
        return this;
    }

    public ProductPage clickByeButton() {
        driver.findElement(BYE_BUTTON).click();
        return this;
    }
}


