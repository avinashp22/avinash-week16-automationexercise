package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductsPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductsPage.class.getName());
    public ProductsPage(){
        PageFactory.initElements(driver,this);
    }


    @CacheLookup
    @FindBy(xpath = "//a[@href='/products']")
    public WebElement productsButton;
    public void clickProductsButton() {
        log.info("Click Products Button" + productsButton.toString());
        clickOnElement(productsButton);
    }


    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'All Products')]")
    public WebElement allProductsText;
    public String verifyAllProductsText() {
        log.info("Verify all Products Text" + allProductsText.toString());
        return getTextFromElement(allProductsText);
    }




    @CacheLookup
    @FindBy(xpath = "//body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/a[1]")
    public WebElement firstViewProductButton;
    public void clickFirstViewProductButton() {
        log.info("Click first View Product Button" + firstViewProductButton.toString());
        mouseHoverToElementAndClick(firstViewProductButton);
    }


    @CacheLookup
    @FindBy(xpath = "//a[.='View Product'][2]")
    public WebElement secondViewProductButton;
    public void clickSecondViewProductButton() {
        log.info("Click second View Product Button" + secondViewProductButton.toString());
        mouseHoverToElementAndClick(secondViewProductButton);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Blue Top']")
    public WebElement productName;
    public String verifyProductName() {
        log.info("Verify product Name Text" + productName.toString());
        return getTextFromElement(productName);
    }


    @CacheLookup
    @FindBy(xpath = "//div[@class='productinfo text-center']//p[contains(text(),'Blue Top')]")
    public WebElement productNameinSearch;
    public String verifyProductNameinSearch() {
        log.info("Verify product Name in Search" + productNameinSearch.toString());
        return getTextFromElement(productNameinSearch);
    }

    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Category: Women > Tops']")
    public WebElement productCategory;
    public String verifyproductCategory() {
        log.info("Verify product Category Text" + productCategory.toString());
        return getTextFromElement(productCategory);
    }

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Rs. 500']")
    public WebElement productPrice;
    public String verifyproductPrice() {
        log.info("Verify product Price Text" + productPrice.toString());
        return getTextFromElement(productPrice);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='product-details']//p[2]")
    public WebElement productAvailability;
    public String verifyproductAvailability() {
        log.info("Verify product Availability Text" + productAvailability.toString());
        return getTextFromElement(productAvailability);
    }

    @CacheLookup
    @FindBy(xpath = "//p[contains(text(),' New')]")
    public WebElement productCondition;
    public String verifyproductCondition() {
        log.info("Verify product Condition Text" + productCondition.toString());
        return getTextFromElement(productCondition);
    }

    @CacheLookup
    @FindBy(xpath = "//p[contains(text(),' Polo')]")
    public WebElement productBrand;
    public String verifyproductBrand() {
        log.info("Verify productBrand Text" + productBrand.toString());
        return getTextFromElement(productBrand);
    }

    @CacheLookup
    @FindBy(id = "search_product")
    public WebElement searchProductBox;
    public void searchProductBoxText(String searchProductBoxText) {
        log.info("Enter search Product Box Text." + searchProductBox);
        sendTextToElement(searchProductBox, searchProductBoxText);
    }

    @CacheLookup
    @FindBy(id = "submit_search")
    public WebElement submitSearchButton;
    public void clickSubmitSearchButton() {
        log.info("Click submit SearchButton" + submitSearchButton.toString());
        clickOnElement(submitSearchButton);
    }


    @CacheLookup
    @FindBy(xpath = "//div[@class='overlay-content']//a[contains(@class,'add-to-cart')]")
    public List<WebElement> addToCartButtons;
    public void clickAddToCartButtons() {
        log.info("Click add To Cart Buttons" + addToCartButtons.toString());
        clickOnElement((WebElement) addToCartButtons);

    }


    @CacheLookup
    @FindBy(xpath = "//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]")
    public WebElement firstAddtocartProductButton;
    public void clickfirstAddtocartProductButton() {
        log.info("Click first Addtocart Product Button" + firstAddtocartProductButton.toString());
        mouseHoverToElementAndClick(firstAddtocartProductButton);
    }


    @CacheLookup
    @FindBy(xpath = "//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/a[1]")
    public WebElement secondAddtocartProductButton;
    public void clickSecondAddtocartButton() {
        log.info("Click second Addtocart Product Button" + secondAddtocartProductButton.toString());
        mouseHoverToElementAndClick(secondAddtocartProductButton);
    }


    @CacheLookup
    @FindBy(xpath = "//button[.='Continue Shopping']")
    public WebElement continueShoppingButton;
    public void clickContinueShoppingButton() {
        log.info("Click continue Shopping Button" + continueShoppingButton.toString());
        clickOnElement(continueShoppingButton);
    }

    @CacheLookup
    @FindBy(xpath = "//u[.='View Cart']")
    public WebElement viewCartButton;
    public void clickViewCartButton() {
        log.info("Click view Cart Button" + viewCartButton.toString());
        clickOnElement(viewCartButton);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[.='Brands']")
    public WebElement brandsText;
    public String verifyBrandsText() {
        log.info("Verify brands Text" + brandsText.toString());
        return getTextFromElement(brandsText);
    }


    @CacheLookup
    @FindBy(xpath = "//a[@href='/brand_products/Polo']")
    public WebElement poloButton;
    public void clickpoloButton() {
        log.info("Click polo Button" + poloButton.toString());
        clickOnElement(poloButton);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Brand - Polo Products']")
    public WebElement poloText;
    public String verifypoloText() {
        log.info("Verify polo Text" + poloText.toString());
        return getTextFromElement(poloText);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@href='/brand_products/H&M']")
    public WebElement hnmButton;
    public void clickhnmButton() {
        log.info("Click hnm Button" + hnmButton.toString());
        clickOnElement(hnmButton);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Brand - H&M Products']")
    public WebElement hnmText;
    public String verifyHnmText() {
        log.info("Verify hnm Text" + hnmText.toString());
        return getTextFromElement(hnmText);
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Blue Top')]")
    public WebElement productNameInCart;
    public String verifyProductNameinCart() {
        log.info("verify Product Name in Cart" + productNameInCart.toString());
        return getTextFromElement(productNameInCart);
    }

    @CacheLookup
    @FindBy(xpath = "//p[contains(text(),'Rs. 500')]")
    public WebElement priceInCart;
    public String verifyPriceInCart() {
        log.info("verify Price in Cart" + priceInCart.toString());
        return getTextFromElement(priceInCart);
    }

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[@id='product-1']/td[4]/button[1]")
    public WebElement quantityInCart;
    public String verifyQuantityInCart() {
        log.info("verify quantity in Cart" + quantityInCart.toString());
        return getTextFromElement(quantityInCart);
    }

    @CacheLookup
    @FindBy(xpath = "//p[contains(text(),'Rs. 500')]")
    public WebElement totalInCart;
    public String verifyTotalInCart() {
        log.info("verify Total in Cart" + totalInCart.toString());
        return getTextFromElement(totalInCart);
    }


}
