package com.automationexercise.steps;

import com.automationexercise.pages.ProductsPage;
import com.automationexercise.pages.SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TC09_SearchProduct {
    @When("The user enters product name {string}")
    public void theUserEntersProductName(String searchProductBoxText) {
        new ProductsPage().searchProductBoxText(searchProductBoxText);
    }

    @When("The user clicks search button")
    public void theUserClicksSearchButton() {
        new ProductsPage().clickSubmitSearchButton();

    }

    @Then("Verify SEARCHED PRODUCTS is visible")
    public void verifySEARCHEDPRODUCTSIsVisible() {
        Assert.assertEquals(new SearchPage().verifySearchedProductsText(),"SEARCHED PRODUCTS");
    }

    @And("Verify all the products related to search are visible")
    public void verifyAllTheProductsRelatedToSearchAreVisible() {
        Assert.assertEquals(new ProductsPage().verifyProductNameinSearch(),"Blue Top");
    }
}
