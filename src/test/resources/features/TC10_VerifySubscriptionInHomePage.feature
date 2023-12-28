
Feature: TC10 Verify Subscription in home page
@register
  Scenario: TC10 Verify Subscription in home page
    Given The user is on the home page
    When The user scrolls down to footer
    Then Verify text SUBSCRIPTION
    When The user enters email address "aavippp@gmail.com"
    When The user clicks Subscription submit button
    Then Verify success message You have been successfully subscribed is visible