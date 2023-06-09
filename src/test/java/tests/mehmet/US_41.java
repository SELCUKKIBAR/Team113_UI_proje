package tests.mehmet;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.SelcukTestBaseRapor;

public class US_41  extends SelcukTestBaseRapor {


    AdminDashboard adminDashboard = new AdminDashboard();

    @BeforeTest
    public void setup() {

        Driver.getDriver().get(ConfigReader.getProperty("trpAdminURL"));
    }

    @Test
    public void AdminGirisiYapveCikisYap() {

        extentTest = extentReports.createTest("Admin Girisi Yapma ve Cikis Yapma",
                "Admin girisi yapilir ve cikis yapilir.");

        WebElement emailKutusu = adminDashboard.adminDashboardEmailKutusu;

        emailKutusu.sendKeys("admin04@tripandway.com");

        extentTest.info("Admin bolumune e-mail adresi girilir.");

        WebElement passwordKutusu = adminDashboard.adminDashboardPasswordKutusu;

        passwordKutusu.sendKeys("123123123");

        extentTest.info("Admin bolumune password girilir.");

        adminDashboard.adminDashboardLoginButonu.click();

        extentTest.info("Login tusuna tiklanilir.");

        adminDashboard.admin04sagustbuton.click();

        extentTest.info("Admin04 bolumune tiklanilir.");

        adminDashboard.logouttusu.click();

        extentTest.info("Logout tusuna tiklanilir.");

        Assert.assertTrue(adminDashboard.adminDashboardEmailKutusu.isDisplayed());

        extentTest.pass("Admin girisi yapip cikis yapma kontrol testi.");

        Driver.quitDriver();

    }

}
