package org.fastrackit.components;

import io.qameta.allure.Feature;
import org.fastrackit.dataprovider.ProductDataProvider;
import org.fastrackit.dataprovider.ProductsInCartDataProvider;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.products.Product;
import org.fasttrackit.products.ProductsInCart;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@Feature("ProductInCart Components Tests")
public class ProductsInCartComponentsTest {

    HomePage homePage = new HomePage();
    @AfterClass
    public void setup() {
        homePage.resetPage();
        homePage.returnToHomePage();
    }

    @Test(dataProvider = "productsDataProvider", dataProviderClass = ProductDataProvider.class)
    public void addToBasket(Product product) {
        product.addToBasket();

    }

    @Test(dataProvider = "productsInCartProvider", dataProviderClass = ProductsInCartDataProvider.class)
    public void verifyMinusButtonIsDisplayedForAllProducts(ProductsInCart productsInCart) {
        homePage.clickOnTheCartIcon();
        assertTrue(productsInCart.validateMinusButtonIsDisplayedForAllProducts(), "Expected minus button to be displayed for all products.");
    }

    @Test(dataProvider = "productsInCartProvider", dataProviderClass = ProductsInCartDataProvider.class)
    public void verifyMinusButtonIsEnabledForAllProducts(ProductsInCart productsInCart) {
        homePage.clickOnTheCartIcon();
        assertTrue(productsInCart.validateMinusButtonIsEnabledForAllProducts(), "Expected minus button to be enabled for all products.");
    }

    @Test(dataProvider = "productsInCartProvider", dataProviderClass = ProductsInCartDataProvider.class)
    public void verifyPlusButtonIsDisplayedForAllProducts(ProductsInCart productsInCart) {
        homePage.clickOnTheCartIcon();
        assertTrue(productsInCart.validatePlusButtonIsDisplayedForAllProducts(), "Expected plus button to be displayed for all products.");
    }

    @Test(dataProvider = "productsInCartProvider", dataProviderClass = ProductsInCartDataProvider.class)
    public void verifyPlusButtonIsEnabledForAllProducts(ProductsInCart productsInCart) {
        homePage.clickOnTheCartIcon();
        assertTrue(productsInCart.validatePlusButtonIsEnabledForAllProducts(), "Expected plus button to be enabled for all products.");
    }

    @Test(dataProvider = "productsInCartProvider", dataProviderClass = ProductsInCartDataProvider.class)
    public void verifyPriceForOneProductIsDisplayedForAllProducts(ProductsInCart productsInCart) {
        homePage.clickOnTheCartIcon();
        assertTrue(productsInCart.validatePriceForOneProductIsDisplayedForAllProducts(), "Expected price for one product to be displayed for all products.");
    }
    @Test(dataProvider = "productsInCartProvider", dataProviderClass = ProductsInCartDataProvider.class)
    public void verifyPriceForSeveralProductsIsDisplayedForAllProducts(ProductsInCart productsInCart) {
        homePage.clickOnTheCartIcon();
        assertTrue(productsInCart.validatePriceForSeveralProductsIsDisplayedForAllProducts(), "Expected price for more than one product to be displayed for all products.");
    }
    @Test(dataProvider = "productsInCartProvider", dataProviderClass = ProductsInCartDataProvider.class)
    public void verifyProductLinkIsDisplayedForAllProducts(ProductsInCart productsInCart) {
        homePage.clickOnTheCartIcon();
        assertTrue(productsInCart.validateProductLinkIsDisplayedForAllProducts(), "Expected product link to be displayed for all products.");
    }
    @Test(dataProvider = "productsInCartProvider", dataProviderClass = ProductsInCartDataProvider.class)
    public void verifyProductLinkIsEnabledForAllProducts(ProductsInCart productsInCart) {
        homePage.clickOnTheCartIcon();
        assertTrue(productsInCart.validateProductLinkIsEnabledForAllProducts(), "Expected product link to be enabled for all products.");
    }
    @Test(dataProvider = "productsInCartProvider", dataProviderClass = ProductsInCartDataProvider.class)
    public void verifyTrashIconIsDisplayedForAllProducts(ProductsInCart productsInCart) {
        homePage.clickOnTheCartIcon();
        assertTrue(productsInCart.validateTrashButtonIsDisplayedForAllProducts(), "Expected trash icon to be displayed for all products.");
    }
    @Test(dataProvider = "productsInCartProvider", dataProviderClass = ProductsInCartDataProvider.class)
    public void verifyTrashIconIsEnabledForAllProducts(ProductsInCart productsInCart) {
        homePage.clickOnTheCartIcon();
        assertTrue(productsInCart.validateTrashButtonIsEnabledForAllProducts(), "Expected trash icon to be enabled for all products.");
    }


}


