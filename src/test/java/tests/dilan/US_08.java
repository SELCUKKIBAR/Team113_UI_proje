package tests.dilan;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UserDashboard;
import pages.UserHomePage;
import utilities.*;

public class US_08 extends TestBaseRapor {

    @Test
    public void footerFirmaIletisimBilgleriGorunurlugu(){

        extentTest = extentReports.createTest("Tripandway firma iletisim bilgilerinin gorunurlugu testi",
                "Kullanici footer bolumundeki firma iletisim bilgileri olan konum, telefon ve email bilgilerini gorebilmeli");

        Driver.getDriver().get(ConfigReader.getProperty("trpURL"));
        extentTest.info("Kullanici Tripandway sayfasina gider");

        UserDashboard userDashboard = new UserDashboard();

        userDashboard.tripandwayCookies.click();
        extentTest.info("Cookies'e tiklar");

        UserHomePage userHomePage = new UserHomePage();

        JSUtilities.scrollToElement(Driver.getDriver(),userHomePage.addressYazisi);
        extentTest.info("JavaScript ile footer bolumundeki Address yazisina kadar scroll yapar");
        ReusableMethods.bekle(1);

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(userHomePage.addressAddress.isDisplayed(),"34, Edd Lane, NYC, 22335 olan konum bilgisi gorunur olmalidir");
        extentTest.info("softAssert ile footer bolumundeki firma iletisim bilgisi olan konum bilgisinin gorunur oldugunu test eder");

        softAssert.assertTrue(userHomePage.addressTelefonNo.isDisplayed(),"202-456-3789 olan telefon bilgisi gorunur olmalidir");
        extentTest.info("softAssert ile footer bolumundeki firma iletisim bilgisi olan telefon bilgisinin gorunur oldugunu test eder");

        softAssert.assertTrue(userHomePage.addressEmail.isDisplayed(),"info@tripandway.com olan email bilgisi gorunur olmalidir");
        extentTest.info("softAssert ile footer bolumundeki firma iletisim bilgisi olan email bilgisinin gorunur oldugunu test eder");

        softAssert.assertAll();
        extentTest.pass("softAssert ile yapilan tum testlerin sonucunu raporlar");

        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");

    }
}
