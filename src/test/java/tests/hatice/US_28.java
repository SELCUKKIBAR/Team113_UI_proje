package tests.hatice;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AdminDashboard;
import pages.UserDashboard;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_28 extends TestBaseRapor {

    @Test
    public void AdminPanelindeBlogSectionTesti(){
        extentTest=extentReports.createTest("Admin Panelinde Blog Section Testi",
                "Kullanici Admin Panelinde Blog Section kismina gidebilmelidir.");

        Driver.getDriver().get(ConfigReader.getProperty("trpAdminURL"));
        extentTest.info("Kullanici tripandway sayfasina gider;");

        //2-Admin Paneli olan sayfanin goruntulenebildigi dogrulanir

        AdminDashboard adminDashboard=new AdminDashboard();

        adminDashboard.adminDashboardEmailKutusu.sendKeys(ConfigReader.getProperty("adminEmail_01"));

        adminDashboard.adminDashboardPasswordKutusu.sendKeys(ConfigReader.getProperty("adminPassword_01"));

        adminDashboard.adminDashboardLoginButonu.click();
        extentTest.info("Kullanici Admim Login butonuna tiklar");

        Assert.assertTrue(adminDashboard.adminDashboardAdminPanelGirisDogrulama.isDisplayed());
        extentTest.pass("Assertion ile Admin Panelinin gorunur oldugu test edilir.");




        Driver.closeDriver();
        extentTest.pass("Sayfa kapatilir.");

    }
    @Test
    public void adminpanelinegiris() {
        extentTest=extentReports.createTest("Admin Paneline Giris Testi",
                "Kullanici admin panelinde email ve password yazaip giris yapabilmeli.");
        Driver.getDriver().get(ConfigReader.getProperty("trpAdminURL"));
        extentTest.info("Kullanici tripandway sayfasindaki Admin Paneli'ne gider;");

        AdminDashboard adminDashboard = new AdminDashboard();

        adminDashboard.adminDashboardEmailKutusu.sendKeys(ConfigReader.getProperty("adminEmail_01"));

        adminDashboard.adminDashboardPasswordKutusu.sendKeys(ConfigReader.getProperty("adminPassword_01"));

        adminDashboard.adminDashboardLoginButonu.click();
        extentTest.info("Kullanici admin paneli girisine tiklar.");

        adminDashboard.adminDasboardBlogSectionElementi.click();
        extentTest.info("Kullanici Blog Section Bolumu'ne giris icin tiklar.");

        adminDashboard.adminDasboardBlogCatagories.click();
        extentTest.info("Kullanici Blog Section'daki categories bolumune tiklar.");

        adminDashboard.adminDasboardBlogAddNew.click();
        extentTest.info("Kullanici yeni kategori eklemek icin Add New butonuna tiklar");

        adminDashboard.adminDasboardBlogAddNewCategoryName.sendKeys(ConfigReader.getProperty("categoryName"));

        adminDashboard.adminDasboardBlogAddNewCategorySlug.sendKeys(ConfigReader.getProperty("categorySlug"));

        adminDashboard.adminDasboardBlogAddNewSeo_Submit.click();

        SoftAssert softAssert=new SoftAssert();

        String expectedUyariMesaji = ConfigReader.getProperty("categoryUyariMesaji");

        UserHomePage userHomePage = new UserHomePage();

        String actualUyariMesaji = userHomePage.warningMessage.getText();

        softAssert.assertEquals(actualUyariMesaji, expectedUyariMesaji,
                "Category is added successfully! mesaji gorulmelidir");
        extentTest.pass("Kullanicinin yeni category ekleyebildigi test edilir");

        adminDashboard.categoryUpdateButon.click();
        extentTest.info("Category update butonuna tiklanir.");

        adminDashboard.adminDasboardBlogAddNewSeo_title.sendKeys(ConfigReader.getProperty("categoryName"));

        adminDashboard.adminDasboardBlogAddNewSeo_Edit_Update.click();
        extentTest.info("Seo Edit kisminin update edilmesi icin tiklanir.");

        expectedUyariMesaji= ConfigReader.getProperty("categoryUpdateUyariMesaji");

        softAssert.assertEquals(actualUyariMesaji,expectedUyariMesaji,
                "Category is updated successfully! mesaji gorunmelidir");
        extentTest.pass("Kullanicinin basariyla update ettigi test edilir");

        adminDashboard.categoryDeleteButonu.click();
        extentTest.info("Category Delete butonuna tiklanir.");
        Driver.getDriver().switchTo().alert().accept();

        expectedUyariMesaji= ConfigReader.getProperty("categoryDeleteUyariMesaji");

        softAssert.assertEquals(actualUyariMesaji,expectedUyariMesaji,
                "Category is deleted successfully! yazisi gorunmelidir");
        extentTest.pass("Category'nin basarili bir sekilde silindigi test edilir.");


        Driver.closeDriver();
        extentTest.pass("Sayfa kapatilir.");


    }


}
