package tests.dilan;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;

public class US_01 {

    @Test
    public void webSiteErisebilirligi(){

        Driver.getDriver().get(ConfigReader.getProperty("trpURL"));

        String expectedAnasayfaTitle=ConfigReader.getProperty("anasayfaTitle");
        String actualTitle=Driver.getDriver().getTitle();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualTitle,expectedAnasayfaTitle);

        Driver.closeDriver();

        softAssert.assertAll();

    }

}
