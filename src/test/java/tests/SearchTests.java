package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.WikiPage;

public class SearchTests extends TestBase {
    WikiPage wikiPage =new WikiPage();
    String appiumElement = "Appium";
    String Bayern = "FC Bayern Munchen";
    String text= "Season of football team";

    @Test
    @DisplayName("Проверка работы поисковой строки. Результат поиска > 0")
    @Tag("android")
    void successfulSearchTest() {
        wikiPage.clickSearchWikipedia();
        wikiPage.searchElement(appiumElement);
        wikiPage.checkElement(appiumElement);
    }

    @Test
    @DisplayName("Проверка текста, d результатов поиска.")
    @Tag("android")
    void searchTextTest() {
        wikiPage.clickSearchWikipedia();
        wikiPage.searchElement(Bayern);
        wikiPage.checkText(text);
    }
}