package com.exact.pages;

import com.exact.utils.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);

    }

    @FindBy(xpath = "//button[@id='cart-button']")
    WebElement button;


    public String getbutton() {
        return getElementText(button);


    }
}