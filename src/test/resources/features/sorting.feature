Feature: Sorting functionality
      Agile Story = As a user ,when I click the Price highest first from
      sorting selecting , I should be able to see highest one


      Scenario:User should be able to see highest price
            Given user is on main page
            When  user clicks women page
            And   user clicks Sort by button
            And   user clicks highest first
            Then  user should see highest product