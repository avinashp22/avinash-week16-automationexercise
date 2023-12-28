
Feature: TC25 Verify Scroll Up using Arrow button and Scroll Down functionality

  Scenario: TC25 Verify Scroll Up using Arrow button and Scroll Down functionality
    Given The user is on the home page
    When The user scrolls down to footer
    Then Verify text SUBSCRIPTION
    When The user clicks orange arrow button
    Then Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen