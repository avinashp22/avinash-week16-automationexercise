package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryProductPage extends Utility {
    private static final Logger log = LogManager.getLogger(CategoryProductPage.class.getName());

    public CategoryProductPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@href='#Women']")
    public WebElement womenCategory;

    public void clickWomenCategory() {
        log.info("Click on Women category." + womenCategory.toString());
        clickOnElement(womenCategory);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@id='Women']//a[contains(text(),'Dress')]")
    public WebElement clickOnWomenDress;

    public void clickOnWomenDress() {
        log.info("Click on Women Dress category." + clickOnWomenDress.toString());
        clickOnElement(clickOnWomenDress);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Women - Dress Products']")
    public WebElement womenDressProductsText;

    public String verifyWomenDressProductsText() {
        log.info("Verify Woman's Dress text." + womenDressProductsText.toString());
        return getTextFromElement(womenDressProductsText);
    }

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Men']")
    public WebElement menCategory;

    public void clickMenCategory() {
        log.info("Click on Men category." + menCategory.toString());
        clickOnElement(menCategory);
    }

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Tshirts']")
    public WebElement tshirtsCategory;

    public void clickTshirtsCategory() {
        log.info("Click on Tshirt category." + tshirtsCategory.toString());
        clickOnElement(tshirtsCategory);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Men - Tshirts Products']")
    public WebElement menTshirtsProductsText;

    public String verifyMenTshirtsProductsText() {
        log.info("Verify Men Tshirts text." + menTshirtsProductsText.toString());
        return getTextFromElement(menTshirtsProductsText);
    }


    @CacheLookup
    @FindBy(xpath = "//h2[.='Category']")
    public WebElement categoryText;

    public String verifyCategoryText() {
        log.info("Verify Category text." + categoryText.toString());
        return getTextFromElement(categoryText);
    }


}