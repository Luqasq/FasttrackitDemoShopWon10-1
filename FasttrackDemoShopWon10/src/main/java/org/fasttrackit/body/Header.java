package org.fasttrackit.body;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Header {

    private final SelenideElement logoIcon = $(".fa-shopping-bag");
    private final SelenideElement cartIcon = $("[href='#/cart']");
    private final SelenideElement wishListIcon = $("[href='#/wishlist']");
    private final SelenideElement greetingsMessage = $(".navbar-text span span");
    private final SelenideElement openModalButton = $(".fa-sign-in-alt");
    private final SelenideElement closeModalButton = $(".fa-sign-out-alt");


    public Header() {
    }

    public Header(String user) {
    }

    /**
     * Getters
     */
    public SelenideElement getLogoIcon() {
        return logoIcon;
    }

    public SelenideElement getCartIcon() {
        return cartIcon;
    }

    public SelenideElement getWishListIcon() {
        return wishListIcon;
    }

    public String getGreetingsMessage() {
        return greetingsMessage.text();
    }

    public SelenideElement getOpenModalButton() {
        return openModalButton;
    }

    /**
     * Actions
     */

    public void clickOnTheOpenModalButton() {
        this.openModalButton.click();
    }


    public void clickOnTheWishlistIcon() {
        System.out.println("Clicked on the wishlist icon. ");
        this.wishListIcon.click();
    }

    public void clickOnTheLogoButton() {
       this.logoIcon.scrollTo();
        this.logoIcon.click();
    }

    public void clickOnTheCartIcon() {
        System.out.println("Clicked on the cart icon. ");
        this.cartIcon.click();
    }

    public void clickOnTheCloseModalButton() {
        this.closeModalButton.click();
    }
}





