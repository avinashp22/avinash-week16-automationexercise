package com.automationexercise.steps;

import com.automationexercise.pages.ProductDetailsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class TC21_AddReviewOnProduct {
    @Then("Verify Write Your Review is visible")
    public void verifyWriteYourReviewIsVisible() {
        Assert.assertEquals(new ProductDetailsPage().verifyWriteYourReviewText(), "WRITE YOUR REVIEW");
    }

    @And("The user fills in name {string}")
    public void theUserFillsInName(String nameBoxText) {
        new ProductDetailsPage().nameBoxText(nameBoxText);
    }

    @And("The user fills in email {string}")
    public void theUserFillsInEmail(String emailBoxText) {
        new ProductDetailsPage().emailBox(emailBoxText);
    }

    @And("The user fills in review {string}")
    public void theUserFillsInReview(String reviewBoxText) {
        new ProductDetailsPage().reviewBoxText(reviewBoxText);
    }

    @And("The click Submit Button")
    public void theClickSubmitButton() {
        new ProductDetailsPage().clickReviewButton();
    }

    @Then("Verify success message Thank you for your review.")
    public void verifySuccessMessageThankYouForYourReview() {
        Assert.assertEquals(new ProductDetailsPage().verifythankYouText(), "Thank you for your review.");
    }
}
