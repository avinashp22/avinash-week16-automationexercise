package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage extends Utility {
    private static final Logger log = LogManager.getLogger(ContactUsPage.class.getName());

    public ContactUsPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='item active']//span[1]")
    public WebElement HomePageAutomationText;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Get In Touch']")
    public WebElement getInTouchText;

    @CacheLookup
    @FindBy(xpath = "//input[@data-qa='name']")
    public WebElement nameBox;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Email']")
    public WebElement emailBox;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Subject']")
    public WebElement subjectBox;

    @CacheLookup
    @FindBy(xpath = "//textarea[@id='message']")
    public WebElement messageBox;

    @CacheLookup
    @FindBy(xpath = "//input[@name='submit']")
    public WebElement submitButton;

    @CacheLookup
    @FindBy(xpath = "//input[@name='upload_file']")
    public WebElement chooseFileButton;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Success!')][1]")
    public WebElement successText;

    @CacheLookup
    @FindBy(xpath = "//span[.=' Home']")
    public WebElement homeButton;

    @CacheLookup
    @FindBy(xpath = "//a[@href='/contact_us']")
    public WebElement contactUsButton;

    public String verifyHomePageAutomationText() {
        log.info("Verify HomePage Automation Text" + HomePageAutomationText.toString());
        return getTextFromElement(HomePageAutomationText);
    }

    public String verifyGetInTouchText() {
        log.info("Verify Get in Touch text." + getInTouchText.toString());
        return getTextFromElement(getInTouchText);
    }

    public void enterNameBoxTextBox(String nameBoxText) {
        log.info("Enter Name Text." + nameBox);
        sendTextToElement(nameBox, nameBoxText);
    }

    public void enterEmailBox(String emailBoxText) {
        log.info("Enter Email Text." + emailBox);
        sendTextToElement(emailBox, emailBoxText);
    }

    public void enterSubjectBox(String subjectBoxText) {
        log.info("Enter Subject Text." + subjectBox);
        sendTextToElement(subjectBox, subjectBoxText);
    }

    public void enterMessageBox(String messageBoxText) {
        log.info("Enter Message Text." + messageBox);
        sendTextToElement(messageBox, messageBoxText);
    }

    public void clickSubmitButton() {
        log.info("Click on Submit button." + submitButton.toString());
        clickOnElement(submitButton);
    }

    public void uploadFile() {
        String projectPath = System.getProperty("user.dir");
        String filePath = "src/test/resources/test.txt";
        String fullPath = projectPath + "/" + filePath;
        chooseFileButton.sendKeys(fullPath);
    }

    public String verifySuccessText() {
        log.info("Verify Success text." + successText.toString());
        return getTextFromElement(successText);
    }

    public void clickHomeButton() {
        log.info("Click on Home button." + homeButton.toString());
        clickOnElement(homeButton);
    }

    public void clickContactUsButton() {
        log.info("Click on Contact Us button." + contactUsButton.toString());
        clickOnElement(contactUsButton);
    }

    public void acceptPopupMessage() {
        acceptAlert();
        log.info("Accept alert");
    }

}
