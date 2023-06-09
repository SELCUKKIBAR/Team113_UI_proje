package tests.cigdem;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.Set;

public class US_34 extends TestBaseRapor {

    @Test
    public void adminOrderInvoiceYazisi(){

        extentTest = extentReports.createTest("Tripandway AdminOrderInvoiceYazisi testi",
                "Kullanici Order Invoice fatura bilgisi sayfasinin göruntulendigini test eder");

        //1- Kullanıcı https://qa.tripandway.com/admin/login sayfasına gider
        Driver.getDriver().get(ConfigReader.getProperty("trpAdminURL"));
        extentTest.info("Kullanici tripandway ADMIN anasayfasina gider...");

        //2- Kullanıcı Email Adress ve Passwrod kutucuklarına geçerli email ve şifre girer
        AdminDashboard adminDashboard = new AdminDashboard();
        adminDashboard.adminDashboardEmailKutusu.sendKeys(ConfigReader.getProperty("adminEmail_01"));
        adminDashboard.adminDashboardPasswordKutusu.sendKeys(ConfigReader.getProperty("adminPassword_01"));
        extentTest.info("Kullanici Email Adress ve Password kutucuklarına geçerli email ve şifre girer...");

        //3- Kullanıcı Login Butonuna tıklar
        adminDashboard.adminDashboardLoginButonu.click();
        extentTest.info("Kullanici Login Butonuna tıklar...");

        ReusableMethods.bekle(5);

        //4- Kullanıcı sağ üst köşede bulunan admin04 yazsının görürünür olduğunu kontrol ederek Admin panele girdiğini doğrular
        String expectedMesaj =ConfigReader.getProperty("adminIsmi");
        String actualMesaj = adminDashboard.admin04sagustbuton.getText();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(actualMesaj.equals(expectedMesaj),"Sağ üst köşedeki admin adı doğru olmalı");

        //5-Kullanıcı Admin panelinde bulunan Order elementine tıklar

        adminDashboard.adminHomepageOrderbutton.click();
        extentTest.info("Kullanici Order Butonuna tıklar...");
        ReusableMethods.bekle(2);

        String ilkSayfaWHD = Driver.getDriver().getWindowHandle();

        //6- Kullanıcı açılan View Orders birinci sayfa ilk siparis Invoice yazısına tıklar

        adminDashboard.birinciSayfailkSiparisInvoiceButonu.click();
        extentTest.info("Kullanici açılan View Orders birinci sayfa ilk siparis Invoice yazısına tıklar...");

        ReusableMethods.bekle(2);

        Set<String> WHDSet = Driver.getDriver().getWindowHandles();
        String ikinciSayfaWHD = "";
        for (String each:WHDSet
        ) {
            if (!each.equals(ilkSayfaWHD)){
                ikinciSayfaWHD=each;

            }
        }

        Driver.getDriver().switchTo().window(ikinciSayfaWHD);


        //7- Kullanıcı açılan yeni tabdaki sol ust kösedeki “Order Invoice” yazısının görünürlüğünü test eder

        expectedMesaj = "Order Invoice";
        actualMesaj = adminDashboard.orderInvoiceButonu.getText();

        softAssert.assertTrue(actualMesaj.equals(expectedMesaj),"Sol ust kösedeki “Order Invoice” yazısı dogru olmali");
        extentTest.info("Softassert ile Order Invoice yazısının gorunurlugu test eder");


        softAssert.assertAll();
        extentTest.pass("Softassert ile yapilan testlerin sonucunu raporlar");

        Driver.quitDriver();
        extentTest.info("Sayfayi kapatir");


    }
}


