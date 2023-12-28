
Feature: TC15 Place Order Register before Checkout

  Scenario: TC15 Register before Checkout
    Given The user is on the home page
    When The user clicks Signup Login menu button
    And The user enters name "Avi"
    And The user enters email "aavviippate@gmail.com"
    And The user clicks Signup button
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
    Then Verify that Logged in as username is visible
    When The user hovers over first product and clicks Add to cart
    And The user clicks Continue Shopping button
    And The user hovers over second product and clicks Add to cart
    And The user clicks Continue Shopping button
    And The user clicks Cart menu button
    Then Verify that cart page is displayed
    When The user clicks Proceed To Checkout button
    Then Verify that the delivery address is same address filled at the time registration of account
    And Verify that the billing address is same address filled at the time registration of account
    When The user enters description in comment text area "thanks"
    And Click Place Order button
    And The user enters payment details Name on Card "avinassh"
    And The user enters payment details Card Number "1234567891234567"
    And The user enters payment details CVC "311"
    And The user enters payment details Expiration month "11"
    And The user enters payment details Expiration year "2024"
    When The user clicks Pay and Confirm Order button
    #Then Verify success message Your order has been placed successfully!
    When The user clicks Delete Account button
    Then Verify that ACCOUNT DELETED is visible
    And The user clicks after delete Continue button