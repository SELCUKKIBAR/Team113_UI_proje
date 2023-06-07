package tests.ercan;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UserDashboard;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_21 extends TestBaseRapor {


    private UserHomePage userHomePage = new UserHomePage();

    private  UserDashboard userDashboard = new UserDashboard();

    private SoftAssert softAssert = new SoftAssert();

    @BeforeMethod
    public void setUp() {
        Driver.getDriver().get(ConfigReader.getProperty("trpURL"));
        ReusableMethods.bekle(5);

        Driver.getDriver().manage().window().maximize();

        UserDashboard userDashboard = new UserDashboard();
        userDashboard.tripandwayCookies.click();

    }


    @Test

    public void paymentHistoryTest(){

        userHomePage.homePageLoginButton.click();
        userHomePage.homePageLoginEmail.sendKeys(ConfigReader.getProperty("adminEmail_01"));
        userHomePage.homePageLoginPassword.sendKeys(ConfigReader.getProperty("adminPassword_02Login") + Keys.ENTER);
        userDashboard.userLoginDashboardPaymentHistoryButton.click();

        String actualResult = userDashboard.userLoginDashboardPaymentHistoryAllPeymantsTable.getText();
        String expectedResult = "View All Payments";

        Assert.assertEquals(actualResult,expectedResult);


    }





}
