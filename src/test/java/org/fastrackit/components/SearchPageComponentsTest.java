package org.fastrackit.components;

import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.SearchPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SearchPageComponentsTest {

    HomePage homePage = new HomePage ();

    @Test
    public void verifySearchPageComponents() {
        assertTrue ( homePage.validateSearchFieldIsDisplayed () , "Expected search field to be displayed." );
        assertTrue ( homePage.validateSearchButtonIsDisplayed () , "Expected search button to be displayed." );
        assertTrue ( homePage.validateSearchButtonIsEnabled () , "Expected search button to be enabled." );
        SearchPage searchPage = new SearchPage ();
        searchPage.clickOnTheSearchField ();
        searchPage.typeOnTheSearchField ( "" );
        searchPage.clickOnTheSearchButton ();
        homePage.clickOnTheLogoButton ();
    }


}
