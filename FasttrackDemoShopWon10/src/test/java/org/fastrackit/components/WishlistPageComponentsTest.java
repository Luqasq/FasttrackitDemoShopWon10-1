package org.fastrackit.components;

import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.WishlistPage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;
import static org.testng.Assert.assertTrue;

public class WishlistPageComponentsTest {

    HomePage homePage = new HomePage ();

    @Test

    public void wishlistPageComponents() {
        homePage.clickOnTheWishlistIcon ();
        WishlistPage wishlistPage = new WishlistPage ();
        assertTrue ( wishlistPage.validateWishlistIsDisplayed () , "Expected wishlist page to be displayed." );
        sleep ( 3000 );
        homePage.clickOnTheLogoButton ();
        assertTrue ( homePage.validateWishlistIsNotDisplayed () , "Expected wishlist to be closed." );
        sleep ( 3000 );

    }


}
