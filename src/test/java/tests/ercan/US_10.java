package tests.ercan;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UserDashboard;
import pages.UserHomePage;
import utilities.*;

public class US_10 extends TestBaseRapor {

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
    public void TermAndConditionTest(){

        extentTest = extentReports.createTest("Term and Condition Elementinin aktifligi testi","" +
                "Kullanici acilan sayfanin footer bolumunde yer alan term and condition sekmesine tiklar ve acilan sayfayi  test eder");

        JSUtilities.scrollToElement(Driver.getDriver(),userHomePage.termsAndConditions);
        ReusableMethods.bekle(2);
        userHomePage.termsAndConditions.click();

        String actualResult = userHomePage.termsAndConditionsHeadText.getText();
        String expectedResult =  "TERMS AND CONDITIONS";

        softAssert.assertEquals(actualResult,expectedResult);
    }
}