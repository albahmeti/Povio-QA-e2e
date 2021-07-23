package com.povioe2e.step_definitions;

import com.povioe2e.pages.CampaignPage;
import com.povioe2e.pages.MainPage;
import com.povioe2e.pages.SignInPage;
import com.povioe2e.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddCampaign {
    private CampaignPage campP= new CampaignPage();

    @When("I enter the sign in information")
    public void iEnterTheSignInInformation() {

    }

    @And("I click Campaigns")
    public void iClickCampaigns() {
        MainPage cp = new MainPage();
        cp.campaign.click();
    }

    @Then("I should see Campaign page")
    public void iShouldSeeCampaignPage() {
        WebDriverWait wait = new WebDriverWait(Driver.get(),5);
        wait.until(ExpectedConditions.urlContains("campaigns"));
        Assert.assertTrue("Link ends with campaigns",Driver.get().getCurrentUrl().endsWith("campaigns"));
    }

    @And("I click Add New Campaign")
    public void iClickAddNewCampaign() {
        MainPage cp = new MainPage();
        cp.newCampaign.click();

    }

    @Then("I should be in the New Campaign page")
    public void iShouldBeInTheNewCampaignPage() {
        WebDriverWait wait = new WebDriverWait(Driver.get(),5);
        wait.until(ExpectedConditions.urlContains("campaigns/new"));
        Assert.assertTrue("Link ends with campaigns/new",Driver.get().getCurrentUrl().endsWith("campaigns/new"));
    }

    @And("I write Name {string}")
    public void iWriteName(String name) {
        campP.nameField.sendKeys(name);
    }

    @And("I write Description {string}")
    public void iWriteDescription(String desc) {
        campP.descriptionField.sendKeys(desc);

    }

    @And("I select Campaign {string}")
    public void iSelectCampaign(String arg0) throws Exception {

        System.out.println(arg0);
        if (arg0.equals("One Time")){
            campP.oneTime.click();
        }else if(arg0.equals("Repeatable")){
            campP.repeatable.click();
        }else{
            throw new Exception("No such Campaign");
        }

    }


    @When("I click on Create Campaign button")
    public void iClickOnCreateCampaignButton() {
        campP.createbutton.click();
    }

    @Then("I should see Campaign added to the table")
    public void iShouldSeeCampaignAddedToTheTable() {
        Assert.assertEquals("Campaign was successfully created.", campP.createdMessage.getText());

    }




}
