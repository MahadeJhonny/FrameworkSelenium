package home;

import Common.CommonApi;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class bestbuyHome extends CommonApi {

   // Open cart
    @Test
    public void testSearchBar () throws InterruptedException {

        driver.get ( "https://www.bestbuy.com/" );
        driver.findElement (By.xpath ( "//*[@id=\'shop-cart-icon-b2b3d0c1-ac8git 5-44e9-99a3-cb55192a25a7\']/div/div/div/a/span" ) ).click ();
        Thread.sleep ( 2000 );
    }

   // Check search button working

    @Test
    public void testSearchButton ()  {

        driver.get ( "https://www.bestbuy.com/" );
        driver.findElement (By.name ( "st" ) ).sendKeys ( "Apple" );
        driver.findElement ( By.xpath ( "//*[@id=\'shop-search-bar-35d5a0fb-4294-4b8f-a0e8-2b1ae6730e08\']/div/div/form/button[2]/span/img" )).click ();
    }
    //Apply for credit card
   @Test
    public void testApplyCreditCard () {

       driver.get ( "https://www.bestbuy.com/" );
       driver.findElement ( By.xpath ( "//*[@id=\'header-block\']/div[2]/div[1]/div/div[2]/nav/ul/li[1]" ) ).click ();
       driver.findElement ( By.xpath ( "//*[@id=\'site-control-content\']/div[4]/div[2]/div[3]/div/div/div/div[2]/a" ) ).click ();

    }

    @Test
    public void testStudentOffer () {
        driver.get ( "https://www.bestbuy.com/" );
        driver.findElement ( By.xpath ( "//*[@id=\'header-block\']/div[2]/div[2]/div/nav[1]/ul/li[3]/button/div" ) ).click ();
        driver.findElement ( By.xpath ( "" ) ).click ();



    }




}



