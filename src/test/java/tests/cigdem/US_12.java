package tests.cigdem;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UserDashboard;
import pages.UserHomePage;
import utilities.*;

public class US_12 extends TestBaseRapor {


    private SoftAssert softAssert = new SoftAssert();



    @Test
    public void servicesInternationalTourDogrulama() {

        extentTest = extentReports.createTest("Tripandway SERVICES testi",
                "Kullanici açılan sayfada 'INTERNATIONAL TOUR' yazinin görunur oldugunu test eder");


        //  1-Kullanıcı https://qa.tripandway.com/ sayfasına gider

        Driver.getDriver().get(ConfigReader.getProperty("trpURL"));
        extentTest.info("Kullanici Tripandway anasayfaya gider...");

        // 2-User Home Page de cikan Cookies 'i kabul eder

        UserDashboard userDashboard = new UserDashboard();
        extentTest.info("Cookies kabul edilir");
        userDashboard.tripandwayCookies.click();

        // 3-Kullanici Header bölümünde bulunan SERVICES  menüsüne tıklayarak sayfaya gider.

        UserHomePage userHomePage = new UserHomePage();
        userHomePage.homePageServicesButton.click();
        extentTest.info("Kullanici header bölumunde SERVICES menusune gider...");
        ReusableMethods.bekle(1);

        softAssert.assertTrue(userHomePage.internationalTourButton.isDisplayed(),"International Tour elementi görunur olmalidir");
        extentTest.info("Services sayfasinda international tour butonun gorundugunu test eder...");

        // 4-Kullanici acilan sayfada "International Tour’u" tıklar

        userHomePage.internationalTourButton.click();
        extentTest.info("Kullanici International Tour butonuna tıklar...");
        ReusableMethods.bekle(1);

        // 5-Kullanıcı title'i INTERNATIONAL TOUR olan sayfaya basariyla giris yapıldığını test eder

        softAssert.assertTrue(userHomePage.InternationalTourButtonTitleDogrulama.isDisplayed(),"INTERNATIONAL TOUR yazisi olmalidir");
        extentTest.info("'International tour sayfasinda 'INTERNATIONAL TOUR' yazisinin gorundugunu test eder...");

        softAssert.assertAll();
        extentTest.pass("Soft assert ile yapilan tum testlerin sonucunu raporlar...");

        Driver.quitDriver();
        extentTest.info("Sayfayi kapatir");

    }


    @Test
    public void servicesAdventureTourDogrulama() {

        extentTest = extentReports.createTest("Tripandway SERVICES testi",
                "Kullanici açılan sayfada 'ADVENTURE TOUR' yazinin görunur oldugunu test eder");


        //  1-Kullanıcı https://qa.tripandway.com/ sayfasına gider

        Driver.getDriver().get(ConfigReader.getProperty("trpURL"));
        extentTest.info("Kullanici Tripandway anasayfaya gider...");

        // 2-User Home Page de cikan Cookies 'i kabul eder

        UserDashboard userDashboard = new UserDashboard();
        extentTest.info("Cookies kabul edilir");
        userDashboard.tripandwayCookies.click();

        // 3-Kullanici Header bölümünde bulunan SERVICES  menüsüne tıklayarak sayfaya gider.

        UserHomePage userHomePage = new UserHomePage();
        userHomePage.homePageServicesButton.click();
        extentTest.info("Kullanici header bölumunde SERVICES menusune gider...");
        ReusableMethods.bekle(1);

        softAssert.assertTrue(userHomePage.adventureTourButton.isDisplayed(),"Adventure Tour elementi görunur olmalidir");
        extentTest.info("Services sayfasinda adventure tour butonun gorundugunu test eder...");
        //  4-Kullanici acilan sayfada "ADVENTURE TOUR’u" tıklar

        userHomePage.adventureTourButton.click();
        extentTest.info("Kullanici ADVENTURE TOUR butonuna tıklar...");
        ReusableMethods.bekle(1);

        //  5-Kullanıcı title'i ADVENTURE TOUR olan sayfaya basariyla giris yapıldığını test eder

        softAssert.assertTrue(userHomePage.adventureTourButtonTitleDogrulama.isDisplayed(),"ADVENTURE TOUR yazisi olmalidir");
        extentTest.info("'Adventure tour sayfasinda 'ADVENTURE TOUR' yazisinin gorundugunu test eder...");

        softAssert.assertAll();
        extentTest.pass("Soft assert ile yapilan tum testlerin sonucunu raporlar...");

        Driver.quitDriver();
        extentTest.info("Sayfayi kapatir");

    }

    @Test
    public void servicesCultureTourDogrulama() {

        extentTest = extentReports.createTest("Tripandway SERVICES testi",
                "Kullanici açılan sayfada 'CULTURE TOUR' yazinin görunur oldugunu test eder");

        //  1-Kullanıcı https://qa.tripandway.com/ sayfasına gider

        Driver.getDriver().get(ConfigReader.getProperty("trpURL"));
        extentTest.info("Kullanici Tripandway anasayfaya gider...");

        // 2-User Home Page de cikan Cookies 'i kabul eder

        UserDashboard userDashboard = new UserDashboard();
        extentTest.info("Cookies kabul edilir");
        userDashboard.tripandwayCookies.click();

        //  3-Kullanici Header bölümünde bulunan SERVICES  menüsüne tıklayarak sayfaya gider.

        UserHomePage userHomePage = new UserHomePage();
        userHomePage.homePageServicesButton.click();
        extentTest.info("Kullanici header bölumunde SERVICES menusune gider...");
        ReusableMethods.bekle(1);

        softAssert.assertTrue(userHomePage.cultureTourButton.isDisplayed(),"Culture Tour elementi görunur olmalidir");
        extentTest.info("Services sayfasinda culture tour butonun gorundugunu test eder...");
        //  4-Kullanici acilan sayfada "CULTURE TOUR’u" tıklar

        userHomePage.cultureTourButton.click();
        extentTest.info("Kullanici CULTURE TOUR butonuna tıklar...");
        ReusableMethods.bekle(1);

        //  5-Kullanıcı title'i CULTURE TOUR olan sayfaya basariyla giris yapıldığını test eder


        softAssert.assertTrue(userHomePage.cultureTourButtonTitledogrulama.isDisplayed(),"CULTURE TOUR yazisi olmalidir");
        extentTest.info("'Culture tour sayfasinda 'CULTURE TOUR' yazisinin gorundugunu test eder...");

        softAssert.assertAll();
        extentTest.pass("Soft assert ile yapilan tum testlerin sonucunu raporlar...");

        Driver.quitDriver();
        extentTest.info("Sayfayi kapatir");

    }

    @Test
    public void servicesBussinessTourDogrulama() {

        extentTest = extentReports.createTest("Tripandway SERVICES testi",
                "Kullanici açılan sayfada 'BUSINESS TOUR' yazinin görunur oldugunu test eder");

        //  1-Kullanıcı https://qa.tripandway.com/ sayfasına gider

        Driver.getDriver().get(ConfigReader.getProperty("trpURL"));
        extentTest.info("Kullanici Tripandway anasayfaya gider...");

        // 2-User Home Page de cikan Cookies 'i kabul eder

        UserDashboard userDashboard = new UserDashboard();
        extentTest.info("Cookies kabul edilir");
        userDashboard.tripandwayCookies.click();

        //  3-Kullanici Header bölümünde bulunan SERVICES  menüsüne tıklayarak sayfaya gider.

        UserHomePage userHomePage = new UserHomePage();
        userHomePage.homePageServicesButton.click();
        extentTest.info("Kullanici header bölumunde SERVICES menusune gider...");
        ReusableMethods.bekle(1);

        // 4-SERVICES sayfasindaki  Bussiness Tour elementine kadar iner

        JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.cultureTourButton);
        extentTest.info("Culture Tour elementine kadar scroll yapar");
        ReusableMethods.bekle(3);

        softAssert.assertTrue(userHomePage.bussinessTourHomePage.isDisplayed(),"Business Tour elementi görunur olmalidir");
        extentTest.info("Services sayfasinda business tour butonun gorundugunu test eder...");
        //  5-Kullanici acilan sayfada "BUSSINESS TOUR’u" tıklar

        userHomePage.bussinessTourHomePage.click();
        extentTest.info("Kullanici BUSSINESS TOUR butonuna tıklar...");
        ReusableMethods.bekle(1);

        //  6-Kullanıcı title'i BUSSINESS TOUR olan sayfaya basariyla giris yapıldığını test eder

        softAssert.assertTrue(userHomePage.bussinessTourBottomTitleDogrulama.isDisplayed(),"BUSINESS TOUR yazisi olmalidir");
        extentTest.info("'Business tour sayfasinda 'BUSINESS TOUR' yazisinin gorundugunu test eder...");

        softAssert.assertAll();
        extentTest.pass("Soft assert ile yapilan tum testlerin sonucunu raporlar...");

        Driver.quitDriver();
        extentTest.info("Sayfayi kapatir");

    }

    @Test
    public void servicesHealthTourDogrulama() {

        extentTest = extentReports.createTest("Tripandway SERVICES testi",
                "Kullanici açılan sayfada 'HEALTH TOUR' yazinin görunur oldugunu test eder");


        // 1-Kullanıcı https://qa.tripandway.com/ sayfasına gider

        Driver.getDriver().get(ConfigReader.getProperty("trpURL"));
        extentTest.info("Kullanici Tripandway anasayfaya gider...");

        // 2-User Home Page de cikan Cookies 'i kabul eder

        UserDashboard userDashboard = new UserDashboard();
        extentTest.info("Cookies kabul edilir");
        userDashboard.tripandwayCookies.click();

        // 3-Kullanici Header bölümünde bulunan SERVICES  menüsüne tıklayarak sayfaya gider.

        UserHomePage userHomePage = new UserHomePage();
        userHomePage.homePageServicesButton.click();
        extentTest.info("Kullanici header bölumunde SERVICES menusune gider...");
        ReusableMethods.bekle(1);

        // 4-SERVICES sayfasindaki  Health Tour elementine kadar iner

        JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.adventureTourButton);
        extentTest.info("Health Tour elementine kadar scroll yapar");
        ReusableMethods.bekle(3);

        softAssert.assertTrue(userHomePage.healthTourHomePage.isDisplayed(),"Health Tour elementi görunur olmalidir");
        extentTest.info("Services sayfasinda health tour butonun gorundugunu test eder...");

        // 5-Kullanici acilan sayfada "HEALTH TOUR’u" tıklar

        userHomePage.healthTourHomePage.click();
        extentTest.info("Kullanici HEALTH TOUR butonuna tıklar...");
        ReusableMethods.bekle(1);

        // 6-Kullanıcı title'i HEALTH TOUR olan sayfaya basariyla giris yapıldığını test eder

        softAssert.assertTrue(userHomePage.healthTourBottonTitleDogrulama.isDisplayed(),"HEALTH TOUR yazisi olmalidir");
        extentTest.info("'Health tour sayfasinda 'HEALTH TOUR' yazisinin gorundugunu test eder...");

        softAssert.assertAll();
        extentTest.pass("Soft assert ile yapilan tum testlerin sonucunu raporlar...");

        Driver.quitDriver();
        extentTest.info("Sayfayi kapatir");

    }

    @Test
    public void servicesReligiousTourDogrulama() {

        extentTest = extentReports.createTest("Tripandway SERVICES testi",
                "Kullanici açılan sayfada 'RELIGIOUS TOUR' yazinin görunur oldugunu test eder");


        //  1-Kullanıcı https://qa.tripandway.com/ sayfasına gider

        Driver.getDriver().get(ConfigReader.getProperty("trpURL"));
        extentTest.info("Kullanici Tripandway anasayfaya gider...");


        // 2-User Home Page de cikan Cookies 'i kabul eder

        UserDashboard userDashboard = new UserDashboard();
        extentTest.info("Cookies kabul edilir");
        userDashboard.tripandwayCookies.click();

        // 3-Kullanici Header bölümünde bulunan SERVICES  menüsüne tıklayarak sayfaya gider.

        UserHomePage userHomePage = new UserHomePage();
        userHomePage.homePageServicesButton.click();
        extentTest.info("Kullanici header bölumunde SERVICES menusune gider...");
        ReusableMethods.bekle(1);

        // 4-SERVICES sayfasindaki  Adventure Tour elementine kadar iner

        JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.adventureTourButton);
        extentTest.info("Health Tour elementine kadar scroll yapar");
        ReusableMethods.bekle(3);

        softAssert.assertTrue(userHomePage.religiousTour.isDisplayed(),"Religious Tour elementi görunur olmalidir");
        extentTest.info("Services sayfasinda religious tour butonun gorundugunu test eder...");

        // 5-Kullanici acilan sayfada "RELIGIOUS TOUR’u" tıklar

        userHomePage.religiousTour.click();
        extentTest.info("Kullanici RELIGIOUS TOUR butonuna tıklar...");
        ReusableMethods.bekle(1);

        // 6-Kullanıcı title'i RELIGIOUS TOUR olan sayfaya basariyla giris yapıldığını test eder

        softAssert.assertTrue(userHomePage.religiousTourBottonTitleDogrulama.isDisplayed(),"RELIGIOUS TOUR yazisi olmalidir");
        extentTest.info("'Religious tour sayfasinda 'RELIGIOUS TOUR' yazisinin gorundugunu test eder...");

        softAssert.assertAll();
        extentTest.pass("Soft assert ile yapilan tum testlerin sonucunu raporlar...");

        Driver.quitDriver();
        extentTest.info("Sayfayi kapatir");

    }

}



