package pages;

import org.openqa.selenium.*;
import locators.Locators;

public class ProductPage {

    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public ProductPage userSelectSpaceGrayColor() {
        driver.findElement(By.xpath(Locators.SPACE_GRAY_COLOR)).click();
        return this;
    }

    public ProductPage clickByeButton() {
        driver.findElement(By.xpath(Locators.BUTTON_BUY)).click();
        return this;
    }
}


