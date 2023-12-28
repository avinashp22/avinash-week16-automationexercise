package com.automationexercise.steps;

import com.automationexercise.pages.ContactUsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TC06_ContactUsForm {
    @When("The user clicks Contact us menu button")
    public void theUserClicksContactUsMenuButton() {
        new ContactUsPage().clickContactUsButton();
    }

    @Then("Verify GET IN TOUCH is visible")
    public void verifyGETINTOUCHIsVisible() {
        Assert.assertEquals(new ContactUsPage().verifyGetInTouchText(), "GET IN TOUCH");
    }

    @When("The user enters name")
    public void theUserEntersName(String nameBoxText) {
        new ContactUsPage().enterNameBoxTextBox(nameBoxText);

    }

    @When("The user enters email")
    public void theUserEntersEmail(String emailBoxText) {
        new ContactUsPage().enterEmailBox(emailBoxText);

    }
    @When("The user enters contact email {string}")
    public void theUserEntersContactEmail(String emailBoxText) {
        new ContactUsPage().enterEmailBox(emailBoxText);
    }


    @And("The user uploads file")
    public void theUserUploadsFile() {
new ContactUsPage().uploadFile();
    }

    @And("The User clicks Submit button")
    public void theUserClicksSubmitButton() {
        new ContactUsPage().clickSubmitButton();
    }

    @And("The user clicks OK button")
    public void theUserClicksOKButton() {
        new ContactUsPage().acceptPopupMessage();
    }

    @Then("Verify success message Success Your details have been submitted successfully is visible")
    public void verifySuccessMessageSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible() {
        Assert.assertEquals(new ContactUsPage().verifySuccessText(), "Success! Your details have been submitted successfully.");
    }

    @When("The user clicks Home button")
    public void theUserClicksHomeButton() {
        new ContactUsPage().clickHomeButton();
    }

    @Then("Verify that landed to home page successfully")
    public void verifyThatLandedToHomePageSuccessfully() {
        Assert.assertEquals(new ContactUsPage().verifyHomePageAutomationText(), "Automation");
    }

    @When("The user enters subject {string}")
    public void theUserEntersSubject(String subjectBoxText) {
        new ContactUsPage().enterSubjectBox(subjectBoxText);
    }

    @When("The user enters message {string}")
    public void theUserEntersMessage(String messageBoxText) {
        new ContactUsPage().enterMessageBox(messageBoxText);
    }


}





