import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private final String URL = "https://rozetka.com.ua/";

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By HOME_PAGE_LOGO = By.xpath("//a[@class='header__logo']//img");
    By SEARCH_FIELD = By.xpath("//input[@name='search']");












    /*

    //a[contains(text(),'Apple iPhone Xs Max 256GB Space Gray (MT682)')]
    //div[@name='search_list']//a[contains(text(),'Apple iPhone Xs Max 256GB Space Gray (MT682)')]/div[@name='search_list']
    //a[contains(text(),'Apple iPhone Xs Max 256GB Space Gray (MT682)')]..div[@class='pos-fix']

    */

}
