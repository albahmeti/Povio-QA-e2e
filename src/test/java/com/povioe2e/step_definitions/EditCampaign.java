package com.povioe2e.step_definitions;

import com.povioe2e.pages.CampaignPage;
import com.povioe2e.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditCampaign {

    private CampaignPage cp=new CampaignPage();

    @And("I select a Campaign to edit {string}")
    public void iSelectACampaignToEdit(String arg0) {
        String[] arg=arg0.split(" ");
        int i = Integer.parseInt(arg[1]);
        cp.editButton.get(i).click();
    }

    @Then("I should see Campaign edit form")
    public void iShouldSeeCampaignEditForm() {
        WebDriverWait wait = new WebDriverWait(Driver.get(),5);
        wait.until(ExpectedConditions.urlContains("edit"));
        Assert.assertTrue("Link ends with edit",Driver.get().getCurrentUrl().endsWith("edit"));
    }

    @And("I update the fields {string}, {string}, {string}")
    public void iUpdateTheFields(String arg0, String arg1, String arg2) {
        cp.nameField.sendKeys(arg0);
        cp.descriptionField.sendKeys(arg1);

        if (arg2.equals("One Time")){
            cp.oneTime.click();
        }else if(arg2.equals("Repeatable")){
            cp.repeatable.click();
        }
    }

    @Then("I click on Update button")
    public void iClickOnUpdateButton() {
        cp.createbutton.click();
    }

    @And("I should see success message")
    public void iShouldSeeSuccessMessage() {
        Assert.assertEquals("Campaign was successfully updated.", cp.createdMessage.getText());
    }
}
