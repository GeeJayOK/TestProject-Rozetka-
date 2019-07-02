package locators;

public interface Locators {

    String BASE_URL = "https://rozetka.com.ua/";
    String SEARCH_WORD = "iphone xs";
    String SEARCH_FIELD = "//input[@name='search']";
    String SEARCH_LIST = "//div[@name='search_list']";
    String SELECT_GOLD = "//a[@href='https://rozetka.com.ua/apple_iphone_xs_max_512_gb_gold/p54189216/']";
    String IPHONEXS_PAGE = "//h1[contains(text(),'Apple iPhone Xs Max 512GB Gold (MT552)')]";
    String SPACE_GRAY_COLOR = "//li[2]//pp-item-color[1]//a[1]//span[1]";
    String BUTTON_BUY = "//button[contains(text(),'Купить')]";
    String BASKET = "//h2[contains(text(),'Вы добавили товар в корзину')]";

}
