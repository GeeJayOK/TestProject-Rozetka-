package pages;

import org.openqa.selenium.*;
import locators.Locators;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage typeWordInSearchField() {
        driver.findElement(By.xpath(Locators.SEARCH_FIELD)).sendKeys(Locators.SEARCH_WORD);
        return this;
    }

    public SearchPage clickEnteredWord() {
        driver.findElement(By.linkText(Locators.ENTERED_WORD)).click();
        return new SearchPage(driver);
    }
}
