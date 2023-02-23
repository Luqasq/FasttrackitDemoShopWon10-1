package org.fastrackit.scenarios;

import org.fasttrackit.body.Header;
import org.fasttrackit.body.Modal;
import org.fasttrackit.pages.HomePage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginWithUserTest {

    HomePage homePage = new HomePage ();

    @Test

    public void loginWithUserDino() {
        homePage.clickOnTheOpenModalButton ();
        Modal modal = new Modal ();
        modal.typeInUserNameField ( "dino" );
        modal.typeInPasswordField ( "choochoo" );
        modal.clickOnTheLoginButton ();
        assertTrue ( homePage.validateModalIsNotDisplayed () , "Expected Modal to be closed." );
        assertEquals ( homePage.validateThatHeaderContainsGreetingsMessage () , "Hi dino!" , "Expected message to be : Hi dino!" );
        homePage.logUserOut();
    }

    @Test
    public void loginWithUserBeetle() {
        homePage.clickOnTheOpenModalButton ();
        Modal modal = new Modal ();
        String user = "beetle";
        modal.typeInUserNameField ( user );
        modal.typeInPasswordField ( "choochoo" );
        modal.clickOnTheLoginButton ();
        assertTrue ( homePage.validateModalIsNotDisplayed () , "Expected Modal to be closed." );
        Header header = new Header ( user );
        header.getGreetingsMessage ();
        assertEquals ( header.getGreetingsMessage () , "Hi beetle!" , "Expected message to be : Hi beetle!" );
        homePage.logUserOut();
    }

}
