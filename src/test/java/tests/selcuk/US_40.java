package tests.selcuk;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_40 extends TestBaseRapor {

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
        ReusableMethods.bekle(1);

        //5- Kullanıcı soldaki menünün altında bulunan daraltma çubuğuna bastığında menünün daraldığını doğrular
        adminDashboard.adminDashboardDaraltmaOkIsareti.click();
        ReusableMethods.bekle(1);
        extentTest.info("Kullanici daraltma okunu test eder...");

        //7- Kullanıcı ekranın sağ üst köşesinde bulunan Visit Website butonuna tıkladığında Webbrowserda
        // yeni bir tab açıldıpını ve o sayfada ana sayfaya gittiğini doğrular
        adminDashboard.adminDashboardVisitWebsiteButonu.click();
        ReusableMethods.switchToWindow("Tripandway");
        extentTest.info("Kullanici yeni açılan sayfanın Titlesini test eder...");

        softAssert.assertAll();
        extentTest.pass("Kullanıcı testini bitirir...");

    }
}
