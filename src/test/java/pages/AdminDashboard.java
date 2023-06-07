package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminDashboard {

    public AdminDashboard(){

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
    @FindBy(xpath = "//*[@id=\"collapsePageSettings\"]/div/a[7]")
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

    @FindBy(xpath = "//*[@id=\"collapsePageSettings\"]/div/a[2]")
    public WebElement adminDashboardPageSettingsFAQ;


    //adminDashBoard>>>PageSettings>>>faqdosrulama
    @FindBy(xpath = "//*[@id=\"content\"]/div/h1")
    public WebElement adminDashboardPageSettingsFAQDogrulama;

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
    @FindBy(xpath ="//*[@id=\"collapseWebsite\"]/div/a[6]")
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


    //***** Blog section****

    // adminDasboard>>>> Blog Section
    @FindBy(xpath = "//*[text()='Blog Section']")
    public WebElement adminDasboardBlogSectionElementi;


    // adminDasboard>>>> Blog Section>>>Catagories
    @FindBy(xpath = "(//a[@class='collapse-item'])[3]")
    public WebElement adminDasboardBlogCatagories;


    // adminDasboard>>>> Blog Section>>>Catagories>>>+add new
    @FindBy(xpath = "//a[@href='https://qa.tripandway.com/admin/category/create']")
    public WebElement adminDasboardBlogAddNew;


    // adminDasboard>>>> Blog Section>>>Catagories>>>+add new>>> category name
    @FindBy(xpath = "//input[@name='category_name']")
    public WebElement adminDasboardBlogAddNewCategoryName;


    // adminDasboard>>>> Blog Section>>>Catagories>>>+add new>>> category slug
    @FindBy(xpath = "//input[@name='category_slug']")
    public WebElement adminDasboardBlogAddNewCategorySlug;


    // adminDasboard>>>> Blog Section>>>Catagories>>>+add new>>> seo_title
    @FindBy(xpath = "//input[@name='seo_title']")
    public WebElement adminDasboardBlogAddNewSeo_title;


    // adminDasboard>>>> Blog Section>>>Catagories>>>+add new>>> Meta_Description
    @FindBy(xpath = "//textarea[@name='seo_meta_description']")
    public WebElement adminDasboardBlogAddNewSeo_Meta_Description;


    // adminDasboard>>>> Blog Section>>>Catagories>>>+add new>>> Submit
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement adminDasboardBlogAddNewSeo_Submit;


    // adminDasboard>>>> Blog Section>>>Catagories>>>+add new>>> Edit_Category
    @FindBy(xpath = "//a[@href='https://qa.tripandway.com/admin/category/edit/117']")
    public WebElement adminDasboardBlogAddNewSeo_Edit_Category;


    // adminDasboard>>>> Blog Section>>>Catagories>>>+add new>>> Edit_Category_Dogrulama
    @FindBy(xpath = "//*[text()='Edit Category']")
    public WebElement adminDasboardBlogAddNewSeo_Edit_Category_Dogrulama;


    // adminDasboard>>>> Blog Section>>>Catagories>>>+add new>>> Update
    @FindBy(xpath = "//*[text()='Update']")
    public WebElement adminDasboardBlogAddNewSeo_Edit_Update;


    // adminDasboard>>>> Blog Section>>>Catagories>>>+add new>>> Delete
    @FindBy(xpath = "//*[@id=\"dataTable\"]/tbody/tr[7]/td[4]/a[2]")
    public WebElement adminDasboardBlogAddNewSeo_Edit_Delete;


    // adminDasboard>>>> Blog Section>>>Blogs
    @FindBy(xpath = "(//a[@class='collapse-item'])[4]")
    public WebElement adminDasboardBlogSectionBlogs;


    // adminDasboard>>>> Blog Section>>>Blogs>>>+addnew
    @FindBy(xpath = "//a[@href='https://qa.tripandway.com/admin/blog/create']")
    public WebElement adminDasboardBlogSectionBlogsAddNew;


    // adminDasboard>>>> Blog Section>>>Blogs>>>+BlogTitle
    @FindBy(xpath = "//input[@name='blog_title']")
    public WebElement adminDasboardBlogSectionBlogsBlogTitle;


    // adminDasboard>>>> Blog Section>>>Blogs>>>+BlogSlug
    @FindBy(xpath = "//input[@name='blog_slug']")
    public WebElement adminDasboardBlogSectionBlogsBlogSlug;


    // adminDasboard>>>> Blog Section>>>Blogs>>>+BlogContent
    @FindBy(xpath = "//div[@class='note-editable card-block']")
    public WebElement adminDasboardBlogSectionBlogsBlogContent;


    // adminDasboard>>>> Blog Section>>>Blogs>>>+BlogShortContent
    @FindBy(xpath = "//textarea[@name='blog_content_short']")
    public WebElement adminDasboardBlogSectionBlogsBlogShortContent;


    // adminDasboard>>>> Blog Section>>>Blogs>>>+BlogPhoto
    @FindBy(xpath = "(//input[@type='file'])[2]")
    public WebElement adminDasboardBlogSectionBlogsBlogPhoto;


    // adminDasboard>>>> Blog Section>>>Blogs>>>SelectCategory
    @FindBy(xpath = "//select[@name='category_id']")
    public WebElement adminDasboardBlogSectionSelectCategory;


    // adminDasboard>>>> Blog Section>>>Blogs>>>ShowComment
    @FindBy(xpath = "//select[@name='comment_show']")
    public WebElement adminDasboardBlogSectionShowComment;


    // adminDasboard>>>> Blog Section>>>Blogs>>>SEO Information>>>Title
    @FindBy(xpath ="//input[@name='seo_title']")
    public WebElement adminDasboardBlogSectionSEOTitle;


    // adminDasboard>>>> Blog Section>>>Blogs>>>SEO Information>>>MetaDescription
    @FindBy(xpath ="//textarea[@name='seo_meta_description']")
    public WebElement adminDasboardBlogSectionSEOMetaDescription;


    // adminDasboard>>>> Blog Section>>>Blogs>>>SEO Information>>>Submit
    @FindBy(xpath ="//button[text()='Submit']")
    public WebElement adminDasboardBlogSectionSEOSubmit;


    // adminDasboard>>>> Blog Section>>>Blogs>>>View
    @FindBy(xpath ="//a[@href='https://qa.tripandway.com/admin/blog/edit/111']")
    public WebElement adminDasboardBlogSectionView;


    // adminDasboard>>>> Blog Section>>>Blogs>>>ViewDogrulama
    @FindBy(xpath ="//h1[text()='Edit Blog']")
    public WebElement adminDasboardBlogSectionViewDogrulama;


    // adminDasboard>>>> Blog Section>>>Blogs>>>BlogDelete
    @FindBy(xpath ="//*[@id=\"dataTable\"]/tbody/tr[7]/td[5]/a[2]")
    public WebElement adminDasboardBlogSectionBlogDelete;


    //************* ELİS HANIM*********

    //**********************  ORDER ***************

    //adminDashBoard>>>>orderButton
    @FindBy(xpath = "//span[text()='Order']")
    public WebElement adminHomepageOrderbutton;


    //adminDashBoard>>>> birinciSayfaelementi
    @FindBy(xpath = "(//a[@class='page-link'])[2]")
    public WebElement adminOrderspageBirincisayfaElementi;


    //adminDashBoard>>>> birinciSayfailkSiparisElementi
    @FindBy(xpath = "(//td[@class='sorting_1'])[1]")
    public WebElement birinciSayfailkSiparisElementi;


    //adminDashBoard>>>> dorduncuSayfaelementi
    @FindBy(xpath="(//a[@class='page-link'])[5]")
    public WebElement adminOrderspageDorduncusayfaElementi;


    //adminDashBoard>>>> dorduncuSayfaikinciSiradakiSiparisElementi
    @FindBy(xpath = "(//td[@class='sorting_1'])[2]")
    public WebElement dorduncuSayfaikinciSiradakiSiparisElementi;


    //adminDashBoard>>>> altinciSayfaelementi
    @FindBy(xpath = "(//a[@class='page-link'])[5]")
    public WebElement adminOrderspageAltincisayfaElementi;


    //adminDashBoard>>>> altinciSayfasonSiparisElementi
    @FindBy(xpath = "(//td[@class='sorting_1'])[10]")
    public  WebElement altinciSayfasonSiparisElementi;


    //adminDashBoard>>>> ikinciSayfaelementi
    @FindBy(xpath = "(//a[@class='page-link'])[3]")
    public WebElement adminOrderspageIkincisayfaElementi;


    //adminDashBoard>>>> ikinciSayfailkSiparisdetailButonu
    @FindBy(xpath="(//a[text()='Detail'])[1]")
    public WebElement ikinciSayfailkSiparisdetailButonu;


    //adminDashBoard>>>> OrderdetailsButonu
    @FindBy(xpath = "//*[text()='Order Detail']")
    public WebElement OrderdetailsButonu;


    //adminDashBoard>>>> birinciSayfailkSiparisinvoiceButonu
    @FindBy(xpath = "(//a[text()='Invoice'])[1]")
    public WebElement birinciSayfailkSiparisinvoiceButonu;


    //adminDashBoard>>>> orderinvoiceButonu
    @FindBy(xpath = "(//*[text()='Order Invoice'])[2]")
    public WebElement OrderinvoiceButonu;


    //************************* SUBSCRIBER ****************

    //adminDashBoard>>>> subscriberButonu
    @FindBy(xpath = "//*[text()='Subscriber']")
    public WebElement subscriberButonu;


    //************************* ALL SUBSCRIBERS ****************
    //adminDashBoard>>>> allSubscribersbutonu
    @FindBy(xpath = "//a[text()='All Subscribers']")
    public WebElement allSubscribersbutonu;


    //adminDashBoard>>>> allSubscribersbirinciSayfaelementi
    @FindBy(xpath = "(//a[@class='page-link'])[2]")
    public WebElement allSubscribersbirinciSayfaelementi;


    //adminDashBoard>>>> allSubscribersikinciSayfaelementi
    @FindBy(xpath = "(//a[@class='page-link'])[3]")
    public WebElement allSubscribersikinciSayfaelementi;


    //adminDashBoard>>>> allSubscribersucuncuSayfaelementi
    @FindBy(xpath = "(//a[@class='page-link'])[4]")
    public WebElement allSubscribersucuncuSayfaelementi;


    //adminDashBoard>>>> allSubscribersdorduncuSayfaelementi
    @FindBy(xpath = "(//a[@class='page-link'])[5]")
    public WebElement allSubscribersdorduncuSayfaelementi;


    //adminDashBoard>>>> allSubscribersbesinciSayfaelementi
    @FindBy(xpath = "(//a[@class='page-link'])[6]")
    public WebElement allSubscribersbesinciSayfaelementi;


    //adminDashBoard>>>> allSubscribersaltinciSayfaelementi
    @FindBy(xpath = "(//a[@class='page-link'])[7]")
    public WebElement allSubscribersaltinciSayfaelementi;


    //adminDashBoard>>>> allSubscribersyedinciSayfaelementi
    @FindBy(xpath = "(//a[@class='page-link'])[8]")
    public WebElement allSubscribersyedinciSayfaelementi;


    //adminDashBoard>>>> allSubscriberssekizinciSayfaelementi
    @FindBy(xpath = "(//a[@class='page-link'])[9]")
    public WebElement allSubscriberssekizinciSayfaelementi;


    //adminDashBoard>>>> allSubscribersdokuzuncuSayfaelementi
    @FindBy(xpath = "(//a[@class='page-link'])[10]")
    public WebElement allSubscribersdokuzuncuSayfaelementi;


    //adminDashBoard>>>> allSubscribersonuncuSayfaelementi
    @FindBy(xpath = "(//a[@class='page-link'])[11]")
    public WebElement allSubscribersonuncuSayfaelementi;


    //************************* SEND EMAIL TO SUBSCRIBERS ****************

    //adminDashBoard>>>> sendEmailtoSubscribersButonu
    @FindBy(xpath = "//a[text()='Send Email to Subscribers']")
    public WebElement sendEmailtoSubscribersButonu;


    //adminDashBoard>>>> subjectYaziElementi
    @FindBy(xpath = "//input[@name='subject']")
    public WebElement subjectYaziElementi;


    //adminDashBoard>>>> messageTextboxElementi
    @FindBy(xpath="//div[@role='textbox']")
    public WebElement textBoxelementi;


    //adminDashBoard>>>> sendEmailButonu
    @FindBy(xpath = "//button[text()='Send Email']")
    public WebElement sendEmailButonu;


    //adminDashBoard>>>> emailIssentSuccesfullyYaziElementi
    @FindBy(xpath = "//*[contains(text(),'Email is sent successfully to all subscribers!')]")
    public WebElement emailIssentSuccesfullyYaziElementi;


    //adminDashBoard>>>> emailIssentSuccesfullyYaziElementi
    //@FindBy  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    public WebElement emailIssentSuccesfullyYaziElementii;


    //***************** Hüseyinn ************

    //adminDashboard>>>>>Sağ Ust Admin03_04_05Profil >>>
    @FindBy(xpath="//span[@class='mr-2 d-none d-lg-inline text-gray-600 small']")
    public WebElement adminDashboardAdmin03_04_05Profil;


    //adminDashboard>>>>>Sağ Ust Admin03_04_05Profil >>>change Password Linki
    @FindBy(xpath = "(//a[@class='dropdown-item'])[1]")
    public WebElement adminDashboardChangePassword;


    //adminDashboard>>>>>Sağ Ust Admin03_04_05Profil >>>change Password Linki >>>Edit Profile Text
    @FindBy(xpath = "//h6[@class='m-0 mt-2 font-weight-bold text-primary']")
    public WebElement adminDashboardEditProfilText;


    //adminDashboard>>>>>Sağ Ust Admin03_04_05Profil >>>change photo Linki
    @FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
    public WebElement adminDashboardChangePhoto;


    //adminDashboard>>>>>Sağ Ust Admin03_04_05Profil >>>change Password Linki >>>Edit Photo Text
    @FindBy(xpath = "//h6[@class='m-0 mt-2 font-weight-bold text-primary']")
    public WebElement adminDashboardEditPhotoText;


    //adminDashboard>>>>>Sağ Ust Admin03_04_05Profil >>>Logout
    @FindBy(xpath = "(//a[@class='dropdown-item'])[3]")
    public WebElement adminDashboardAdmin03_04_05ProfilLogout;


    //adminDashboard  >>>En Alttaki Daraltma Ok İşareti
    @FindBy(xpath = "//button[@class='rounded-circle border-0']")
    public WebElement adminDashboardDaraltmaOkIsareti;


    //adminDashboard  >>>Sağ Üst VisitWebsiteButonu
    @FindBy(xpath = "//a[@class='btn btn-info btn-sm mt-3']")
    public WebElement adminDashboardVisitWebsiteButonu;


    // *********** MERYEM HANIM ***********

    //admin04SagUsttekıCıkısButonu>>>>>>>>>sayfadan cıkıp site ekranına tekrar gidebilmek icin<<<<<<


    @FindBy(xpath =" //a[@class='nav-link dropdown-toggle']" )
    public WebElement admin04sagustbuton;


    @FindBy(xpath =" //i[@class='fas fa-unlock-alt fa-sm fa-fw mr-2 text-gray-400']" )
    public WebElement ChangePasswordbutonu;


    @FindBy(xpath =" //i[@class='fas fa-image fa-sm fa-fw mr-2 text-gray-400']" )
    public WebElement ChangePhotobuton;


    @FindBy(xpath =" //a[@class='dropdown-item'][2]" )
    public WebElement LogoutCikisbutonu;


    @FindBy(xpath =" //div[@class='topbar-divider d-none d-sm-block']" )
    public WebElement VisitWebsiteSiteEkraninaDonusbutonu;

    //************************* Dilan ****************
    //************************* DESTINATIONS ****************

    //adminDashBoard >>> Destinations >>> View Destinations Yazisi
    @FindBy(xpath = "//h6[text()='View Destinations']")
    public WebElement adminDashboardViewDestinationsText;

    //************************* DESTINATIONS ****************





    //adminDashBoard >>> Destinations >>> Add New Linki
    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement adminDashboardDestiAddNewLink;

    //adminDashBoard >>> Destinations >>> Add New Linki >>> Name textbox'i
    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement adminDashboardDestiNameTextbox;

    //adminDashBoard >>> Destinations >>> Add New Linki >>> Slug textbox'i
    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement adminDashboardDestiSlugTextbox;

    //adminDashBoard >>> Destinations >>> Add New Linki >>> Heading textbox'i
    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement adminDashboardHeadingTextbox;

    //adminDashBoard >>> Destinations >>> Add New Linki >>> Short Description textbox'i
    @FindBy(xpath = "//textarea[@name='d_short_description']")
    public WebElement adminDashboardDestiShortDescriptionTextbox;

    //adminDashBoard >>> Destinations >>> Add New Linki >>> Package Heading textbox'i
    @FindBy(xpath = "(//input[@type='text'])[4]")
    public WebElement adminDashboardPackageHeadingTextbox;

    //adminDashBoard >>> Destinations >>> Add New Linki >>> Package Subheading textbox'i
    @FindBy(xpath = "(//input[@type='text'])[5]")
    public WebElement adminDashboardPackageSubheadingTextbox;

    //adminDashBoard >>> Destinations >>> Add New Linki >>> Detail Heading textbox'i
    @FindBy(xpath = "(//input[@type='text'])[6]")
    public WebElement adminDashboardDetailHeadingTextbox;

    //adminDashBoard >>> Destinations >>> Add New Linki >>> Detail Subheading textbox'i
    @FindBy(xpath = "(//input[@type='text'])[7]")
    public WebElement adminDashboardDetailSubheadingTextbox;

    //adminDashBoard >>> Destinations >>> Add New Linki >>> Photo Dosya Seç Button
    @FindBy(xpath = "//input[@type='file']")
    public WebElement adminDashboardDestiDosyaSecButton;

    //adminDashBoard >>> Destinations >>> Add New Linki >>> Introduction textbox'i
    @FindBy(xpath = "(//div[@role='textbox'])[1]")
    public WebElement adminDashboardIntroductionTextbox;

    //adminDashBoard >>> Destinations >>> Add New Linki >>> Experience textbox'i
    @FindBy(xpath = "(//div[@role='textbox'])[2]")
    public WebElement adminDashboardExperienceTextbox;

    //adminDashBoard >>> Destinations >>> Add New Linki >>> Weather textbox'i
    @FindBy(xpath = "(//div[@role='textbox'])[3]")
    public WebElement adminDashboardWeatherTextbox;

    //adminDashBoard >>> Destinations >>> Add New Linki >>> Hotel textbox'i
    @FindBy(xpath = "(//div[@role='textbox'])[4]")
    public WebElement adminDashboardHotelTextbox;

    //adminDashBoard >>> Destinations >>> Add New Linki >>> Transportation textbox'i
    @FindBy(xpath = "(//div[@role='textbox'])[5]")
    public WebElement adminDashboardTransportationTextbox;

    //adminDashBoard >>> Destinations >>> Add New Linki >>> Culture textbox'i
    @FindBy(xpath = "(//div[@role='textbox'])[6]")
    public WebElement adminDashboardCultureTextbox;

    //adminDashBoard >>> Destinations >>> Add New Linki >>> Title textbox'i
    @FindBy(xpath = "//input[@name='seo_title']")
    public WebElement adminDashboardDestiTitleTextbox;

    //adminDashBoard >>> Destinations >>> Add New Linki >>> Meta Description textbox'i
    @FindBy(xpath = "//textarea[@name='seo_meta_description']")
    public WebElement adminDashboardDestiMetaDescriptionTextbox;

    //adminDashBoard >>> Destinations >>> Add New Linki >>> Submit button
    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement adminDashboardDestiSubmitButton;

    //adminDashBoard >>> Destinations >>> Add New Linki >>> Submit button'una tiklayinca sag yukari kosede cikan Destination added onay'i
    @FindBy(xpath = "//*[contains(text(), 'Destination is added successfully!')]")
    public WebElement adminDashboardDestinationAddedOnay;

    //adminDashBoard >>> Destinations >>> Sagdaki sari renli duzenleme button'u
    @FindBy(xpath = "(//a[@class='btn btn-warning btn-sm'])[9]")
    public WebElement adminDashboardDestiDuzenlemeButton;

    //adminDashBoard >>> Destinations >>> Sagdaki sari renli duzenleme button'u >>> Update Button
    @FindBy(xpath = "//button[text()='Update']")
    public WebElement adminDashboardDestiUpdateButton;

    //adminDashBoard >>> Destinations >>> Sagdaki sari renli duzenleme button'u >>> Update button'una tiklayinca sag yukari kosede cikan Destination updated onay'i
    @FindBy(xpath = "//*[contains(text(), 'Destination is updated successfully!')]")
    public WebElement adminDashboardDestinationUpdateOnay;

        //************************* PACKAGES ****************

    //adminDashBoard >>> Packages >>> View Packages Yazisi
    @FindBy(xpath = "//h6[text()='View Packages']")
    public WebElement adminDashboardViewPackagesText;

    //adminDashBoard >>> Packages >>> Add New Linki
    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement adminDashboardPackAddNewLink;

    //adminDashBoard >>> Packages >>> Add New Linki >>> Name textbox'i
    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement adminDashboardPackNameTextbox;

    //adminDashBoard >>> Packages >>> Add New Linki >>> Slug textbox'i
    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement adminDashboardPackSlugTextbox;

    //adminDashBoard >>> Packages >>> Add New Linki >>> Photo Dosya Seç Button
    @FindBy(xpath = "//input[@type='file']")
    public WebElement adminDashboardPackDosyaSecButton;

    //adminDashBoard >>> Packages >>> Add New Linki >>> Description textbox'i
    @FindBy(xpath = "(//div[@role='textbox'])[1]")
    public WebElement adminDashboardDescriptionTextbox;

    //adminDashBoard >>> Packages >>> Add New Linki >>> Short Description textbox'i
    @FindBy(xpath = "(//textarea[@class='form-control h_100'])[1]")
    public WebElement adminDashboardPackShortDescriptionTextbox;

    //adminDashBoard >>> Packages >>> Add New Linki >>> Location textbox'i
    @FindBy(xpath = "(//textarea[@class='form-control h_100'])[2]")
    public WebElement adminDashboardLocationTextbox;

    //adminDashBoard >>> Packages >>> Add New Linki >>> Start Date textbox'i
    @FindBy(xpath = "(//input[@class='form-control hasDatepicker'])[1]")
    public WebElement adminDashboardStartDateTextbox;

    //adminDashBoard >>> Packages >>> Add New Linki >>> End Date textbox'i
    @FindBy(xpath = "(//input[@class='form-control hasDatepicker'])[2]")
    public WebElement adminDashboardEndDateTextbox;

    //adminDashBoard >>> Packages >>> Add New Linki >>> Last Booking Date textbox'i
    @FindBy(xpath = "(//input[@class='form-control hasDatepicker'])[3]")
    public WebElement adminDashboardLastBookingDateTextbox;
    //adminDashBoard >>> Packages >>> Add New Linki >>> Map textbox'i
    @FindBy(xpath = "(//textarea[@class='form-control h_100'])[3]")
    public WebElement adminDashboardMapTextbox;

    //adminDashBoard >>> Packages >>> Add New Linki >>> Itinerary textbox'i
    @FindBy(xpath = "(//div[@role='textbox'])[2]")
    public WebElement adminDashboardItineraryTextbox;

    //adminDashBoard >>> Packages >>> Add New Linki >>> Price textbox'i
    @FindBy(xpath = "(//input[@class='form-control'])[3]")
    public WebElement adminDashboardPriceTextbox;

    //adminDashBoard >>> Packages >>> Add New Linki >>> Policy textbox'i
    @FindBy(xpath = "(//div[@role='textbox'])[3]")
    public WebElement adminDashboardPolicyTextbox;

    //adminDashBoard >>> Packages >>> Add New Linki >>> Terms textbox'i
    @FindBy(xpath = "(//div[@role='textbox'])[4]")
    public WebElement adminDashboardTermsTextbox;

    //adminDashBoard >>> Packages >>> Add New Linki >>> Is Featured dropdown
    @FindBy(xpath = "//select[@class='form-control']")
    public WebElement adminDashboardIsFeaturedDropDown;

    //adminDashBoard >>> Packages >>> Add New Linki >>> Is Featured dropdown >>> No option'u
    @FindBy(xpath = "//option[text()='No']")
    public WebElement adminDashboardIsFeaturedDropDownNoOption;

    //adminDashBoard >>> Packages >>> Add New Linki >>> Is Featured dropdown >>> Yes option'u
    @FindBy(xpath = "//option[text()='Yes']")
    public WebElement adminDashboardIsFeaturedDropDownYesOption;

    //adminDashBoard >>> Packages >>> Add New Linki >>> Destination textbox'i
    @FindBy(xpath = "//span[@role='textbox']")
    public WebElement adminDashboardDestinationTextbox;

    //adminDashBoard >>> Packages >>> Add New Linki >>> Title textbox'i
    @FindBy(xpath = "(//input[@class='form-control'])[4]")
    public WebElement adminDashboardPackTitleTextbox;

    //adminDashBoard >>> Packages >>> Add New Linki >>> Meta Description textbox'i
    @FindBy(xpath = "(//textarea[@class='form-control h_100'])[4]")
    public WebElement adminDashboardPackMetaDescriptionTextbox;

    //adminDashBoard >>> Packages >>> Add New Linki >>> Submit button
    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement adminDashboardPackSubmitButton;

    //adminDashBoard >>> Packages >>> Add New Linki >>> Submit button'una tiklayinca sag yukari kosede cikan Package added onay'i
    @FindBy(xpath = "//*[contains(text(), 'Package is added successfully!')]")
    public WebElement adminDashboardPackageAddedOnay;

    //adminDashBoard >>> Packages >>> Sagdaki sari renli duzenleme button'u
    @FindBy(xpath = "(//a[@class='btn btn-warning btn-sm'])[8]")
    public WebElement adminDashboardPackDuzenlemeButton;

    //adminDashBoard >>> Packages >>> Sagdaki sari renli duzenleme button'u >>> Update Button
    @FindBy(xpath = "//button[text()='Update']")
    public WebElement adminDashboardPackUpdateButton;

    //adminDashBoard >>> Destinations >>> Sagdaki sari renli duzenleme button'u >>> Update button'una tiklayinca sag yukari kosede cikan Package updated onay'i
    @FindBy(xpath = "//*[contains(text(), 'Package is updated successfully!')]")
    public WebElement adminDashboardPackageUpdatedOnay;

    //adminDashBoard >>> Packages >>> Sagdaki kirmizi renkli silme butonu
    @FindBy(xpath = "(//a[@class='btn btn-danger btn-sm'])[8]")
    public WebElement adminDashboardSilmeButton;

    //adminDashBoard >>> Packages >>> Sagdaki kirmizi renkli silme butonu >> Silme buton'una tiklayinca sag yukari kosede cikan Package deleted onay'i
    @FindBy(xpath = "//*[contains(text(), 'Package is deleted successfully!')]")
    public WebElement adminDashboardPackageDeletedOnay;





}
