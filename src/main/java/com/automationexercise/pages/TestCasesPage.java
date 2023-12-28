package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestCasesPage extends Utility {
    private static final Logger log = LogManager.getLogger(TestCasesPage.class.getName());

    public TestCasesPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//b[contains(text(),'Test Cases')]")
    public WebElement testCasesText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Test Cases']")
    public WebElement testCases;

    public String verifyTestCasesText() {
        log.info("Verify Test Cases text." + testCasesText.toString());
        return getTextFromElement(testCasesText);
    }

    public void clickTestCases() {
        log.info("Click on Test Cases" + testCases.toString());
        clickOnElement(testCases);
    }

}