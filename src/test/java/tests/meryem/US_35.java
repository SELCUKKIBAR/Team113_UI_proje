package tests.meryem;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_35 extends TestBaseRapor {
    SoftAssert softAssert = new SoftAssert();
    AdminDashboard adminDashboard = new AdminDashboard();

    @Test
    public void AdminSubscribersTesti(){


        extentTest = extentReports.createTest("tripandway Admin Subscriber Testi");
        //   Kullanıcı https://qa.tripandway.com/admin/ sayfasına gider
        Driver.getDriver().get(ConfigReader.getProperty("trpAdminURL"));
        extentTest.info("Kullanıcı Tripandway Admin anasayfaya gider ");

        //  Admin login olmak icin geçerli mail ve passwordu girer

        adminDashboard.adminDashboardEmailKutusu.sendKeys(ConfigReader.getProperty("adminEmail_01"));
        extentTest.info("Kullanıcı admin kutucuguna gecerli admin Emili girer");
        adminDashboard.adminDashboardPasswordKutusu.sendKeys(ConfigReader.getProperty("adminPassword_01"));
        extentTest.info("Kullanıcı admin kutucuguna gecerli admin Passwordu girer");

        // Login butonunu tıklar sifre kaydedilsin mi yazısını kaydet diye kabuleder tıklar

        adminDashboard.adminDashboardLoginButonu.click();
        extentTest.info("Kullanıcı admin login butonunu tıklar");
        //  AdmınPanel sayfasının acıldıgını görür

        String expectedMesaj = "admin04";
        String actualMesaj = adminDashboard.admin04sagustbuton.getText();
        softAssert.assertTrue(actualMesaj.equals(expectedMesaj),"Sağ üst köşedeki admin adı doğru olmalı");
        extentTest.info("Kullanıcı admin oldukatn sonra sag ustten admın adının dogrulrugunu kontrol eder");

        // Subscriber tıklanır
        adminDashboard.subscriberButonu.click();
        extentTest.info("kullanıcı Deshbord sayfasındakı Subsciber Butonunu tıklar");
        adminDashboard.allSubscribersbutonu.click();
        extentTest.info("Kullanıcı Subscriber  butonunun altındakı allSubscriber kısmını tıklar");

        //  Subscriber in altında All Subscribers tıklanır
        // Tum haber listesi üyelerinin olduğu sayfaya giris yapılır
        //   Sayfalardakı tüm haber listesi üyeleri görüntülenir

        adminDashboard.allSubscribersbirinciSayfaelementi.click();
        extentTest.info("Kullanıcı allSubscriber sayfasına girer ve tum Haber listesi" +
                " uyelerinin isimlerini goruntuler ");









    }
}
