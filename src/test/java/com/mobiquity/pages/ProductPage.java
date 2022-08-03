package com.mobiquity.pages;

import com.mobiquity.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends MainPage{

    public ProductPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//tr[@class])[1]//child::td[2]")
    public WebElement compositions;

    @FindBy(xpath = "(//tr[@class])[2]//child::td[2]")
    public WebElement styles;

    @FindBy(xpath = "(//tr[@class])[3]//child::td[2]")
    public WebElement properties;
}
