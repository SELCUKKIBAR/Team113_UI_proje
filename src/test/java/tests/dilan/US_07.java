package tests.dilan;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UserDashboard;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

import java.util.Set;

public class US_07 {
    private UserHomePage userHomePage = new UserHomePage();
    private SoftAssert softAssert = new SoftAssert();

    @BeforeMethod
    public void setUp(){
        Driver.getDriver().get(ConfigReader.getProperty("trpURL"));
        ReusableMethods.bekle(2);

        UserDashboard userDashboard = new UserDashboard();
        userDashboard.tripandwayCookies.click();

        JSUtilities.scrollToElement(Driver.getDriver(),userHomePage.addressYazisi);
        ReusableMethods.bekle(2);
    }

    @AfterMethod
    public void teardown(){
        Driver.quitDriver();
    }

    @Test
    public void sosyalMedyaIkonlarininGoruntulenmesi(){

        softAssert.assertTrue(userHomePage.facebookLogoHomePage.isDisplayed(),"Footer bolumundeki Facebook ikonu goruntulenebilmeli");

        softAssert.assertTrue(userHomePage.twitterLogoHomePage.isDisplayed(),"Footer bolumundeki Twitter ikonu goruntulenebilmeli");

        softAssert.assertTrue(userHomePage.linkedInLogoHomePage.isDisplayed(),"Footer bolumundeki LinkedIn ikonu goruntulenebilmeli");

        softAssert.assertTrue(userHomePage.pinterestLogoHomePage.isDisplayed(),"Footer bolumundeki Pinterest ikonu goruntulenebilmeli");

        softAssert.assertTrue(userHomePage.instagramLogoHomePage.isDisplayed(),"Footer bolumundeki Instagram ikonu goruntulenebilmeli");

        softAssert.assertAll();

    }

    @Test
    public void facebookSosyalMedyaIkonuAktifligi(){

        // Facebook ikonuna tiklayinca yeni bir tab acilir, driver'i o yeni acilan sayfaya gecirmeliyiz
        // O yuzden once ilk sayfanin windowHandeDegeri'ni almaliyiz
        String ilkSayfaWindowHandleDegeri=Driver.getDriver().getWindowHandle();

        userHomePage.facebookLogoHomePage.click();

        //61. satirdan itibaren yeni window acildi
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

        softAssert.assertTrue(userHomePage.facebookLogoFacebookYazisiHomePage.isDisplayed(),"Facebook ikonuna tiklayinca acilan sayfada facebook yazisi gorunur olmali");

        softAssert.assertAll();

    }

    @Test
    public void twitterSosyalMedyaIkonuAktifligi(){

        // Twitter ikonuna tiklayinca yeni bir tab acilir, driver'i o yeni acilan sayfaya gecirmeliyiz
        // O yuzden once ilk sayfanin windowHandeDegeri'ni almaliyiz
        String ilkSayfaWindowHandleDegeri=Driver.getDriver().getWindowHandle();

        userHomePage.twitterLogoHomePage.click();

        // 90. satirdan itibaren yeni window acildi
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

        softAssert.assertTrue(userHomePage.twitterLogoAyarlarYazisiHomePage.isDisplayed(),"Twitter ikonuna tiklayinca acilan sayfada Ayarlar yazisi gorunur olmali");

        softAssert.assertAll();

    }

    @Test
    public void linkedInSosyalMedyaIkonuAktifligi(){

        // LinkedIn ikonuna tiklayinca yeni bir tab acilir, driver'i o yeni acilan sayfaya gecirmeliyiz
        // O yuzden once ilk sayfanin windowHandeDegeri'ni almaliyiz
        String ilkSayfaWindowHandleDegeri=Driver.getDriver().getWindowHandle();

        userHomePage.linkedInLogoHomePage.click();

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

        softAssert.assertTrue(userHomePage.linkedInSayfaLinkedInLogoHomePage.isDisplayed(),"LinkedIn ikonuna tiklayinca acilan sayfada LinkedIn logosu gorunur olmali");

    }

    @Test
    public void pinterestSosyalMedyaIkonuAktifligi(){

        // Pinterest ikonuna tiklayinca yeni bir tab acilir, driver'i o yeni acilan sayfaya gecirmeliyiz
        // O yuzden once ilk sayfanin windowHandeDegeri'ni almaliyiz
        String ilkSayfaWindowHandleDegeri=Driver.getDriver().getWindowHandle();

        userHomePage.pinterestLogoHomePage.click();

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

        softAssert.assertTrue(userHomePage.pinterestSayfaPinterestLogoHomePage.isDisplayed(),"Pinterest ikonuna tiklayinca acilan sayfada Pinterest logosu gorunur olmali");

        softAssert.assertAll();

    }

    @Test
    public void instagramSosyalMedyaIkonuAktifligi(){

        // Instagram ikonuna tiklayinca yeni bir tab acilir, driver'i o yeni acilan sayfaya gecirmeliyiz
        // O yuzden once ilk sayfanin windowHandeDegeri'ni almaliyiz
        String ilkSayfaWindowHandleDegeri=Driver.getDriver().getWindowHandle();

        userHomePage.instagramLogoHomePage.click();

        // 179. satirdan itibaren yeni window acildi
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

        String expectedInstagramTitle= ConfigReader.getProperty("instagramSosyalMedyaIkonuTitle");
        String actualInstagramTitle= Driver.getDriver().getTitle();

        softAssert.assertEquals(actualInstagramTitle,expectedInstagramTitle,"Instagram ikonuna tiklayinca acilan sayfanin title'i Instagram olmali");

        softAssert.assertAll();

    }

}
