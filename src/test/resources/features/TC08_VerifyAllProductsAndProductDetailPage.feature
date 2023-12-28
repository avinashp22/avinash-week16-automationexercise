
Feature: TC08 Verify All Products and product detail page

  Scenario: TC08 Verify All Products and product detail page
    Given The user is on the home page
    When The user clicks Products menu button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    And Verify the products list is visible
    When The user clicks on View Product of first product
    Then Verify the user is landed to product detail page
    And Verify that detail detail is visible product name
    And Verify that detail detail is visible category
    And Verify that detail detail is visible price
    And Verify that detail detail is visible availability
    And Verify that detail detail is visible condition
    And Verify that detail detail is visible brand