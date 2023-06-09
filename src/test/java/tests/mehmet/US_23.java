package tests.mehmet;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UserDashboard;
import pages.UserHomePage;
import utilities.*;


public class US_23  extends SelcukTestBaseRapor {

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

        extentTest = extentReports.createTest("Login ve Logout olma testi",
                "Kullanici sirasiyla Login ve Logout olur");

       userHomePage.userHompageSagUstLoginButton.click();

        extentTest.info("Kullanici Login bolumune tiklar.");

        JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.homePageLoginEmail);
        ReusableMethods.bekle(2);

        WebElement emailKutusu= userHomePage.homePageLoginEmail;

        emailKutusu.sendKeys("mehmetsp5800@gmail.com");

        extentTest.info("Kullanici e-mail bolumune kendi e-mailini yazar. ");

        WebElement passwordKutusu=userHomePage.loginPasswordTextBox;

        passwordKutusu.sendKeys("123456@@@@@@");

        extentTest.info("Kullanici password bolumune kendi passwordunu yazar. ");

        userHomePage.homePageAltLoginButton.click();

        extentTest.info("Kullanici Login tusuna basar. ");

        userDashboard.userLoginDashboardLogoutButton.click();

        extentTest.info("Kullanici acilan sayfada Logout tusuna basar. ");

        Assert.assertTrue(userHomePage.homePageAltLoginButton.isDisplayed());

        extentTest.pass("Login ve Logout bolumleri kontrol testi.");

        Driver.quitDriver();


    }
}




