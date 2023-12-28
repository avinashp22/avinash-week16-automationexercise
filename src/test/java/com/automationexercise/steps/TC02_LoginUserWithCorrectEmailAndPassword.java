package com.automationexercise.steps;

import com.automationexercise.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class TC02_LoginUserWithCorrectEmailAndPassword {
    @When("The user enters correct email address {string}")
    public void theUserEntersCorrectEmailAddress(String loginEmailBoxText) {
        new LoginPage().enterLoginEmailBoxText(loginEmailBoxText);
    }

    @When("The user enters correct password {string}")
    public void theUserEntersCorrectPassword(String loginPasswordBoxText) {
        new LoginPage().enterloginPasswordBoxText(loginPasswordBoxText);
    }

    @And("The user clicks login button")
    public void theUserClicksLoginButton() {
        new LoginPage().clickLoginButton();
    }
}
