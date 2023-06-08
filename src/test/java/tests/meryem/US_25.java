package tests.meryem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UserDashboard;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_25 extends TestBaseRapor {

    SoftAssert softAssert = new SoftAssert();
    UserDashboard userDashboard = new UserDashboard();
    UserHomePage userHomePage = new UserHomePage();

    @Test
    public void PaymentHistoryTesti01(){
        extentTest = extentReports.createTest("tripandway Login+PaymentHistory  Testi");

        //https://qa.tripandway.com/ sayfasina  gidilir
        Driver.getDriver().get(ConfigReader.getProperty("trpURL"));
        extentTest.info("Kullanıcı Tripandway anasayfaya gider ");

        //  Login butonu tıklanır
        userHomePage.homePageLoginButton.click();
        extentTest.info("Kullanıcı sag ustteki login butonunu tıklar");

        // cookies kabul edilir
          userDashboard.tripandwayCookies.click();
        extentTest.info("Kullanıcı cookiesi kabul eder");

        //Login butonu tıklanır

        userHomePage.homePageLoginButton.click();

        ReusableMethods.bekle(2);
        extentTest.info("Kullanıcı Homepage login Butonunu tıklar ve 2 sanıye bekler");


        // Email Adress kısmına gecerli email girilir
        userHomePage.homePageLoginEmail.sendKeys(" yolcu80@gmail.com");
        userHomePage.homePageLoginEmail.click();
        extentTest.info("Kullanıcı login sayfasında Email kutusuna gecerli Email i girer");


        // Password kısmına geçerli password girilir
        userHomePage.homePageLoginPassword.sendKeys("1453Meryem*");
        userHomePage.homePageLoginPassword.click();
        extentTest.info("Kullanıcı login sayfasıda Password kutusuna gecerli Passwordu girer");


        // kullanıcı alt logın tıklar
        userHomePage.homePageAltLoginButton.click();
        extentTest.info("Kullanıcı login sayfasında gerekli bilgileri" +
                " girdikten sonra alt login butonunu tıklar ve login olur");

        userDashboard.userLoginDashboardPaymentHistoryButton.click();
        extentTest.info("Kullanıcı login olup Dashboard " +
                "sayfasında PaymentHistory butonunu tıklar");

        for (WebElement each:userDashboard.userLoginDashboardTablonunBirinciSatirindakiDatalar

             ) {

            Assert.assertTrue(each.isDisplayed());

        }

        extentTest.info("Kullanıcı Payment History sayfasında satın aldıgı turun tum odeme bilgilerini görüntüler");
        extentTest.info("Kullanıcı görütülemeyi yapıp sayfayı 2 sanıye bekletip kapatır");
        ReusableMethods.bekle(2);
        Driver.closeDriver();





    }
}
