package tests.meryem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UserDashboard;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_02 extends TestBaseRapor {
    UserHomePage userHomePage=new UserHomePage();
    UserDashboard userDashboard=new UserDashboard();
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void HomepagesTesti() throws InterruptedException {

        extentTest = extentReports.createTest("tripandway Homepages  Testi");

        //1- Kullanıcı https://qa.tripandway.com/ ana sayfasına gider

        Driver.getDriver().get(ConfigReader.getProperty("trpURL"));
        extentTest.info("Kullanıcı Tripandway anasayfaya gider ");

        // cookies kabul edilir ve tıklanır
        WebElement accept = Driver.getDriver().findElement(By.xpath("//button[@type='button']"));
        accept.click();
        extentTest.info("Kullanıcı cookiesi kabul eder");


        // İlgili sitenin Home Page bölümündeki header kısmina gelinir
        // Header bölümünde bulunan menuleri göruntülenir
        // Bu menülerin görünür ve aktif olduğu sayfalar arası geçiş yapılarak test edilir
        extentTest.info("Kullanıcı Tripandway sitesinin Homepage bolumunde bulunan " +
                "Header kısmındaki Menuleri goruntuler");
        extentTest.info("Header bölümünde ki sayfaların aktıf oldugunu gecis testi ıle test eder ");

        userHomePage.homePageHomeButton.click();
        softAssert.assertTrue(userHomePage.homePageHomeButton.isDisplayed());
         extentTest.info("HomePage sayfası görüntülenip tıklanır");

        userHomePage.homePageServicesButton.click();
        softAssert.assertTrue(userHomePage.homePageHomeButton.isDisplayed());
        extentTest.info("Services sayfası görüntülenip tıklanır");

        userHomePage.homePageDestinationsButton.click();
        softAssert.assertTrue(userHomePage.homePageHomeButton.isDisplayed());
        extentTest.info("Destinations sayfası görüntülenip tıklanır");

        userHomePage.homePagePackagesButton.click();
        softAssert.assertTrue(userHomePage.homePageHomeButton.isDisplayed());
        extentTest.info("Packages sayfası görüntülenip tıklanır");

        userHomePage.homePageAboutUsButton.click();
        softAssert.assertTrue(userHomePage.homePageHomeButton.isDisplayed());
        extentTest.info("AboutUs sayfası görüntülenip tıklanır");

        userHomePage.homePageFaqButton.click();
        softAssert.assertTrue(userHomePage.homePageHomeButton.isDisplayed());
        extentTest.info("FAQ sayfası görüntülenip tıklanır");

        userHomePage.homePageBlogButton.click();
        softAssert.assertTrue(userHomePage.homePageHomeButton.isDisplayed());
        extentTest.info("Blog sayfası görüntülenip tıklanır");

        userHomePage.homePageContactButton.click();
        softAssert.assertTrue(userHomePage.homePageHomeButton.isDisplayed());
        extentTest.info("Contact sayfası görüntülenip tıklanır");

        extentTest.info("sayfa 2 sanıye bekletılıp kapatılır");
         Thread.sleep(2);
        Driver.closeDriver();


    }

}
