package tests.ercan;

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

        extentTest = extentReports.createTest("Our Service Bolum Elementlerininin Gorunurlulugu testi","" +
                "Kullanici acilan sayfanin body bolumunde yer alan Our Service sekmelerinin gornurlulugunu test eder");

        JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.ourServiceaheadLIneText);
        ReusableMethods.bekle(2);


        softAssert.assertTrue(userHomePage.internationalTourButton.isDisplayed());
        softAssert.assertTrue(userHomePage.adventureTourButton.isDisplayed());
        softAssert.assertTrue(userHomePage.cultureTourButton.isDisplayed());
        softAssert.assertTrue(userHomePage.bussinessTourHomePage.isDisplayed());
        softAssert.assertTrue(userHomePage.healthTourHomePage.isDisplayed());
        softAssert.assertTrue(userHomePage.religiousTour.isDisplayed());
    }

    @Test

    public void ourServiceBolumElementlerininErsilebilirligi() {

        extentTest = extentReports.createTest("Our Service Bolum Elementlerininin Erisilebilirligini testi","" +
                "Kullanici acilan sayfanin body bolumunde yer alan Our Service sekmelerinin erisilebilirligini test eder");

        JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.ourServiceaheadLIneText);
        ReusableMethods.bekle(2);


        softAssert.assertTrue(userHomePage.internationalTourButton.isEnabled());
        softAssert.assertTrue(userHomePage.adventureTourButton.isEnabled());
        softAssert.assertTrue(userHomePage.cultureTourButton.isEnabled());
        softAssert.assertTrue(userHomePage.bussinessTourHomePage.isEnabled());
        softAssert.assertTrue(userHomePage.healthTourHomePage.isEnabled());
        softAssert.assertTrue(userHomePage.religiousTour.isEnabled());
    }

    @Test

    public void futurePackageGorunurlulugu() {

        extentTest = extentReports.createTest("Future Package Bolum Elementlerininin Gorunurlulugu testi","" +
                "Kullanici acilan sayfanin body bolumunde yer alan Future Package sekmelerinin gornurlulugunu test eder");
        JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.featuredPackageHeadText);
        ReusableMethods.bekle(2);

        softAssert.assertTrue(userHomePage.featuredPackageHeadText.isDisplayed());
    }

    @Test

    public void destinationElementlerinGorunurlulugu() {

        extentTest = extentReports.createTest("Destinstion  Bolum Elementlerininin Gorunurlulugu testi","" +
                "Kullanici acilan sayfanin body bolumunde yer alan Destination elementlerinin gornurlulugunu test eder");


        JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.destinationHeadText);
        ReusableMethods.bekle(5);

        softAssert.assertTrue(userHomePage.marrakeshMoroccoHomePage.isDisplayed());
        softAssert.assertTrue(userHomePage.salinaIslandHomePage.isDisplayed());
        softAssert.assertTrue(userHomePage.istanbulTurkeyHomePage.isDisplayed());
        softAssert.assertTrue(userHomePage.greenvilleCarolinaHomePage.isDisplayed());
        softAssert.assertTrue(userHomePage.bangkokThailandHomePage.isDisplayed());
        softAssert.assertTrue(userHomePage.buenosArgentinaHomePage.isDisplayed());

    }
    @Test

    public void destinationElementlerinErisebilirligi() {


        extentTest = extentReports.createTest("Destinstion  Bolum Elementlerininin Erisilebilirligi testi","" +
                "Kullanici acilan sayfanin body bolumunde yer alan Destination sekmelerinin erisilebilirligini test eder");

        JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.destinationHeadText);
        ReusableMethods.bekle(5);

        softAssert.assertTrue(userHomePage.marrakeshMoroccoHomePage.isEnabled());
        softAssert.assertTrue(userHomePage.salinaIslandHomePage.isEnabled());
        softAssert.assertTrue(userHomePage.istanbulTurkeyHomePage.isEnabled());
        softAssert.assertTrue(userHomePage.greenvilleCarolinaHomePage.isEnabled());
        softAssert.assertTrue(userHomePage.bangkokThailandHomePage.isEnabled());
        softAssert.assertTrue(userHomePage.buenosArgentinaHomePage.isEnabled());
        softAssert.assertTrue(userHomePage.seeAllDestinationButton.isEnabled());
    }

    @Test

    public void teamMembersGorunurlulugu() {

        extentTest = extentReports.createTest("Team Members  Bolum Elementlerininin Gorunurlulugu testi","" +
                "Kullanici acilan sayfanin body bolumunde yer alan Team Members elementlerinin gornurlulugunu test eder");

        JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.teamMembersHeadText);
        ReusableMethods.bekle(2);



        softAssert.assertTrue(userHomePage.teamMembersAvery.isDisplayed());
        softAssert.assertTrue(userHomePage.teamMembersJaxon.isDisplayed());
        softAssert.assertTrue(userHomePage.teamMembersKnox.isDisplayed());
        softAssert.assertTrue(userHomePage.teamMembersZara.isDisplayed());


    }

    @Test

    public void teamMembersEriselebilirligi() {


        extentTest = extentReports.createTest("Team Members  Bolum Elementlerininin Erisebilirligi Testi","" +
                "Kullanici acilan sayfanin body bolumunde yer alan Team Members sekmelerinin erisilebilirligi test eder");



        JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.teamMembersHeadText);
        ReusableMethods.bekle(2);



        softAssert.assertTrue(userHomePage.teamMembersAvery.isEnabled());
        softAssert.assertTrue(userHomePage.teamMembersJaxon.isEnabled());
        softAssert.assertTrue(userHomePage.teamMembersKnox.isEnabled());
        softAssert.assertTrue(userHomePage.teamMembersZara.isEnabled());
        softAssert.assertTrue(userHomePage.facebookLogoHomePage.isEnabled());
        softAssert.assertTrue(userHomePage.twitterLogoHomePage.isEnabled());
        softAssert.assertTrue(userHomePage.linkedInLogoHomePage.isEnabled());


    }

   @Test

 public void testimonialGorunurlulugu() {

       extentTest = extentReports.createTest("Testimonial  Bolum Elementlerininin Gorunurlulugu testi","" +
               "Kullanici acilan sayfanin body bolumunde yer alan Testimonial elementlerinin gornurlulugunu test eder");
       JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.testimonialHeadText);
         ReusableMethods.bekle(5);



     //userHomePage.testimonialJessicaButton.click();
    softAssert.assertTrue(userHomePage.testimonialJessica.isDisplayed());

    softAssert.assertTrue(userHomePage.testimonialDadiv.isDisplayed());

    softAssert.assertTrue(userHomePage.testimonialJohanson.isDisplayed());

    softAssert.assertTrue(userHomePage.testimonialStefen.isDisplayed());

    }

    @Test

    public void testimonialErisilebilirligi() {

        extentTest = extentReports.createTest("Testimonial  Bolum Elementlerininin Gorunurlulugu testi","" +
                "Kullanici acilan sayfanin body bolumunde yer alan Testimonial sekmelerinin erisilebilirligini test eder");
        JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.testimonialHeadText);
        ReusableMethods.bekle(5);



        softAssert.assertTrue(userHomePage.testimonialJessicaButton.isEnabled());

        softAssert.assertTrue(userHomePage.testimonialDadivButton.isEnabled());

        softAssert.assertTrue(userHomePage.testimonialJeohansonButton.isEnabled());

        softAssert.assertTrue(userHomePage.testimonialStefenButton.isEnabled());


    }

    @Test

    public void latestBlogGorunurlugu_aktifligi(){

        extentTest = extentReports.createTest("Latest Blog  Bolum Elementlerininin Gorunurlulugu ve aktifligi testi","" +
                "Kullanici acilan sayfanin body bolumunde yer alan Latest Blog sekmelerinin gorunululurlugu ve erisilebilirligini test eder");

        JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.latestBlogHeadText);
        ReusableMethods.bekle(5);

        softAssert.assertTrue(userHomePage.latestBlogSatirLocate.isDisplayed());
        softAssert.assertTrue(userHomePage.latestBlogSatirLocate.isEnabled());

    }


    @Test

    public void ourClientGorrunurlulugu(){

        extentTest = extentReports.createTest("Our Client  Bolum Elementlerininin Gorunurlulugu testi","" +
                "Kullanici acilan sayfanin body bolumunde yer alan OUr Client elementlerinin gorunululurgunu test eder");

        JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.ourClientYazisi);
        ReusableMethods.bekle(2);

        softAssert.assertTrue(userHomePage.ourClientYazisi.isDisplayed());
    }

   @Test

    public void newsletterGorunurluluk_aktiflik(){

       extentTest = extentReports.createTest("Newsletter   Bolum Elementlerininin Gorunurlulugu ve erisilebilirlik  testi","" +
               "Kullanici acilan sayfanin body bolumunde yer alan newsletter elementlerinin gornurlulugunu  ve erisilebilirligini test eder");

       JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.newsletterYazisiHomePage);
       ReusableMethods.bekle(2);
        softAssert.assertTrue(userHomePage.newsletterYazisiHomePage.isDisplayed());

       userHomePage.newsletterAramaKutusu.sendKeys(ConfigReader.getProperty("adminEmail_02"));
       userHomePage.newsletterSubmit.click();
       softAssert.assertTrue(userHomePage.newsletteeAlreadyExistYAzisi.isEnabled());


   }


}