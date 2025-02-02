package com.exact.pages;

import com.exact.utils.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "account header-hover")
    WebElement accountHeader;

public  String getaccountHeader(){
    return getElementText(accountHeader);


}

    }




