package tests.hatice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserDashboard;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_16 extends TestBaseRapor {

    @Test
    public void FAQDogrulama(){
        extentTest=extentReports.createTest("FAQ Testi",
                "Kullanici FAQ sayfasina giderek sorulari gormelidir.");

        //  https://qa.tripandway.com/ sayfasina gidilir.

        Driver.getDriver().get(ConfigReader.getProperty("trpURL"));
        extentTest.info("Kullanici tripandway sayfasina gider;");
        UserDashboard userDashboard=new UserDashboard();
        userDashboard.tripandwayCookies.click();
        extentTest.info("Acilan sayfada cookies kabul edilir");

        //2-Sayfanin FQA (Frequently Questions Asking bolumununun goruntulenebildigi dogrulanir.
        UserHomePage userHomePage=new UserHomePage();
        userHomePage.homePageFaqButton.click();
        extentTest.info("FAQ butonuna tiklanir");

        Assert.assertTrue(userHomePage.FAQyazisi.isDisplayed());
        extentTest.pass("Assertion ile FAQ yazisi test edilir.");

        for (WebElement each:userHomePage.FAQSorular
        ) {
            Assert.assertTrue(each.isDisplayed());

        }
        extentTest.pass("Assertion ile FAQ sorulari test edilir.");

        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");

    }





    }

