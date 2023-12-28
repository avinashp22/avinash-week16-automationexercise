package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends Utility {
    private static final Logger log = LogManager.getLogger(SearchPage.class.getName());
    public SearchPage(){
        PageFactory.initElements(driver,this);
    }


    @CacheLookup
    @FindBy(xpath = "//h2[.='Searched Products']")
    public WebElement searchedProductsText;

    public String verifySearchedProductsText() {
        log.info("Verify searched Products Text" + searchedProductsText.toString());
        return getTextFromElement(searchedProductsText);
    }

}
