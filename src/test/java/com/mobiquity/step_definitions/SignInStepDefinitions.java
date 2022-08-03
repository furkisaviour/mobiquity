package com.mobiquity.step_definitions;

import com.mobiquity.pages.SignInPage;
import com.mobiquity.utilities.BrowserUtils;
import com.mobiquity.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class SignInStepDefinitions {

    SignInPage signInPage = new SignInPage();

    @When("user clicks Sign-in button")
    public void user_clicks_sign_in_button() {
        signInPage.signInButton.click();
    }
    @When("user enters {string} to email text area")
    public void user_enters_to_email_text_area(String email) {
        signInPage.emailBox.sendKeys(email);
    }
    @When("user enters {string} to password text area")
    public void user_enters_to_password_text_area(String password) {
        signInPage.passwordBox.sendKeys(password);
    }
    @When("user clicks login button")
    public void user_clicks_login_button() {
        signInPage.submitButton.click();
    }
    @Then("user should see danger message")
    public void user_should_see_danger_message() {
        BrowserUtils.waitForVisibility(signInPage.dangerMessage,10);

        String expectedText = "There is 1 error";
        Assert.assertEquals(expectedText,signInPage.dangerMessage.getText());

        String expectedTitle = "Login - My Store";
        Assert.assertEquals(expectedTitle,Driver.getDriver().getTitle());
    }
}
