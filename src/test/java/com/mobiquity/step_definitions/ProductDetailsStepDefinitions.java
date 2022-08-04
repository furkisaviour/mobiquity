package com.mobiquity.step_definitions;

import com.mobiquity.pages.ProductPage;
import com.mobiquity.utilities.BrowserUtils;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class ProductDetailsStepDefinitions {

    ProductPage productPage = new ProductPage();

    @When("user clicks T-shirts product")
    public void user_clicks_t_shirts_product() {
        productPage.tshirtButton.click();
    }
    @When("user scrolls down the page")
    public void user_scrolls_down_the_page() {
        BrowserUtils.scrollToElement(productPage.styles);
    }
    @Then("user should see that {string} of the product")
    public void user_should_see_that_of_the_product(String feature) {
        switch (feature){

            case "Compositions":
            Assert.assertEquals("Cotton",productPage.compositions.getText());
            break;

            case  "Styles":
            Assert.assertEquals("Casual",productPage.styles.getText());
            break;

            case "Properties":
            Assert.assertEquals("Short Sleeve",productPage.properties.getText());
            break;
        }
    }

}
