package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserHomePage {

    public UserHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    // Home Page --> Uyari Mesajlari (Sag yukarida cikan butun uyari mesajlari icin, dinamik locater)
    @FindBy(className = "toast-message")
    public WebElement warningMessage;


    //Home Page --> Slide Pictures --> First Picture
    @FindBy(xpath ="//div[@class='owl-item active']//h1[@class='fadeInDown animated'][normalize-space()='Explore the World']")
    public WebElement homepageIlkresim;


    //Home Page --> Slide Pictures --> Secand Picture
    @FindBy(xpath ="//div[@class='owl-item active']//h1[@class='fadeInDown animated'][normalize-space()='Salina Island']" )
    public WebElement homePageIkinciREsim;


    //Home Page --> Slide Pictures --> Thirt Picture
    @FindBy(id ="//div[@class='owl-item active']//h1[@class='fadeInDown animated'][normalize-space()='The World is So Beautiful']")
    public WebElement homePageUcuncuREsim;;


    //Home Page --> Slide Pictures --> Resim Gecis Button
    @FindBy(xpath = "//div[@class='slide-carousel owl-carousel owl-loaded owl-drag']//div[@class='owl-next']")
    public WebElement resimGecisButton;


    //Home Page --> Slide Pictures --> Read Button
    @FindBy(xpath ="//div[@class='owl-item active']//div[@class='slider-item']//a[contains(text(),'Read More')]")
    public WebElement homePageIlkResimReadButton;


    //Home Page --> Tel Nummer
    @FindBy(xpath = "//div[@class='top-header-left']//p[contains(text(),'202-456-3789')]")
    public WebElement homePageTelNummer;


    //Home Page --> Email Adress
    @FindBy(xpath ="//div[@class='top-header-left']//p[contains(text(),'202-456-3789')]")
    public WebElement homePageEmailAdress;


    //Home Page --> Registration Button
    @FindBy(xpath ="//a[normalize-space()='Registration']" )
    public WebElement homePageRegistrationButton;


    //Home Page --> Login Button
    @FindBy(xpath ="//a[normalize-space()='Login']")
    public WebElement homePageLoginButton;


    //Home Page --> Home Button
    @FindBy(xpath = "//ul[@id='menu']//a[normalize-space()='Home']")
    public WebElement homePageHomeButton;


    //Home Page --> Service Button
    @FindBy(xpath ="//ul[@id='menu']//a[normalize-space()='Services’]")
    public WebElement homeButtonServicesButton;


    //Home Page --> Destination Button
    @FindBy(xpath = "//ul[@id='menu']//a[normalize-space()='Destinations']")
    public WebElement homePageDestinationsButton;


    //Home Page --> Package Button
    @FindBy(xpath ="//ul[@id='menu']//a[normalize-space()='Packages']")
    public WebElement homePagePackagesButton;


    //Home Page --> AboutUs Button
    @FindBy(xpath = "//ul[@id='menu']//a[normalize-space()='About Us’]")
    public WebElement homePageAboutUsButton;


    //Home Page --> Faq Button
    @FindBy(xpath ="//ul[@id='menu']//a[normalize-space()='FAQ']")
    public WebElement homePageFaqButton;


    //Home Page --> Blog Button
    @FindBy(xpath = "//ul[@id='menu']//a[normalize-space()='Blog']")
    public WebElement homePageBlogButton;


    //Home Page --> Contact Button
    @FindBy(xpath ="//ul[@id='menu']//a[normalize-space()='Contact']")
    public WebElement homePageContactButton;


    //Home Page --> Our Service Line Text
    @FindBy(xpath = "//div[@class='service-area pt_80 pb_80']//div[@class='main-headline']" )
    public WebElement ourServiceaheadLIneText;


    //Home Page --> Our Service --> International Tour Button
    @FindBy(xpath ="//a[@href='https://qa.tripandway.com/service/international-tour']")
    public WebElement InternationalTourButton;


    //Home Page --> Our Service --> adventure Tour Button
    @FindBy(xpath = "//a[@href='https://qa.tripandway.com/service/adventure-tour']")
    public WebElement adventureTourButton;


    //Home Page --> Our Service --> culture Tour Button
    @FindBy(xpath = "//a[@href='https://qa.tripandway.com/service/culture-tour']")
    public WebElement cultureTourButton;


    //Home Page --> featured Package Head Text
    @FindBy(xpath = "//div[@class='featured-package bg-area pt_80 pb_80']//div[@class='main-headline']")
    public WebElement featuredPackageHeadText;


    //Home Page --> Team Members  --> Twitter Button
    @FindBy(xpath ="(//i[@class='fab fa-twitter'])[5]")
    public WebElement teamMembersTwitterButton;


    //Home Page --> Team Members  --> Twitter Image
    @FindBy(xpath = "//*[name()='path' and contains(@d,'M23.643 4.')]")
    public WebElement teamMembersTwitterImage;


    //Home Page --> Team Members  --> Facebook Button
    @FindBy(xpath ="(//i[@class='fab fa-facebook-f'])[5]")
    public WebElement teamMembersFacebookButton;


    //Home Page --> Team Members  --> Facebook Image
    @FindBy(xpath = "//img[@alt='Facebook']")
    public WebElement teamMembersFacebookImage;

    //Home Page --> Team Members  --> Linkedin Button
    @FindBy(xpath = "(//i[@ class=\"fab fa-linkedin-in\"])[8]")
    public WebElement teamMembersLinkedinButton;


    //Home Page --> Team Members  --> Linkedin Image
    @FindBy(xpath ="//icon[@class='block text-color-brand w-//*[name()='svg']")
    public WebElement teamMembersLinkedinImage;


    // Home Page --> footer --> Privacy Policy
    @FindBy(xpath = "//*[text()='Privacy Policy']")
    public WebElement privacyPolicy;


    // Home Page --> footer --> Terms and Conditions
    @FindBy(xpath = "//*[text()='Terms and Conditions']")
    public WebElement termsAndConditions;


    // Home Page --> footer -->Featured Packages Yazisi
    @FindBy(xpath = "//*[text()='Featured Packages']")
    public WebElement FeaturedPackagesYazisi;


    // Home Page --> Featured Packages --> 3 days in Buenos Aires
    @FindBy(xpath = "(//*[text()='3 days in Buenos Aires'])[2]")
    public WebElement threeDaysInBuenosAires;


    // Home Page --> Featured Packages --> 10 days in Buenos Aires
    @FindBy(xpath = "(//*[text()='10 days in Buenos Aires'])[2]")
    public WebElement tenDaysInBuenosAires;


    // Home Pages --> Featured Packages --> 3 days in Bangkok
    @FindBy(xpath = "(//*[text()='3 days in Bangkok'])[2]")
    public WebElement threeDaysInBangkok;


    // Home Page --> Featured Packages --> 7 days in Salina Island
    @FindBy(xpath = "(//*[text()='7 days in Salina Island'])[2]")
    public WebElement sevenDaysInSalinaIslandFeaturedPackages;


    // Home Page --> footer --> Latest Packages Yazisi
    @FindBy(xpath = "//*[text()='Latest Packages']")
    public WebElement LatestPackagesYazisi;


    // Home Page --> Latest Packages --> 3 days in Nahcivan
    @FindBy(xpath = "//a[normalize-space()='3 Days in Nahcivan']")
    public WebElement threeDaysInNahcivan;


    // Home Page --> Latest Packages --> 5 days in Rome
    @FindBy(xpath = "//a[normalize-space()='3 days in Rome']")
    public WebElement threeDaysInRome;


    // Home Page --> Latest Packages --> 5 days California
    @FindBy(xpath = "//*[text()='5 Day California']")
    public WebElement fiveDaysCalifornia;


    // Home Page --> Latest Packages --> 7 days in Salina Island
    @FindBy(xpath = "(//*[text()='7 days in Salina Island'])[3]")
    public WebElement sevenDaysInSalinaIslandLatestPackages;


    // Home Page --> Latest Packages --> 3 days in Bangkok
    @FindBy(xpath = "(//*[text()='3 days in Bangkok'])[3]")
    public WebElement getThreeDaysInBangkokLatestPackages;


    // Home Page --> footer --> Recent Posts
    @FindBy(xpath = "//*[text()='Recent Posts']")
    public WebElement recentPostYazisi;


    // Home Page --> Recent Posts --> Huzura Dogru
    @FindBy(xpath = "//div[@class='footer-item mt_30']//a[contains(text(),'Huzura Doğru')]")
    public WebElement huzuraDogru;


    // Home Page --> Recent Posts --> Discovering Greenville
    @FindBy(xpath = "(//*[text()='Discovering Greenville: A Hidden Gem in South Carolina'])[3]")
    public WebElement discoveringGreenvilleRecentPost;


    // Home Page --> Recent Posts --> Buenos Aires
    @FindBy(xpath = "(//*[text()='Buenos Aires: The Paris of South America'])[3]")
    public WebElement buenosAiresRecentPosts;


    // Home Page --> Recent Posts --> Bangkok
    @FindBy(xpath = "(//*[text()='Bangkok: A City of Contrasts'])[3]")
    public WebElement bangkokRecentPosts;


    // Home Page --> Recent Posts -->Salina Island
    @FindBy(xpath = "(//*[text()='Salina Island: A Perfect Family Getaway'])[3]")
    public WebElement salinaIslandRecentPosts;


    //Home Page --> footer --> Address Yazisi
    @FindBy(xpath = "//*[text()='Address']")
    public WebElement addressYazisi;


    // Home Page --> Address --> 34,Edd Lane, NYC, 22335
    @FindBy(xpath = "//*[text()='34, Edd Lane, NYC, 22335']")
    public WebElement addressAddress;


    // Home Page --> Address --> 202-456-3789
    @FindBy(xpath = "(//*[text()='202-456-3789'])[2]")
    public WebElement addressTelefonNo;


    // Home Page --> Address --> Address -->  info@tripandway.com
    @FindBy(xpath = "(//*[text()='info@tripandway.com'])[2]")
    public WebElement addressEmail;


    // Home Page --> footer --> Facebook Logo
    @FindBy(xpath = "//div[@class='col-md-3 col-sm-6 wow fadeInRight']//li[1]//a[1]")
    public WebElement facebookLogoHomePage;


    // Home Page --> footer --> Facebook Logo --> Acilan sayfada "facebook" yazisi
    @FindBy(xpath = "//img[@class='fb_logo _8ilh img']")
    public WebElement facebookLogoFacebookYazisiHomePage;


    // Home Page--> footer --> Twitter Logo
    @FindBy(xpath = "//a[@href='http://www.facebook.com']//i[@class='fab fa-twitter']")
    public WebElement twitterLogoHomePage;


    // Home Page --> footer --> Twitter Logo --> Acilan sayfada "Ayarlar" yazisi
    @FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-sdzlij r-18u37iz r-1777fci r-dnmrzs r-xyw6el r-o7ynqc r-6416eg'])[2]")
    public WebElement twitterLogoAyarlarYazisiHomePage;


    // Home Page--> footer --> LinkedIn Logo
    @FindBy(xpath = "(//i[@class='fab fa-linkedin-in'])[13]")
    public WebElement linkedInLogoHomePage;


    // Home Page--> footer --> LinkedIn Logo --> Acilan sayfada LinkedIn logosu
    @FindBy(xpath = "(//*[@aria-busy='false'])[2]")
    public WebElement linkedInSayfaLinkedInLogoHomePage;


    // Home Page --> footer --> Instagram Logo
    @FindBy(xpath = "//a[@href='http://www.instagram.com']")
    public WebElement instagramLogoHomePage;


    // Home Page --> footer --> Pinterest Logo
    @FindBy(xpath = "//a[@href='https://twitter.com']")
    public WebElement pinterestLogoHomePage;


    // Home Page --> footer --> Pinterest Logo --> Acilan sayfada Pinterest logosu
    @FindBy(xpath = "//i[@class='fab fa-pinterest-p']")
    public WebElement pinterestSayfaPinterestLogoHomePage;


    // Home Page --> footer --> Scroll Top
    @FindBy(xpath = "//div[@class='scroll-top']")
    public WebElement scrollTopHomePage;



    // Home Page --> Newsletter --> Arama Kutus

    // Home Page --> Newsletter --> Arama Kutusu



    @FindBy(xpath = "//input[@placeholder='Email Address']")
    public WebElement newsletterAramaKutusu;


    // Home Page --> Newsletter --> Submit
    @FindBy(xpath = "//input[@value='Submit']")
    public WebElement newsletterSubmit;


    // Home Page --> Newsletter Yazisi
    @FindBy(xpath = "//*[text()='Newsletter']")
    public WebElement newsletterYazisiHomePage;



    // Home Page --> Newsletter sag yukari kosede cikan yazi onay'i
    @FindBy(xpath = "//*[contains(text(), 'To activate your subscription please check your email and follow instruction there.')]")
    public WebElement newsletterYaziOnayHomePage;



    // Home Page --> Our Client Yazisi
    @FindBy(xpath = "//*[text()='OUR CLIENT']")
    public WebElement ourClientYazisi;


    // Home Page --> Destination --> Marrakesh Morrocco
    @FindBy(xpath = "//a[normalize-space()='Marrakesh, Morocco']")
    public WebElement marrakeshMoroccoHomePage;


    // Home Page --> Destination --> Salina Island
    @FindBy(xpath = "//a[normalize-space()='Salina Island, Italy']")
    public WebElement salinaIslandHomePage;


    //  Home Page --> Destination --> Istanbul
    @FindBy(xpath = "//a[normalize-space()='Istanbul, Turkey']")
    public WebElement istanbulTurkeyHomePage;


    // Home Page --> Our Services --> Bussiness Tour
    @FindBy(xpath = "//h4[normalize-space()='Bussiness Tour']")
    public WebElement bussinessTourHomePage;


    // Home Page --> Our Services --> Health Tour
    @FindBy(xpath = "//h4[normalize-space()='Health Tour']")
    public WebElement healthTourHomePage;


    // Home Page --> Our Services --> Religious Tour
    @FindBy(xpath = "//h4[normalize-space()='Religious Tour']")
    public WebElement religiousTour;

}
