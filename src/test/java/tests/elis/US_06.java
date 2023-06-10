package tests.elis;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UserDashboard;
import pages.UserHomePage;
import utilities.*;

public class US_06 extends TestBaseRapor {

    UserHomePage userHomePage = new UserHomePage();
    private SoftAssert softAssert = new SoftAssert();

    @BeforeMethod
    private void setUp() {
        extentTest = extentReports.createTest("Tripandway sayfasindaki footer bolumundeki recent post ogeleri testi ",
                "Kullanici footer bolumunde recent post kismindaki ogeleri goruntuleyebildigini dogrulayabilmeli");

        Driver.getDriver().get(ConfigReader.getProperty("trpURL"));
        extentTest.info("Kullanici Tripandway sayfasina gider");

        UserDashboard userDashboard = new UserDashboard();
        userDashboard.tripandwayCookies.click();
        extentTest.info("Cookies'i kabul eder");

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        extentTest.info("JavaScript ile footer bolumune kadar scroll yapar");

    }

    @AfterMethod
    public void teardown() {
        Driver.quitDriver();
        extentTest.info("Sayfayi kapatir");
    }

    @Test
    public void test01() {

        WebElement birincisatirdakielement = Driver.getDriver().findElement(By.xpath("(//div[@class='footer-item mt_30'])[3]//ul//li//a[1]"));
        birincisatirdakielement.click();
        extentTest.info("recent post kismindaki 1. elemente tiklanir");
        ReusableMethods.bekle(2);
        WebElement categoriesyaziElementi= Driver.getDriver().findElement(By.xpath("(//div[@class='sidebar-item'])[2]//h3"));
        softAssert.assertTrue(categoriesyaziElementi.isDisplayed(), "Sayfanin basligi goruntulendi");
        extentTest.info("softassert ile recent post kismindaki 1. elementin gorunurlugu test edildi");

    }

    @Test
    public void test02() {

        WebElement ikincisatirdakielement = Driver.getDriver().findElement(By.xpath("(//div[@class='footer-item mt_30'])[3]//ul//li[2]//a"));
        ikincisatirdakielement.click();
        extentTest.info("recent post kismindaki 2. elemente tiklanir");
        ReusableMethods.bekle(2);
        WebElement categoriesyaziElementi= Driver.getDriver().findElement(By.xpath("(//div[@class='sidebar-item'])[2]//h3"));
        softAssert.assertTrue(categoriesyaziElementi.isDisplayed(), "Sayfanin basligi goruntulendi");
        extentTest.info("softassert ile recent post kismindaki 2. elementin gorunurlugu test edildi");

    }

    @Test
    public void test03() {

        WebElement ucuncusatirdakielement = Driver.getDriver().findElement(By.xpath("(//div[@class='footer-item mt_30'])[3]//ul//li[3]//a"));
        ucuncusatirdakielement.click();
        extentTest.info("recent post kismindaki 3. elemente tiklanir");
        ReusableMethods.bekle(2);
        WebElement categoriesyaziElementi= Driver.getDriver().findElement(By.xpath("(//div[@class='sidebar-item'])[2]//h3"));
        softAssert.assertTrue(categoriesyaziElementi.isDisplayed(), "Sayfanin basligi goruntulendi");
        extentTest.info("softassert ile recent post kismindaki 3. elementin gorunurlugu test edildi");

    }

    @Test
    public void test04() {

        WebElement dorduncusatirdakielement = Driver.getDriver().findElement(By.xpath("(//div[@class='footer-item mt_30'])[3]//ul//li[4]//a"));
        dorduncusatirdakielement.click();
        extentTest.info("recent post kismindaki 4. elemente tiklanir");
        ReusableMethods.bekle(2);
        WebElement categoriesyaziElementi= Driver.getDriver().findElement(By.xpath("(//div[@class='sidebar-item'])[2]//h3"));
        softAssert.assertTrue(categoriesyaziElementi.isDisplayed(), "Sayfanin basligi goruntulendi");
        extentTest.info("softassert ile recent post kismindaki 4. elementin gorunurlugu test edildi");
    }

    @Test
    public void test05() {

        WebElement besincisatirdakielement = Driver.getDriver().findElement(By.xpath("(//div[@class='footer-item mt_30'])[3]//ul//li[5]//a"));
        besincisatirdakielement.click();
        extentTest.info("recent post kismindaki 5. elemente tiklanir");
        ReusableMethods.bekle(2);
        WebElement categoriesyaziElementi= Driver.getDriver().findElement(By.xpath("(//div[@class='sidebar-item'])[2]//h3"));
        softAssert.assertTrue(categoriesyaziElementi.isDisplayed(), "Sayfanin basligi goruntulendi");
        extentTest.info("softassert ile recent post kismindaki 5. elementin gorunurlugu test edildi");

    }
}