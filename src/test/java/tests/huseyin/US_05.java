package tests.huseyin;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class US_05 {

    //TEST CASE 1
    //1-        Kullanıcı https://qa.tripandway.com/ sayfasına gider
    //2-        Kullanıcı footer bölümüne iner
    //3-        Kullanıcı 5 days California’i tıklar
    //4-        Kullanıcı başarılı olarak giriş yapıldığını test eder

    @Test
    public void besDaysCaloforniaTesti(){

      Driver.getDriver().get(ConfigReader.getProperty("trpURL"));
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END);
    }
}
