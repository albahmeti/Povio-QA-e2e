package com.povioe2e.step_definitions;

import com.povioe2e.pages.DashboardPage;
import com.povioe2e.utilities.ConfigurationReader;
import com.povioe2e.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppHealth {


    @Given("I navigate to the login page")
    public void iNavigateToTheLoginPage() {Driver.get().get(ConfigurationReader.get("url"));}


    @When("I click on sign in button")
    public void iClickOnSignInButton() {
        DashboardPage button = new DashboardPage();
        button.signinbutton.click();
    }

    @Then("I get the sign in page")
    public void iGetTheSignInPage() {
        WebDriverWait wait = new WebDriverWait(Driver.get(),5);
        wait.until(ExpectedConditions.urlContains("sign_in"));
        Assert.assertTrue("Link ends with sign_in",Driver.get().getCurrentUrl().endsWith("sign_in"));
    }

    @When("I click on sign up button")
    public void iClickOnSignUpButton() throws InterruptedException {
        Thread.sleep(3000);
        DashboardPage button = new DashboardPage();
        button.signupbutton.click();
    }

    @Then("I get the sign up page")
    public void iGetTheSignUpPage() {
        WebDriverWait wait = new WebDriverWait(Driver.get(),5);
        wait.until(ExpectedConditions.urlContains("sign_up"));
        Assert.assertTrue("Link ends with sign_up",Driver.get().getCurrentUrl().endsWith("sign_up"));
    }

    @When("I click on home button")
    public void iClickOnHomeButton() throws InterruptedException {
        Thread.sleep(3000);
        DashboardPage button = new DashboardPage();
        button.homebutton.click();
    }

    @Then("I get the home page")
    public void iGetTheHomePage() {
        WebDriverWait wait = new WebDriverWait(Driver.get(),5);
        Assert.assertEquals(Driver.get().getCurrentUrl(), ConfigurationReader.get("url"));
    }




}
