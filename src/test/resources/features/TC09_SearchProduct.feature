
Feature:TC09 Search Product

  Scenario: TC09 Search Product
    Given The user is on the home page
    When The user clicks Products menu button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    When The user enters product name "Blue Top"
    When The user clicks search button
    Then Verify SEARCHED PRODUCTS is visible
    And Verify all the products related to search are visible
