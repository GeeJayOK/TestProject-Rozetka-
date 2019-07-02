package pages;

import org.openqa.selenium.*;
import locators.Locators;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage typeWordInSearchField() {
        driver.findElement(By.xpath(Locators.SEARCH_FIELD)).sendKeys("iphone");
        return this;
    }

    public SearchPage clickEnteredWord() {
        driver.findElement(By.linkText(Locators.SEARCH_WORD)).click();
        return new SearchPage(driver);
    }
}
