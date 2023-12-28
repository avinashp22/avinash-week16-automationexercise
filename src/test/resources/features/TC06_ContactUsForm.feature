
Feature: TC06 Contact Us Form

  Scenario: TC06 Contact Us Form
    Given The user is on the home page
    When The user clicks Contact us menu button
    Then Verify GET IN TOUCH is visible
    When The user enters name "Avi"
    When The user enters contact email "avip2@gmail.com"
    When The user enters subject "subject"
    When The user enters message "message"
    And The user uploads file
    And The User clicks Submit button
    And The user clicks OK button
    Then Verify success message Success Your details have been submitted successfully is visible
    When The user clicks Home button
    Then Verify that landed to home page successfully