package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class adminDashboard {

    public adminDashboard(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    //***********************ADMİN GİRİŞ EKRANI***********************
    //adminDashBoard>>>Email kutusu
    @FindBy(xpath = "//input[@id='email']")
    public WebElement adminDashboardEmailKutusu;

    //adminDashBoard>>>Password kutusu
    @FindBy(xpath = "//input[@id='password']")
    public WebElement adminDashboardPasswordKutusu;

    //adminDashBoard>>>Login butonu
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement adminDashboardLoginButonu;

    //adminDashBoard>>>Forgot Password butonu
    @FindBy(xpath = "//a[@class='small']")
    public WebElement adminDashboardForgotPasswordButonu;

    //adminDashBoard>>>Reset Password email kutusu
    @FindBy(xpath = "//input[@id='email']")
    public WebElement adminDashboardResetPasswordEmailKutusu;

    //adminDashBoard>>> Send Verification Link butonu
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement adminDashboardSendVerificationLinki;

    //adminDashBoard>>> Back to login page
    @FindBy(xpath = "//a[@class='small']")
    public WebElement adminDashboardBackToLoginPageButonu;

    //adminDashBoard>>> Admin Panel yazisi
    @FindBy(xpath = "//div[text()='Admin Panel']")
    public WebElement adminDashboardAdminPanelGirisDogrulama;


    //*************GENERAL SETTİNGS*************************

    //adminDashBoard>>>GeneralSetting
    @FindBy(xpath ="//span[text()='General Settings']")
    public WebElement adminDashboardGeneralSettings;

    //adminDashBoard>>>GeneralSetting>>>Logo
    @FindBy(xpath ="//a[text()='Logo'] ")
    public WebElement adminDashboardGeneralSettingsLogo;

    //adminDashBoard>>>GeneralSetting>>>Logo Dogrulama
    @FindBy(xpath ="//h1[text()='Edit Logo']")
    public WebElement adminDashboardGeneralSettingsLogoDogrulama;

    //adminDashBoard>>>GeneralSetting>>>Favicron
    @FindBy(xpath ="//a[text()='Favicon']")
    public WebElement adminDashboardGeneralSettingsFavicron;

    //adminDashBoard>>>GeneralSetting>>>Favicron Dogrulama
    @FindBy(xpath ="//h1[text()='Edit Favicon']")
    public WebElement adminDashboardGeneralSettingsFavicronDogrulama;

    //adminDashBoard>>>GeneralSetting>>>Login Background
    @FindBy(xpath ="//a[text()='Login Background']")
    public WebElement adminDashboardGeneralSettingsBackground ;

    //adminDashBoard>>>GeneralSetting>>>Login Background  Dogrulama
    @FindBy(xpath ="//h1[text()='Edit Login Background']")
    public WebElement adminDashboardGeneralSettingsBackgroundDogrulama;


    //adminDashBoard>>>GeneralSetting>>>Top Bar
    @FindBy(xpath ="//a[text()='Top Bar']")
    public WebElement adminDashboardGeneralSettingsTopBar;

    //adminDashBoard>>>GeneralSetting>>>Top Bar  Dogrulama
    @FindBy(xpath ="//h1[text()='Edit Top Bar Information']")
    public WebElement adminDashboardGeneralSettingsTopBarDogrulama;


    //adminDashBoard>>>GeneralSetting>>>Banner
    @FindBy(xpath ="//a[text()='Banner']")
    public WebElement adminDashboardGeneralSettingsBanner;

    //adminDashBoard>>>GeneralSetting>>>Banner  Dogrulama
    @FindBy(xpath ="//h1[text()='Edit Banner']")
    public WebElement adminDashboardGeneralSettingsBannerDogrulama;

    //adminDashBoard>>>GeneralSetting>>>Footer
    @FindBy(xpath ="//a[text()='Footer']")
    public WebElement adminDashboardGeneralSettingsFooter;

    //adminDashBoard>>>GeneralSetting>>> Footer  Dogrulama
    @FindBy(xpath ="//h1[text()='Edit Footer Information']")
    public WebElement adminDashboardGeneralSettingsFooterDogrulama;

    //adminDashBoard>>>GeneralSetting>>>Sidebar
    @FindBy(xpath ="//a[text()='Sidebar']")
    public WebElement adminDashboardGeneralSettingsSidebar;

    //adminDashBoard>>>GeneralSetting>>> Sidebar  Dogrulama
    @FindBy(xpath ="//h1[text()='Edit Sidebar Information']")
    public WebElement adminDashboardGeneralSettingsSidebarDogrulama;

    //adminDashBoard>>>GeneralSetting>>>Color
    @FindBy(xpath ="//a[text()='Color']")
    public WebElement adminDashboardGeneralSettingsColor;

    //adminDashBoard>>>GeneralSetting>>> Color  Dogrulama
    @FindBy(xpath ="//h1[text()='Edit Color Information']")
    public WebElement adminDashboardGeneralSettingsColorDogrulama;


    //adminDashBoard>>>GeneralSetting>>>Preloader
    @FindBy(xpath ="//a[text()='Preloader']")
    public WebElement adminDashboardGeneralSettingsPreloader;

    //adminDashBoard>>>GeneralSetting>>> Preloader  Dogrulama
    @FindBy(xpath ="//h1[text()='Edit Preloader Information']")
    public WebElement adminDashboardGeneralSettingsPreloaderDogrulama;


    //adminDashBoard>>>GeneralSetting>>>Google Analytic
    @FindBy(xpath ="//a[text()='Google Analytic']")
    public WebElement adminDashboardGeneralSettingsGoogleAnalytic;

    //adminDashBoard>>>GeneralSetting>>> Google Analytic  Dogrulama
    @FindBy(xpath ="//h1[text()='Edit Google Analytic Setting']")
    public WebElement adminDashboardGeneralSettingsGoogleAnalyticDogrulama;


    //adminDashBoard>>>GeneralSetting>>>Google Recaptcha
    @FindBy(xpath ="//a[text()='Google Recaptcha']")
    public WebElement adminDashboardGeneralSettingsGoogleRecaptcha;

    //adminDashBoard>>>GeneralSetting>>> Google Recaptcha  Dogrulama
    @FindBy(xpath ="//h1[text()='Edit Google Recaptcha Setting']")
    public WebElement adminDashboardGeneralSettingsGoogleRecaptchaDogrulama;

    //adminDashBoard>>>GeneralSetting>>>Tawk Live Chat
    @FindBy(xpath ="//a[text()='Tawk Live Chat']")
    public WebElement adminDashboardGeneralSettingsTawkLiveChat;

    //adminDashBoard>>>GeneralSetting>>>Login Tawk Live Chat   Dogrulama
    @FindBy(xpath ="//h1[text()='Edit Tawk Live Chat Setting']")
    public WebElement adminDashboardGeneralSettingsTawkLiveChatDogrulama;

    //adminDashBoard>>>GeneralSetting>>>Cookie Consent
    @FindBy(xpath ="//a[text()='Cookie Consent']")
    public WebElement adminDashboardGeneralSettingsCookieConsent;

    //adminDashBoard>>>GeneralSetting>>>Cookie Consent Dogrulama
    @FindBy(xpath ="//h1[text()='Edit Cookie Consent Setting']")
    public WebElement adminDashboardGeneralSettingsCookieConsentDogrulama;


    //adminDashBoard>>>GeneralSetting>>>Layout
    @FindBy(xpath ="//a[text()='Layout']  ")
    public WebElement adminDashboardGeneralSettingsLayout;

    //adminDashBoard>>>GeneralSetting>>>Layout Dogrulama
    @FindBy(xpath ="//h1[text()='Edit Layout Information']")
    public WebElement adminDashboardGeneralSettingsLayoutDogrulama;


    //**************PAGE SETTİNGS*******************

    //adminDashBoard>>>PageSettings
    @FindBy(xpath = "//span[text()='Page Settings']")
    public WebElement adminDashboardPageSettingsElementi;

    //adminDashBoard>>>PageSettings>>>Home
    @FindBy(xpath = "//*[text()='Home']")
    public WebElement adminDashboardPageSettingsHome;


    //adminDashBoard>>>PageSettings>>>Home Dogrulama
    @FindBy(xpath = "//*[text()='Edit Home Page Information']")
    public WebElement adminDashboardPageSettingsHomeDogrulama;

    //adminDashBoard>>>PageSettings>>>About
    @FindBy(xpath = "//*[text()='About']")
    public WebElement adminDashboardPageSettingsAbout;

    //adminDashBoard>>>PageSettings>>>About Dogrulama
    @FindBy(xpath = "//*[text()='Edit About Page Information']")
    public WebElement adminDashboardPageSettingsAboutDogrulama;


    //adminDashBoard>>>PageSettings>>>Service
    @FindBy(xpath = "//*[text()='Service']")
    public WebElement adminDashboardPageSettingsService;

    //adminDashBoard>>>PageSettings>>>Service Dogrulama
    @FindBy(xpath = "//*[text()='Edit Service Page Information']")
    public WebElement adminDashboardPageSettingsServiceDogrulama;


    //adminDashBoard>>>PageSettings>>>Blog
    @FindBy(xpath = "//*[text()='Blog']")
    public WebElement adminDashboardPageSettingsBlog;

    //adminDashBoard>>>PageSettings>>>Blog Dogrulama
    @FindBy(xpath = "//*[text()='Edit Blog Page Information']")
    public WebElement adminDashboardPageSettingsBlogDogrulama;


    //adminDashBoard>>>PageSettings>>>Team Member
    @FindBy(xpath = "//*[text()='Team Member']")
    public WebElement adminDashboardPageSettingsTeamMember;

    //adminDashBoard>>>PageSettings>>>Team Member Dogrulama
    @FindBy(xpath = "//*[text()='Edit Team Member Page Information']")
    public WebElement adminDashboardPageSettingsTeamMemberDogrulama;


    //adminDashBoard>>>PageSettings>>>Testimonial
    @FindBy(xpath = "//*[text()='Testimonial']")
    public WebElement adminDashboardPageSettingsTestimonial;

    //adminDashBoard>>>PageSettings>>>Testimonial Dogrulama
    @FindBy(xpath = "Edit Testimonial Page Information")
    public WebElement adminDashboardPageSettingsTestimonialDogrulama;


    //adminDashBoard>>>PageSettings>>>Destination
    @FindBy(xpath = "//*[text()='Destination']")
    public WebElement adminDashboardPageSettingsDestination;

    //adminDashBoard>>>PageSettings>>>Destination Dogrulama
    @FindBy(xpath = "//*[text()='Edit Destination Page Information']")
    public WebElement adminDashboardPageSettingsDestinationDogrulama;


    //adminDashBoard>>>PageSettings>>>Package
    @FindBy(xpath = "//*[text()='Package']")
    public WebElement adminDashboardPageSettingsPackage;

    //adminDashBoard>>>PageSettings>>>Package Dogrulama
    @FindBy(xpath = "//*[text()='Edit Package Page Information']")
    public WebElement adminDashboardPageSettingsPackageDogrulama;


    //adminDashBoard>>>PageSettings>>>Contact
    @FindBy(xpath = "//*[text()='Contact']")
    public WebElement adminDashboardPageSettingsContact;

    //adminDashBoard>>>PageSettings>>>Contact Dogrulama
    @FindBy(xpath = "//*[text()='Edit Contact Page Information']")
    public WebElement adminDashboardPageSettingsContactDogrulama;


    //adminDashBoard>>>PageSettings>>>Term
    @FindBy(xpath = "//*[text()='Term']")
    public WebElement adminDashboardPageSettingsTerm;

    //adminDashBoard>>>PageSettings>>>Term Dogrulama
    @FindBy(xpath = "//*[text()='Edit Term Page Information']")
    public WebElement adminDashboardPageSettingsTermDogrulama;


    //adminDashBoard>>>PageSettings>>>Privacy
    @FindBy(xpath = "//*[text()='Privacy']")
    public WebElement adminDashboardPageSettingsPrivacy;

    //adminDashBoard>>>PageSettings>>>Privacy Dogrulama
    @FindBy(xpath = "//*[text()='Edit Privacy Page Information']")
    public WebElement adminDashboardPageSettingsPrivacyDogrulama;


    //adminDashBoard>>>PageSettings>>>Other
    @FindBy(xpath = "//*[text()='Other']")
    public WebElement adminDashboardPageSettingsOther;

    //adminDashBoard>>>PageSettings>>>Other Dogrulama
    @FindBy(xpath = "//*[text()='Edit Other Page Information']")
    public WebElement adminDashboardPageSettingsOtherDogrulama;


    //**************ADMİN PAYMENT SETTİNGS**********

    //adminDashBoard>>>>>>Payment Settings
    @FindBy(xpath = "//*[text()='Payment Settings']")
    public WebElement adminDashboardPaymentSettingsElementi;


    //adminDashBoard>>>>>>Payment Settings>>>>Payment Information
    @FindBy(xpath = "//*[text()='Payment Information']")
    public WebElement adminDashboardPaymentSettingsPaymentInformation;

    //adminDashBoard>>>>>>Payment Settings>>>Payment Information dogrulama
    @FindBy(xpath = "//*[text()='Edit Payment Setting']")
    public WebElement adminDashboardPaymentSettingsPaymentInformationDogrulama;


    //adminDashBoard>>>>>>Payment Settings>>>>Currency Setup
    @FindBy(xpath = "//*[text()='Currency Setup']")
    public WebElement adminDashboardPaymentSettingsCurrencySetup;

    //adminDashBoard>>>>>>Payment Settings>>>Currency Setup dogrulama
    @FindBy(xpath = "//*[text()='Edit Currency Setting']")
    public WebElement adminDashboardPaymentSettingsCurrencySetupDogrulama;


    //adminDashBoard>>>>>>>>>>Dynamic Pages'
    @FindBy(xpath = "//*[text()='Dynamic Pages']")
    public WebElement adminDashboardDynamicPagesElementi;

    //adminDashBoard>>>>>>Payment Settings>>>Dynamic Pages' dogrulama
    @FindBy(xpath = "//*[text()='View Dynamic Pages']")
    public WebElement adminDashboardDynamicPagesDogrulama;


    //adminDashBoard>>>>>>>>>>Language
    @FindBy(xpath = "//*[text()='Language']")
    public WebElement adminDashboardLanguageElementi;

    //adminDashBoard>>>>>>Payment Settings>>>Dynamic Pages' dogrulama
    @FindBy(xpath = "//*[text()='Language Setting']")
    public WebElement adminDashboardLanguageDogrulama;


    //adminDashboard>>>>>Web Site Section
    @FindBy(xpath = "//*[text()='Website Section']")
    public WebElement adminDashboardWebSiteSectionElementi;

    //adminDashboard>>>>>Web Site Section>>>>Sliders
    @FindBy(xpath ="(//a[@class='collapse-item'])[5]")
    public WebElement adminDashboardWebSiteSectionSliders;

    //adminDashboard>>>>>Web Site Section>>>Sliders dogrulama
    @FindBy(xpath = "(//*[text()='Sliders'])[2]")
    public WebElement adminDashboardWebSiteSectionSlidersDogrulama;


    //adminDashboard>>>>>Web Site Section>>>>Client
    @FindBy(xpath ="(//*[text()='Client'])[1]")
    public WebElement adminDashboardWebSiteSectionClient;

    //adminDashboard>>>>>Web Site Section>>>Client dogrulama
    @FindBy(xpath = "(//*[text()='Clients'])[1]")
    public WebElement adminDashboardWebSiteSectionClientDogrulama;


    //adminDashboard>>>>>Web Site Section>>>>Services
    @FindBy(xpath ="(//*[text()='Services'])[1]")
    public WebElement adminDashboardWebSiteSectionServices;

    //adminDashboard>>>>>Web Site Section>>>Services dogrulama
    @FindBy(xpath = "//*[text()='View Services']")
    public WebElement adminDashboardWebSiteSectionServicesDogrulama;

    //adminDashboard>>>>>Web Site Section>>>>Testimonials
    @FindBy(xpath ="(//*[text()='Testimonials'])[1]")
    public WebElement adminDashboardWebSiteSectionTestimonials;

    //adminDashboard>>>>>Web Site Section>>>Testimonials dogrulama
    @FindBy(xpath = "(//*[text()='View Testimonials'])[1]")
    public WebElement adminDashboardWebSiteSectionTestimonialsDogrulama;


    //adminDashboard>>>>>Web Site Section>>>>Team Members
    @FindBy(xpath ="(//*[text()='Team Members'])[1]")
    public WebElement adminDashboardWebSiteSectionTeamMembers;

    //adminDashboard>>>>>Web Site Section>>>Team Members dogrulama
    @FindBy(xpath = "(//*[text()='View Team Members'])[1]")
    public WebElement adminDashboardWebSiteSectionTeamMembersDogrulama;


    //adminDashboard>>>>>Web Site Section>>>>FAQ
    @FindBy(xpath ="(//*[text()='FAQ'])[1]")
    public WebElement adminDashboardWebSiteSectionFAQ;

    //adminDashboard>>>>>Web Site Section>>>FAQ dogrulama
    @FindBy(xpath = "(//*[text()='View FAQs'])[1]")
    public WebElement adminDashboardWebSiteSectionFAQDogrulama;


    //adminDashboard>>>>>Web Site Section>>>>Social Media
    @FindBy(xpath ="(//*[text()='Social Media'])[1]")
    public WebElement adminDashboardWebSiteSectionSocialMedia;

    //adminDashboard>>>>>Web Site Section>>>Social Media dogrulama
    @FindBy(xpath = "(//*[text()='View Social Media Items'])[1]")
    public WebElement adminDashboardWebSiteSectionSocialMediaDogrulama;


    //adminDashboard>>>>>Web Site Section>>>>Email Template
    @FindBy(xpath ="(//*[text()='Email Template'])[1]")
    public WebElement adminDashboardWebSiteSectionEmailTemplateElementi;

    //adminDashboard>>>>>Web Site Section>>>Email Template  dogrulama
    @FindBy(xpath = "(//*[text()='View Email Templates'])[1]")
    public WebElement adminDashboardWebSiteSectionEmailTemplateElementiDogrulama;





    /*
Admin giriş yaptıktan sonra sırasıyla

Web Site Section  ve




Email Template      (//*[text()='Email Template'])[1]  (//*[text()='View Email Templates'])[1]
sayfalarını görüntüleyebildiğimi doğrulayabilmeliyim
     */









}
