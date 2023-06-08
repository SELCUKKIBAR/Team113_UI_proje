package tests.ercan;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UserDashboard;
import pages.UserHomePage;
import utilities.*;

public class US_15 extends TestBaseRapor {


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

    @Test

    private void aboutUsTest(){

        extentTest = extentReports.createTest("About US Elementinin aktifligi testi","" +
                "Kullanici acilan sayfanin Header bolumunde yer alan About us sekmesine tiklar ve acilan sayfayida " +
                "our mission ve our vission textlerinin  actual ve expected degerlerini test eder");

        userHomePage.homePageAboutUsButton.click();

        String actualResult = userHomePage.homePageAboutUsButtonOurMissionText.getText();
        String expectedResult = "OUR MISSION";

        softAssert.assertEquals(actualResult,expectedResult);

        JSUtilities.scrollToElement(Driver.getDriver(),userHomePage.homePageAboutUsButtonOurVissionText);

         actualResult =userHomePage.homePageAboutUsButtonOurVissionText.getText();
         expectedResult = "OUR VISION";

         softAssert.assertEquals(actualResult,expectedResult);



    }

}
