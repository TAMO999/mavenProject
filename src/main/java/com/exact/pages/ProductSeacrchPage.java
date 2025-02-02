package com.exact.pages;

import com.exact.utils.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductSeacrchPage extends BasePage {

    public ProductSeacrchPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//input[@placeholder='რას ეძებ?']")
    WebElement Searchforanythingfield;

    @FindBy(xpath = "//div[@class='styled__SearchDropdown-sc-1gjbxx7-15 bOUDJQ']")
  WebElement Button;

    @FindBy (xpath = "//button[@title='search']//*[name()='svg']")
    WebElement clickfield;


    public void searchforanything (String input){

                enterText(Searchforanythingfield,input);
                clickToElementWithWait(clickfield);

            }
}
