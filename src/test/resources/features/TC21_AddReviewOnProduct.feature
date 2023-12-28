
Feature: TC21 Add review on product

  Scenario: TC21 Add review on product
    Given The user is on the home page
    When The user clicks Products menu button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    When The user clicks View Product for any product on home page
    Then Verify Write Your Review is visible
    And The user fills in name "Avi"
    And The user fills in email "avip@gmail.com"
    And The user fills in review "test"
    And The click Submit Button
    Then Verify success message Thank you for your review.