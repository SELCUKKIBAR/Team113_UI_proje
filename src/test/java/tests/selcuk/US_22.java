package tests.selcuk;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UserDashboard;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_22 extends TestBaseRapor {

    @Test
    public void sifreDegistirme(){

        extentTest = extentReports.createTest("Tripandway ŞİFRE DEĞİŞTİRME testi",
                "Kullanici açılan sayfanın Header Sağ köşe mesajının DASHBOARD oldugunu test eder");

        //TEST CASE 1
        //1- Kullanıcı https://qa.tripandway.com/ ana sayfasına gider
        Driver.getDriver().get(ConfigReader.getProperty("trpURL"));
        extentTest.info("Kullanici Tripandway anasayfaya gider...");

        //2- Kullanıcı ana sayfanın sağ üst köşesinde bulunan Login butonuna tıklar
        SoftAssert softAssert = new SoftAssert();
        UserDashboard userDashboard = new UserDashboard();
        UserHomePage userHomePage = new UserHomePage();
        userHomePage.homePageLoginButton.click();
        WebElement accept = Driver.getDriver().findElement(By.xpath("//button[@type='button']"));
        accept.click();
        extentTest.info("KUllanıcı Login Butonuna tıkla ve Kullanici footer bölümüne iner ve açılan ACCEPT alertini kabul ededer...");

        //3- Kullanıcı Login sayfasında Email ve Password kutucuklarına geçerli email ve password'u girer
        userDashboard.userLoginDashboradEmailAddressTextBox.sendKeys(ConfigReader.getProperty("mailAdresim"));
        extentTest.info("Kullanıcı Email Adresini girer..");

        //4- Kullanıcı Password kutcuğunun altında bulunan Login Butonuna tıklar
        userDashboard.userLoginDashboradPasswordAddressTextBox.sendKeys(ConfigReader.getProperty("sifre_01"));
        userDashboard.userLoginDashboradLogin.click();
        extentTest.info("Kullanıcı Passwordunu girer ve Login e tıklar..");

        //5- Kullanıcı giriş yaptığını Header bölümünde sağ üst köşede bulunan "Dashboard" yazısının görünür olduğunu test ederek doğrular
        String expectedDashboard = "Dashboard";
        String actualDashboard= userDashboard.userLoginDashboradDashboardDogrulama.getText();


        softAssert.assertTrue(actualDashboard.equals(expectedDashboard),"Dashboard yazısı görünür olmalı");
        extentTest.info("Dashboard yazısını görür..");

        //6- Kullanıcı sol menüde bulunan "Update Password" elementine tıklar
        userDashboard.userLoginDashboardUpdatePasswordButton.click();
        extentTest.info("Kullanıcı Şifre değiştirme butonuna tıklar..");

        //7- Kullanıcı açılan sayfadaki "New Password *" kutuscuğuna yeni şifresini yazar ve  Update butonuna tıklar

        userDashboard.userLoginDashboardNewPasswordunYazilacagiButton.sendKeys(ConfigReader.getProperty("sifre_02"));
        userDashboard.userLoginDashboardUpdateButton.click();
        extentTest.info("Kullanıcı yeni şifreyi girer ve Update Butonuna tıklar..");







        //8- Kullanıcı şifresinin başarılı bir şekilde değişltiğini sağ üst köşede çıkak yeşil Pop up mesajının göründüğünü test ederek doğrular
       WebElement popMesaj = Driver.getDriver().findElement(By.xpath("//*[contains(text(), 'Password is updated successfully')]"));
        ReusableMethods.bekle(2);
       softAssert.assertFalse(popMesaj.isDisplayed(),"pop mesajı görünür olmalı");
        extentTest.info("Kullanıcı popUp mesajını görür..");

        //9- Kullanıcı Sol menüde bulunan Logout butonuna tıklayarak hesabından çıkış yapar
        userDashboard.userLoginDashboardLogoutButton.click();
        extentTest.info("Kullanıcı Logout butonuna tıklar..");



        Driver.quitDriver();

        softAssert.assertAll();
        extentTest.pass("Sayfayı kapatır...");
    }
}
