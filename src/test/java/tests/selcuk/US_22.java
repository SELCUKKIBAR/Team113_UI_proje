package tests.selcuk;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserDashboard;
import pages.UserHomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_22 {

    @Test
    public void testCase01() throws InterruptedException {

        //TEST CASE 1
        //1- Kullanıcı https://qa.tripandway.com/ ana sayfasına gider
        Driver.getDriver().get(ConfigReader.getProperty("trpURL"));

        //2- Kullanıcı ana sayfanın sağ üst köşesinde bulunan Login butonuna tıklar
        UserDashboard userDashboard = new UserDashboard();
        UserHomePage userHomePage = new UserHomePage();
        userHomePage.homePageLoginButton.click();
        WebElement accept = Driver.getDriver().findElement(By.xpath("//button[@type='button']"));
        accept.click();

        //3- Kullanıcı Login sayfasında Email ve Password kutucuklarına geçerli email ve password'u girer
        userDashboard.userLoginDashboradEmailAddressTextBox.sendKeys("selcukkibar88@gmail.com");

        //4- Kullanıcı Password kutcuğunun altında bulunan Login Butonuna tıklar
        userDashboard.userLoginDashboradPasswordAddressTextBox.sendKeys("duru1234.");
        userDashboard.userLoginDashboradLogin.click();

        //5- Kullanıcı giriş yaptığını Header bölümünde sağ üst köşede bulunan "Dashboard" yazısının görünür olduğunu test ederek doğrular
        String expectedDashboard = "Dashboard";
        String actualDashboard= userDashboard.userLoginDashboradDashboardDogrulama.getText();

        Assert.assertTrue(actualDashboard.equals(expectedDashboard));

        //6- Kullanıcı sol menüde bulunan "Update Password" elementine tıklar
        userDashboard.userLoginDashboardUpdatePasswordButton.click();

        //7- Kullanıcı açılan sayfadaki "New Password *" kutuscuğuna yeni şifresini yazar ve  Update butonuna tıklar
        userDashboard.userLoginDashboardNewPasswordunYazilacagiButton.sendKeys("selcuk1234.");
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).click();
        actions.perform();


        //8- Kullanıcı şifresinin başarılı bir şekilde değişltiğini sağ üst köşede çıkak yeşil Pop up mesajının göründüğünü test ederek doğrular
       //WebElement popMesaj = Driver.getDriver().findElement(By.xpath("//h1[text()='Password is updated successfully']"));
       //Thread.sleep(1000);
       //Assert.assertTrue(popMesaj.isDisplayed());
        //9- Kullanıcı Sol menüde bulunan Logout butonuna tıklayarak hesabından çıkış yapar
        Driver.quitDriver();

    }
}
