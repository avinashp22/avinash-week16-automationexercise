package com.automationexercise.steps;

import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.ViewCartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TC22_AddToCartFromRecommendedItems {
    @Then("Verify RECOMMENDED ITEMS are visible")
    public void verifyRECOMMENDEDITEMSAreVisible() {
        Assert.assertEquals(new HomePage().verifyrecommendedItemsText(), "RECOMMENDED ITEMS");
    }

    @When("The user clicks on Add To Cart on Recommended product")
    public void theUserClicksOnAddToCartOnRecommendedProduct() {
        new HomePage().clickAddtoCartRecommendedItem();
    }

    @Then("Verify that recommended product is displayed in cart page")
    public void verifyThatRecommendedProductIsDisplayedInCartPage() {
Assert.assertEquals(new ViewCartPage().verifyRecommendedProductNameinCart(),"Stylish Dress");
    }
}
