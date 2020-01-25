package homeTest;

import Common.CommonApi;
import org.testng.annotations.Test;

public class goalTest extends CommonApi {

    @Test
    public void test()  {
        String url = "http://goal.com/";
        driver.get(url);
       // System.out.println(driver.getTitle());
    }
}
