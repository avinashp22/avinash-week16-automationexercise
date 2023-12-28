package com.automationexercise.steps;

import com.automationexercise.pages.RegisterPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class TC16_PlaceOrderLoginBeforeCheckout {
    @Then("Verify that ACCOUNT DELETED! is visible")
    public void verifyThatACCOUNTDELETEDIsVisible() {
        Assert.assertEquals(new RegisterPage().verifyaccountDeletedText(), "ACCOUNT DELETED!");
    }
}
