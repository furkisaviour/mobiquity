package com.mobiquity.step_definitions;

import com.mobiquity.pages.WomenPage;
import com.mobiquity.utilities.BrowserUtils;
import com.mobiquity.utilities.ConfigurationReader;
import com.mobiquity.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class SortingStepDefinitions {

    WomenPage womenPage = new WomenPage();

    @Given("user is on main page")
    public void user_is_on_main_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("mainPage"));
    }
    @When("user clicks women page")
    public void user_clicks_women_page() {
        womenPage.womenButton.click();
    }
    @When("user clicks Sort by button")
    public void user_clicks_sort_by_button() {
        womenPage.sortButton.click();
    }
    @When("user clicks highest first")
    public void user_clicks_highest_first() {
        womenPage.dropdownList.get(2).click();
        BrowserUtils.wait(5);
    }
    @Then("user should see highest product")
    public void user_should_see_highest_product() {
        String expectedHighestProduct = "Printed Dress";
        Assert.assertEquals(expectedHighestProduct,womenPage.firstProduct.getText());
    }
}
