import org.junit.*;
import pages.HomePage;
import pages.ProductPage;
import pages.SearchPage;

public class RozetkaTest extends BaseTest {

    private BaseTest baseTest = null;

    @Before
    public void setUp() {
        baseTest = new BaseTest();
        baseTest.getDriver();
    }

    @Test
    public void searchIphoneTest() {
        baseTest.openHomePage();
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isHomePageOpened());
        homePage.typeWordInSearchField("iphone xs");
        Assert.assertTrue(homePage.checkThatWordIsTyped());
        homePage.clickEnteredWord("iphone xs max");
        SearchPage searchPage = new SearchPage(driver);
        Assert.assertTrue(searchPage.isSearchListDisplayed());
        searchPage.productSearch();
        ProductPage productPage = new ProductPage(driver);
        Assert.assertTrue(productPage.isProductDisplayed());
        productPage.userSelectSpaceGrayColor();
        Assert.assertTrue(productPage.isBuyButtonPresent());
        productPage.clickBuyButton();
        Assert.assertTrue(productPage.isBasketOpened());
    }

    @After
    public void shotDown() {
        baseTest.tearDown();
    }
}
