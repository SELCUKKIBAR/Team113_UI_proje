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


    UserDashboard userDashboard = new UserDashboard();
    userDashboard.tripandwayCookies.click();


  }



    @Test
    public void destinationsGorunurMu(){



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

    Assert.assertTrue(userHomePage.bangkokYazisi.isDisplayed());

    Driver.closeDriver();

  }
  @Test
  public void destinationsGreenvilleAktifMi() {

    JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.destinationsBangkok);
    ReusableMethods.bekle(2);


    userHomePage.destinationsGreenville.click();

    Assert.assertTrue(userHomePage.greenvilleYazisi.isDisplayed());

    Driver.closeDriver();

  }@Test
  public void destinationsBuenosAiresAktifMi (){

    JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.destinationsBangkok);
    ReusableMethods.bekle(2);

    userHomePage.destinationsBuenosAires.click();

    Assert.assertTrue(userHomePage.buenosAiresYazisi.isDisplayed());

    Driver.closeDriver();
  }

  @Test
  public void destinationsMarrakeshAktifMi(){

    JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.destinationsBangkok);
    ReusableMethods.bekle(2);



    userHomePage.destinationsMarrakesh.click();


    Assert.assertTrue(userHomePage.marrakeshYazisi.isDisplayed());


    Driver.closeDriver();
  }

  @Test
  public void destinationsSalinaIslandAktifMi(){

    JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.destinationsBangkok);
    ReusableMethods.bekle(2);



    userHomePage.destinationsSalinaIsland.click();

    Assert.assertTrue(userHomePage.salinaYazisi.isDisplayed());

   Driver.closeDriver();

  }
  @Test
  public void destinationsIstanbulAktifMi(){

    JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.destinationsBangkok);
    ReusableMethods.bekle(2);



    userHomePage.destinationsIstanbul.click();



  Assert.assertTrue(userHomePage.istanbulYazisi.isDisplayed());


  Driver.closeDriver();

  }

  @Test
  public void destinationsCaliforniaAktifMi(){

    JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.destinationsCalifornia);
    ReusableMethods.bekle(2);



    userHomePage.destinationsCalifornia.click();



 Assert.assertTrue(userHomePage.californiaYazisi.isDisplayed());


 Driver.closeDriver();

  }

  @Test
  public void destinationsGoztepeAktifMi(){

    JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.destinationsCalifornia);
    ReusableMethods.bekle(2);

    userHomePage.destinationsGoztepe.click();

    Assert.assertTrue(userHomePage.goztepeYazisi.isDisplayed());

    Driver.closeDriver();
  }

}
