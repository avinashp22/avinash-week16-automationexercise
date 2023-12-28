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
    public RegisterPage(){
        PageFactory.initElements(driver,this);
    }


    @CacheLookup
    @FindBy(xpath = "//h2[.='New User Signup!']")
    public WebElement newUserSignupText;
    public String verifyNewUserSignupText() {
        log.info("Verify new User Signup Text" + newUserSignupText.toString());
        return getTextFromElement(newUserSignupText);
    }


    @CacheLookup
    @FindBy(name = "name")
    public WebElement nameBox;
    public void enterNameBoxText(String nameBoxText) {
        log.info("Enter Name Box Text" + nameBox);
        sendTextToElement(nameBox, nameBoxText);
    }


    @CacheLookup
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement emailBox;
    public void enterEmailBoxText(String enterEmailBoxText) {
        log.info("Enter email Box Text." + emailBox);
        sendTextToElement(emailBox, enterEmailBoxText);
    }


    @CacheLookup
    @FindBy(xpath = "//button[.='Signup']")
    public WebElement signupButton;
    public void clickSignupButton() {
        log.info("Click signup Button" + signupButton.toString());
        clickOnElement(signupButton);
    }


    @CacheLookup
    @FindBy(xpath = "//b[.='Enter Account Information']")
    public WebElement enterAccountText;
    public String verifyEnterAccountText() {
        log.info("Verify Enter Account Info Text" + enterAccountText.toString());
        return getTextFromElement(enterAccountText);
    }


    @CacheLookup
    @FindBy(id = "uniform-id_gender1")
    public WebElement genderButton;
    public void clickgenderButton() {
        log.info("Click genderButton" + genderButton.toString());
        clickOnElement(genderButton);
    }

    @CacheLookup
    @FindBy(id = "password")
    public WebElement passwordBox;
    public void enterPasswordBoxText(String PasswordBoxText) {
        log.info("Enter password Box Text." + passwordBox);
        sendTextToElement(passwordBox, PasswordBoxText);
    }


    @CacheLookup
    @FindBy(id = "days")
    public WebElement selectDay;
    public void selectDay(String day) {
        log.info("Select Day");
        selectByVisibleTextFromDropDown(selectDay, day);

    }

    @CacheLookup
    @FindBy(id = "months")
    public WebElement selectMonth;
    public void selectMonth(String month) {
        log.info("Select Month");
        selectByVisibleTextFromDropDown(selectMonth, month);
    }


    @CacheLookup
    @FindBy(id = "years")
    public WebElement selectYear;
    public void selectYear(String year) {
        log.info("Select Year");
        selectByVisibleTextFromDropDown(selectYear, year);
    }

    @CacheLookup
    @FindBy(id = "newsletter")
    public WebElement newsletterBox;
    public void clickNewsletterBox() {
        log.info("Click newsletter Box" + newsletterBox.toString());
        clickOnElement(newsletterBox);
    }

    @CacheLookup
    @FindBy(id = "first_name")
    public WebElement firstNameBox;
    public void enterFirstNameBoxText(String firstNameBoxText) {
        log.info("Enter First Name Box Text" + firstNameBox);
        sendTextToElement(firstNameBox, firstNameBoxText);
    }



    @CacheLookup
    @FindBy(id = "last_name")
    public WebElement lastNameBox;
    public void enterLastNameBox(String lastNameBoxText) {
        log.info("Enter last Name Box" + lastNameBox);
        sendTextToElement(lastNameBox, lastNameBoxText);
    }



    @CacheLookup
    @FindBy(id = "address1")
    public WebElement address1Box;
    public void enterAddress1Box(String address1BoxText) {
        log.info("Enter Address 1 Box Text" + address1Box);
        sendTextToElement(address1Box, address1BoxText);
    }



    @CacheLookup
    @FindBy(id = "country")
    public WebElement selectCountry;
    public void selectCountry(String country) {
        log.info("Select Country");
        selectByVisibleTextFromDropDown(selectCountry, country);
    }


    @CacheLookup
    @FindBy(id = "state")
    public WebElement stateBox;
    public void enterStateBox(String stateBoxText) {
        log.info("Enter state Box Text" + stateBox);
        sendTextToElement(stateBox, stateBoxText);
    }


    @CacheLookup
    @FindBy(id = "city")
    public WebElement cityBox;
    public void enterCityBox(String cityBoxText) {
        log.info("Enter city Box Text" + cityBox);
        sendTextToElement(cityBox, cityBoxText);
    }


    @CacheLookup
    @FindBy(id = "zipcode")
    public WebElement zipcodeBox;
    public void enterzipcodeBox(String zipcodeBoxText) {
        log.info("Enter zipcode Box Text." + zipcodeBox);
        sendTextToElement(zipcodeBox, zipcodeBoxText);
    }


    @CacheLookup
    @FindBy(id = "mobile_number")
    public WebElement mobileNumberBox;
    public void entermobileNumberBox(String mobileNumberBoxText) {
        log.info("Enter mobile Number Box Text" + mobileNumberBox);
        sendTextToElement(mobileNumberBox, mobileNumberBoxText);
    }


    @CacheLookup
    @FindBy(xpath = "//b[.='Account Created!']")
    public WebElement accountText;
    public String verifyaccountText() {
        log.info("Verify account Text" + accountText.toString());
        return getTextFromElement(accountText);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@data-qa='create-account']")
    public WebElement createAccountButton;
    public void clickcreateAccountButton() {
        log.info("Click create Account Button" + createAccountButton.toString());
        clickOnElement(createAccountButton);
    }


    @CacheLookup
    @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement continueButton;
    public void clickcontinueButton() {
        log.info("Click continue Button" + continueButton.toString());
        clickOnElement(continueButton);
    }


    @CacheLookup
    @FindBy(id = "dismiss-button")
    public WebElement dismissButton;
    public void clickdismissButton() {
        log.info("Click dismiss Button" + dismissButton.toString());
        clickOnElement(dismissButton);
    }


    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Logged in')]")
    public WebElement loggedInText;
    public String verifyloggedInText() {
        log.info("Verify logged In Text" + loggedInText.toString());
        return getTextFromElement(loggedInText);
    }


    @CacheLookup
    @FindBy(xpath = "//a[@href='/delete_account']")
    public WebElement deleteAccountButton;

    public void clickdeleteAccountButton() {
        log.info("Click delete Account Button" + deleteAccountButton.toString());
        clickOnElement(deleteAccountButton);
    }


    @CacheLookup
    @FindBy(css = "//b[normalize-space()='Account Deleted!']")
    public WebElement accountDeletedText;
    public String verifyaccountDeletedText() {
        log.info("Verify account Deleted Text" + accountDeletedText.toString());
        return getTextFromElement(accountDeletedText);
    }


    @CacheLookup
    @FindBy(xpath = "//p[.='Email Address already exist!']")
    public WebElement alreadyExistText;
    public String verifyalreadyExistText() {
        log.info("Verify already Exist Text" + alreadyExistText.toString());
        return getTextFromElement(alreadyExistText);
    }

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    public WebElement deleteContinueButton;
    public void clickDeleteContinueButton() {
        log.info("Click on Delete Continue Button" + deleteContinueButton.toString());
        clickOnElement(deleteContinueButton);
    }

}
