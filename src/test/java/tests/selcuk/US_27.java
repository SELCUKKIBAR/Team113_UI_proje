package tests.selcuk;

import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.SelcukTestBaseRapor;
import utilities.TestBaseRapor;

public class US_27 extends SelcukTestBaseRapor {
    AdminDashboard adminDashboard = new AdminDashboard();
    SoftAssert softAssert = new SoftAssert();


    @Test
    public void adminPanel_giris_dogrulama(){

        extentTest = extentReports.createTest("Admin panelindeki menülerin kontrol testi",
                "Kullanici Admin Panelde sol tarafta bulunan menüleri test eder");
        //TEST CASE 1
        //1- Kullanıcı https://qa.tripandway.com/admin/login sayfasına gider
        Driver.getDriver().get(ConfigReader.getProperty("trpAdminURL"));
        extentTest.info("Kullanici Admin Panel anasayfayasına gider...");


        //2- Kullanıcı Email Adress ve Passwrod kutucuklarına geçerli email ve şifre girer

        adminDashboard.adminDashboardEmailKutusu.sendKeys(ConfigReader.getProperty("adminEmail_01"));
        adminDashboard.adminDashboardPasswordKutusu.sendKeys(ConfigReader.getProperty("adminPassword_01"));
        extentTest.info("Kullanici email ve şifresini girer ve logim olur...");

        //3- Kullanıcı Login Butonuna tıklar
        adminDashboard.adminDashboardLoginButonu.click();
        //4- Kullanıcı sağ üst köşede bulunan admin04 yazsının görürünür olduğunu kontrol ederek Admin panele girdiğini doğrular
        String expectedMesaj = ConfigReader.getProperty("adminKullaniciAdi_1");
        String actualMesaj = adminDashboard.admin04sagustbuton.getText();

        softAssert.assertTrue(actualMesaj.equals(expectedMesaj),"Sağ üst köşedeki admin adı doğru olmalı");


        softAssert.assertAll();
        extentTest.pass("Admin yönetici sayfasındayız...");

    }

    @Test
    public void generalSettingsElementleriGoruntuleme() throws InterruptedException {

        extentTest = extentReports.createTest("Admin panelindeki menülerin kontrol testi",
                "Kullanici Admin Panelde sol tarafta bulunan General Settings menüsünü test eder");

        //TEST CASE 2
        //1- Kullanıcı Sol menüde bulunan "General Settings" e tıklar

        adminDashboard.adminDashboardGeneralSettings.click();
        extentTest.info("Kullanici General Settings'e tıklar...");

        //2- Kullanıcı Logo elementine tıklar ve açılan sayfada "Existing Logo" yazısının göründüğünü doğrular
        adminDashboard.adminDashboardGeneralSettingsLogo.click();
        softAssert.assertTrue(adminDashboard.adminDashboardGeneralSettingsLogoDogrulama.isDisplayed());

        //3- Kullanıcı Favicon elementine tıklar ve açılan sayfada "Existing Favicon" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardGeneralSettingsFavicron.click();
        softAssert.assertTrue(adminDashboard.adminDashboardGeneralSettingsFavicronDogrulama.isDisplayed());

        //4- Kullanıcı Login Background elementine tıklar ve açılan sayfada "Edit Login Background" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardGeneralSettingsBackground.click();
        softAssert.assertTrue(adminDashboard.adminDashboardGeneralSettingsBackgroundDogrulama.isDisplayed());

        //5- Kullanıcı Top Bar elementine tıklar ve açılan sayfada "Edit Top Bar Information" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardGeneralSettingsTopBar.click();
        softAssert.assertTrue(adminDashboard.adminDashboardGeneralSettingsTopBarDogrulama.isDisplayed());

        //6- Kullanıcı Banner elementine tıklar ve açılan sayfada "Edit Banner" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardGeneralSettingsBanner.click();
        softAssert.assertTrue(adminDashboard.adminDashboardGeneralSettingsBannerDogrulama.isDisplayed());

        //7- Kullanıcı Footer elementine tıklar ve açılan sayfada "Edit Footer Information" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardGeneralSettingsFooter.click();
        softAssert.assertTrue(adminDashboard.adminDashboardGeneralSettingsFooterDogrulama.isDisplayed());

        //8- Kulanıcı Sidebar elementine tıklar ve açılan sayfada "Edit Sidebar Information" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardGeneralSettingsSidebar.click();
        softAssert.assertTrue(adminDashboard.adminDashboardGeneralSettingsSidebarDogrulama.isDisplayed());

        //9- Kullanıcı Color elementine tıklar ve açılansayfada "Edit Color Information" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardGeneralSettingsColor.click();
        softAssert.assertTrue(adminDashboard.adminDashboardGeneralSettingsColorDogrulama.isDisplayed());

        //10- Kullanıcı Preloader elementine tıklar ve açılan sayfada "Edit Preloader Information" yazsının görğndüğünü doğrular
        adminDashboard.adminDashboardGeneralSettingsPreloader.click();
        softAssert.assertTrue(adminDashboard.adminDashboardGeneralSettingsPreloaderDogrulama.isDisplayed());

        //11- Kullanıcı Google Analytic elementine tıklar ve açılan sayfada "Edit Google Analytic Setting" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardGeneralSettingsGoogleAnalytic.click();
        softAssert.assertTrue(adminDashboard.adminDashboardGeneralSettingsGoogleAnalyticDogrulama.isDisplayed());

        //12- Kullanıcı Google Recaptcha elementine tıklar ve açılan sayfada "Edit Google Recaptcha Setting" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardGeneralSettingsGoogleRecaptcha.click();
        softAssert.assertTrue(adminDashboard.adminDashboardGeneralSettingsGoogleRecaptchaDogrulama.isDisplayed());

        //13- Kullanıcı Tawk Live Chat elementine tıklar ve açılan sayfada "Edit Tawk Live Chat Setting" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardGeneralSettingsTawkLiveChat.click();
        softAssert.assertTrue(adminDashboard.adminDashboardGeneralSettingsTawkLiveChatDogrulama.isDisplayed());
        //14- Kullanıcı Cookie Consent elementine tıklar ve açılan sayfada "Edit Cookie Consent Setting" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardGeneralSettingsCookieConsent.click();
        softAssert.assertTrue(adminDashboard.adminDashboardGeneralSettingsCookieConsentDogrulama.isDisplayed());

        //15- Kullanıcı Layout elementine tıklar ver açılan sayfada "Edit Layout Information" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardGeneralSettingsLayout.click();
        softAssert.assertTrue(adminDashboard.adminDashboardGeneralSettingsLayoutDogrulama.isDisplayed());
        adminDashboard.adminDashboardGeneralSettings.click();
        extentTest.info("Kullanici General Settings menüsündeki elemanları test etti ve tekrar General Settings'e tıkladı...");
        Thread.sleep(1000);

        softAssert.assertAll();

        extentTest.pass("Page Settings menüsünü test etmeye hazır...");

    }

    @Test
    public void pageSettings_ElementleriniGoruntuleme() throws InterruptedException {

        extentTest = extentReports.createTest("Admin panelindeki menülerin kontrol testi",
                "Kullanici Admin Panelde sol tarafta bulunan Page Settings menüsünü test eder");

        //TEST CASE 3
        //1- Kullanıcı Sol menüde bulunan "Page Settings" e tıklar
        adminDashboard.adminDashboardPageSettingsElementi.click();
        extentTest.info("Kullanici Page Settings'e tıklar...");

        //2- Kullanıcı Home elementine tıklar ve açılan sayfada "Edit Home Page Information" yazısının göründüğünü doğrular
        adminDashboard.adminDashboardPageSettingsHome.click();
        softAssert.assertTrue(adminDashboard.adminDashboardPageSettingsHomeDogrulama.isDisplayed());

        //3- Kullanıcı About elementine tıklar ve açılan sayfada "Edit About Page Information" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardPageSettingsAbout.click();
        softAssert.assertTrue(adminDashboard.adminDashboardPageSettingsAboutDogrulama.isDisplayed());

        //4- Kullanıcı Service elementine tıklar ve açılan sayfada "Edit Service Page Information" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardPageSettingsService.click();
        softAssert.assertTrue(adminDashboard.adminDashboardPageSettingsServiceDogrulama.isDisplayed());

        //5- Kullanıcı Blog elementine tıklar ve açılan sayfada "Edit Blog Page Information" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardPageSettingsBlog.click();
        softAssert.assertTrue(adminDashboard.adminDashboardPageSettingsBlogDogrulama.isDisplayed());

        //6- Kullanıcı FAQ elementine tıklar ve açılan sayfada "Edit FAQ Page Information" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardPageSettingsFAQ.click();
        softAssert.assertTrue(adminDashboard.adminDashboardPageSettingsFAQDogrulama.isDisplayed());

        //7- KullanıcıTeam Member elementine tıklar ve açılan sayfada "Edit Team Member Page Information" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardPageSettingsTeamMember.click();
        softAssert.assertTrue(adminDashboard.adminDashboardPageSettingsTeamMemberDogrulama.isDisplayed());

        //8- KulanıcıTestimonial elementine tıklar ve açılan sayfada "Edit Testimonial Page Information" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardPageSettingsTestimonial.click();
        softAssert.assertTrue(adminDashboard.adminDashboardPageSettingsTestimonialDogrulama.isDisplayed());

        //9- KullanıcıDestination elementine tıklar ve açılansayfada "Edit Destination Page Information" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardPageSettingsDestination.click();
        softAssert.assertTrue(adminDashboard.adminDashboardPageSettingsDestinationDogrulama.isDisplayed());

        //10- Kullanıcı Package elementine tıklar ve açılan sayfada "Edit Package Page Information" yazsının görğndüğünü doğrular
        adminDashboard.adminDashboardPageSettingsPackage.click();
        softAssert.assertTrue(adminDashboard.adminDashboardPageSettingsPackageDogrulama.isDisplayed());

        //11- Kullanıcı Contact elementine tıklar ve açılan sayfada "Edit Contact Page Information" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardPageSettingsContact.click();
        softAssert.assertTrue(adminDashboard.adminDashboardPageSettingsContactDogrulama.isDisplayed());

        //12- Kullanıcı Term elementine tıklar ve açılan sayfada "Edit Term Page Information" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardPageSettingsTerm.click();
        softAssert.assertTrue(adminDashboard.adminDashboardPageSettingsTermDogrulama.isDisplayed());

        //13- Kullanıcı Privacy elementine tıklar ve açılan sayfada "Edit Privacy Page Information" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardPageSettingsPrivacy.click();
        softAssert.assertTrue(adminDashboard.adminDashboardPageSettingsPrivacyDogrulama.isDisplayed());

        //14- Kullanıcı Other elementine tıklar ve açılan sayfada "Edit Other Page Information" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardPageSettingsOther.click();
        softAssert.assertTrue(adminDashboard.adminDashboardPageSettingsOtherDogrulama.isDisplayed());
        Thread.sleep(1000);
        adminDashboard.adminDashboardPageSettingsElementi.click();

        extentTest.info("Kullanici PAge Settings menüsündeki elemanları test etti ve tekrar Page Settings'e tıkladı...");

        softAssert.assertAll();
        extentTest.pass("Payment Settings,Dynamic Pages ve Language menülerini test etmeye hazır...");

    }

    @Test
    public void paymentSettingsElementleriniGoruntuleme() throws InterruptedException {

        extentTest = extentReports.createTest("Admin panelindeki menülerin kontrol testi",
                "Kullanici Admin Panelde sol tarafta bulunan Payment Settings,Dynamic Pages ve Language menülerini test etmeye hazır...");

        //TEST CASE 4
        //1- Kullanıcı Sol menüde bulunan "Payment Settings" e tıklar
        Thread.sleep(1000);
        adminDashboard.adminDashboardPaymentSettingsElementi.click();
        extentTest.info("Kullanici Payment Settings'e tıklar...");

        //2- Kullanıcı Payment Information elementine tıklar ve açılan sayfada "Edit Payment Setting" yazısının göründüğünü doğrular
        adminDashboard.adminDashboardPaymentSettingsPaymentInformation.click();
        softAssert.assertTrue(adminDashboard.adminDashboardPaymentSettingsPaymentInformationDogrulama.isDisplayed());

        //3- Kullanıcı Currency Setup elementine tıklar ve açılan sayfada "Edit Currency Setting" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardPaymentSettingsCurrencySetup.click();
        softAssert.assertTrue(adminDashboard.adminDashboardPaymentSettingsCurrencySetupDogrulama.isDisplayed());

        //4- Kullanıcı Dynamic Pages'e tıklar ve "Dynamic Pages" yazsının göründüğünü doğrular
        extentTest.info("Kullanici Dynamic Pages'e tıklar...");
        adminDashboard.adminDashboardDynamicPagesElementi.click();
        softAssert.assertTrue(adminDashboard.adminDashboardDynamicPagesDogrulama.isDisplayed());
        Thread.sleep(1000);


        //5- Kullanıcı Language'a tıklar ve "Language Setting" yazsının göründüğünü doğrular
        extentTest.info("Kullanici Language Setting'e tıklar...");
        adminDashboard.adminDashboardLanguageElementi.click();
        softAssert.assertTrue(adminDashboard.adminDashboardLanguageDogrulama.isDisplayed());
        extentTest.info("Kullanıcı Payment Settings,Dynamic Pages ve Language menülerini test etti...");

        Thread.sleep(1000);
        adminDashboard.adminDashboardLanguageElementi.click();
        extentTest.info("Kullanici tekrar Language Setting'e tıklar... ve Website Section menüsünü test etmeye hazır");


        softAssert.assertAll();
        extentTest.pass("Kullanıcı Payment Settings,Dynamic Pages ve Language menülerini test etti ve " +
                "ve Website Section menüsünü test etmeye hazır");
    }

    @Test
    public void webSiteSectionElemenleriniGoruntuleme() throws InterruptedException {

        extentTest = extentReports.createTest("Admin panelindeki menülerin kontrol testi",
                "Kullanici Admin Panelde sol tarafta bulunan Website Section menüsünü test etmeye hazır...");

        //TEST CASE 5
        //1- Kullanıcı Sol menüde bulunan "Website Section" e tıklar
        Thread.sleep(1000);
        adminDashboard.adminDashboardWebSiteSectionElementi.click();
        extentTest.info("Kullanici Website Section'e tıklar...");

        //2- Kullanıcı Sliders elementine tıklar ve açılan sayfada "Sliders" yazısının göründüğünü doğrular
        adminDashboard.adminDashboardWebSiteSectionSliders.click();
        softAssert.assertTrue(adminDashboard.adminDashboardWebSiteSectionSlidersDogrulama.isDisplayed());

        //3- Kullanıcı Client elementine tıklar ve açılan sayfada "Clients" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardWebSiteSectionClient.click();
        softAssert.assertTrue(adminDashboard.adminDashboardWebSiteSectionClientDogrulama.isDisplayed());

        //4- Kullanıcı Services'e tıklar ve "Services" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardWebSiteSectionServices.click();
        softAssert.assertTrue(adminDashboard.adminDashboardWebSiteSectionServicesDogrulama.isDisplayed());

        //5- Kullanıcı Testimonials'a tıklar ve "Testimonials" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardWebSiteSectionTestimonials.click();
        softAssert.assertTrue(adminDashboard.adminDashboardWebSiteSectionTestimonialsDogrulama.isDisplayed());

        //6- Kullanıcı Team Members'a tıklar ve "Team Members" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardWebSiteSectionTeamMembers.click();
        softAssert.assertTrue(adminDashboard.adminDashboardWebSiteSectionTeamMembersDogrulama.isDisplayed());

        //7- Kullanıcı FAQ'a tıklar ve "FAQs" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardWebSiteSectionFAQ.click();
        softAssert.assertTrue(adminDashboard.adminDashboardWebSiteSectionFAQDogrulama.isDisplayed());

        //8- Kullanıcı Social Media'a tıklar ve "Social Media Items" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardWebSiteSectionSocialMedia.click();
        softAssert.assertTrue(adminDashboard.adminDashboardWebSiteSectionSocialMediaDogrulama.isDisplayed());

        //9- Kullanıcı Email Template'a tıklar ve açılan sayfada "Email Templates" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardWebSiteSectionEmailTemplateElementi.click();
        softAssert.assertTrue(adminDashboard.adminDashboardWebSiteSectionEmailTemplateElementiDogrulama.isDisplayed());
        extentTest.info("Kullanici Website Section'e menüsünün testini bitirir...");

        softAssert.assertAll();

        Driver.quitDriver();

        extentTest.pass("Kullanıcı Website Section menülsünü test etti ve Testi bitirip webbrowser'ı kapattı");

    }
}
