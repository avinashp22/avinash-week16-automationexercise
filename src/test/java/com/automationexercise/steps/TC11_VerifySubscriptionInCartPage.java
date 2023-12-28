package com.automationexercise.steps;

import com.automationexercise.pages.ViewCartPage;
import io.cucumber.java.en.When;

public class TC11_VerifySubscriptionInCartPage {
    @When("The user clicks Cart menu button")
    public void theUserClicksCartMenuButton() {
new ViewCartPage().clickCartButton();

    }
}
