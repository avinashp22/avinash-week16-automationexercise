package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ViewCartPage.class.getName());
    public ViewCartPage(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//li[contains(text(),'Shopping Cart')]")
    public WebElement shoppingCartText;
    public String verifyShoppingCartText() {
        log.info("Verify Shopping Cart Text" + shoppingCartText.toString());
        return getTextFromElement(shoppingCartText);
    }

    @CacheLookup
    @FindBy(xpath = "//i[@class='fa fa-times']")
    public WebElement removeQtyButton;
    public void clickRemoveQtyButton() {
        log.info("Click remove Qty Button" + removeQtyButton.toString());
        clickOnElement(removeQtyButton);
    }




    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Proceed To Checkout']")
    public WebElement proceedToCheckoutButton;
    public void clickProceedToCheckoutButton() {
        log.info("Click proceedToCheckoutButton" + proceedToCheckoutButton.toString());
        clickOnElement(proceedToCheckoutButton);
    }


    @CacheLookup
    @FindBy(xpath = "//u[normalize-space()='Register / Login']")
    public WebElement registerLoginButton;
    public void clickregisterLoginButton() {
        log.info("Click registerLoginButton." + registerLoginButton.toString());
        clickOnElement(registerLoginButton);
    }



    @CacheLookup
    @FindBy(xpath = "//b[.='Cart is empty!']")
    public WebElement cartEmptyText;
    public String verifycartEmptyText() {
        log.info("Verify cartEmptyText" + cartEmptyText.toString());
        return getTextFromElement(cartEmptyText);
    }


@CacheLookup
@FindBy(xpath = "//a[contains(text(),'Blue Top')]")
public WebElement productNameInCart;
    public String verifyProductNameinCart() {
        log.info("verify Product Name in Cart" + productNameInCart.toString());
        return getTextFromElement(productNameInCart);
    }

    @CacheLookup
    @FindBy(xpath = " //a[normalize-space()='Cart']")
    public WebElement cartButton;
    public void clickCartButton() {
        log.info("Click Cart Button." + cartButton.toString());
        clickOnElement(cartButton);
    }

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Stylish Dress']")
    public WebElement recommendedProductNameInCart;
    public String verifyRecommendedProductNameinCart() {
        log.info("verify Recommended Product Name in Cart" + recommendedProductNameInCart.toString());
        return getTextFromElement(recommendedProductNameInCart);
    }

    @CacheLookup
    @FindBy (xpath = "//ul[@id = 'address_delivery']/li[4]")
    WebElement deliveryAddress;
    public String getDeliveryAddress(){
        log.info("Getting delivery address : " + deliveryAddress.toString());
        return getTextFromElement(deliveryAddress);
    }

    @CacheLookup
    @FindBy (xpath = "//ul[@id = 'address_invoice']/li[4]")
    WebElement billingAddress;
    public String getBillingAddress(){
        log.info("Getting billing address : " + deliveryAddress.toString());
        return getTextFromElement(billingAddress);
    }


}
