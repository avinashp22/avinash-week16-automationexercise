package com.automationexercise.steps;

import com.automationexercise.pages.ProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class TC12_AddProductsInCart {
    @And("The user hovers over first product and clicks Add to cart")
    public void theUserHoversOverFirstProductAndClicksAddToCart() {
        new ProductsPage().clickfirstAddtocartProductButton();
    }

    @And("The user clicks Continue Shopping button")
    public void theUserClicksContinueShoppingButton() {
        new ProductsPage().clickContinueShoppingButton();
    }

    @And("The user hovers over second product and clicks Add to cart")
    public void theUserHoversOverSecondProductAndClicksAddToCart() {
        new ProductsPage().clickSecondAddtocartButton();
    }

    @And("The user clicks View Cart button")
    public void theUserClicksViewCartButton() {
        new ProductsPage().clickViewCartButton();
    }

    @Then("Verify both products are added to Cart")
    public void verifyBothProductsAreAddedToCart() {
        Assert.assertEquals(new ProductsPage().verifyProductNameinCart(), "Blue Top");
    }

    @And("Verify their prices")
    public void verifyTheirPrices() {
        Assert.assertEquals(new ProductsPage().verifyPriceInCart(),"Rs. 500");
    }

    @And("Verify their quantity")
    public void verifyTheirQuantity() {
        Assert.assertEquals(new ProductsPage().verifyQuantityInCart(),"1");
    }

    @And("Verify their total price")
    public void verifyTheirTotalPrice() {
        Assert.assertEquals(new ProductsPage().verifyTotalInCart(),"Rs. 500");
    }


}
