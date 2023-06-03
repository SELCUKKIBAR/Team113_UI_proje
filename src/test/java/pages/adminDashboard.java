package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class adminDashboard {

    public adminDashboard(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

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








    /*
Admin giriş yaptıktan sonra sırasıyla

Page Settings,
Payment Settings,
Dynamic Pages,
Language,
Web Site Section  ve
Email Template
sayfalarını görüntüleyebildiğimi doğrulayabilmeliyim
     */









}
