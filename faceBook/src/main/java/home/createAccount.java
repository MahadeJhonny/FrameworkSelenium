package home;

import Common.CommonApi;
import org.openqa.selenium.By;

import static Common.CommonApi.driver;

public class createAccount extends CommonApi {

    public void accountCreate () {

        driver.findElement ( By.xpath ( "//*[@id=\'u_0_f\']" ) ).sendKeys ( "Peter" );
        driver.findElement ( By.xpath ( "//*[@id=\'u_0_f\']" ) ).sendKeys ( "Peter" );
        driver.findElement ( By.name ( "lastname" ) ).sendKeys ( "Parker" );
        driver.findElement ( By.xpath ( "//*[@id=\'u_0_k\']" ) ).sendKeys ( "3475366192" );
        driver.findElement ( By.name ( "reg_passwd__" ) ).sendKeys ( "Test123" );
        driver.findElement ( By.name ( "birthday_month" ) ).sendKeys ( "10" );
        driver.findElement ( By.name ( "birthday_day" ) ).sendKeys ( "05" );
        driver.findElement ( By.name ( "birthday_year" ) ).sendKeys ( "1990" );
        driver.findElement ( By.name ( "sex" ) ).click ();
        driver.findElement ( By.xpath ( "//*[@id=\'u_0_w\']" ) ).click ();
    }
}


