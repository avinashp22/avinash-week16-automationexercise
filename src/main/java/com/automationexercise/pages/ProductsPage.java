package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductsPage.class.getName());
    public ProductsPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@href='#Women']")
    public WebElement womenCategory;

    @FindBy(id = "subscribe_email")
    public WebElement subscribeEmailBox;

    public void clickOnWomenCategory() {
        log.info("Click on woman category." + womenCategory.toString());
        clickOnElement(womenCategory);
    }

    public void enterSubscribeEmailBox(String email) {
        sendTextToElement(subscribeEmailBox, email);
        log.info("Entering the email in the field : " + subscribeEmailBox);
    }

}
