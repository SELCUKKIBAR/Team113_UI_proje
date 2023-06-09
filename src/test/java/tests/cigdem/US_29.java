package tests.cigdem;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AdminDashboard;
import pages.UserHomePage;
import utilities.*;


public class US_29 extends TestBaseRapor {

    private SoftAssert softAssert = new SoftAssert();
    private UserHomePage userHomePage = new UserHomePage();

    private AdminDashboard adminDashboard = new AdminDashboard();

    @Test
    public void adminBlogsYeniBlogYazisi() {

        extentTest = extentReports.createTest("Tripandway AdminOrderInvoiceYazisi testi",
                "Kullanici Order Invoice fatura bilgisi sayfasinin göruntulendigini test eder");

        //1- Kullanıcı https://qa.tripandway.com/admin/login sayfasına gider
        Driver.getDriver().get(ConfigReader.getProperty("trpAdminURL"));
        extentTest.info("Kullanici tripandway ADMIN anasayfasina gider...");

        //2- Kullanıcı Email Adress ve Password kutucuklarına geçerli email ve şifre girer

        adminDashboard.adminDashboardEmailKutusu.sendKeys(ConfigReader.getProperty("adminEmail_01"));
        adminDashboard.adminDashboardPasswordKutusu.sendKeys(ConfigReader.getProperty("adminPassword_01"));
        extentTest.info("Kullanici Email Adress ve Passwrod kutucuklarına geçerli email ve şifre girer...");

        //3- Kullanıcı Login Butonuna tıklar
        adminDashboard.adminDashboardLoginButonu.click();
        extentTest.info("Kullanici Login Butonuna tıklar...");

        ReusableMethods.bekle(2);

        //4- Kullanıcı sağ üst köşede bulunan admin04 yazisının görürünür olduğunu kontrol ederek Admin panele girdiğini doğrular

        String expectedMesaj = ConfigReader.getProperty("adminIsmi");
        String actualMesaj = adminDashboard.admin04sagustbuton.getText();

        softAssert.assertTrue(actualMesaj.equals(expectedMesaj), "Sağ üst köşedeki admin adı doğru olmalı");
        extentTest.info("Soft assert ile Admin adinin dogru oldugu test edilir...");

        //5-Kullanıcı Admin panelinde bulunan Blog Section elementine tıklar

        adminDashboard.adminDasboardBlogSectionElementi.click();
        extentTest.info("Kullanici Blog Section Butonuna tıklar...");
        ReusableMethods.bekle(2);

        //6- Kullanıcı açılan Blog elementine tiklar

        adminDashboard.adminDasboardBlogSectionBlogs.click();
        extentTest.info("Kullanici Blog Sectionin altinda acilan Blogs Butonuna tıklar...");

        //7- Kullanıcı acilan View Blogs  sayfasinda  sağ üstte bulunan Add New butonuna tıklar
        adminDashboard.adminDasboardBlogSectionBlogsAddNew.click();
        extentTest.info("Kullanıcı acilan View Blogs  sayfasinda  sağ üstte bulunan Add New butonuna tıklar...");


        //8- Kullanıcı gerekli alanlara gerekli bilgileri girer
        adminDashboard.adminDasboardBlogSectionBlogsBlogTitle.sendKeys(ConfigReader.getProperty("blogTitle"));
        extentTest.info("Kullanici Blog Title kutucuguna gerekli datayi girer...");
        ReusableMethods.bekle(2);
        adminDashboard.adminDasboardBlogSectionBlogsBlogContent.sendKeys(ConfigReader.getProperty("blogContent"));
        extentTest.info("Kullanici Blog Content kutucuguna gerekli datayi girer...");
        ReusableMethods.bekle(2);
        adminDashboard.adminDasboardBlogSectionBlogsBlogShortContent.sendKeys(ConfigReader.getProperty("blogShortContent"));
        extentTest.info("Kullanici Blog Short Content kutucuguna gerekli datayi girer...");
        ReusableMethods.bekle(2);


        //9- Kullanici Dosya Sec butonuna basar
        String dosyaYolu = System.getProperty("user.dir") + "/image/blog-6.jpg";
        adminDashboard.adminDasboardBlogSectionBlogsBlogPhoto.sendKeys(dosyaYolu);
        extentTest.info("Kullanici Dosya Sec butonuna dosya ekler...");
        ReusableMethods.bekle(2);


        //10- Kullanıcı gerekli alanlara gerekli bilgileri girer ve submit tuşuna basar

        Select select = new Select(adminDashboard.adminDasboardBlogSectionSelectCategory);
        select.selectByVisibleText(ConfigReader.getProperty("selectCategory"));
        extentTest.info("Kullanici Dropdown menusunden gerekli option'u secer...");

        Select select1 = new Select(adminDashboard.adminDasboardBlogSectionShowComment);
        select1.selectByVisibleText(ConfigReader.getProperty("showComment"));
        extentTest.info("Kullanici Dropdown menusunden gerekli option'u secer...");

        adminDashboard.adminDasboardBlogSectionSEOSubmit.click();
        extentTest.info("Kullanici Submit butonuna tiklar...");

        //11- Kullanıcı yeni bir Blog yazisinin başarılı bir şekilde eklendiğini  Blogs (View Blogs) sayfasina giderek test eder.

        ReusableMethods.bekle(2);

        String expectedUyariMesaji = ConfigReader.getProperty("blogsSubmitExpectedUyariMesaji");
        String actualUyariMesaji = userHomePage.warningMessage.getText();
        softAssert.assertEquals(actualUyariMesaji, expectedUyariMesaji);
        extentTest.info("Kullanici blog ekledikten sonra uyari mesajinin gozuktugunu test eder...");

        softAssert.assertAll();
        extentTest.pass("Soft assert ile yapilan tum testlerin sonucunu raporlar...");

        Driver.quitDriver();
        extentTest.info("Sayfayi kapatir");

    }

    @Test
    public void adminBlogsYeniBlogYazisiEdit() {

        extentTest = extentReports.createTest("Tripandway AdminOrderInvoiceYazisi testi",
                "Kullanici Order Invoice fatura bilgisi sayfasinin göruntulendigini test eder");

        //1- Kullanıcı https://qa.tripandway.com/admin/login sayfasına gider
        Driver.getDriver().get(ConfigReader.getProperty("trpAdminURL"));
        extentTest.info("Kullanici tripandway ADMIN anasayfasina gider...");

        //2- Kullanıcı Email Adress ve Password kutucuklarına geçerli email ve şifre girer

        adminDashboard.adminDashboardEmailKutusu.sendKeys(ConfigReader.getProperty("adminEmail_01"));
        adminDashboard.adminDashboardPasswordKutusu.sendKeys(ConfigReader.getProperty("adminPassword_01"));
        extentTest.info("Kullanici Email Adress ve Password kutucuklarına geçerli email ve şifre girer...");

        //3- Kullanıcı Login Butonuna tıklar
        adminDashboard.adminDashboardLoginButonu.click();
        extentTest.info("Kullanici Login Butonuna tıklar...");

        ReusableMethods.bekle(2);

        //4-Kullanıcı Admin panelinde bulunan Blog Section elementine tıklar

        adminDashboard.adminDasboardBlogSectionElementi.click();
        extentTest.info("Kullanici Blog Section Butonuna tıklar...");
        ReusableMethods.bekle(2);

        //5- Kullanıcı açılan Blog elementine tiklar

        adminDashboard.adminDasboardBlogSectionBlogs.click();
        extentTest.info("Kullanici Blog Sectionin altinda acilan Blogs Butonuna tıklar...");
        ReusableMethods.bekle(3);

        //6- Kullanıcı eklenen Blog yazisina kadar iner
        JSUtilities.scrollToElement(Driver.getDriver(),adminDashboard.adminDasboardBlogSectionYeniEklenenSatir);
        extentTest.info("Kullanici eklenen Blog yazisina kadar iner...");


        //7- Kullanıcı açılan Edit elementine tiklar
        adminDashboard.adminDasboardBlogSectionEdit.click();
        extentTest.info("Kullanıcı açılan Edit elementine tiklar...");

        //8- Kullanıcı edit yapilan sayfada tekrar asagi iner
        JSUtilities.scrollToElement(Driver.getDriver(),adminDashboard.adminDasboardBlogSectionSelectCategory);
        extentTest.info("Kullanıcı edit yapilan sayfada tekrar asagi iner...");

        //9- Kullanıcı gerekli alanlara gerekli bilgileri girer

        Select select1 = new Select(adminDashboard.adminDasboardBlogSectionShowComment);
        select1.selectByVisibleText(ConfigReader.getProperty("showComment1"));
        extentTest.info("Kullanici Dropdown menusunden gerekli option'u secer...");

        //10- Kullanici Update tuşuna basar
        adminDashboard.adminDasboardBlogSectionUpdate.click();
        extentTest.info("Kullanici Update tuşuna basar...");

        //11- Kullanıcı yeni bir Blog yazisinin başarılı bir şekilde degistirildigini Blogs (View Blogs) sayfasina giderek test eder.

        ReusableMethods.bekle(2);

        String expectedUyariMesaji = ConfigReader.getProperty("blogsUpdateExpectedUyariMesaji");
        String actualUyariMesaji = userHomePage.warningMessage.getText();
        softAssert.assertEquals(actualUyariMesaji, expectedUyariMesaji);
        extentTest.info("Kullanici blogu sildikten sonra uyari mesajinin gorundugunu test eder...");

        JSUtilities.scrollToElement(Driver.getDriver(),adminDashboard.adminDasboardBlogSectionYeniEklenenSatir);
        extentTest.info("Kullanici eklenen Blog yazisina kadar iner...");

        adminDashboard.adminDasboardBlogSectionBlogDelete.click();
        extentTest.info("Kullanici Delete tusuna basar...");

        Driver.getDriver().switchTo().alert().accept();
        extentTest.info("Alerte gecer ve tamam butonuna tiklar...");

        ReusableMethods.bekle(2);

        expectedUyariMesaji = ConfigReader.getProperty("blogsDeleteExpectedUyariMesaji");
        actualUyariMesaji = userHomePage.warningMessage.getText();
        softAssert.assertEquals(actualUyariMesaji, expectedUyariMesaji);
        extentTest.info("Kullanici blogu sildikten sonra uyari mesajinin gorundugunu test eder...");

        softAssert.assertAll();
        extentTest.pass("Soft assert ile yapilan tum testlerin sonucunu raporlar...");


        Driver.quitDriver();
        extentTest.info("Sayfayi kapatir");


    }


}









