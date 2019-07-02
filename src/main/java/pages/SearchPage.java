package pages;

import org.openqa.selenium.*;
import locators.Locators;

public class SearchPage {
    private WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public ProductPage productSearch() {
        driver.findElement(By.xpath(Locators.SELECT_GOLD)).click();
        return new ProductPage(driver);
    }
}
