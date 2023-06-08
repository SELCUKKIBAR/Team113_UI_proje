package tests.mehmet;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UserDashboard;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;



public class US_23 {

    UserHomePage userHomePage = new UserHomePage();
    UserDashboard userDashboard = new UserDashboard();

    private SoftAssert softAssert = new SoftAssert();

    @BeforeTest
    public void setup(){



        Driver.getDriver().get(ConfigReader.getProperty("trpURL"));



        userDashboard.tripandwayCookies.click();


    }

    @Test
    public void LogInVelogOutOlma(){

       userHomePage.userHompageSagUstLoginButton.click();
        JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.homePageLoginEmail);
        ReusableMethods.bekle(2);

        WebElement emailKutusu= userHomePage.homePageLoginEmail;

        emailKutusu.sendKeys("mehmetsp5800@gmail.com");

        WebElement passwordKutusu=userHomePage.loginPasswordTextBox;

        passwordKutusu.sendKeys("123456@@@@@@");

        userHomePage.homePageAltLoginButton.click();

        userDashboard.userLoginDashboardLogoutButton.click();

        Assert.assertTrue(userHomePage.homePageAltLoginButton.isDisplayed());

        Driver.quitDriver();


    }
}




