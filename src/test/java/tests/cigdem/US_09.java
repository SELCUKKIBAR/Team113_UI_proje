package tests.cigdem;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UserDashboard;
import pages.UserHomePage;
import utilities.*;

public class US_09 extends TestBaseRapor {


    @Test
    public void newsletterMailTesti() {

        extentTest = extentReports.createTest("Newsletter mail testi","Newsletter arama kutusuna mail girilebilmeli ve katilim onay mesaji görulmeli");


        // 1-Kullanıcı https://qa.tripandway.com/ sayfasına gider
        Driver.getDriver().get(ConfigReader.getProperty("trpURL"));
        extentTest.info("Kullanici Tripandway anasayfaya gider");
        ReusableMethods.bekle(1);

        // 2-Cikan cookies kabul edilir
        UserDashboard userDashboard = new UserDashboard();
        extentTest.info("Cookies kabul edilir");
        userDashboard.tripandwayCookies.click();

        // 3-Body bölumunun alt kismindaki newsletter kismina iner
        UserHomePage userHomePage = new UserHomePage();
        JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.newsletterAramaKutusu);
        extentTest.info("Newsletter arama kutusu elementine kadar scroll yapar");
        ReusableMethods.bekle(3);

        // 4-NEWSLETTER yazisi altındaki Email Address textbox’ına ilgili datayi girer SUBMIT butonuna tiklar
        userHomePage.newsletterAramaKutusu.sendKeys(ConfigReader.getProperty("newsletterAramaKutusuEmail"));
        extentTest.info("Newsletter arama kutusuna e-mail gönderir");
        userHomePage.newsletterSubmit.click();
        extentTest.info("Newsletter submit butonuna tiklar");

        ReusableMethods.bekle(1);

        // 5-Mail haber gurubuna(newsletter) katılabildiğini sağ üst köşede çıkan yeşil Pop Up mesajın görüntülendiğini doğrulayarak test eder
        SoftAssert softAssert = new SoftAssert();
        String expectedUyariMesaji = ConfigReader.getProperty("newsletterExpectedUyariMesaji");
        String actualUyariMesaji = userHomePage.warningMessage.getText();
        softAssert.assertEquals(actualUyariMesaji, expectedUyariMesaji, "Varolan ya da bir kere kullanilacak bir mail girilince newsletter yazi onayi cikar");
        extentTest.info("Softassert ile Newsletter mail uyari mesaji test eder");


        softAssert.assertAll();
        extentTest.pass("Softassert ile yapilan testlerin sonucunu raporlar");

        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");


    }
}


