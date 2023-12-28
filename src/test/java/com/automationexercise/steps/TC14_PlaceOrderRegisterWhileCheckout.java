package com.automationexercise.steps;

import com.automationexercise.pages.PaymentPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class TC14_PlaceOrderRegisterWhileCheckout {
    @Then("Verify success message Your order has been placed successfully!")
    public void verifySuccessMessageYourOrderHasBeenPlacedSuccessfully() {
        Assert.assertEquals(new PaymentPage().verifySuccessMessageText(), "Congratulations! Your order has been confirmed!");
    }
}
