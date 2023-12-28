package com.automationexercise.steps;

import com.automationexercise.pages.RegisterPage;
import io.cucumber.java.en.And;

public class TC15_PlaceOrderRegisterBeforeCheckout {
    @And("The user clicks after delete Continue button")
    public void theUserClicksAfterDeleteContinueButton() {
        new RegisterPage().clickDeleteContinueButton();
    }
}
