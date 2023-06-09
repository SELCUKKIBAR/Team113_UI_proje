package tests.dilan;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UserDashboard;
import pages.UserHomePage;
import utilities.*;

public class US_17 extends TestBaseRapor {

    private UserHomePage userHomePage = new UserHomePage();
    private UserDashboard userDashboard = new UserDashboard();
    private SoftAssert softAssert = new SoftAssert();

    @Test
    public void contactSayfasiUlasilabilirligi(){

        extentTest= extentReports.createTest("Contact sayfasi ulasilabilirligi testi",
                "Kullanici contact sayfasina ulasabilmelidir ve CONTACT US yazisini gorebilmelidir");

        Driver.getDriver().get(ConfigReader.getProperty("trpURL"));
        extentTest.info("Kullanici Tripandway sayfasina gider");

        userDashboard.tripandwayCookies.click();
        extentTest.info("Cookies'i kabul eder");

        userHomePage.homePageContactButton.click();
        extentTest.info("Contact bolumune tiklar");

        softAssert.assertTrue(userHomePage.contactUsYazisi.isDisplayed(),"Contact menusune tikladiktan sonra CONTACT US yazisi gorunur olmalidir");
        extentTest.info("softAssert ile CONTACT US yazisinin gorunurlugunu test eder");

        softAssert.assertAll();
        extentTest.pass("softAssert ile yapilan tum testlerin sonucunu raporlar");

        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");

    }

    @Test
    public void contactFormAktifligi(){

        extentTest= extentReports.createTest("Contact form aktifligi testi",
                "Kullanici contact sayfasina ulasabilmelidir ve Contact Form basligi altndaki textbox'lari kullanabilmelidir");

        Driver.getDriver().get(ConfigReader.getProperty("trpURL"));
        extentTest.info("Kullanici Tripandway sayfasina gider");

        userDashboard.tripandwayCookies.click();
        extentTest.info("Cookies'i kabul eder");

        userHomePage.homePageContactButton.click();
        extentTest.info("Contact bolumune tiklar");

        Actions actions = new Actions(Driver.getDriver());

        Faker faker = new Faker();

        actions.click(userHomePage.nameTextBox)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().phoneNumber())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("messageContact")).perform();

        extentTest.info("Contact From basligi altindaki textbox'lara gerekli data'lari girer");

        JSUtilities.scrollToElement(Driver.getDriver(),userHomePage.nameTextBox);

        userHomePage.submitButton.submit();
        extentTest.info("Submit butonuna tiklar");

        ReusableMethods.bekle(1);

        String expectedUyariMesaji="Message is sent successfully! Admin will contact you soon";
        String actualUyariMesaji=userHomePage.warningMessage.getText();

        softAssert.assertEquals(actualUyariMesaji,expectedUyariMesaji,"Submit butonuna tiklayinca uyari mesajinda Message is sent successfully! Admin will contact you soon yazmalidir");
        extentTest.info("softAssert ile uyari mesajinda Message is sent successfully! Admin will contact you soon yazdigini test eder");

        softAssert.assertAll();
        extentTest.pass("softAssert ile yapilan testin sonucunu raporlar");

        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");

    }

    @Test
    public void contactInformationGorunurlugu(){
        extentTest= extentReports.createTest("Contact form aktifligi testi",
                "Kullanici contact sayfasina ulasabilmelidir ve Contact Information'i gorebilmelidir");

        Driver.getDriver().get(ConfigReader.getProperty("trpURL"));
        extentTest.info("Kullanici Tripandway sayfasina gider");

        userDashboard.tripandwayCookies.click();
        extentTest.info("Cookies'i kabul eder");

        userHomePage.homePageContactButton.click();
        extentTest.info("Contact bolumune tiklar");
        ReusableMethods.bekle(1);

        softAssert.assertTrue(userHomePage.addressIletisimBilgisi.isDisplayed(),"Address iletisim bilgisi gorunur olmalidir");
        extentTest.info("softAssert ile Address iletisim bilgisinin gorunurlugunu test eder");

        JSUtilities.scrollToElement(Driver.getDriver(),userHomePage.emailAddressIletisimBilgisi);
        extentTest.info("JavaScript ile Address iletisim bilgisine kadar scroll yapar");
        ReusableMethods.bekle(1);

        softAssert.assertTrue(userHomePage.emailAddressIletisimBilgisi.isDisplayed(),"Email Address iletisim bilgisi gorunur olmalidir");
        extentTest.info("softAssert ile Email Address iletisim bilgisinin gorunurlugunu test eder");

        softAssert.assertTrue(userHomePage.phoneIletisimBilgisi.isDisplayed(),"Phone iletisim bilgisi gorunur olmalidir");
        extentTest.info("softAssert ile Phone iletisim bilgisinin gorunurlugunu test eder");

        softAssert.assertAll();
        extentTest.pass("softAssert ile yapilan tum testlerin sonucunu raporlar");

        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
}
