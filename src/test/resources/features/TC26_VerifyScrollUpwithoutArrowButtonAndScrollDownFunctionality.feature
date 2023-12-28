
Feature: TC26 Verify Scroll Up without Arrow button and Scroll Down functionality

  Scenario: TC26 Verify Scroll Up without Arrow button and Scroll Down functionality
    Given The user is on the home page
    When The user scrolls down to footer
    Then Verify text SUBSCRIPTION
    When The user scrolls up to top
    Then Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen

