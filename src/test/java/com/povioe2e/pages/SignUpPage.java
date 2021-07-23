package com.povioe2e.pages;

import com.povioe2e.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
    public SignUpPage() {
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(id = "user_name")
    public WebElement nameField;
    @FindBy(id = "user_email")
    public WebElement emailField;
    @FindBy(id = "user_password")
    public WebElement passwordField;
    @FindBy(id = "user_password_confirmation")
    public WebElement passwordConfirmField;
    @FindBy(xpath = "//*[@id=\"new_user\"]/input[3]")
    public WebElement signUpnButton;
    @FindBy(xpath = "//*[@id=\"error_explanation\"]")
    public WebElement credError;
    @FindBy(xpath = "//*[@id=\"flash_notice\"]")
    public WebElement successMessage;


}
