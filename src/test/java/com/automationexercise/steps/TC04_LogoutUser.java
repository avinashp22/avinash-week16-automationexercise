package com.automationexercise.steps;

import com.automationexercise.pages.LoginPage;
import io.cucumber.java.en.When;

public class TC04_LogoutUser {
    @When("The user clicks Logout button")
    public void theUserClicksLogoutButton() {
        new LoginPage().clickLogoutButton();
    }
}
