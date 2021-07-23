package com.povioe2e.step_definitions;

import com.povioe2e.pages.*;
import com.povioe2e.utilities.ConfigurationReader;
import com.povioe2e.utilities.Driver;
import io.cucumber.gherkin.Main;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Ma;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogIn {

    @Given("I navigate to the sign in page")
    public void iNavigateToTheSignInPage() {
        Driver.get().get(ConfigurationReader.get("url"));
        DashboardPage button = new DashboardPage();
        button.signinbutton.click();
        WebDriverWait wait = new WebDriverWait(Driver.get(),5);
        wait.until(ExpectedConditions.urlContains("sign_in"));
        Assert.assertTrue("Link ends with sign_in",Driver.get().getCurrentUrl().endsWith("sign_in"));
    }

    @And("I write email {string}")
    public void iWriteEmail(String email) {
        SignInPage signIn = new SignInPage();
        signIn.emailField.sendKeys(email);
    }

    @And("I write password {string}")
    public void iWritePassword(String password) {
        SignInPage signIn = new SignInPage();
        signIn.passwordField.sendKeys(password);
    }


    @When("I click on signin button")
    public void iClickOnSigninButton() throws InterruptedException {
        SignInPage signIn = new SignInPage();
        signIn.signInButton.click();



    }

    @Then("I should see main page")
    public void iShouldSeeMainPage() {
        Assert.assertEquals(Driver.get().getCurrentUrl(), ConfigurationReader.get("url"));
        SignUpPage signUp = new SignUpPage();
        Assert.assertTrue(signUp.successMessage.isDisplayed());
    }




}
