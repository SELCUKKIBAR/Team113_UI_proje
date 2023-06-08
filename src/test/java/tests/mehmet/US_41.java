package tests.mehmet;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;

public class US_41 {


    AdminDashboard adminDashboard = new AdminDashboard();

    @BeforeTest
    public void setup() {

        Driver.getDriver().get(ConfigReader.getProperty("trpAdminURL"));
    }

    @Test
    public void AdminGirisiYapveCikisYap() {

        WebElement emailKutusu = adminDashboard.adminDashboardEmailKutusu;

        emailKutusu.sendKeys("admin04@tripandway.com");

        WebElement passwordKutusu = adminDashboard.adminDashboardPasswordKutusu;

        passwordKutusu.sendKeys("123123123");

        adminDashboard.adminDashboardLoginButonu.click();
        adminDashboard.admin04sagustbuton.click();
        adminDashboard.logouttusu.click();

        Assert.assertTrue(adminDashboard.adminDashboardEmailKutusu.isDisplayed());

        Driver.quitDriver();

    }

}
