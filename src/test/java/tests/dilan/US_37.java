package tests.dilan;

import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

import static org.testng.Assert.*;

public class US_37 extends TestBaseRapor {

    @Test
    public void profilBilgileriDegistirmeEkraniGorunurlugu(){

        extentTest = extentReports.createTest("Admin sayfasi profil bilgileri degistirme ekrani gorunurlugu testi",
                "Kullanici admin sayfasina giderek profil bilgileri degistirme ekranini goruntuleyebilmeli");

        Driver.getDriver().get(ConfigReader.getProperty("trpAdminURL"));
        extentTest.info("Kullanici Admin Login Sayfasina gider");

        AdminDashboard adminDashboard = new AdminDashboard();

        adminDashboard.adminDashboardEmailKutusu.sendKeys(ConfigReader.getProperty("adminEmail_01"));
        extentTest.info("Admin Login sayfasinda email Address textbox'ina gecerli email girer");

        adminDashboard.adminDashboardPasswordKutusu.sendKeys(ConfigReader.getProperty("adminPassword_01"));
        extentTest.info("Admin Login sayfasinda password textbox'ina gecerli email girer");

        adminDashboard.adminDashboardLoginButonu.click();
        extentTest.info("Admin Login sayfasinda login butonuna tiklar");

        adminDashboard.adminDashboardAdmin03_04_05Profil.click();
        extentTest.info("Admin Panel sayfasinda admin isminin yazdigi yere tiklar");

        adminDashboard.adminDashboardChangePassword.click();
        extentTest.info("Acilan menuden Change Password'e tiklar");

        assertTrue(adminDashboard.adminDashboardEditProfilText.isDisplayed(),"Edit Profile yazisi gorunur olmalidir");
        extentTest.pass(adminDashboard.adminDashboardEditProfilText.getText() + " yazisinin gorunur oldugunu test eder");

        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");

    }
}