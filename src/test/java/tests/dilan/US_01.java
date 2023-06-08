package tests.dilan;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

    public class US_01 extends TestBaseRapor {

        @Test
        public void webSiteErisebilirligi() {

            extentTest = extentReports.createTest("Tripandway web sayfasi erisilebilirligi testi",
                    "Kullanici Tripandway sitesine girebilmeli ve siteye girdiginde title'i Tripandway olarak gorebilmeli");

            Driver.getDriver().get(ConfigReader.getProperty("trpURL"));
            extentTest.info("Kullanici Tripandway sayfasina gider");

            String expectedAnasayfaTitle = ConfigReader.getProperty("anasayfaTitle");
            String actualTitle = Driver.getDriver().getTitle();

            SoftAssert softAssert = new SoftAssert();
            softAssert.assertEquals(actualTitle, expectedAnasayfaTitle, "Tripandway web sayfasinin title'i Tripandway olmalidir");
            extentTest.info("softAssert ile web sayfasinin title'inin Trinpandway oldugunu test eder");

            softAssert.assertAll();
            extentTest.pass("softAssert ile yapilan testin sonucunu raporlar");

            Driver.closeDriver();
            extentTest.info("Sayfayi kapatir");


        }
    }
