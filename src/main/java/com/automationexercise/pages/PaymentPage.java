package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public class PaymentPage extends Utility {
    private static final Logger log = LogManager.getLogger(PaymentPage.class.getName());

    public PaymentPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@name='name_on_card']")
    public WebElement nameOnCard;

    @CacheLookup
    @FindBy(xpath = "//input[@name='card_number']")
    public WebElement cardNumber;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='ex. 311']")
    public WebElement cvcNumber;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='MM'")
    public WebElement expiryMonth;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='YYYY']")
    public WebElement expiryYear;

    @CacheLookup
    @FindBy(xpath = "//div[@id='success_message'][1]")
    public WebElement successMessage;

    @CacheLookup
    @FindBy(xpath = "//button[@id='submit']")
    public WebElement payAndConfirmOrderButton;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Download Invoice']")
    public WebElement downloadInvoiceButton;

    public void enterNameOnCardText(String nameOnCardText) {
        log.info("Enter name On Card Text." + nameOnCard);
        sendTextToElement(nameOnCard, nameOnCardText);
    }

    public void enterCardNumberText(String cardNumberText) {
        log.info("Enter card Number Text." + cardNumber);
        sendTextToElement(cardNumber, cardNumberText);
    }

    public void enterCvcNumberText(String cvcNumberText) {
        log.info("Enter cvc Number Text." + cvcNumber);
        sendTextToElement(cvcNumber, cvcNumberText);
    }

    public void enterExpiryMonthText(String expiryMonthText) {
        log.info("Enter expiry Month Text." + expiryMonth);
        sendTextToElement(expiryMonth, expiryMonthText);
    }

    public void enterExpiryYearText(String expiryYearText) {
        log.info("Enter expiry Year Text." + expiryYear);
        sendTextToElement(expiryYear, expiryYearText);
    }

    public String verifySuccessMessageText() {
        log.info("Verify success Message Text" + successMessage.toString());
        return getTextFromElement(successMessage);
    }

    public void clickPayAndConfirmOrderButton() {
        log.info("Click pay And Confirm Order Button" + payAndConfirmOrderButton.toString());
        clickOnElement(payAndConfirmOrderButton);
    }

    public void clickDownloadInvoiceButton() {
        log.info("Click download Invoice Button" + downloadInvoiceButton.toString());
        clickOnElement(downloadInvoiceButton);
    }

    public boolean filePresent() {
        String homePath = System.getProperty("user.home");
        File f = new File(homePath + "/Downloads/invoice.txt");
        return f.exists();
    }

}




