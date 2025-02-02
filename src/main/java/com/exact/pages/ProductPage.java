package com.exact.pages;

import com.exact.utils.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


 public class ProductPage extends BasePage{

     public ProductPage(WebDriver driver){
         super(driver);
     }


    @FindBy(className = "title")
    WebElement mobailName;



      public String getmobailName() {
          return getElementText(mobailName);

    }
}




