package tests.ercan;

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

        extentTest = extentReports.createTest("Sent Email All subscribs aktifligi testi","" +
                "Kullanici admin sayfana giris yapar , sayfanin sol en alt bolumunde ki  subscribs sekmesine tiklar" +
                "Send email subscribs secenegini secer , baslik ve mail yazarak send butonuna tiklar, succesfully yazisini test eder ");
        Driver.getDriver().get(ConfigReader.getProperty("trpAdminURL"));



        adminDashboard.adminDashboardEmailKutusu.sendKeys(ConfigReader.getProperty("adminEmail_01"));
        adminDashboard.adminDashboardPasswordKutusu.sendKeys(ConfigReader.getProperty("adminPassword_01")) ;
        adminDashboard.adminDashboardLoginButonu.click();
        adminDashboard.subscriberButonu.click();
        adminDashboard.sendEmailtoSubscribersButonu.click();

        adminDashboard.subjectYaziElementi.sendKeys("selam");
        adminDashboard.textBoxelementi.sendKeys("son test");

        adminDashboard.sendEmailButonu.click();

        String expectedResult = "Email is sent successfully to all subscribers!";

       String actualResult = adminDashboard.emailIssentSuccesfullyYaziElementi.getText();

       softAssert.assertTrue(adminDashboard.emailIssentSuccesfullyYaziElementi.isEnabled());




    }
}
