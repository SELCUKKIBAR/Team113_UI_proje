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

public class US_04{

    @Test
    public void testCase01(){


        //TEST CASE 1
        //1- Kullanıcı https://qa.tripandway.com/ ana sayfasına gider
        Driver.getDriver().get(ConfigReader.getProperty("trpURL"));


        //2- Kullanıcı footer bölümüne iner
        UserHomePage userHomePage = new UserHomePage();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();",userHomePage.FeaturedPackagesYazisi);

        //3- Kullanıcı 3 DAYS IN BUENOS AIRES'i tıklar
        userHomePage.threeDaysInBuenosAires.click();

        //4- Kullanıcı sayfanın tıklandığını titilina bakarak test eder
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "3 days in Buenos Aires";

        Assert.assertTrue(actualTitle.equals(expectedTitle));


        Driver.quitDriver();
    }

    @Test
    public void testCase02(){

        //TEST CASE 2
        //1- Kullanıcı https://qa.tripandway.com/ ana sayfasına gider
        Driver.getDriver().get(ConfigReader.getProperty("trpURL"));

        //2- Kullanıcı footer bölümüne iner
        UserHomePage userHomePage = new UserHomePage();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();",userHomePage.FeaturedPackagesYazisi);

        //3- Kullanıcı 10 DAYS IN BUENOS AIRES'i tıklar
        userHomePage.tenDaysInBuenosAires.click();

        //4- Kullanıcı sayfanın tıklandığını titilina bakarak test eder
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "10 days in Buenos Aires";

        Assert.assertTrue(actualTitle.equals(expectedTitle));


        Driver.quitDriver();


    }

    @Test
    public void testCase03(){
        //TEST CASE 3
        //1- Kullanıcı https://qa.tripandway.com/ ana sayfasına gider
        Driver.getDriver().get(ConfigReader.getProperty("trpURL"));

        //2- Kullanıcı footer bölümüne iner
        UserHomePage userHomePage = new UserHomePage();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();",userHomePage.FeaturedPackagesYazisi);

        //3- Kullanıcı 3 DAYS IN BANGKOK'u tıklar
        userHomePage.threeDaysInBangkok.click();

        //4- Kullanıcı sayfanın tıklandığını titilina bakarak test eder
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "3 days in Bangkok";

        Assert.assertTrue(actualTitle.equals(expectedTitle));


        Driver.quitDriver();

    }

    @Test
    public void testCase04(){
        //TEST CASE 4
        //1- Kullanıcı https://qa.tripandway.com/ ana sayfasına gider
        Driver.getDriver().get(ConfigReader.getProperty("trpURL"));

        //2- Kullanıcı footer bölümüne iner
        UserHomePage userHomePage = new UserHomePage();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();",userHomePage.FeaturedPackagesYazisi);

        //3- Kullanıcı 7 DAYS IN SALINA ISLAND'ı tıklar
        userHomePage.sevenDaysInSalinaIslandLatestPackages.click();

        //4- Kullanıcı sayfanın tıklandığını titilina bakarak test eder
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "7 days in Salina Island";

        Assert.assertTrue(actualTitle.equals(expectedTitle));


        Driver.quitDriver();
    }




}


