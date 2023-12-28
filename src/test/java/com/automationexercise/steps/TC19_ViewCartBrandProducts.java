package com.automationexercise.steps;

import com.automationexercise.pages.ProductsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TC19_ViewCartBrandProducts {
    @Then("Verify that Brands are visible on left side bar")
    public void verifyThatBrandsAreVisibleOnLeftSideBar() {
        Assert.assertEquals(new ProductsPage().verifyBrandsText(),"BRANDS");
    }

    @When("The user clicks on left side bar Polo brand name")
    public void theUserClicksOnLeftSideBarPoloBrandName() {
        new ProductsPage().clickpoloButton();
    }

    @Then("Verify that user is navigated to Polo page and brand products are displayed")
    public void verifyThatUserIsNavigatedToPoloPageAndBrandProductsAreDisplayed() {
        Assert.assertEquals(new ProductsPage().verifypoloText(),"BRAND - POLO PRODUCTS");
    }

    @When("The user clicks on left side bar H&M brand name")
    public void theUserClicksOnLeftSideBarHMBrandName() {
        new ProductsPage().clickhnmButton();
    }


    @Then("Verify that user is navigated to H&M page and brand products are displayed")
    public void verifyThatUserIsNavigatedToHMPageAndBrandProductsAreDisplayed() {
        Assert.assertEquals(new ProductsPage().verifyHnmText(),"BRAND - H&M PRODUCTS");
    }
}
