/*package tests.mehmet;

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

    private SoftAssert softAssert = new SoftAssert();

    @BeforeTest
    public void setup(){



        Driver.getDriver().get(ConfigReader.getProperty("trpURL"));


        UserDashboard userDashboard = new UserDashboard();
        userDashboard.tripandwayCookies.click();


    }

    @Test
    public void LogInVelogOutOlma(){

       userHomePage.homePageLoginButton.click();
        JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.emailAdressKutusu);
        ReusableMethods.bekle(2);

        WebElement emailKutusu= userHomePage.emailAdressKutusu;

        emailKutusu.sendKeys("mehmetsp5800@gmail.com");

        WebElement passwordKutusu=userHomePage.passwordKutusu;

        passwordKutusu.sendKeys("123456@@@@@@");

        userHomePage.loginolmaTusu.click();

        userHomePage.logoutTusu.click();

        Assert.assertTrue(userHomePage.loginolmaTusu.isDisplayed());

        Driver.quitDriver();


    }
}

 */


