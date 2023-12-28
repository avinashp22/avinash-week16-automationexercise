
Feature: TC03 Login User with incorrect email and password

  Scenario: TC03 Login User with incorrect email and password
    Given The user is on the home page
    When The user clicks Signup Login menu button
    Then Verify New User Signup! is visible
    When The user enters correct email address "avinashp222@gmail.com"
    When The user enters correct password "Prime123456"
    And The user clicks login button
    Then Verify error Your email or password is incorrect is visible