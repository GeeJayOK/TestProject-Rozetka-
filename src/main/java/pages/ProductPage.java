package pages;

import org.openqa.selenium.*;
import locators.Locators;

public class ProductPage {

    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isProductDisplayed() {
        return driver.findElement(By.xpath(Locators.IPHONEXS_PAGE)).isDisplayed();
    }

    public ProductPage userSelectSpaceGrayColor() {
        driver.findElement(By.xpath(Locators.SPACE_GRAY_COLOR)).click();
        return this;
    }

    public boolean isBuyButtonPresent() {
        return driver.findElement(By.xpath(Locators.BUTTON_BUY)).isDisplayed();
    }

    public ProductPage clickBuyButton() {
        driver.findElement(By.xpath(Locators.BUTTON_BUY)).click();
        return this;
    }

    public boolean isBasketOpened() {
        return driver.findElement(By.xpath(Locators.BASKET)).isDisplayed();
    }
}


