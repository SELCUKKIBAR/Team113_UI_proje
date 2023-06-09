package tests.mehmet;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import pages.UserDashboard;
import pages.UserHomePage;
import utilities.*;

import java.util.Set;

public class US_13 extends SelcukTestBaseRapor {

  UserHomePage userHomePage = new UserHomePage();
  UserDashboard userDashboard = new UserDashboard();

  private SoftAssert softAssert = new SoftAssert();









    @Test (priority = 1)
    public void destinationsGorunurMu(){

      extentTest = extentReports.createTest("Tripandway Anasayfa Destinations Gorunurluk testi",
              "Kullanici açılan sayfada Title'nin gorunurlugunu test eder.");


      Driver.getDriver().get(ConfigReader.getProperty("trpURL"));

      extentTest.info("Kullanici Tripandway anasayfaya gider.");


    @Test(priority = 1)
    public void destinationsGorunurMu(){


      userHomePage.homePageDestinationsButton.click();

      extentTest.info("Kullanici Destination butonuna tiklar.");

      String expected = "DESTINATIONS";
      String actual = userHomePage.destinationsYazisi.getText();

      extentTest.info("Kullanici Title'lari kontrol eder.");

      Assert.assertEquals(expected,actual);

      extentTest.pass("Destination bolumu kontrol testi.");




  }

  @Test(priority = 2)
  public void destinationsBangkokAktifMi(){

    extentTest = extentReports.createTest("Tripandway/Destinations/Bangkok aktiflik testi",
            "Kullanici açılan sayfada Bangkok bolumunun aktifligini test eder.");


    userHomePage.homePageDestinationsButton.click();

    extentTest.info("Kullanici Tripandway Destinations bolumune gider.");


    JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.destinationsBangkok);
    ReusableMethods.bekle(2);

    userHomePage.destinationsBangkok.click();

    extentTest.info("Kullanici Bangkok bolumune tiklar.");

    Assert.assertTrue(userHomePage.bangkokYazisi.isDisplayed());

    extentTest.pass("Bangkok bolumunun aktifligini kontrol testi.");



  }
  @Test(priority = 3)
  public void destinationsGreenvilleAktifMi() {

    extentTest = extentReports.createTest("Tripandway/Destinations/Greenville aktiflik testi",
            "Kullanici açılan sayfada GreenVille bolumunun aktifligini test eder.");


    userHomePage.homePageDestinationsButton.click();

    extentTest.info("Kullanici Tripandway Destinations bolumune gider.");

    JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.destinationsBangkok);
    ReusableMethods.bekle(2);


    userHomePage.destinationsGreenville.click();

    extentTest.info("Kullanici Greenville bolumune tiklar.");

    Assert.assertTrue(userHomePage.greenvilleYazisi.isDisplayed());

    extentTest.pass("Greenville bolumunun aktifligini kontrol testi.");



  }@Test(priority = 4)
  public void destinationsBuenosAiresAktifMi (){


    extentTest = extentReports.createTest("Tripandway/Destinations/Buenos Aires aktiflik testi",
            "Kullanici acilan sayfada Buenos Aires bolumunun aktifligini kontrol eder.");



    userHomePage.homePageDestinationsButton.click();

    extentTest.info("Kullanici Tripandway Destinations bolumune gider.");

    JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.destinationsBangkok);
    ReusableMethods.bekle(2);

    userHomePage.destinationsBuenosAires.click();

    extentTest.info("Kullanici Buenos Aires bolumune tiklar.");

    Assert.assertTrue(userHomePage.buenosAiresYazisi.isDisplayed());

    extentTest.pass("Buenos Aires bolumunun aktifligini kontrol testi.");


  }

  @Test(priority = 5)
  public void destinationsMarrakeshAktifMi(){

    extentTest = extentReports.createTest("Tripandway/Destinations/Marrakesh aktiflik testi",
            "Kullanici açılan sayfada Marrakesh bolumunun aktifligini test eder.");

    userHomePage.homePageDestinationsButton.click();

    extentTest.info("Kullanici Tripandway Destinations bolumune gider.");


    JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.destinationsBangkok);
    ReusableMethods.bekle(2);


    userHomePage.destinationsMarrakesh.click();

    extentTest.info("Kullanici Marrakesh bolumune tiklar.");


    Assert.assertTrue(userHomePage.marrakeshYazisi.isDisplayed());

    extentTest.pass("Marrakesh bolumunun aktifligini kontrol testi.");



  }

  @Test(priority = 6)
  public void destinationsSalinaIslandAktifMi(){

    extentTest = extentReports.createTest("Tripandway/Destinations/Salina Island aktiflik testi",
            "Kullanici açılan sayfada Salina Island bolumunun aktifligini test eder.");


    userHomePage.homePageDestinationsButton.click();

    extentTest.info("Kullanici Tripandway Destinations bolumune gider.");

    JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.destinationsBangkok);
    ReusableMethods.bekle(2);

    userHomePage.destinationsSalinaIsland.click();

    extentTest.info("Kullanici Salina Island bolumune tiklar.");

    Assert.assertTrue(userHomePage.salinaYazisi.isDisplayed());

    extentTest.pass("Salina Island bolumunun aktifligini kontrol testi.");



  }
  @Test(priority = 7)
  public void destinationsIstanbulAktifMi(){

    extentTest = extentReports.createTest("Tripandway/Destinations/Istanbul aktiflik testi",
            "Kullanici açılan sayfada GreenVille bolumunun aktifligini test eder.");


    userHomePage.homePageDestinationsButton.click();

    extentTest.info("Kullanici Tripandway Destinations bolumune gider.");


    JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.destinationsBangkok);
    ReusableMethods.bekle(2);


    userHomePage.destinationsIstanbul.click();
    extentTest.info("Kullanici Island bolumune tiklar.");


    Assert.assertTrue(userHomePage.istanbulYazisi.isDisplayed());

    extentTest.pass("Istanbul bolumunun aktifligini kontrol testi.");




  }

  @Test(priority = 8)
  public void destinationsCaliforniaAktifMi(){

    extentTest = extentReports.createTest("Tripandway/Destinations/California aktiflik testi",
            "Kullanici açılan sayfada California bolumunun aktifligini test eder.");


    userHomePage.homePageDestinationsButton.click();

    extentTest.info("Kullanici Tripandway Destinations bolumune gider.");


    JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.destinationsCalifornia);
    ReusableMethods.bekle(2);

    userHomePage.destinationsCalifornia.click();

    extentTest.info("Kullanici California bolumune tiklar.");



 Assert.assertTrue(userHomePage.californiaYazisi.isDisplayed());

    extentTest.pass("California bolumunun aktifligini kontrol testi.");

 Driver.closeDriver();



  }


}
