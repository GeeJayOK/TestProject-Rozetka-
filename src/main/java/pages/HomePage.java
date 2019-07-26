package pages;

import org.openqa.selenium.*;
import locators.Locators;

public class HomePage extends BasePage {

    //private WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage typeWordInSearchField(String searchWord) {
        getDriver().findElement(By.xpath(Locators.SEARCH_FIELD)).sendKeys(searchWord);
        return this;
    }

    public HomePage checkThatWordIsTyped() {
        getDriver().findElement(By.xpath(Locators.SEARCH_FIELD));
        return this;
    }

    public SearchPage clickEnteredWord(String enteredWord) {
        getDriver().findElement(By.linkText(enteredWord)).click();
        return new SearchPage(driver);
    }
}
