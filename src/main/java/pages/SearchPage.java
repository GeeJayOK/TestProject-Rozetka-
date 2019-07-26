package pages;

import org.openqa.selenium.*;
import locators.Locators;

public class SearchPage extends BasePage{
    //private WebDriver driver;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public ProductPage productSearch() {
        getDriver().findElement(By.xpath(Locators.SELECT_GOLD)).click();
        return new ProductPage(driver);
    }
}
