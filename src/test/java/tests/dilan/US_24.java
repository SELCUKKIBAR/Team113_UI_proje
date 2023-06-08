package tests.dilan;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.UserDashboard;
import pages.UserHomePage;
import utilities.*;

import static org.testng.Assert.*;

public class US_24 extends TestBaseRapor {

    @Test
    public void odemeYapilabilirligiDogrulama(){

        extentTest = extentReports.createTest("Package secip odeme yapilabilirligini dogrulama testi",
                "Kullanici login olup package sayfasindan herhangi bir package'i secip odeme yapabildigini dogrulayabilmeli");

        Driver.getDriver().get(ConfigReader.getProperty("trpURL"));
        extentTest.info("Kullanici Tripandway sayfasina gider");

        UserDashboard userDashboard = new UserDashboard();
        userDashboard.tripandwayCookies.click();
        extentTest.info("Cookies'i kabul eder");

        UserHomePage userHomePage = new UserHomePage();
        userHomePage.homePageLoginButton.click();
        extentTest.info("Anasayfada login butonuna tiklar");

        userHomePage.loginEmailAddressTextBox.sendKeys(ConfigReader.getProperty("loginEmailAddress"));
        extentTest.info("Gecerli Email Address'ini girer");

        userHomePage.loginPasswordTextBox.sendKeys(ConfigReader.getProperty("loginPassword"));
        extentTest.info("Gecerli Password'u girer");

        userHomePage.loginSayfasiLoginButton.click();
        extentTest.info("Login butonuna tiklar");

        userHomePage.homePagePackagesButton.click();
        extentTest.info("Acilan sayfada package bolumune tiklar");

        JSUtilities.scrollToElement(Driver.getDriver(),userHomePage.packagesBesDaysInCalifornia);
        extentTest.info("Javascript ile 5 Days California package'ine kadar scroll yapar");

        ReusableMethods.bekle(1);
        userHomePage.packagesBesDaysInCalifornia.click();
        extentTest.info("5 Days California package'ine tiklar");

        JSUtilities.scrollToElement(Driver.getDriver(), userHomePage.bookYourSeatButton);
        extentTest.info("Javascript ile Book Your Seat butonuna kadar scroll yapar");

        ReusableMethods.bekle(1);
        userHomePage.bookYourSeatButton.click();
        extentTest.info("Book Your Seat butonuna tiklar");


        JSUtilities.scrollToElement(Driver.getDriver(),userHomePage.payWithCardButton);
        extentTest.info("Javascript ile Pay with card butonuna kadar scroll yapar");

        ReusableMethods.bekle(1);
        userHomePage.payWithCardButton.click();
        extentTest.info("Pay with card butonuna tiklar");

        Driver.getDriver().switchTo().frame(userHomePage.iframe);
        extentTest.info("Iframe'e gecer");

        userHomePage.cardNumberTextBox.sendKeys(ConfigReader.getProperty("cardNumber"));
        userHomePage.cardNumberTextBox.sendKeys(ConfigReader.getProperty("cardNumber"));
        userHomePage.cardNumberTextBox.sendKeys(ConfigReader.getProperty("cardNumber"));
        userHomePage.cardNumberTextBox.sendKeys(ConfigReader.getProperty("cardNumber"));
        userHomePage.MM_YYTextBox.sendKeys(ConfigReader.getProperty("MM/YY"));
        userHomePage.MM_YYTextBox.sendKeys(ConfigReader.getProperty("MM/YY1") + Keys.TAB + ConfigReader.getProperty("CVC"));
        extentTest.info("Odeme yapmak icin card number, MM/YY ve CVC textbox'larina gecerli kart bilgilerini girer");

        userHomePage.payTextBox.click();
        extentTest.info("Pay butonuna tiklayarak odeme yapar");

        Driver.getDriver().switchTo().defaultContent();
        extentTest.info("Iframe'den cikar");

        String expectedUyariMesaji = ConfigReader.getProperty("packageOdemeExpectedUyariMesaji");
        String actualUyariMesaji = userHomePage.warningMessage.getText();

        assertEquals(actualUyariMesaji,expectedUyariMesaji,"Payment is successful! uyari mesaji gorunur olmalidir");
        extentTest.pass("Assert ile odeme yapabildigini test eder");

        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");

    }
}
