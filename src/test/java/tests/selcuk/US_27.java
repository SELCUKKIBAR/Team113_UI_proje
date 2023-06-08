package tests.selcuk;



import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AdminDashboard;
import utilities.*;

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
    public void generalSettingsElementleriGoruntuleme() {

        extentTest = extentReports.createTest("Admin panelindeki menülerin kontrol testi",
                "Kullanici Admin Panelde sol tarafta bulunan General Settings menüsünü test eder");

        //TEST CASE 2
        //1- Kullanıcı Sol menüde bulunan "General Settings" e tıklar

        adminDashboard.adminDashboardGeneralSettings.click();
        extentTest.info("Kullanici General Settings'e tıklar...");

        //2- Kullanıcı Logo elementine tıklar ve açılan sayfada "Existing Logo" yazısının göründüğünü doğrular
        adminDashboard.adminDashboardGeneralSettingsLogo.click();
        extentTest.info("Kullanici General Settings>>Logo'ya tıklar...");
        softAssert.assertTrue(adminDashboard.adminDashboardGeneralSettingsLogoDogrulama.isDisplayed());
        extentTest.info("Kullanici General Settings>>Logo'u doğrular...");

        //3- Kullanıcı Favicon elementine tıklar ve açılan sayfada "Existing Favicon" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardGeneralSettingsFavicron.click();
        extentTest.info("Kullanici General Settings>>Favicron'a tıklar...");
        softAssert.assertTrue(adminDashboard.adminDashboardGeneralSettingsFavicronDogrulama.isDisplayed());
        extentTest.info("Kullanici General Settings>>Favicron'u doğrular...");

        //4- Kullanıcı Login Background elementine tıklar ve açılan sayfada "Edit Login Background" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardGeneralSettingsBackground.click();
        extentTest.info("Kullanici General Settings>>Background'a tıklar...");
        softAssert.assertTrue(adminDashboard.adminDashboardGeneralSettingsBackgroundDogrulama.isDisplayed());
        extentTest.info("Kullanici General Settings>>Background'u doğrular...");

        //5- Kullanıcı Top Bar elementine tıklar ve açılan sayfada "Edit Top Bar Information" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardGeneralSettingsTopBar.click();
        extentTest.info("Kullanici General Settings>>TopBar'ı tıklar...");
        softAssert.assertTrue(adminDashboard.adminDashboardGeneralSettingsTopBarDogrulama.isDisplayed());
        extentTest.info("Kullanici General Settings>>TopBarı'ı doğrular...");

        //6- Kullanıcı Banner elementine tıklar ve açılan sayfada "Edit Banner" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardGeneralSettingsBanner.click();
        extentTest.info("Kullanici General Settings>>Banner'ı tıklar...");
        softAssert.assertTrue(adminDashboard.adminDashboardGeneralSettingsBannerDogrulama.isDisplayed());
        extentTest.info("Kullanici General Settings>>Banner'ı doğrular...");

        //7- Kullanıcı Footer elementine tıklar ve açılan sayfada "Edit Footer Information" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardGeneralSettingsFooter.click();
        extentTest.info("Kullanici General Settings>>Footer'ı tıklar...");
        softAssert.assertTrue(adminDashboard.adminDashboardGeneralSettingsFooterDogrulama.isDisplayed());
        extentTest.info("Kullanici General Settings>>Footer'ı doğrular...");

        //8- Kulanıcı Sidebar elementine tıklar ve açılan sayfada "Edit Sidebar Information" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardGeneralSettingsSidebar.click();
        extentTest.info("Kullanici General Settings>>Sidebar'ı tıklar...");
        softAssert.assertTrue(adminDashboard.adminDashboardGeneralSettingsSidebarDogrulama.isDisplayed());
        extentTest.info("Kullanici General Settings>>Sidebar'ı doğrular...");

        //9- Kullanıcı Color elementine tıklar ve açılansayfada "Edit Color Information" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardGeneralSettingsColor.click();
        extentTest.info("Kullanici General Settings>>Color'u tıklar...");
        softAssert.assertTrue(adminDashboard.adminDashboardGeneralSettingsColorDogrulama.isDisplayed());
        extentTest.info("Kullanici General Settings>>Color'u doğrular...");

        //10- Kullanıcı Preloader elementine tıklar ve açılan sayfada "Edit Preloader Information" yazsının görğndüğünü doğrular
        adminDashboard.adminDashboardGeneralSettingsPreloader.click();
        extentTest.info("Kullanici General Settings>>Preloader'u tıklar...");
        softAssert.assertTrue(adminDashboard.adminDashboardGeneralSettingsPreloaderDogrulama.isDisplayed());
        extentTest.info("Kullanici General Settings>>Preloader'u doğrular...");

        //11- Kullanıcı Google Analytic elementine tıklar ve açılan sayfada "Edit Google Analytic Setting" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardGeneralSettingsGoogleAnalytic.click();
        extentTest.info("Kullanici General Settings>>GoogleAnalytic'ı tıklar...");
        softAssert.assertTrue(adminDashboard.adminDashboardGeneralSettingsGoogleAnalyticDogrulama.isDisplayed());
        extentTest.info("Kullanici General Settings>>GoogleAnalytic'ı doğrular...");

        //12- Kullanıcı Google Recaptcha elementine tıklar ve açılan sayfada "Edit Google Recaptcha Setting" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardGeneralSettingsGoogleRecaptcha.click();
        extentTest.info("Kullanici General Settings>>GoogleRecaptcha'ı tıklar...");
        softAssert.assertTrue(adminDashboard.adminDashboardGeneralSettingsGoogleRecaptchaDogrulama.isDisplayed());
        extentTest.info("Kullanici General Settings>>GoogleRecaptcha'ı doğrular...");

        //13- Kullanıcı Tawk Live Chat elementine tıklar ve açılan sayfada "Edit Tawk Live Chat Setting" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardGeneralSettingsTawkLiveChat.click();
        extentTest.info("Kullanici General Settings>>TawkLiveChat'ı tıklar...");
        softAssert.assertTrue(adminDashboard.adminDashboardGeneralSettingsTawkLiveChatDogrulama.isDisplayed());
        extentTest.info("Kullanici General Settings>>TawkLiveChat'ı doğrular...");

        //14- Kullanıcı Cookie Consent elementine tıklar ve açılan sayfada "Edit Cookie Consent Setting" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardGeneralSettingsCookieConsent.click();
        extentTest.info("Kullanici General Settings>>CookieConsent'ı tıklar...");
        softAssert.assertTrue(adminDashboard.adminDashboardGeneralSettingsCookieConsentDogrulama.isDisplayed());
        extentTest.info("Kullanici General Settings>>CookieConsent'ı doğrular...");

        //15- Kullanıcı Layout elementine tıklar ver açılan sayfada "Edit Layout Information" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardGeneralSettingsLayout.click();
        extentTest.info("Kullanici General Settings>>Layout'u tıklar...");
        softAssert.assertTrue(adminDashboard.adminDashboardGeneralSettingsLayoutDogrulama.isDisplayed());
        extentTest.info("Kullanici General Settings>>Layout'u doğrular...");

        adminDashboard.adminDashboardGeneralSettings.click();
        extentTest.info("Kullanici General Settingse tekrar tıklar");
        ReusableMethods.bekle(2);

        softAssert.assertAll();

        extentTest.pass("Page Settings menüsünü test etmeye hazır...");

    }

    @Test
    public void pageSettings_ElementleriniGoruntuleme(){

        extentTest = extentReports.createTest("Admin panelindeki menülerin kontrol testi",
                "Kullanici Admin Panelde sol tarafta bulunan Page Settings menüsünü test eder");

        //TEST CASE 3
        //1- Kullanıcı Sol menüde bulunan "Page Settings" e tıklar
        adminDashboard.adminDashboardPageSettingsElementi.click();
        extentTest.info("Kullanici Page Settings'e tıklar...");

        //2- Kullanıcı Home elementine tıklar ve açılan sayfada "Edit Home Page Information" yazısının göründüğünü doğrular
        adminDashboard.adminDashboardPageSettingsHome.click();
        extentTest.info("Kullanici Page Settings>>>Home tıklar...");
        softAssert.assertTrue(adminDashboard.adminDashboardPageSettingsHomeDogrulama.isDisplayed());
        extentTest.info("Kullanici Page Settings>>Home doğrular...");

        //3- Kullanıcı About elementine tıklar ve açılan sayfada "Edit About Page Information" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardPageSettingsAbout.click();
        extentTest.info("Kullanici Page Settings>>>About tıklar...");
        softAssert.assertTrue(adminDashboard.adminDashboardPageSettingsAboutDogrulama.isDisplayed());
        extentTest.info("Kullanici Page Settings>>>About doğrular...");

        //4- Kullanıcı Service elementine tıklar ve açılan sayfada "Edit Service Page Information" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardPageSettingsService.click();
        extentTest.info("Kullanici Page Settings>>>Service tıklar...");
        softAssert.assertTrue(adminDashboard.adminDashboardPageSettingsServiceDogrulama.isDisplayed());
        extentTest.info("Kullanici Page Settings>>>Service doğrular...");

        //5- Kullanıcı Blog elementine tıklar ve açılan sayfada "Edit Blog Page Information" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardPageSettingsBlog.click();
        extentTest.info("Kullanici Page Settings>>>Blog tıklar...");
        softAssert.assertTrue(adminDashboard.adminDashboardPageSettingsBlogDogrulama.isDisplayed());
        extentTest.info("Kullanici Page Settings>>>Blog doğrular...");

        //6- Kullanıcı FAQ elementine tıklar ve açılan sayfada "Edit FAQ Page Information" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardPageSettingsFAQ.click();
        extentTest.info("Kullanici Page Settings>>>FAQ tıklar...");
        softAssert.assertTrue(adminDashboard.adminDashboardPageSettingsFAQDogrulama.isDisplayed());
        extentTest.info("Kullanici Page Settings>>>FAQ doğrular...");

        //7- KullanıcıTeam Member elementine tıklar ve açılan sayfada "Edit Team Member Page Information" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardPageSettingsTeamMember.click();
        extentTest.info("Kullanici Page Settings>>>TeamMember tıklar...");
        softAssert.assertTrue(adminDashboard.adminDashboardPageSettingsTeamMemberDogrulama.isDisplayed());
        extentTest.info("Kullanici Page Settings>>>TeamMember doğrular...");

        //8- KulanıcıTestimonial elementine tıklar ve açılan sayfada "Edit Testimonial Page Information" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardPageSettingsTestimonial.click();
        extentTest.info("Kullanici Page Settings>>>Testimonial tıklar...");
        softAssert.assertTrue(adminDashboard.adminDashboardPageSettingsTestimonialDogrulama.isDisplayed());
        extentTest.info("Kullanici Page Settings>>>Testimonial doğrular...");

        //9- KullanıcıDestination elementine tıklar ve açılansayfada "Edit Destination Page Information" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardPageSettingsDestination.click();
        extentTest.info("Kullanici Page Settings>>>Destination tıklar...");
        softAssert.assertTrue(adminDashboard.adminDashboardPageSettingsDestinationDogrulama.isDisplayed());
        extentTest.info("Kullanici Page Settings>>>Destination doğrular...");

        //10- Kullanıcı Package elementine tıklar ve açılan sayfada "Edit Package Page Information" yazsının görğndüğünü doğrular
        adminDashboard.adminDashboardPageSettingsPackage.click();
        extentTest.info("Kullanici Page Settings>>>Package tıklar...");
        softAssert.assertTrue(adminDashboard.adminDashboardPageSettingsPackageDogrulama.isDisplayed());
        extentTest.info("Kullanici Page Settings>>>Package doğrular...");

        //11- Kullanıcı Contact elementine tıklar ve açılan sayfada "Edit Contact Page Information" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardPageSettingsContact.click();
        extentTest.info("Kullanici Page Settings>>>Contact tıklar...");
        softAssert.assertTrue(adminDashboard.adminDashboardPageSettingsContactDogrulama.isDisplayed());
        extentTest.info("Kullanici Page Settings>>>Contact doğrular...");

        //12- Kullanıcı Term elementine tıklar ve açılan sayfada "Edit Term Page Information" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardPageSettingsTerm.click();
        extentTest.info("Kullanici Page Settings>>>Term tıklar...");
        softAssert.assertTrue(adminDashboard.adminDashboardPageSettingsTermDogrulama.isDisplayed());
        extentTest.info("Kullanici Page Settings>>>Term doğrular...");

        //13- Kullanıcı Privacy elementine tıklar ve açılan sayfada "Edit Privacy Page Information" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardPageSettingsPrivacy.click();
        extentTest.info("Kullanici Page Settings>>>Privacy tıklar...");
        softAssert.assertTrue(adminDashboard.adminDashboardPageSettingsPrivacyDogrulama.isDisplayed());
        extentTest.info("Kullanici Page Settings>>>Privacy doğrular...");

        //14- Kullanıcı Other elementine tıklar ve açılan sayfada "Edit Other Page Information" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardPageSettingsOther.click();
        extentTest.info("Kullanici Page Settings>>>Other tıklar...");
        softAssert.assertTrue(adminDashboard.adminDashboardPageSettingsOtherDogrulama.isDisplayed());
        extentTest.info("Kullanici Page Settings>>>Other doğrular...");
        ReusableMethods.bekle(2);
        adminDashboard.adminDashboardPageSettingsElementi.click();

        extentTest.info("Kullanici PAge Settings menüsündeki elemanları test etti ve tekrar Page Settings'e tıkladı...");

        softAssert.assertAll();
        extentTest.pass("Payment Settings,Dynamic Pages ve Language menülerini test etmeye hazır...");

    }

    @Test
    public void paymentSettingsElementleriniGoruntuleme()   {

        extentTest = extentReports.createTest("Admin panelindeki menülerin kontrol testi",
                "Kullanici Admin Panelde sol tarafta bulunan Payment Settings,Dynamic Pages ve Language menülerini test etmeye hazır...");

        //TEST CASE 4
        //1- Kullanıcı Sol menüde bulunan "Payment Settings" e tıklar
        ReusableMethods.bekle(1);
        adminDashboard.adminDashboardPaymentSettingsElementi.click();
        extentTest.info("Kullanici Payment Settings'e tıklar...");

        //2- Kullanıcı Payment Information elementine tıklar ve açılan sayfada "Edit Payment Setting" yazısının göründüğünü doğrular
        adminDashboard.adminDashboardPaymentSettingsPaymentInformation.click();
        extentTest.info("Kullanici Payment Settings>>>Information tıklar...");
        softAssert.assertTrue(adminDashboard.adminDashboardPaymentSettingsPaymentInformationDogrulama.isDisplayed());
        extentTest.info("Kullanici Payment Settings>>>Information doğrular...");

        //3- Kullanıcı Currency Setup elementine tıklar ve açılan sayfada "Edit Currency Setting" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardPaymentSettingsCurrencySetup.click();
        extentTest.info("Kullanici Payment Settings>>>CurrencySetup tıklar...");
        softAssert.assertTrue(adminDashboard.adminDashboardPaymentSettingsCurrencySetupDogrulama.isDisplayed());
        extentTest.info("Kullanici Payment Settings>>>CurrencySetup doğrular...");

        //4- Kullanıcı Dynamic Pages'e tıklar ve "Dynamic Pages" yazsının göründüğünü doğrular


        adminDashboard.adminDashboardDynamicPagesElementi.click();
        extentTest.info("Kullanici Dynamic Pages tıklar...");
        softAssert.assertTrue(adminDashboard.adminDashboardDynamicPagesDogrulama.isDisplayed());
        extentTest.info("Kullanici Dynamic Pages doğrular...");
        ReusableMethods.bekle(1);

//burda kaldımmmmmmmmm
        //5- Kullanıcı Language'a tıklar ve "Language Setting" yazsının göründüğünü doğrular
        extentTest.info("Kullanici Language Setting tıklar...");
        adminDashboard.adminDashboardLanguageElementi.click();
        softAssert.assertTrue(adminDashboard.adminDashboardLanguageDogrulama.isDisplayed());
        extentTest.info("Kullanici Language Setting doğrular...");

        ReusableMethods.bekle(1);
        adminDashboard.adminDashboardLanguageElementi.click();
        extentTest.info("Kullanici tekrar Language Setting'e tıklar... ");


        softAssert.assertAll();
        extentTest.pass("Kullanıcı Payment Settings,Dynamic Pages ve Language menülerini test etti ve " +
                "ve Website Section menüsünü test etmeye hazır");
    }

    @Test
    public void webSiteSectionElemenleriniGoruntuleme() {

        extentTest = extentReports.createTest("Admin panelindeki menülerin kontrol testi",
                "Kullanici Admin Panelde sol tarafta bulunan Website Section menüsünü test etmeye hazır...");

        //TEST CASE 5
        //1- Kullanıcı Sol menüde bulunan "Website Section" e tıklar
        ReusableMethods.bekle(1);
        adminDashboard.adminDashboardWebSiteSectionElementi.click();
        extentTest.info("Kullanici Website Section'e tıklar...");

        //2- Kullanıcı Sliders elementine tıklar ve açılan sayfada "Sliders" yazısının göründüğünü doğrular
        adminDashboard.adminDashboardWebSiteSectionSliders.click();
        extentTest.info("Kullanici Website Section Sliders  tıklar...");
        softAssert.assertTrue(adminDashboard.adminDashboardWebSiteSectionSlidersDogrulama.isDisplayed());
        extentTest.info("Kullanici Website Section Sliders  doğrular...");

        //3- Kullanıcı Client elementine tıklar ve açılan sayfada "Clients" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardWebSiteSectionClient.click();
        extentTest.info("Kullanici Website Section Client  tıklar...");
        softAssert.assertTrue(adminDashboard.adminDashboardWebSiteSectionClientDogrulama.isDisplayed());
        extentTest.info("Kullanici Website Section Client  doğrular...");

        //4- Kullanıcı Services'e tıklar ve "Services" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardWebSiteSectionServices.click();
        extentTest.info("Kullanici Website Section Servides  tıklar...");
        softAssert.assertTrue(adminDashboard.adminDashboardWebSiteSectionServicesDogrulama.isDisplayed());
        extentTest.info("Kullanici Website Section Servides  doğrular...");

        //5- Kullanıcı Testimonials'a tıklar ve "Testimonials" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardWebSiteSectionTestimonials.click();
        extentTest.info("Kullanici Website Section Testimonials  tıklar...");
        softAssert.assertTrue(adminDashboard.adminDashboardWebSiteSectionTestimonialsDogrulama.isDisplayed());
        extentTest.info("Kullanici Website Section Testimonials  doğrular...");

        //6- Kullanıcı Team Members'a tıklar ve "Team Members" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardWebSiteSectionTeamMembers.click();
        extentTest.info("Kullanici Website Section Team Members  tıklar...");
        softAssert.assertTrue(adminDashboard.adminDashboardWebSiteSectionTeamMembersDogrulama.isDisplayed());
        extentTest.info("Kullanici Website Section Team Members  doğrular...");

        //7- Kullanıcı FAQ'a tıklar ve "FAQs" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardWebSiteSectionFAQ.click();
        extentTest.info("Kullanici Website Section FAQ  tıklar...");
        softAssert.assertTrue(adminDashboard.adminDashboardWebSiteSectionFAQDogrulama.isDisplayed());
        extentTest.info("Kullanici Website Section FAQ  doğrular...");

        //8- Kullanıcı Social Media'a tıklar ve "Social Media Items" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardWebSiteSectionSocialMedia.click();
        extentTest.info("Kullanici Website Section Social Medya  tıklar...");
        softAssert.assertTrue(adminDashboard.adminDashboardWebSiteSectionSocialMediaDogrulama.isDisplayed());
        extentTest.info("Kullanici Website Section Social Medya  doğrular...");

        //9- Kullanıcı Email Template'a tıklar ve açılan sayfada "Email Templates" yazsının göründüğünü doğrular
        adminDashboard.adminDashboardWebSiteSectionEmailTemplateElementi.click();
        extentTest.info("Kullanici Website Section EmailTemplate  tıklar...");
        softAssert.assertTrue(adminDashboard.adminDashboardWebSiteSectionEmailTemplateElementiDogrulama.isDisplayed());
        extentTest.info("Kullanici Website Section EmailTemplate  doğrular...");
        extentTest.info("Kullanici Website Section'e menüsünün testini bitirir...");

        softAssert.assertAll();

        Driver.quitDriver();

        extentTest.pass("Kullanıcı Website Section menülsünü test etti ve Testi bitirip webbrowser'ı kapattı");

    }

}
