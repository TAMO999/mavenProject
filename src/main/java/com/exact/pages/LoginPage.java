package com.exact.pages;


import com.exact.utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='sigin-email']")
    WebElement Emailfield;

    @FindBy(xpath = "//input[@id='signin-password']")
    WebElement Passwordield;

    @FindBy(xpath = "//button[@class='styled__AuthPrimaryBtn-mh0716-2 dCwCil']")
    WebElement loginButton;


    public void login(String Email, String password) {


        enterText(Emailfield, Email);
        enterText(Passwordield, password);
        clickToElementWithWait(loginButton);



    }
}