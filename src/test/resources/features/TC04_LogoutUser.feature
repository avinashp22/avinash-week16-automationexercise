
Feature: TC04 Logout User

  Scenario: TC04 Logout User
    Given The user is on the home page
    When The user clicks Signup Login menu button
    Then Verify New User Signup! is visible
    When The user enters correct email address "avinashp22@gmail.com"
    When The user enters correct password "Prime12345!"
    And The user clicks login button
    Then Verify that Logged in as username is visible
    When The user clicks Logout button
    Then Verify New User Signup! is visible