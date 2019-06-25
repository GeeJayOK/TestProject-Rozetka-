package pages;


public class HomePage {

    private final String URL = "https://rozetka.com.ua/";
    private final String SEARCH_FIELD = "//input[@name='search']";
    public final String SEARCH_RESULT = "//span[contains(text(),'iphone xs')]";
    public final String SEARCH_LIST = "//div[@name='search_list']";

    /*

    //a[contains(text(),'Apple iPhone Xs Max 256GB Space Gray (MT682)')]
    //div[@name='search_list']//a[contains(text(),'Apple iPhone Xs Max 256GB Space Gray (MT682)')]/div[@name='search_list']
    //a[contains(text(),'Apple iPhone Xs Max 256GB Space Gray (MT682)')]..div[@class='pos-fix']

    */

    public String userOpenHomepage() {
        return URL;
    }

    public String checkSearchField() {
        return SEARCH_FIELD;
    }

}
