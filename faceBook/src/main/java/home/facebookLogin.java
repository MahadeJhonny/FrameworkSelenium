package home;

import Common.CommonApi;
import org.openqa.selenium.By;

public class facebookLogin extends CommonApi {

    public void logIn(String email,String password) {

        driver.findElement ( By.xpath ("//*[@id=\'email\']") ).sendKeys ( "mahadeh999@gmail.com" );
        driver.findElement ( By.xpath ( "//*[@id=\'pass\']" ) ).sendKeys ( "Test123" );
        driver.findElement ( By.xpath ( "//*[@id=\'u_0_b\']" ) ).click ();


    }
}

