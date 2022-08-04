@smoke
Feature: Product Details

  Background: user is on main page
    Given user is on main page

  Scenario: user should be able to see styles of the product
    When user clicks T-shirts product
    And user scrolls down the page
    Then user should see that styles of the product

