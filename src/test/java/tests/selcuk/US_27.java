package tests.selcuk;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;

public class US_27 {
    @Test
    public void testCase01(){

        //TEST CASE 1
        //1- Kullanıcı https://qa.tripandway.com/admin/login sayfasına gider
        Driver.getDriver().get(ConfigReader.getProperty("trpAdminURL"));

        //2- Kullanıcı Email Adress ve Passwrod kutucuklarına geçerli email ve şifre girer
        AdminDashboard adminDashboard = new AdminDashboard();
        adminDashboard.adminDashboardEmailKutusu.sendKeys(ConfigReader.getProperty("adminEmail_01"));
        adminDashboard.adminDashboardPasswordKutusu.sendKeys(ConfigReader.getProperty("adminPassword_01"));

        //3- Kullanıcı Login Butonuna tıklar
        adminDashboard.adminDashboardLoginButonu.click();
        //4- Kullanıcı sağ üst köşede bulunan admin04 yazsının görürünür olduğunu kontrol ederek Admin panele girdiğini doğrular
        String expectedMesaj = "admin04";
        String actualMesaj = adminDashboard.admin04sagustbuton.getText();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(actualMesaj.equals(expectedMesaj),"Sağ üst köşedeki admin adı doğru olmalı");



        Driver.quitDriver();


        softAssert.assertAll();

    }
}
