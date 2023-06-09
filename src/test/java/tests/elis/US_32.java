package tests.elis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_32 extends TestBaseRapor {

    AdminDashboard adminDashboard = new AdminDashboard();

    @Test
    public void testCase01() {
        extentTest = extentReports.createTest("Admin panelindeki order kontrol testi",
                "Kullanici birinci sayfadaki ilk siparisi goruntuledigini test eder");

        // 1-https://qa.tripandway.com/admin/login sayfasina gidilir
        Driver.getDriver().get(ConfigReader.getProperty("trpAdminURL"));
        extentTest.info("Kullanici Admin Panel anasayfayasına gider");

        //2-Ilgili  e mail ve sifre girilir
        adminDashboard.adminDashboardEmailKutusu.sendKeys(ConfigReader.getProperty("adminEmail_01"));
        adminDashboard.adminDashboardPasswordKutusu.sendKeys(ConfigReader.getProperty("adminPassword_01"));
        extentTest.info("Kullanici email ve şifresini girer");

        //3-Login butonuna tiklanir
        adminDashboard.adminDashboardLoginButonu.click();
        extentTest.info("Kullanici login butonuna tiklar");

        //4-Acilan sayfada admin panelindeki order elementine tiklanir
        adminDashboard.adminHomepageOrderbutton.click();
        extentTest.info("Kullanici order butonuna tiklar");

        //5-1.sayfaya tiklanir 1. sayfadaki ilk siparisin goruntulendigi dogrulanir

        adminDashboard.adminOrderspageBirincisayfaElementi.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(adminDashboard.birinciSayfailkSiparisElementi.isDisplayed());
        extentTest.pass("Kullanici birinci sayfadaki siparisin goruntulendigini dogrular");

        Driver.quitDriver();

    }

    @Test
    public void testCase02() {
        extentTest = extentReports.createTest("Admin panelindeki order kontrol testi",
                "Kullanici dorduncu sayfadaki ikinci siradaki siparisin goruntuledigini test eder");

        // 1-https://qa.tripandway.com/admin/login sayfasina gidilir
        Driver.getDriver().get(ConfigReader.getProperty("trpAdminURL"));
        extentTest.info("Kullanici Admin Panel anasayfayasına gider");

        //2-Ilgili  e mail ve sifre girilir
        adminDashboard.adminDashboardEmailKutusu.sendKeys(ConfigReader.getProperty("adminEmail_01"));
        adminDashboard.adminDashboardPasswordKutusu.sendKeys(ConfigReader.getProperty("adminPassword_01"));
        extentTest.info("Kullanici email ve şifresini girer");

        //3-Login butonuna tiklanir
        adminDashboard.adminDashboardLoginButonu.click();
        extentTest.info("Kullanici login butonuna tiklar");

        //4-Acilan sayfada admin panelindeki order elementine tiklanir
        adminDashboard.adminHomepageOrderbutton.click();
        extentTest.info("Kullanici order butonuna tiklar");

        //5- 4.sayfaya tiklanir 2.siradaki siparisin goruntulendigi dogrulanir

        adminDashboard.adminOrderspageDorduncusayfaElementi.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(adminDashboard.dorduncuSayfaikinciSiradakiSiparisElementi.isDisplayed());
        extentTest.pass("Kullanici dorduncu sayfadaki ikinci siradaki siparisin goruntulendigini dogrular");

        Driver.quitDriver();

    }

    @Test
    public void testCase03() {
        extentTest = extentReports.createTest("Admin panelindeki order kontrol testi",
                "Kullanici altinci sayfadaki son siparisin goruntuledigini test eder");

        // 1-https://qa.tripandway.com/admin/login sayfasina gidilir
        Driver.getDriver().get(ConfigReader.getProperty("trpAdminURL"));
        extentTest.info("Kullanici Admin Panel anasayfayasına gider");

        //2-Ilgili  e mail ve sifre girilir
        adminDashboard.adminDashboardEmailKutusu.sendKeys(ConfigReader.getProperty("adminEmail_01"));
        adminDashboard.adminDashboardPasswordKutusu.sendKeys(ConfigReader.getProperty("adminPassword_01"));
        extentTest.info("Kullanici email ve şifresini girer");

        //3-Login butonuna tiklanir
        adminDashboard.adminDashboardLoginButonu.click();
        extentTest.info("Kullanici login butonuna tiklar");

        //4-Acilan sayfada admin panelindeki order elementine tiklanir
        adminDashboard.adminHomepageOrderbutton.click();
        extentTest.info("Kullanici order butonuna tiklar");

        //5- 6.sayfaya tiklanir son  siparisin goruntulendigi dogrulanir

        adminDashboard.adminOrderspageAltincisayfaElementi.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(adminDashboard.altinciSayfasonSiparisElementi.isDisplayed());
        extentTest.pass("Kullanici altinci sayfadaki son siparisin goruntulendigini dogrular");

        Driver.quitDriver();
    }

}