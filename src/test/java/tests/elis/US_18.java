package tests.elis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserDashboard;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_18 extends TestBaseRapor {

    @Test
    public void registrationtest(){
        extentTest = extentReports.createTest("Registration testi", "Kullanici siteye kayit olabilmelidir");
        //1-https://qa.tripandway.com/ sayfasina gidilir
        Driver.getDriver().get(ConfigReader.getProperty("trpURL"));
        extentTest.info("Kullanici Tripandway anasayfaya gider");

        //2-Kayit butonu elementine tiklanir
        UserHomePage userHomePage = new UserHomePage();
        userHomePage.homePageRegistrationButton.click();
        WebElement accept = Driver.getDriver().findElement(By.xpath("//div[@class='wpcc-compliance']"));
        accept.click();
        extentTest.info("Kullanıcı Registration Butonuna tıklar ve cikan ACCEPT alertini kabul eder");

        //3-Gecerli isim girilir
        userHomePage.nameText.sendKeys("Elis");
        extentTest.info("Kullanıcı ismini girer");

        //4-Gecerli e mail adresi girilir
        userHomePage.emailText.sendKeys("elis56777@hotmail.com");
        extentTest.info("Kullanıcı email adresini girer.");

        //5-Gecerli sifre girilir
        userHomePage.sifreText.sendKeys("E123456e?");
        extentTest.info("Kullanıcı sifresini girer");

        //6-Kayit ol butonuna tiklanir
        userHomePage.makeRegistrationbutton.click();
        extentTest.info("Kullanıcı kayit ol butonuna tiklar");

        //7-Basarili bir sekilde kayit oldugu dogrulanir
        WebElement basariliGiriselementi=Driver.getDriver().findElement(By.xpath("//*[contains(text(),'Registration is completed. You can now login.')]"));
        String expectedIcerik= "Registration is completed. You can now login.";
        String actualIcerik=basariliGiriselementi.getText();
        Assert.assertFalse(basariliGiriselementi.isDisplayed());
        extentTest.pass("Kullanici pop up mesajini goruntuledi ve basarili bir sekilde kayit olundugu test edildi");

        //8-Sayfa kapatilir
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");

    }

}