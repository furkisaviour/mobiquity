package com.mobiquity.pages;

import com.mobiquity.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends MainPage{

    public SignInPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "email")
    public WebElement emailBox;

    @FindBy(id = "passwd")
    public WebElement passwordBox;

    @FindBy(id = "SubmitLogin")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@class='alert alert-danger']//child::p")
    public WebElement dangerMessage;


}
