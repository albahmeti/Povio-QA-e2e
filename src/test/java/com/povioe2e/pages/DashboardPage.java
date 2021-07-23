package com.povioe2e.pages;

import com.povioe2e.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    public DashboardPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy( xpath= "/html/body/header/div/nav/div/div[1]/a")
    public WebElement homebutton;
    @FindBy(xpath = "/html/body/header/div/nav/div/div[2]/ul/li[1]/a")
    public WebElement signinbutton;
    @FindBy(xpath = "/html/body/header/div/nav/div/div[2]/ul/li[2]/a")
    public WebElement signupbutton;

}
