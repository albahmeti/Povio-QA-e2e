package com.povioe2e.pages;

import com.povioe2e.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public MainPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy( xpath= "/html/body/header/div/nav/div/div[1]/a")
    public WebElement homebutton;
    @FindBy(xpath = "/html/body/header/div/nav/div/div[2]/ul/li[1]/a")
    public WebElement editaccount;
    @FindBy(xpath = "/html/body/header/div/nav/div/div[2]/ul/li[2]/a")
    public WebElement campaign;
    @FindBy(xpath = "/html/body/header/div/nav/div/div[2]/ul/li[3]/a")
    public WebElement signout;
    @FindBy(xpath = "/html/body/main/div/a")
    public WebElement newCampaign;


}
