package tests.ercan;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AdminDashboard;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_36 extends TestBaseRapor {

    private UserHomePage userHomePage = new UserHomePage();
    private SoftAssert softAssert = new SoftAssert();

    private AdminDashboard adminDashboard = new AdminDashboard();




    @Test

    public void sentEmailallSubscribs(){
        Driver.getDriver().get(ConfigReader.getProperty("trpAdminURL"));



        adminDashboard.adminDashboardEmailKutusu.sendKeys(ConfigReader.getProperty("adminEmail_01"));
        adminDashboard.adminDashboardPasswordKutusu.sendKeys(ConfigReader.getProperty("adminPassword_01")) ;
        adminDashboard.adminDashboardLoginButonu.click();
        adminDashboard.subscriberButonu.click();
        adminDashboard.sendEmailtoSubscribersButonu.click();

        adminDashboard.subjectYaziElementi.sendKeys("selam");
        adminDashboard.textBoxelementi.sendKeys("son test");

        adminDashboard.sendEmailButonu.click();


        Assert.assertTrue(adminDashboard.emailIssentSuccesfullyYaziElementi.isEnabled());

        Driver.getDriver().close();







    }
}
