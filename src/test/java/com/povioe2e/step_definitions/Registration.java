package com.povioe2e.step_definitions;

import com.povioe2e.pages.DashboardPage;
import com.povioe2e.pages.SignInPage;
import com.povioe2e.pages.SignUpPage;
import com.povioe2e.utilities.ConfigurationReader;
import com.povioe2e.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registration {

    @Given("I navigate to the sign up page")
    public void iNavigateToTheSignUpPage() {
        Driver.get().get(ConfigurationReader.get("url"));
        DashboardPage button = new DashboardPage();
        button.signupbutton.click();
        WebDriverWait wait = new WebDriverWait(Driver.get(),5);
        wait.until(ExpectedConditions.urlContains("sign_up"));
        Assert.assertTrue("Link ends with sign_up",Driver.get().getCurrentUrl().endsWith("sign_up"));
    }

    @And("I write name {string}")
    public void iWriteName(String name) {
        SignUpPage signup = new SignUpPage();
        signup.nameField.sendKeys(name);

    }

    @And("I write the email {string}")
    public void iWriteTheEmail(String email) {
        SignUpPage signup = new SignUpPage();
        signup.emailField.sendKeys(email);
    }

    @And("I write the password {string}")
    public void iWriteThePassword(String password) {
        SignUpPage signup = new SignUpPage();
        signup.passwordField.sendKeys(password);
    }

    @And("I confirm password {string}")
    public void iConfirmPassword(String password) {
        SignUpPage signup = new SignUpPage();
        signup.passwordConfirmField.sendKeys(password);
    }

    @When("I click on signup button")
    public void iClickOnSignupButton() {
        SignUpPage signup = new SignUpPage();
        signup.signUpnButton.click();

    }

    @Then("I should see the main page")
    public void iShouldSeeTheMainPage() {
        Assert.assertEquals(Driver.get().getCurrentUrl(), ConfigurationReader.get("url"));
        SignUpPage signUp = new SignUpPage();
        Assert.assertTrue(signUp.successMessage.isDisplayed());
    }



    @Then("I should see Email has already been taken- message")
    public void iShouldSeeEmailHasAlreadyBeenTakenMessage() {
            SignUpPage signUp = new SignUpPage();
            Assert.assertTrue(signUp.credError.isDisplayed());
        }



}

