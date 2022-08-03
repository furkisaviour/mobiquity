package com.mobiquity.pages;

import com.mobiquity.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenPage extends MainPage{

    public WomenPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "selectProductSort")
    public WebElement sortButton;
}
