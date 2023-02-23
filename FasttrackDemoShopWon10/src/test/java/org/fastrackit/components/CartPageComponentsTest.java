package org.fastrackit.components;

import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.HomePage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class CartPageComponentsTest {

    HomePage homePage = new HomePage ();

    @Test
    public void cartPageComponents() {
        homePage.clickOnTheCartIcon ();
        CartPage cartPage = new CartPage ();
        assertTrue ( cartPage.validateCartIsDisplayed () , "Expected cart page to be displayed." );
        assertTrue ( cartPage.validateCartAddingMsgIsDisplayed () , "Expected cart adding message to be displayed." );
        homePage.clickOnTheLogoButton ();

    }



}
