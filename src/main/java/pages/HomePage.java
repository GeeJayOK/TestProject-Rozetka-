package pages;

import org.openqa.selenium.*;
import locators.Locators;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage typeWordInSearchField(String searchWord) {
        driver.findElement(By.xpath(Locators.SEARCH_FIELD)).sendKeys(searchWord);
        return this;
    }

    public SearchPage clickEnteredWord(String enteredWord) {
        driver.findElement(By.linkText(enteredWord)).click();
        return new SearchPage(driver);
    }
}
