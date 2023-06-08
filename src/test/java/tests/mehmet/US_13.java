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

public class US_13  {

  UserHomePage userHomePage = new UserHomePage();

  private SoftAssert softAssert = new SoftAssert();





  @BeforeTest
  public void setup(){



    Driver.getDriver().get(ConfigReader.getProperty("trpURL"));
    userHomePage.destinationsUstTaraf.click();

    UserDashboard userDashboard = new UserDashboard();
    userDashboard.tripandwayCookies.click();


  }



    @Test
    public void destinationsGorunurMu(){



      try {
        Thread.sleep(3000);
      } catch (InterruptedException e) {

      }

      String expected = "DESTINATIONS";
      String actual = userHomePage.destinationsYazisi.getText();



      Assert.assertEquals(expected,actual);

    Driver.closeDriver();

  }

  @Test
  public void destinationsBangkokAktifMi(){

    JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.destinationsBangkok);
    ReusableMethods.bekle(2);



    userHomePage.destinationsBangkok.click();



    softAssert.assertTrue(userHomePage.bangkokYazisi.isDisplayed(),"Destinations'a tiklayinca acilan sayfada Bangkok yazisi gorunur olmali");

    softAssert.assertAll();



    Driver.quitDriver();





  }



  @Test
  public void destinationsGreenvilleAktifMi(){

    JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.destinationsBangkok);
    ReusableMethods.bekle(2);



    userHomePage.destinationsGreenville.click();



    softAssert.assertTrue(userHomePage.greenvilleYazisi.isDisplayed(),"Destinations'a tiklayinca acilan sayfada GreenVille yazisi gorunur olmali");

    softAssert.assertAll();



    Driver.quitDriver();
  }

  @Test
  public void destinationsBuenosAiresAktifMi(){

    JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.destinationsBangkok);
    ReusableMethods.bekle(2);



    userHomePage.destinationsBuenosAires.click();



    softAssert.assertTrue(userHomePage.buenosAiresYazisi.isDisplayed(),"Destinations'a tiklayinca acilan sayfada Buenos Aires yazisi gorunur olmali");

    softAssert.assertAll();



    Driver.quitDriver();
  }

  @Test
  public void destinationsMarrakeshAktifMi(){

    JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.destinationsBangkok);
    ReusableMethods.bekle(2);



    userHomePage.destinationsMarrakesh.click();



    softAssert.assertTrue(userHomePage.marrakeshYazisi.isDisplayed(),"Destinations'a tiklayinca acilan sayfada Marrakesh yazisi gorunur olmali");

    softAssert.assertAll();



    Driver.quitDriver();
  }

  @Test
  public void destinationsSalinaIslandAktifMi(){

    JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.destinationsBangkok);
    ReusableMethods.bekle(2);



    userHomePage.destinationsSalinaIsland.click();



    softAssert.assertTrue(userHomePage.salinaYazisi.isDisplayed(),"Destinations'a tiklayinca acilan sayfada Salina yazisi gorunur olmali");

    softAssert.assertAll();



    Driver.quitDriver();
  }
  @Test
  public void destinationsIstanbulAktifMi(){

    JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.destinationsBangkok);
    ReusableMethods.bekle(2);



    userHomePage.destinationsIstanbul.click();



    softAssert.assertTrue(userHomePage.istanbulYazisi.isDisplayed(),"Destinations'a tiklayinca acilan sayfada Istanbul yazisi gorunur olmali");

    softAssert.assertAll();



    Driver.quitDriver();
  }

  @Test
  public void destinationsCaliforniaAktifMi(){

    JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.destinationsCalifornia);
    ReusableMethods.bekle(2);



    userHomePage.destinationsCalifornia.click();



    softAssert.assertTrue(userHomePage.californiaYazisi.isDisplayed(),"Destinations'a tiklayinca acilan sayfada California yazisi gorunur olmali");

    softAssert.assertAll();



    Driver.quitDriver();
  }

  @Test
  public void destinationsGoztepeAktifMi(){

    JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.destinationsCalifornia);
    ReusableMethods.bekle(2);



    userHomePage.destinationsGoztepe.click();



    softAssert.assertTrue(userHomePage.goztepeYazisi.isDisplayed(),"Destinations'a tiklayinca acilan sayfada Goztepe yazisi gorunur olmali");

    softAssert.assertAll();



    Driver.quitDriver();
  }








}
