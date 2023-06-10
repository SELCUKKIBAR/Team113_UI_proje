package tests.elis;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomePage;
import utilities.*;

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

        Faker faker= new Faker();

        //3-Gecerli isim girilir
        userHomePage.nameText.sendKeys(faker.name().firstName());
        extentTest.info("Kullanıcı ismini girer");

        //4-Gecerli e mail adresi girilir
        userHomePage.emailText.sendKeys(faker.internet().emailAddress());
        extentTest.info("Kullanıcı email adresini girer.");

        //5-Gecerli sifre girilir
        userHomePage.sifreText.sendKeys(ConfigReader.getProperty("registrationSifre"));
        extentTest.info("Kullanıcı sifresini girer");

        JSUtilities.scrollToElement(Driver.getDriver(),userHomePage.makeRegistrationbutton);
        ReusableMethods.bekle(2);

        //6-Kayit ol butonuna tiklanir
        userHomePage.makeRegistrationbutton.click();
        extentTest.info("Kullanıcı kayit ol butonuna tiklar");

        //7-Basarili bir sekilde kayit oldugu dogrulanir
        WebElement basariliGiriselementi=Driver.getDriver().findElement(By.xpath("//*[contains(text(),'Registration is completed. You can now login.')]"));
        String expectedIcerik=ConfigReader.getProperty("registrationUyariMesaji");
        String actualIcerik=userHomePage.warningMessage.getText();
        Assert.assertEquals(actualIcerik,expectedIcerik);
        extentTest.pass("Kullanici pop up mesajini goruntuledi ve basarili bir sekilde kayit olundugu test edildi");

        //8-Sayfa kapatilir
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");

    }

}