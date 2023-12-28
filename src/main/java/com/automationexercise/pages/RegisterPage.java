package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//h2[.='New User Signup!']")
    public WebElement newUserSignupText;

    @CacheLookup
    @FindBy(name = "name")
    public WebElement nameBox;

    @CacheLookup
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement emailBox;

    @CacheLookup
    @FindBy(xpath = "//button[.='Signup']")
    public WebElement signupButton;

    @CacheLookup
    @FindBy(xpath = "//b[.='Enter Account Information']")
    public WebElement enterAccountText;

    @CacheLookup
    @FindBy(id = "uniform-id_gender1")
    public WebElement genderButton;

    @CacheLookup
    @FindBy(id = "password")
    public WebElement passwordBox;

    @CacheLookup
    @FindBy(id = "days")
    public WebElement selectDay;

    @CacheLookup
    @FindBy(id = "months")
    public WebElement selectMonth;

    @CacheLookup
    @FindBy(id = "years")
    public WebElement selectYear;

    @CacheLookup
    @FindBy(id = "newsletter")
    public WebElement newsletterBox;

    @CacheLookup
    @FindBy(id = "first_name")
    public WebElement firstNameBox;

    @CacheLookup
    @FindBy(id = "last_name")
    public WebElement lastNameBox;

    @CacheLookup
    @FindBy(id = "address1")
    public WebElement address1Box;

    @CacheLookup
    @FindBy(id = "country")
    public WebElement selectCountry;

    @CacheLookup
    @FindBy(id = "state")
    public WebElement stateBox;

    @CacheLookup
    @FindBy(id = "city")
    public WebElement cityBox;

    @CacheLookup
    @FindBy(id = "zipcode")
    public WebElement zipcodeBox;

    @CacheLookup
    @FindBy(id = "mobile_number")
    public WebElement mobileNumberBox;

    @CacheLookup
    @FindBy(xpath = "//b[.='Account Created!']")
    public WebElement accountText;

    @CacheLookup
    @FindBy(xpath = "//button[@data-qa='create-account']")
    public WebElement createAccountButton;

    @CacheLookup
    @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Logged in')]")
    public WebElement loggedInText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Delete Account']")
    public WebElement deleteAccountButton;

    @CacheLookup
    @FindBy(css = "//b[normalize-space()='Account Deleted!']")
    public WebElement accountDeletedText;

    @CacheLookup
    @FindBy(xpath = "//p[.='Email Address already exist!']")
    public WebElement alreadyExistText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    public WebElement deleteContinueButton;

    public String verifyNewUserSignupText() {
        log.info("Verify new User Signup Text" + newUserSignupText.toString());
        return getTextFromElement(newUserSignupText);
    }

    public void enterNameBoxText(String nameBoxText) {
        log.info("Enter Name Box Text" + nameBox);
        sendTextToElement(nameBox, nameBoxText);
    }

    public void enterEmailBoxText(String enterEmailBoxText) {
        log.info("Enter email Box Text." + emailBox);
        sendTextToElement(emailBox, enterEmailBoxText);
    }

    public void clickSignupButton() {
        log.info("Click signup Button" + signupButton.toString());
        clickOnElement(signupButton);
    }

    public String verifyEnterAccountText() {
        log.info("Verify Enter Account Info Text" + enterAccountText.toString());
        return getTextFromElement(enterAccountText);
    }

    public void clickgenderButton() {
        log.info("Click genderButton" + genderButton.toString());
        clickOnElement(genderButton);
    }

    public void enterPasswordBoxText(String PasswordBoxText) {
        log.info("Enter password Box Text." + passwordBox);
        sendTextToElement(passwordBox, PasswordBoxText);
    }

    public void selectDay(String day) {
        log.info("Select Day");
        selectByVisibleTextFromDropDown(selectDay, day);
    }

    public void selectMonth(String month) {
        log.info("Select Month");
        selectByVisibleTextFromDropDown(selectMonth, month);
    }

    public void selectYear(String year) {
        log.info("Select Year");
        selectByVisibleTextFromDropDown(selectYear, year);
    }

    public void clickNewsletterBox() {
        log.info("Click newsletter Box" + newsletterBox.toString());
        clickOnElement(newsletterBox);
    }

    public void enterFirstNameBoxText(String firstNameBoxText) {
        log.info("Enter First Name Box Text" + firstNameBox);
        sendTextToElement(firstNameBox, firstNameBoxText);
    }

    public void enterLastNameBox(String lastNameBoxText) {
        log.info("Enter last Name Box" + lastNameBox);
        sendTextToElement(lastNameBox, lastNameBoxText);
    }

    public void enterAddress1Box(String address1BoxText) {
        log.info("Enter Address 1 Box Text" + address1Box);
        sendTextToElement(address1Box, address1BoxText);
    }

    public void selectCountry(String country) {
        log.info("Select Country");
        selectByVisibleTextFromDropDown(selectCountry, country);
    }

    public void enterStateBox(String stateBoxText) {
        log.info("Enter state Box Text" + stateBox);
        sendTextToElement(stateBox, stateBoxText);
    }

    public void enterCityBox(String cityBoxText) {
        log.info("Enter city Box Text" + cityBox);
        sendTextToElement(cityBox, cityBoxText);
    }

    public void enterzipcodeBox(String zipcodeBoxText) {
        log.info("Enter zipcode Box Text." + zipcodeBox);
        sendTextToElement(zipcodeBox, zipcodeBoxText);
    }

    public void entermobileNumberBox(String mobileNumberBoxText) {
        log.info("Enter mobile Number Box Text" + mobileNumberBox);
        sendTextToElement(mobileNumberBox, mobileNumberBoxText);
    }

    public String verifyaccountText() {
        log.info("Verify account Text" + accountText.toString());
        return getTextFromElement(accountText);
    }

    public void clickcreateAccountButton() {
        log.info("Click create Account Button" + createAccountButton.toString());
        clickOnElement(createAccountButton);
    }

    public void clickcontinueButton() {
        log.info("Click continue Button" + continueButton.toString());
        clickOnElement(continueButton);
    }

    public String verifyloggedInText() {
        log.info("Verify logged In Text" + loggedInText.toString());
        return getTextFromElement(loggedInText);
    }

    public void clickdeleteAccountButton() {
        log.info("Click delete Account Button" + deleteAccountButton.toString());
        clickOnElement(deleteAccountButton);
    }

    public String verifyaccountDeletedText() {
        log.info("Verify account Deleted Text" + accountDeletedText.toString());
        return getTextFromElement(accountDeletedText);
    }

    public String verifyalreadyExistText() {
        log.info("Verify already Exist Text" + alreadyExistText.toString());
        return getTextFromElement(alreadyExistText);
    }

    public void clickDeleteContinueButton() {
        log.info("Click on Delete Continue Button" + deleteContinueButton.toString());
        clickOnElement(deleteContinueButton);
    }
}
