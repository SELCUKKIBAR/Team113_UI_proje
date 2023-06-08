package tests.meryem;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UserDashboard;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_19 extends TestBaseRapor {
    SoftAssert softAssert = new SoftAssert();
    UserDashboard userDashboard = new UserDashboard();
    UserHomePage userHomePage = new UserHomePage();

    @Test
    public void loginTesti() throws InterruptedException {

        extentTest = extentReports.createTest("tripandway login  Testi");

        // Kullanıcı https://qa.tripandway.com/admin/login sayfasına gider

        Driver.getDriver().get(ConfigReader.getProperty("trpURL"));
        extentTest.info("Kullanıcı Tripandway anasayfaya gider ");

        //Kullanıcı ana sayfanın sağ üst köşesinde bulunan Login butonuna tıklar
        userHomePage.homePageLoginButton.click();
        extentTest.info("Kullanıcı sag ustteki login butonunu tıklar");

        // cookies i kabul eder
        userDashboard.tripandwayCookies.click();
        extentTest.info("Kullanıcı cookiesi kabul eder");

        // Login sayfasında gecerliEmail  kutucuguna geçerli email  girer
        userHomePage.homePageLoginEmail.sendKeys(" yolcu80@gmail.com");
        userHomePage.homePageLoginEmail.click();
        extentTest.info("Kullanıcı login sayfasında Email kutusuna gecerli Email i girer");

        // Kullanıcı gecerli Password kutucuğunun geçerli Password girer
         userHomePage.homePageLoginPassword.sendKeys("1453Meryem*");
         userHomePage.homePageLoginPassword.click();
         extentTest.info("Kullanıcı login sayfasıda Password kutusuna gecerli Passwordu girer");

       // kullanıcı alt logın tıklar
         userHomePage.homePageAltLoginButton.click();
         extentTest.info("Kullanıcı login sayfasında gerekli bilgileri" +
                 " girdikten sonra alt login butonunu tıklar ve login olur");

        //  Kullanıcı login oldugunu Dashboard sayfasına giderek  dogrulamalı
        String expectedMesaj = "Dashboard";
        String actualMesaj = userDashboard.userLoginDashboardSagDashboardButton.getText();

        softAssert.assertEquals(actualMesaj,expectedMesaj,"Sağ üst köşedeki admin adı doğru olmalı");
        extentTest.info("Kullanıcı Dashboard sayfasına gidip login oldugunu dogrular");

        // Login olunduktan sonra https://qa.tripandway.com/ sayfasına gitmeli
         extentTest.info("kullanıcı  sayfayı kapatı ve anasayfaya doner ");
        Driver.getDriver().get(ConfigReader.getProperty("trpURL"));

        ReusableMethods.bekle(3);
        Driver.closeDriver();





    }
}

