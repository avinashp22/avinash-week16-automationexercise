package com.automationexercise.steps;

import com.automationexercise.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TC25_VerifyScrollUpUsingArrowButtonAndScrollDownfunctionality {
    @Then("Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen")
    public void verifyThatPageIsScrolledUpAndFullFledgedPracticeWebsiteForAutomationEngineersTextIsVisibleOnScreen() {
        Assert.assertEquals(new HomePage().verifyFullFleggedText(), "Full-Fledged practice website for Automation Engineers");

    }

    @When("The user clicks orange arrow button")
    public void theUserClicksOrangeArrowButton() {
        new HomePage().clickScrollUpArrow();
        new HomePage().scrollUpScript();
    }
}
