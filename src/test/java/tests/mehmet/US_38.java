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

public class US_38 {
    AdminDashboard adminDashboard=new AdminDashboard();
    @BeforeTest
    public void setup(){

        Driver.getDriver().get(ConfigReader.getProperty("trpAdminURL"));
    }

    @Test
    public void AdminGirisiYapveHesapDegistirmeGoruntele(){

        WebElement emailKutusu= adminDashboard.adminDashboardEmailKutusu;

        emailKutusu.sendKeys("admin04@tripandway.com");

        WebElement passwordKutusu=adminDashboard.adminDashboardPasswordKutusu;

        passwordKutusu.sendKeys("123123123");

        adminDashboard.adminDashboardLoginButonu.click();

        Assert.assertTrue(adminDashboard.admin04sagustbuton.isDisplayed());

        Driver.quitDriver();


    }
}
