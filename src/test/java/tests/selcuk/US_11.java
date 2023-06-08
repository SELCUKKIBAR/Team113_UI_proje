package tests.selcuk;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;


public class US_11 extends TestBaseRapor {

    @Test
    public void privacyPolicy_goruntuleme()  {
        extentTest = extentReports.createTest("Tripandway PRIVACY POLICY testi",
                "Kullanici açılan sayfanın Title'sinin Privacy Policy oldugunu test eder");
        //1- Kullanıcı https://qa.tripandway.com/ ana sayfasına gider
        Driver.getDriver().get(ConfigReader.getProperty("trpURL"));
        extentTest.info("Kullanici Tripandway anasayfaya gider...");

        //2- Kullanıcı footer bölümüne iner
        UserHomePage userHomePage = new UserHomePage();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();",userHomePage.FeaturedPackagesYazisi);
        ReusableMethods.bekle(2);
        WebElement accept = Driver.getDriver().findElement(By.xpath("//button[@type='button']"));
        accept.click();
        extentTest.info("Kullanici footer bölümüne iner ve açılan ACCEPT alertini kabul ededer...");

        //3- Kullanıcı PRIVACY POLICY'i tıklar

        userHomePage.privacyPolicy.click();
        //4- Kullanıcı sayfanın tıklandığını titilina bakarak test eder
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Privacy Policy";

        Assert.assertTrue(actualTitle.equals(expectedTitle));
        extentTest.pass("Sayfanın Title'ının Privacu Policy olduğunu doğrular...");


        Driver.quitDriver();
    }


}
