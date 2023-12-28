package com.automationexercise.steps;

import com.automationexercise.pages.ProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TC08_VerifyAllProductsAndProductDetailPage {
    @When("The user clicks Products menu button")
    public void theUserClicksProductsMenuButton() {
    new ProductsPage().clickProductsButton();
    }

    @Then("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {
        Assert.assertEquals(new ProductsPage().verifyAllProductsText(),"ALL PRODUCTS");
    }

    @And("Verify the products list is visible")
    public void verifyTheProductsListIsVisible() {
        Assert.assertEquals(new ProductsPage().verifyAllProductsText(),"ALL PRODUCTS");
    }

    @When("The user clicks on View Product of first product")
    public void theUserClicksOnViewProductOfFirstProduct() {
        new ProductsPage().clickFirstViewProductButton();
    }

    @Then("Verify the user is landed to product detail page")
    public void verifyTheUserIsLandedToProductDetailPage() {
        Assert.assertEquals(new ProductsPage().verifyProductName(),"Blue Top");
    }

    @And("Verify that detail detail is visible product name")
    public void verifyThatDetailDetailIsVisibleProductName() {
        Assert.assertEquals(new ProductsPage().verifyProductName(),"Blue Top");
    }

    @And("Verify that detail detail is visible category")
    public void verifyThatDetailDetailIsVisibleCategory() {
        Assert.assertEquals(new ProductsPage().verifyproductCategory(),"Category: Women > Tops");
    }

    @And("Verify that detail detail is visible price")
    public void verifyThatDetailDetailIsVisiblePrice() {
        Assert.assertEquals(new ProductsPage().verifyproductPrice(),"Rs. 500");
    }

    @And("Verify that detail detail is visible availability")
    public void verifyThatDetailDetailIsVisibleAvailability() {
        Assert.assertEquals(new ProductsPage().verifyproductAvailability(),"Availability: In Stock");
    }

    @And("Verify that detail detail is visible condition")
    public void verifyThatDetailDetailIsVisibleCondition() {
        Assert.assertEquals(new ProductsPage().verifyproductCondition(),"Condition: New");
    }

    @And("Verify that detail detail is visible brand")
    public void verifyThatDetailDetailIsVisibleBrand() {
        Assert.assertEquals(new ProductsPage().verifyproductBrand(),"Brand: Polo");
    }
}
