package com.exact;

import com.exact.utils.DriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {
    protected WebDriver driver;

   @BeforeMethod
    public  void setUP () {

       driver = DriverManager.getDriver();
       driver.manage().window().maximize();
      driver.get("https://veli.store/?show_modal=login");
    }


    @AfterMethod
    public  void  tearDown() {
        DriverManager.quit();
    }

}
