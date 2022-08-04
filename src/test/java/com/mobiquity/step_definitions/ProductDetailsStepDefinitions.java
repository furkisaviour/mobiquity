package com.mobiquity.step_definitions;

import com.mobiquity.pages.ProductPage;
import io.cucumber.java.en.*;

public class ProductDetailsStepDefinitions {

    ProductPage productPage = new ProductPage();

    @When("user clicks T-shirts product")
    public void user_clicks_t_shirts_product() {
        productPage.tshirtButton.click();
    }
    @When("user scrolls down the page")
    public void user_scrolls_down_the_page() {

    }
    @Then("user should see that styles of the product")
    public void user_should_see_that_styles_of_the_product() {

    }
}
