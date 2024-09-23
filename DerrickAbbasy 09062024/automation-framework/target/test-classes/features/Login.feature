Feature: Login

  Scenario: Successful login and complete checkout
    Given I am on the login page
    When I enter username "standard_user"
    And I enter password "secret_sauce"
    And I click the login button
    And I should be redirected to the products page
    And I add a product to the cart
    And I click the shopping cart icon
    And I proceed to checkout
    And I enter first name "John"
    And I enter last name "Doe"
    And I enter postal code "12345"
    And I click the continue button
    And I click the finish button    
    Then I should see the checkout complete message
    
  Scenario: Login with locked out user
    Given I am on the login page
    When I enter username "locked_out_user"
    And I enter password "secret_sauce"
    And I click the login button
    Then I should see an error message "Epic sadface: Sorry, this user has been locked out."

  Scenario: Login with incorrect password
    Given I am on the login page
    When I enter username "standard_user"
    And I enter password "wrong_password"
    And I click the login button
    Then I should see an error message "Epic sadface: Username and password do not match any user in this service"
