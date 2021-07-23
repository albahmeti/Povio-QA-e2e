package com.povioe2e.pages;

import com.povioe2e.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CampaignPage {
    public CampaignPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy( name= "campaign[name]")
    public WebElement nameField;
    @FindBy(name = "campaign[description]")
    public WebElement descriptionField;
    @FindBy(xpath = "/html/body/main/div/form/div[4]/label/input")
    public WebElement oneTime;
    @FindBy(xpath = "/html/body/main/div/form/div[5]/label/input")
    public WebElement repeatable;
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement createbutton;
    @FindBy(id="flash_notice")
    public WebElement createdMessage;

    @FindBy(xpath = "//tbody//a[contains(text(), 'Edit')]")
    public List<WebElement> editButton;



}
//input[@type='radio']