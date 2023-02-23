package org.fastrackit.components;

import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.SortDropDownMenu;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;
import static org.testng.Assert.assertTrue;

public class SortDropDownMenuTest {

    HomePage homePage = new HomePage();

    @Test
    public void verifySortPageComponents() {
        assertTrue(homePage.validateSortFieldIsDisplayed(), "Expected sort field to be displayed.");
        SortDropDownMenu sortDropDownMenu = new SortDropDownMenu();
        assertTrue(sortDropDownMenu.validateSortAToZIsDisplayedByDefault(), "Expected Sort by name (A to Z) to be displayed.");
        sleep(3000);
        homePage.clickOnTheSortMenu();
        sleep(3000);
        assertTrue(sortDropDownMenu.validateSortZToAIsDisplayed(), "Expected Sort by name (Z to A) to be displayed.");
        assertTrue(sortDropDownMenu.validateSortByPriceLowToHighIsDisplayed(), "Expected Sort by price (Low to High) to be displayed.");
        assertTrue(sortDropDownMenu.validateSortByPriceHighToLowIsDisplayed(), "Expected Sort by price (High to Low) to be displayed.");
        homePage.clickOnTheSortMenu();
        sleep(3000);
    }


}
