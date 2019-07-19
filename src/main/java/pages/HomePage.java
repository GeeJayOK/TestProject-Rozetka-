package pages;

import org.openqa.selenium.*;
import locators.Locators;

public class HomePage extends BasePage {

    //private WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage typeWordInSearchField(String searchWord) {
        driver.findElement(By.xpath(Locators.SEARCH_FIELD)).sendKeys(searchWord);
        return new HomePage(driver);
    }

    public WebElement checkThatWordIsTyped() {
        return driver.findElement(By.xpath(Locators.SEARCH_FIELD));
    }

    public SearchPage clickEnteredWord(String enteredWord) {
        driver.findElement(By.linkText(enteredWord)).click();
        return new SearchPage(driver);
    }
}
