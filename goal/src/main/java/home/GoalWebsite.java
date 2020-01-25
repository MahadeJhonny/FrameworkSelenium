package home;

import Common.CommonApi;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GoalWebsite extends CommonApi {

    //Latest news
    @Test
    public void latestNews(String news) {
       driver.findElement ( By.xpath ( "/html/body/div[5]/div/div[2]/div/a[1]" ) ).click ();
    }

    //Transfer

    public void transfer () {
        driver.findElement ( By.xpath ( "/html/body/header/nav/div[1]/div/ul/li[1]/a" ) ).click ();
   }

    //today Matches

    public void todayMatches() {
        driver.findElement (By.xpath ( "/html/body/div[5]/div/section[4]/div[1]/div/ul/li[1]/a" ) ).click ();
    }

}
