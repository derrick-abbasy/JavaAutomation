Feature: Checkout
  Scenario: Checkout Complete
    Given I am on the login page
    When I enter username "standard_user"
    And I enter password "secret_sauce"
    And I click the login button
    And I add a product to the cart
    And I click the shopping cart icon
    And I proceed to checkout
    And I enter first name "John"
    And I enter last name "Doe"
    And I enter postal code "12345"
    And I click the continue button
    And I click the finish button    
    Then I should see the checkout complete message