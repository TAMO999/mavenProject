package tests;


import com.exact.BaseTest;
import com.exact.pages.*;
import io.reactivex.rxjava3.schedulers.SchedulerRunnableIntrospection;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin() {
        //ავტორიზაცია
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("tamunarostiashvili94@gmail.com", "tamuna09");

        String expectedUrl = "https://veli.store/";
        String actualUrl = "https://veli.store/";
        Assert.assertEquals(actualUrl, expectedUrl, " URL   არ ემთხვევა");


        HomePage homePage = new HomePage(driver);
        String expectegetaccountHeader = "ჩემი ველი";
        String actualgetaccountHeader = homePage.getaccountHeader();
        Assert.assertEquals(actualgetaccountHeader, expectegetaccountHeader, "ტექსტი არ ემთვევა");


        @Test

                // პროდუქტის მოძებნა სერჩით
        public void productSearch () {

            ProductSeacrchPage productSeacrchPage = new ProductSeacrchPage(driver);
            productSeacrchPage.searchforanything("Oppo A78 CPH2565 8 GB 256 GB Black");


            String expecteproductUrl = "https://veli.store/details/oppo-a78-cph2565-8-gb-256-gb-black/?sku=6932169332491";
            String actualproductUrl = "https://veli.store/details/oppo-a78-cph2565-8-gb-256-gb-black/?sku=6932169332491";
            Assert.assertEquals(actualproductUrl, expecteproductUrl, "URL   არ ემთხვევა");

            @Test

                    //კალათაში დამატება
            public void addToCard () {

                CartPage cartPage = new CartPage(driver);

                //პროდუქტის სახელის შემოწმება
                String expectedmobailName = "Oppo A78 CPH2565 8 GB 256 GB Black]";
                String actualmobailName = cartPage.getbutton();
                Assert.assertEquals(expectedmobailName, actualmobailName, "ტექსტი არ ემთხვევა");
            }

        }
    }
}












