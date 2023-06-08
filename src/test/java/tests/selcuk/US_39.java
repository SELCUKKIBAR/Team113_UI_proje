package tests.selcuk;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_39 extends TestBaseRapor {

    AdminDashboard adminDashboard = new AdminDashboard();
    SoftAssert softAssert = new SoftAssert();



    @Test
    public void testCase01(){
        extentTest = extentReports.createTest("Admin panelindeki Change Photo kontrol testi",
                "Kullanici Admin Panelde sağ üst kısımda bulunan Change Photo elementinin işlevini test eder");

        //TEST CASE 1
        //1- Kullanıcı https://qa.tripandway.com/admin/login sayfasına gider
        Driver.getDriver().get(ConfigReader.getProperty("trpAdminURL"));
        extentTest.info("Kullanici Admin Panel anasayfayasına gider...");

        //2- Kullanıcı Email Adress ve Passwrod kutucuklarına geçerli email ve şifre girer
        adminDashboard.adminDashboardEmailKutusu.sendKeys(ConfigReader.getProperty("adminEmail_01"));
        adminDashboard.adminDashboardPasswordKutusu.sendKeys(ConfigReader.getProperty("adminPassword_01"));


        //3- Kullanıcı Login Butonuna tıklar
        adminDashboard.adminDashboardLoginButonu.click();
        extentTest.info("Kullanici email ve şifresini girer ve logim olur...");

        //4- Kullanıcı sağ üst köşede bulunan admin04 yazsının görürünür olduğunu kontrol ederek Admin panele girdiğini doğrular
        String expectedMesaj = "admin04";
        String actualMesaj = adminDashboard.admin04sagustbuton.getText();

        softAssert.assertTrue(actualMesaj.equals(expectedMesaj),"Sağ üst köşedeki admin adı doğru olmalı");
        extentTest.info("Kullanici login olduğunu test eder...");

        //5- admin04 elementine tıklar
        adminDashboard.adminDashboardAdmin03_04_05Profil.click();
        extentTest.info("Kullanici adminX elementine tıklar...");
        ReusableMethods.bekle(1);

        //6- Change Photo elementine tıklar
        adminDashboard.ChangePhotobuton.click();
        ReusableMethods.bekle(1);
        extentTest.info("Kullanici Change Photo elementine tıklar...");
        adminDashboard.adminDashboardEditPhotoText.isDisplayed();
        extentTest.info("Kullanici Profil resmi değişme ekranının aktif ve görünür olduğunu test eder...");
        ReusableMethods.bekle(1);



        softAssert.assertAll();

        extentTest.pass("Kullanıcı testini bitirir...");

    }
}
