package tests.mehmet;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AdminDashboard;
import pages.UserDashboard;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.SelcukTestBaseRapor;

public class US_38  extends SelcukTestBaseRapor {
    AdminDashboard adminDashboard=new AdminDashboard();
    @BeforeTest
    public void setup(){

        Driver.getDriver().get(ConfigReader.getProperty("trpAdminURL"));
    }

    @Test
    public void AdminGirisiYapveHesapDegistirmeGoruntele(){


        extentTest = extentReports.createTest("Admin Girisi ve Hesap Degistirme Goruntuleme",
                "Admin girisi yapilir ve hesap degistirilir");

        WebElement emailKutusu= adminDashboard.adminDashboardEmailKutusu;

        emailKutusu.sendKeys("admin04@tripandway.com");

        extentTest.info("Admin bolumune e-mail adresi girilir.");

        WebElement passwordKutusu=adminDashboard.adminDashboardPasswordKutusu;

        passwordKutusu.sendKeys("123123123");

        extentTest.info("Admin bolumune password girilir.");

        adminDashboard.adminDashboardLoginButonu.click();

        extentTest.info("Login tusuna tiklanilir.");

        Assert.assertTrue(adminDashboard.admin04sagustbuton.isDisplayed());

        extentTest.pass("Admin hesabi olusturup hesap degistirme goruntule testi.");

        Driver.quitDriver();


    }
}
