package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductDetailsPage.class.getName());

    public ProductDetailsPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "quantity")
    public WebElement quantityBox;

    @CacheLookup
    @FindBy(css = ".btn.btn-default.cart")
    public WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Write Your Review')]")
    public WebElement writeYourReviewText;

    @CacheLookup
    @FindBy(id = "name")
    public WebElement nameBox;

    @CacheLookup
    @FindBy(id = "email")
    public WebElement emailBox;

    @CacheLookup
    @FindBy(id = "review")
    public WebElement reviewBox;

    @CacheLookup
    @FindBy(xpath = "//button[@id='button-review']")
    public WebElement reviewButton;

    @CacheLookup
    @FindBy(xpath = "//span[.='Thank you for your review.']")
    public WebElement thankYouText;

    @CacheLookup
    @FindBy(xpath = "//h2[.='Blue Top']")
    public WebElement productName;

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[@id='product-1']/td[4]/button[1]")
    public WebElement quantityInCart;

    public void enterQuantityBoxText(String quantityBoxText) {
        log.info("Enter quantity Box Text." + quantityBox);
        sendTextToElement(quantityBox, quantityBoxText);
    }

    public void clickAddToCartButton() {
        log.info("Click add To Cart Button" + addToCartButton.toString());
        clickOnElement(addToCartButton);
    }

    public String verifyWriteYourReviewText() {
        log.info("Verify write Your Review Text" + writeYourReviewText.toString());
        return getTextFromElement(writeYourReviewText);
    }

    public void nameBoxText(String nameBoxText) {
        log.info("Enter name Box Text" + nameBox);
        sendTextToElement(nameBox, nameBoxText);
    }

    public void emailBox(String emailBoxText) {
        log.info("Enter email Box Text" + emailBox);
        sendTextToElement(emailBox, emailBoxText);
    }

    public void reviewBoxText(String reviewBoxText) {
        log.info("Enter review Box Text" + reviewBox);
        sendTextToElement(reviewBox, reviewBoxText);
    }

    public void clickReviewButton() {
        log.info("Click review Button" + reviewButton.toString());
        clickOnElement(reviewButton);
    }

    public String verifythankYouText() {
        log.info("Verify thank You Text" + thankYouText.toString());
        return getTextFromElement(thankYouText);
    }

    public String verifyProductName() {
        log.info("Verify product Name Text" + productName.toString());
        return getTextFromElement(productName);
    }

    public String verifyQuantityInCart() {
        log.info("verify quantity in Cart" + quantityInCart.toString());
        return getTextFromElement(quantityInCart);
    }

}
