package tests.ercan;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UserDashboard;
import pages.UserHomePage;
import utilities.*;

public class US_03 extends TestBaseRapor {

    private UserHomePage userHomePage = new UserHomePage();
    private SoftAssert softAssert = new SoftAssert();

    @BeforeMethod
    public void setUp() {
        Driver.getDriver().get(ConfigReader.getProperty("trpURL"));
        ReusableMethods.bekle(2);

        Driver.getDriver().manage().window().maximize();

        UserDashboard userDashboard = new UserDashboard();
        userDashboard.tripandwayCookies.click();

    }

    @AfterMethod
    public void teardown() {
        Driver.quitDriver();
    }

    @Test

    public void ourServiceBolumElementlerininGorunurlugu() {

        JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.ourServiceaheadLIneText);
        ReusableMethods.bekle(2);


        Assert.assertTrue(userHomePage.internationalTourButton.isDisplayed());
        Assert.assertTrue(userHomePage.adventureTourButton.isDisplayed());
        Assert.assertTrue(userHomePage.cultureTourButton.isDisplayed());
        Assert.assertTrue(userHomePage.bussinessTourHomePage.isDisplayed());
        Assert.assertTrue(userHomePage.healthTourHomePage.isDisplayed());
        Assert.assertTrue(userHomePage.religiousTour.isDisplayed());
    }

    @Test

    public void ourServiceBolumElementlerininErsilebilirligi() {

        JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.ourServiceaheadLIneText);
        ReusableMethods.bekle(2);


        Assert.assertTrue(userHomePage.internationalTourButton.isEnabled());
        Assert.assertTrue(userHomePage.adventureTourButton.isEnabled());
        Assert.assertTrue(userHomePage.cultureTourButton.isEnabled());
        Assert.assertTrue(userHomePage.bussinessTourHomePage.isEnabled());
        Assert.assertTrue(userHomePage.healthTourHomePage.isEnabled());
        Assert.assertTrue(userHomePage.religiousTour.isEnabled());
    }

    @Test

    public void futurePackageGorunurlulugu() {
        JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.featuredPackageHeadText);
        ReusableMethods.bekle(2);

        Assert.assertTrue(userHomePage.featuredPackageHeadText.isDisplayed());
    }

    @Test

    public void destinationElementlerinGorunurlulugu() {
        JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.destinationHeadText);
        ReusableMethods.bekle(5);

        Assert.assertTrue(userHomePage.marrakeshMoroccoHomePage.isDisplayed());
        Assert.assertTrue(userHomePage.salinaIslandHomePage.isDisplayed());
        Assert.assertTrue(userHomePage.istanbulTurkeyHomePage.isDisplayed());
        Assert.assertTrue(userHomePage.greenvilleCarolinaHomePage.isDisplayed());
        Assert.assertTrue(userHomePage.bangkokThailandHomePage.isDisplayed());
        Assert.assertTrue(userHomePage.buenosArgentinaHomePage.isDisplayed());

    }
    @Test

    public void destinationElementlerinErisebilirligi() {
        JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.destinationHeadText);
        ReusableMethods.bekle(5);

        Assert.assertTrue(userHomePage.marrakeshMoroccoHomePage.isEnabled());
        Assert.assertTrue(userHomePage.salinaIslandHomePage.isEnabled());
        Assert.assertTrue(userHomePage.istanbulTurkeyHomePage.isEnabled());
        Assert.assertTrue(userHomePage.greenvilleCarolinaHomePage.isEnabled());
        Assert.assertTrue(userHomePage.bangkokThailandHomePage.isEnabled());
        Assert.assertTrue(userHomePage.buenosArgentinaHomePage.isEnabled());
        Assert.assertTrue(userHomePage.seeAllDestinationButton.isEnabled());
    }

    @Test

    public void teamMembersGorunurlulugu() {

        JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.teamMembersHeadText);
        ReusableMethods.bekle(2);



        Assert.assertTrue(userHomePage.teamMembersAvery.isDisplayed());
        Assert.assertTrue(userHomePage.teamMembersJaxon.isDisplayed());
        Assert.assertTrue(userHomePage.teamMembersKnox.isDisplayed());
        Assert.assertTrue(userHomePage.teamMembersZara.isDisplayed());


    }

    @Test

    public void teamMembersEriselebilirligi() {

        JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.teamMembersHeadText);
        ReusableMethods.bekle(2);



        Assert.assertTrue(userHomePage.teamMembersAvery.isEnabled());
        Assert.assertTrue(userHomePage.teamMembersJaxon.isEnabled());
        Assert.assertTrue(userHomePage.teamMembersKnox.isEnabled());
        Assert.assertTrue(userHomePage.teamMembersZara.isEnabled());
        Assert.assertTrue(userHomePage.facebookLogoHomePage.isEnabled());
        Assert.assertTrue(userHomePage.twitterLogoHomePage.isEnabled());
        Assert.assertTrue(userHomePage.linkedInLogoHomePage.isEnabled());


    }

   @Test

 public void testimonialGorunurlulugu() {
       JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.testimonialHeadText);
         ReusableMethods.bekle(5);



     //userHomePage.testimonialJessicaButton.click();
    Assert.assertTrue(userHomePage.testimonialJessica.isDisplayed());
    userHomePage.testimonialDadivButton.click();
    Assert.assertTrue(userHomePage.testimonialDadiv.isDisplayed());
    userHomePage.testimonialJeohansonButton.click();
    Assert.assertTrue(userHomePage.testimonialJohanson.isDisplayed());
    userHomePage.testimonialStefenButton.click();
    Assert.assertTrue(userHomePage.testimonialStefen.isDisplayed());

    }

    @Test

    public void latestBlogGorunurlugu_aktifligi(){
        JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.latestBlogHeadText);
        ReusableMethods.bekle(5);

        Assert.assertTrue(userHomePage.latestBlogSatirLocate.isDisplayed());
        Assert.assertTrue(userHomePage.latestBlogSatirLocate.isEnabled());

    }


    @Test

    public void ourClientGorrunurlulugu(){
        JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.ourClientYazisi);
        ReusableMethods.bekle(2);

        Assert.assertTrue(userHomePage.ourClientYazisi.isDisplayed());
    }

   @Test

    public void newsletterGorunurluluk_aktiflik(){
       JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.newsletterYazisiHomePage);
       ReusableMethods.bekle(2);
        Assert.assertTrue(userHomePage.newsletterYazisiHomePage.isDisplayed());

       userHomePage.newsletterAramaKutusu.sendKeys(ConfigReader.getProperty("adminEmail_02"));
       userHomePage.newsletterSubmit.click();
       Assert.assertTrue(userHomePage.newsletteeAlreadyExistYAzisi.isEnabled());


   }


}