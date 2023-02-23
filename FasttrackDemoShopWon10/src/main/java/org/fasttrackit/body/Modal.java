package org.fasttrackit.body;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Modal {

    private final SelenideElement modalTitle = $(".modal-title");
    private final SelenideElement closeButton = $(".close");
    private final SelenideElement username = $("#user-name");
    private final SelenideElement password = $("#password");
    private final SelenideElement loginButton = $(".btn.btn-primary");


    /**
     * Getters
     */
    public String getModalTitle() {
        return modalTitle.text();
    }

    public SelenideElement getCloseButton() {
        return closeButton;
    }

    public SelenideElement getUsername() {
        return username;
    }

    public SelenideElement getPassword() {
        return password;
    }

    public SelenideElement getLoginButton() {
        return loginButton;
    }

    /**
     * Validators
     */
    public boolean validateCloseButtonIsDisplayed() {
        return this.closeButton.exists() && this.closeButton.isDisplayed();
    }

    public boolean validateUsernameFieldIsDisplayed() {
        return this.username.exists() && this.username.isDisplayed();
    }

    public boolean validatePasswordFieldIsDisplayed() {
        return this.password.exists() && this.password.isDisplayed();

    }

    public boolean validateThatLoginButtonIsDisplayed() {
        return this.loginButton.exists() && this.loginButton.isDisplayed();
    }

    public boolean validateThatLoginButtonIsEnabled() {
        return this.loginButton.isEnabled();

    }

    /**
     * Clicks
     */

    public void clickOnTheCloseButton() {
        System.out.println("Clicked on the " + closeButton + " button.");
        this.closeButton.click();
        sleep(200);
    }

    public void clickOnUserNameField() {
        System.out.println("Clicked on the : " + this.username);
        this.username.click();
    }

    public void clickOnPasswordField() {
        System.out.println(" Clicked on the : " + this.password);
    }

    public void clickOnTheLoginButton() {
        System.out.println("Clicked on the : " + this.loginButton);
        this.loginButton.click();
    }

    /**
     * Types
     */

    public void typeInUserNameField(String userToType) {
        System.out.println("Typed in username : " + userToType);
        this.username.click();
        this.username.sendKeys(userToType);
    }

    public void typeInPasswordField(String passwordToType) {
        System.out.println("Typed in password : " + passwordToType);
        this.password.click();
        this.password.sendKeys(passwordToType);
    }

}


