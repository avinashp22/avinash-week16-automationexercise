package com.automationexercise.steps;

import com.automationexercise.pages.ViewCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TC23_VerifyAddressDetailsInCheckoutPage {
    @When("The user clicks Proceed To Checkout button")
    public void theUserClicksProceedToCheckoutButton() {
        new ViewCartPage().clickProceedToCheckoutButton();
    }

    @Then("Verify that the delivery address is same address filled at the time registration of account")
    public void verifyThatTheDeliveryAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
        Assert.assertEquals(new ViewCartPage().getDeliveryAddress(),"1 Prime Road");
    }

    @And("Verify that the billing address is same address filled at the time registration of account")
    public void verifyThatTheBillingAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
        Assert.assertEquals(new ViewCartPage().getBillingAddress(),"1 Prime Road");
    }
}
