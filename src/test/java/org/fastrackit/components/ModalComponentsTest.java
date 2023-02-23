package org.fastrackit.components;

import org.fasttrackit.body.Modal;
import org.fasttrackit.pages.HomePage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ModalComponentsTest {

    HomePage homePage = new HomePage ();

    @Test
    public void verifyModalComponents() {
        homePage.clickOnTheOpenModalButton ();
        assertTrue ( homePage.validateModalIsDisplayed () , "Expected modal is displayed." );
        Modal modal = new Modal ();
        assertEquals ( modal.getModalTitle () , "Login" , "Expected Modal title to be Login." );
        assertTrue ( modal.validateCloseButtonIsDisplayed () , "Expected Close Button to be displayed." );
        assertTrue ( modal.validateUsernameFieldIsDisplayed () , "Expected username field to be displayed." );
        assertTrue ( modal.validatePasswordFieldIsDisplayed () , "Expected password field to be displayed." );
        assertTrue ( modal.validateThatLoginButtonIsDisplayed () , "Expected login button to be displayed." );
        assertTrue ( modal.validateThatLoginButtonIsEnabled () , "Expected login button to be enabled." );
        modal.clickOnTheCloseButton ();
        assertTrue ( homePage.validateModalIsNotDisplayed () , "Expected Modal to be closed." );


    }

}
