package com.automationexercise.steps;

import com.automationexercise.pages.ProductDetailsPage;
import com.automationexercise.pages.ProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TC13_VerifyProductQuantityInCart {
    @When("The user clicks View Product for any product on home page")
    public void theUserClicksViewProductForAnyProductOnHomePage() {
        new ProductsPage().clickFirstViewProductButton();
    }

    @Then("Verify product detail is opened")
    public void verifyProductDetailIsOpened() {
        Assert.assertEquals(new ProductDetailsPage().verifyProductName(), "Blue Top");
    }

    @When("The user increases quantity to {string}")
    public void theUserIncreasesQuantityTo(String quantityBoxText) {
        new ProductDetailsPage().enterQuantityBoxText(quantityBoxText);
    }

    @And("The user clicks Add to cart button")
    public void theUserClicksAddToCartButton() {
        new ProductDetailsPage().clickAddToCartButton();
    }

    @Then("Verify that product is displayed in cart page with exact quantity")
    public void verifyThatProductIsDisplayedInCartPageWithExactQuantity() {
        Assert.assertEquals(new ProductDetailsPage().verifyQuantityInCart(), "41");
    }
}
