
Feature: TC01 Register User

  Scenario: TC01 Register on the web page
    Given The user is on the home page
    When The user clicks Signup Login menu button
    Then Verify New User Signup! is visible
    When The user enters name "Avi"
    When The user enters email "avvipa@gmail.com"
    And The user clicks Signup button
    Then Verify that ENTER ACCOUNT INFORMATION is visible
    When User selects Mr
    When User Enters Password "Prime12345"
    When User Selects Day "1"
    When User Selects Month "May"
    When User Selects Year "2009"
    When User Enters First Name "Avi"
    When User Enters Last Name "Pat"
    When User Enters Address "1 Prime Road"
    When User Enters Country "India"
    When User Enters State "Mumbai"
    When User Enters City "Bombay"
    When User Enters Zipcode "HA02JK"
    When User Enters Mobile "07765234598"
    And The user clicks Create Account button
    Then Verify that ACCOUNT CREATED! is visible
    When The user clicks Continue button
  #  And The user clicks Dismiss button
    Then Verify that Logged in as username is visible
    When The user clicks Delete Account button
    Then Verify that ACCOUNT DELETED is visible
    And The user clicks Other Continue button