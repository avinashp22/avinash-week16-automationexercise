package com.automationexercise.steps;

import com.automationexercise.pages.LoginPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class TC03_LoginUserWithIncorrectEmailAndPassword {
    @Then("Verify error Your email or password is incorrect is visible")
    public void verifyErrorYourEmailOrPasswordIsIncorrectIsVisible() {
        Assert.assertEquals(new LoginPage().verifyIncorrectText(), "Your email or password is incorrect!");
    }
}
