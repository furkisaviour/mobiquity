@miniRegression
Feature: Product Details

  Background: user is on main page
    Given user is on main page

  Scenario Outline: user should be able to see feature of the product
    When user clicks T-shirts product
    And user scrolls down the page
    Then user should see that "<feature>" of the product

    Examples:
              | feature       |
              | Compositions  |
              | Styles        |
              | Properties    |


