package tests.dilan;

import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import pages.UserDashboard;
import pages.UserHomePage;
import utilities.*;

import java.util.Set;

public class US_07 extends TestBaseRapor {
    private UserHomePage userHomePage = new UserHomePage();
    private UserDashboard userDashboard = new UserDashboard();
    private SoftAssert softAssert = new SoftAssert();

    @BeforeMethod
    public void setUp(){

        extentTest = extentReports.createTest("Tripandway sayfasindaki footer bolumundeki sosyal medya ikonlari testi",
                "Kullanici footer bolumundeki sosyal medya ikonlarini goruntuleyebilmeli ve aktif olarak kullanabilmeli");

        Driver.getDriver().get(ConfigReader.getProperty("trpURL"));
        extentTest.info("Kullanici Tripandway sayfasina gider");

        userDashboard.tripandwayCookies.click();
        extentTest.info("Cookies'i kabul eder");

        JSUtilities.scrollToElement(Driver.getDriver(),userHomePage.addressYazisi);
        extentTest.info("JavaScript ile footer bolumundeki Address yazisina kadar scroll yapar");
        ReusableMethods.bekle(1);
    }

    @AfterMethod
    public void teardown(){
        Driver.quitDriver();
        extentTest.info("Sayfayi kapatir");
    }

    @Test
    public void sosyalMedyaIkonlarininGoruntulenmesi(){

        softAssert.assertTrue(userHomePage.facebookLogoHomePage.isDisplayed(),"Footer bolumundeki Facebook ikonu goruntulenebilmeli");
        extentTest.info("softassert ile footer bolumundeki sosyal medya ikonu olan Facebook ikonunun goruntulenebildigini test eder");

        softAssert.assertTrue(userHomePage.twitterLogoHomePage.isDisplayed(),"Footer bolumundeki Twitter ikonu goruntulenebilmeli");
        extentTest.info("softassert ile footer bolumundeki sosyal medya ikonu olan Twitter ikonunun goruntulenebildigini test eder");

        softAssert.assertTrue(userHomePage.linkedInLogoHomePage.isDisplayed(),"Footer bolumundeki LinkedIn ikonu goruntulenebilmeli");
        extentTest.info("softassert ile footer bolumundeki sosyal medya ikonu olan LinkedIn ikonunun goruntulenebildigini test eder");

        softAssert.assertTrue(userHomePage.pinterestLogoHomePage.isDisplayed(),"Footer bolumundeki Pinterest ikonu goruntulenebilmeli");
        extentTest.info("softassert ile footer bolumundeki sosyal medya ikonu olan Pinterest ikonunun goruntulenebildigini test eder");

        softAssert.assertTrue(userHomePage.instagramLogoHomePage.isDisplayed(),"Footer bolumundeki Instagram ikonu goruntulenebilmeli");
        extentTest.info("softassert ile footer bolumundeki sosyal medya ikonu olan Instagram ikonunun goruntulenebildigini test eder");

        softAssert.assertAll();
        extentTest.pass("softAssert ile yapilan tum testlerin sonucunu raporlar");

    }

    @Test
    public void facebookSosyalMedyaIkonuAktifligi(){

        softAssert.assertTrue(userHomePage.facebookLogoHomePage.isEnabled(),"Footer bolumundeki Facebook ikonu aktif olmalidir");
        extentTest.info("softAssert ile footer bolumundeki sosyal medya ikonu olan Facebook ikonunun aktif oldugunu test eder");

        userHomePage.facebookLogoHomePage.click();
        extentTest.info("Footer bolumundeki sosyal medya ikonu olan Facebook ikonuna tiklar");

        ReusableMethods.switchToWindow("Facebook - Giriş Yap veya Kaydol");
        extentTest.info("Yeni window'da acilan Facebook anasayfasina gecer");

        softAssert.assertTrue(userHomePage.facebookLogoFacebookYazisiHomePage.isDisplayed(),"Facebook ikonuna tiklayinca acilan sayfada facebook yazisi gorunur olmali");
        extentTest.info("Facebook anasayfasinda 'facebook' yazisinin gorunur oldugunu test eder");

        softAssert.assertAll();
        extentTest.pass("softAssert ile yapilan tum testlerin sonucunu raporlar");

    }

    @Test
    public void twitterSosyalMedyaIkonuAktifligi(){

        // Twitter ikonuna tiklayinca yeni bir tab acilir, driver'i o yeni acilan sayfaya gecirmeliyiz
        // O yuzden once ilk sayfanin windowHandeDegeri'ni almaliyiz
        String ilkSayfaWindowHandleDegeri=Driver.getDriver().getWindowHandle();

        softAssert.assertTrue(userHomePage.twitterLogoHomePage.isEnabled(),"Footer bolumundeki Twitter ikonu aktif olmalidir");
        extentTest.info("softAssert ile footer bolumundeki sosyal medya ikonu olan Twitter ikonunun aktif oldugunu test eder");

        userHomePage.twitterLogoHomePage.click();
        extentTest.info("Footer bolumundeki sosyal medya ikonu olan Twitter ikonuna tiklar");

        // 73. satirdan itibaren yeni window acildi
        // Su an iki tane acik window'umuz var
        Set<String> windowHandleDegerleriSet=Driver.getDriver().getWindowHandles();

        String ikinciSayfaWindowHandleDegeri="";

        for (String eachWHD: windowHandleDegerleriSet
        ) {
            if (!eachWHD.equals(ilkSayfaWindowHandleDegeri)) {
                ikinciSayfaWindowHandleDegeri=eachWHD;
            }
        }
        // Artik ikinci sayfaninda windowHandleDeger'ine sahibiz
        Driver.getDriver().switchTo().window(ikinciSayfaWindowHandleDegeri); // driver'da artik ikinci window'da
        extentTest.info("Yeni acilan window'a gecer");

        softAssert.assertTrue(userHomePage.twitterLogoAyarlarYazisiHomePage.isDisplayed(),"Twitter ikonuna tiklayinca acilan sayfada Ayarlar yazisi gorunur olmali");
        extentTest.info("Yeni acilan anasayfada twitter logosunun gorunur oldugunu test eder");

        softAssert.assertAll();
        extentTest.pass("softAssert ile yapilan tum testlerin sonucunu raporlar");

    }

    @Test
    public void linkedInSosyalMedyaIkonuAktifligi(){

        // LinkedIn ikonuna tiklayinca yeni bir tab acilir, driver'i o yeni acilan sayfaya gecirmeliyiz
        // O yuzden once ilk sayfanin windowHandeDegeri'ni almaliyiz
        String ilkSayfaWindowHandleDegeri=Driver.getDriver().getWindowHandle();

        softAssert.assertTrue(userHomePage.linkedInLogoHomePage.isEnabled(),"Footer bolumundeki LinkedIn ikonu aktif olmalidir");
        extentTest.info("softAssert ile footer bolumundeki sosyal medya ikonu olan LinkedIn ikonunun aktif oldugunu test eder");

        userHomePage.linkedInLogoHomePage.click();
        extentTest.info("Footer bolumundeki sosyal medya ikonu olan LinkedIn ikonuna tiklar");

        // 121. satirdan itibaren yeni window acildi
        // Su an iki tane acik window'umuz var
        Set<String> windowHandleDegerleriSet=Driver.getDriver().getWindowHandles();

        String ikinciSayfaWindowHandleDegeri="";

        for (String eachWHD: windowHandleDegerleriSet
        ) {
            if (!eachWHD.equals(ilkSayfaWindowHandleDegeri)) {
                ikinciSayfaWindowHandleDegeri=eachWHD;
            }
        }
        // Artik ikinci sayfaninda windowHandleDeger'ine sahibiz
        Driver.getDriver().switchTo().window(ikinciSayfaWindowHandleDegeri); // driver'da artik ikinci window'da
        extentTest.info("Yeni window'da acilan LinkedIn anasayfasina gecer");

        softAssert.assertTrue(userHomePage.linkedInSayfaLinkedInLogoHomePage.isDisplayed(),"LinkedIn ikonuna tiklayinca acilan sayfada LinkedIn logosu gorunur olmali");
        extentTest.info("Facebook anasayfasinda linkedin logosunun gorunur oldugunu test eder");

        softAssert.assertAll();
        extentTest.pass("softAssert ile yapilan tum testlerin sonucunu raporlar");
    }

    @Test
    public void pinterestSosyalMedyaIkonuAktifligi(){

        // Pinterest ikonuna tiklayinca yeni bir tab acilir, driver'i o yeni acilan sayfaya gecirmeliyiz
        // O yuzden once ilk sayfanin windowHandeDegeri'ni almaliyiz
        String ilkSayfaWindowHandleDegeri=Driver.getDriver().getWindowHandle();

        softAssert.assertTrue(userHomePage.pinterestLogoHomePage.isEnabled(),"Footer bolumundeki Pinterest ikonu aktif olmalidir");
        extentTest.info("softAssert ile footer bolumundeki sosyal medya ikonu olan Pinterest ikonunun aktif oldugunu test eder");

        userHomePage.pinterestLogoHomePage.click();
        extentTest.info("Footer bolumundeki sosyal medya ikonu olan Pinterest ikonuna tiklar");

        // 149. satirdan itibaren yeni window acildi
        // Su an iki tane acik window'umuz var
        Set<String> windowHandleDegerleriSet=Driver.getDriver().getWindowHandles();

        String ikinciSayfaWindowHandleDegeri="";

        for (String eachWHD: windowHandleDegerleriSet
        ) {
            if (!eachWHD.equals(ilkSayfaWindowHandleDegeri)) {
                ikinciSayfaWindowHandleDegeri=eachWHD;
            }
        }
        // Artik ikinci sayfaninda windowHandleDeger'ine sahibiz
        Driver.getDriver().switchTo().window(ikinciSayfaWindowHandleDegeri); // driver'da artik ikinci window'da
        extentTest.info("Yeni acilan window'a gecer");

        softAssert.assertTrue(userHomePage.pinterestSayfaPinterestLogoHomePage.isDisplayed(),"Pinterest ikonuna tiklayinca acilan sayfada Pinterest logosu gorunur olmali");
        extentTest.info("Yeni acilan anasayfada pintererst logosunun gorunur oldugunu test eder");

        softAssert.assertAll();
        extentTest.pass("softAssert ile yapilan tum testlerin sonucunu raporlar");

    }

    @Test
    public void instagramSosyalMedyaIkonuAktifligi(){

        softAssert.assertTrue(userHomePage.instagramLogoHomePage.isEnabled(),"Footer bolumundeki Instagram ikonu aktif olmalidir");
        extentTest.info("softAssert ile footer bolumundeki sosyal medya ikonu olan Instagram ikonunun aktif oldugunu test eder");

        userHomePage.instagramLogoHomePage.click();
        extentTest.info("Footer bolumundeki sosyal medya ikonu olan Instagram ikonuna tiklar");

        ReusableMethods.switchToWindow("Instagram");
        extentTest.info("Yeni window'da acilan Instagram anasayfasina gecer");

        String expectedInstagramTitle= ConfigReader.getProperty("instagramSosyalMedyaIkonuTitle");
        String actualInstagramTitle= Driver.getDriver().getTitle();

        softAssert.assertEquals(actualInstagramTitle,expectedInstagramTitle,"Instagram ikonuna tiklayinca acilan sayfanin title'i Instagram olmali");
        extentTest.info("Instagram anasayfasinda linkedin logosunun gorunur oldugunu test eder");

        softAssert.assertAll();
        extentTest.pass("softAssert ile yapilan tum testlerin sonucunu raporlar");

    }

}
