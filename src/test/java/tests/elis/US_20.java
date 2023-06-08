package tests.elis;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserDashboard;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_20 extends TestBaseRapor {


    @Test
    public void updatetest(){
        extentTest = extentReports.createTest("Update testi", "Kullanici profil bilgilerini duzenleyebilmelidir");

        //1-https://qa.tripandway.com/ sayfasina gidilir
        Driver.getDriver().get(ConfigReader.getProperty("trpURL"));
        extentTest.info("Kullanici Tripandway anasayfaya gider");

        //2-Login butonuna tiklanir
        UserHomePage userHomePage = new UserHomePage();
        userHomePage.homePageLoginButton.click();
        WebElement accept = Driver.getDriver().findElement(By.xpath("//div[@class='wpcc-compliance']"));
        accept.click();
        extentTest.info("Kullanıcı Login Butonuna tıklar ve cikan ACCEPT alertini kabul eder");

        //3- Gecerli  e mail adresi girilir
        UserDashboard userDashboard=new UserDashboard();
        userDashboard.userLoginDashboradEmailAddressTextBox.sendKeys("elis.musaoglu@gmail.com");
        extentTest.info("Kullanıcı email adresini girer.");

        //4- Gecerli sifre girilir
        userDashboard.userLoginDashboradPasswordAddressTextBox.sendKeys("E64668890m?");
        extentTest.info("Kullanıcı sifresini girer");

        //5- Login butonuna tiklanir
        userDashboard.userLoginDashboradLogin.click();
        extentTest.info("Kullanıci login butonuna tiklar");

        //6- Acilan sayfada update profile butonuna tiklanir
        userDashboard.userLoginDashboardUpdateProfileButton.click();
        extentTest.info("Kullanıci update profil butonuna tiklar");

        //7- Acilan sayfada ilgili alanlardaki bilgiler guncellenir
        userDashboard.userLoginDashboradNameTextBox.clear();
        userDashboard.userLoginDashboradNameTextBox.sendKeys("Fatma");

        userDashboard.userLoginDashboradPhoneTextBox.clear();
        userDashboard.userLoginDashboradPhoneTextBox.sendKeys("123456");

        userDashboard.userLoginDashboradCountryTextBox.clear();
        userDashboard.userLoginDashboradCountryTextBox.sendKeys("Turkiye");

        userDashboard.userLoginDashboradAddressTextBox.clear();
        userDashboard.userLoginDashboradAddressTextBox.sendKeys("Istanbul");

        userDashboard.userLoginDashboradStateTextBox.clear();
        userDashboard.userLoginDashboradStateTextBox.sendKeys("Kadikoy");

        userDashboard.userLoginDashboradCityTextBox.clear();
        userDashboard.userLoginDashboradCityTextBox.sendKeys("Istanbul");

        userDashboard.userLoginDashboradZipCodeTextBox.clear();
        userDashboard.userLoginDashboradZipCodeTextBox.sendKeys("1234");
        extentTest.info("Kullanıci bilgilerini gunceller");

        //8-Update butonuna tiklanir
        userDashboard.userLoginDashboardUpdateButton.click();
        extentTest.info("Kullanıci update butonuna tiklar");

        //9-Profil bilgileri basariyla guncellendikten sonra sag ust kosede
        //yesil bir pop up mesajinin goruntulendigi dogrulanir
        WebElement basariliGiriselementi=Driver.getDriver().findElement(By.xpath("//*[contains(text(),'Profile is updated successfully')]"));
        Assert.assertFalse(basariliGiriselementi.isDisplayed(),"Pop up meseji gorunur olmali");
        extentTest.pass("Kullanici pop up mesajini goruntuledi ve bilgilerin guncellendigi test edildi");

        //10-Sayfa kapatilir
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");

    }
}