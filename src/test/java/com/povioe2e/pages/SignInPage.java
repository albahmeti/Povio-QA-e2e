package com.povioe2e.pages;

import com.povioe2e.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
    public SignInPage() {
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(id = "user_email")
    public WebElement emailField;
    @FindBy(id = "user_password")
    public WebElement passwordField;
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement signInButton;
    @FindBy(xpath = "//*[@id=\"new_user\"]/div[3]/label")
    public WebElement rememberMe;
    @FindBy(xpath = "/html/body/main/div[1]")
    public WebElement invalidEmailOrPassError;



}
