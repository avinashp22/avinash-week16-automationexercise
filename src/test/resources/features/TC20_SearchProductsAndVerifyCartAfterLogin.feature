
Feature: TC20 Search Products and Verify Cart After Login

  Scenario: TC20 Search Products and Verify Cart After Login
    Given The user is on the home page
    When The user clicks Products menu button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    When The user enters product name "Blue Top"
    When The user clicks search button
    Then Verify SEARCHED PRODUCTS is visible
    And Verify all the products related to search are visible
    When The user hovers over first product and clicks Add to cart
    And The user clicks Continue Shopping button
    And The user clicks Cart menu button
    Then Verify that products are visible in cart
    When The user clicks Signup Login menu button
    When The user enters correct email address "avinashp22@gmail.com"
    When The user enters correct password "Prime12345!"
    And The user clicks login button
    And The user clicks Cart menu button
    Then Verify that those products are visible in cart after login as well