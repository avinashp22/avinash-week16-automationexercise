
Feature: TC02 Login User with correct email and password

  Scenario: TC02 Login User with correct email and password
    Given The user is on the home page
    When The user clicks Signup Login menu button
    Then Verify New User Signup! is visible
    When The user enters correct email address "Avinashp2222@gmail.com"
    When The user enters correct password "Prime12345!"
    And The user clicks login button
    Then Verify that Logged in as username is visible
    When The user clicks Delete Account button
    Then Verify that ACCOUNT DELETED is visible
    And The user clicks Other Continue button