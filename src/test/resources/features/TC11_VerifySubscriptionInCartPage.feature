
Feature: TC11 Verify Subscription in Cart page

  Scenario: TC11 Verify Subscription in Cart page
    Given The user is on the home page
    When The user clicks Cart menu button
    And The user scrolls down to footer
    Then Verify text SUBSCRIPTION
    When The user enters email address "aviiippp@gmail.com"
    When The user clicks Subscription submit button
    Then Verify success message You have been successfully subscribed is visible