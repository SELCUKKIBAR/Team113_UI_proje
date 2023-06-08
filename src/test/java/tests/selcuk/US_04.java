package tests.selcuk;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.animation.model.KeyframeStyle;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_04 extends TestBaseRapor {

    @Test
    public void featuredPackages_3days_BuenoAires_goruntuleme (){


        //TEST CASE 1
        //1- Kullanıcı https://qa.tripandway.com/ ana sayfasına gider
        Driver.getDriver().get(ConfigReader.getProperty("trpURL"));


        //2- Kullanıcı footer bölümüne iner
        UserHomePage userHomePage = new UserHomePage();


        //3- Kullanıcı 3 DAYS IN BUENOS AIRES'i tıklar

        userHomePage.threeDaysInBuenosAires.click();

        //4- Kullanıcı sayfanın tıklandığını titilina bakarak test eder
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "3 days in Buenos Aires";

        Assert.assertTrue(actualTitle.equals(expectedTitle));


        extentTest.pass("Sayfanın Title'ının '3 days in Buenos Aires' olduğunu doğrular...");


        Driver.quitDriver();
    }

    @Test
    public void featuredPackages_10days_BuenoAires_goruntuleme(){

        extentTest = extentReports.createTest("Tripandway FOOTER testi",
                "Kullanici açılan sayfanın Title'sinin '10 days in Buenos Aires' oldugunu test eder");

        //TEST CASE 2
        //1- Kullanıcı https://qa.tripandway.com/ ana sayfasına gider
        Driver.getDriver().get(ConfigReader.getProperty("trpURL"));
        extentTest.info("Kullanici Tripandway anasayfaya gider...");

        //2- Kullanıcı footer bölümüne iner
        UserHomePage userHomePage = new UserHomePage();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();",userHomePage.FeaturedPackagesYazisi);

        //3- Kullanıcı 10 DAYS IN BUENOS AIRES'i tıklar
        userHomePage.tenDaysInBuenosAires.click();
        extentTest.info("Kullanici 10 days in Buenos Aires'a tıklar...");

        //4- Kullanıcı sayfanın tıklandığını titilina bakarak test eder
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "10 days in Buenos Aires";

        Assert.assertTrue(actualTitle.equals(expectedTitle));
        extentTest.pass("Sayfanın Title'ının '10 days in Buenos Aires' olduğunu doğrular...");


        Driver.quitDriver();


    }

    @Test
    public void featuredPackages_3days_Bangkok_goruntuleme(){

        extentTest = extentReports.createTest("Tripandway FOOTER testi",
                "Kullanici açılan sayfanın Title'sinin '3 days in Bangkok' oldugunu test eder");


        //TEST CASE 3
        //1- Kullanıcı https://qa.tripandway.com/ ana sayfasına gider
        Driver.getDriver().get(ConfigReader.getProperty("trpURL"));
        extentTest.info("Kullanici Tripandway anasayfaya gider...");

        //2- Kullanıcı footer bölümüne iner
        UserHomePage userHomePage = new UserHomePage();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();",userHomePage.FeaturedPackagesYazisi);

        //3- Kullanıcı 3 DAYS IN BANGKOK'u tıklar
        userHomePage.threeDaysInBangkok.click();
        extentTest.info("Kullanici 3 days in Bangkok'a tıklar...");

        //4- Kullanıcı sayfanın tıklandığını titilina bakarak test eder
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "3 days in Bangkok";

        Assert.assertTrue(actualTitle.equals(expectedTitle));
        extentTest.pass("Sayfanın Title'ının '3 days in Bangkok' olduğunu doğrular...");


        Driver.quitDriver();

    }

    @Test
    public void featuredPackages_7days_SalinaIsland_goruntuleme(){

        extentTest = extentReports.createTest("Tripandway FOOTER testi",
                "Kullanici açılan sayfanın Title'sinin '7 days in Salina Island' oldugunu test eder");


        //TEST CASE 4
        //1- Kullanıcı https://qa.tripandway.com/ ana sayfasına gider
        Driver.getDriver().get(ConfigReader.getProperty("trpURL"));
        extentTest.info("Kullanici Tripandway anasayfaya gider...");

        //2- Kullanıcı footer bölümüne iner
        UserHomePage userHomePage = new UserHomePage();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();",userHomePage.FeaturedPackagesYazisi);

        //3- Kullanıcı 7 DAYS IN SALINA ISLAND'ı tıklar
        userHomePage.sevenDaysInSalinaIslandLatestPackages.click();
        extentTest.info("Kullanici 7 days in Salina Island'a tıklar...");

        //4- Kullanıcı sayfanın tıklandığını titilina bakarak test eder
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "7 days in Salina Island";

        Assert.assertTrue(actualTitle.equals(expectedTitle));
        extentTest.pass("Sayfanın Title'ının '7 days in Salina Island' olduğunu doğrular...");



        Driver.quitDriver();
    }

}

