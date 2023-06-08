package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class UserDashboard {

    public UserDashboard(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    // cookies
    @FindBy(xpath = "//button[text()='ACCEPT']")
    public WebElement tripandwayCookies;

    //***********************User Login Dashboard Soldaki Button'lar***********************

    // userLoginDashboardPage ===> Sag Dashboard Button
    @FindBy (xpath= "(//a[normalize-space()='Dashboard'])[1]")
    public WebElement userLoginDashboardSagDashboardButton;

    // userLoginDashboardPage ===> Sol Dashboard Button
    @FindBy (xpath= "(//a[normalize-space()='Dashboard'])[2]")
    public WebElement userLoginDashboardSolDashboardButton;

    // userLoginDashboardPage ===> Payment History Button
    @FindBy (xpath= "//a[normalize-space()='Payment History']")
    public WebElement userLoginDashboardPaymentHistoryButton;

    // userLoginDashboardPage ===> Payment History Button ====> All Payments Table
    @FindBy (xpath= "//h1[normalize-space()='View All Payments']")
    public WebElement userLoginDashboardPaymentHistoryAllPeymantsTable;

    // userLoginDashboardPage ===> Update Profile Button
    @FindBy (xpath= "//a[normalize-space()='Update Profile']")
    public WebElement userLoginDashboardUpdateProfileButton;

    // userLoginDashboardPage ===> Update Password Button
    @FindBy (xpath= "//a[normalize-space()='Update Password']")
    public WebElement userLoginDashboardUpdatePasswordButton;

    // userLoginDashboardPage ===> Logout Button
    @FindBy (xpath= "//a[normalize-space()='Logout']")
    public WebElement userLoginDashboardLogoutButton;

    //***********************Dashboard Sayfasi***********************

    // userLoginDashboardPage ===> Soldaki Dashboard ===> Completed Orders yazisi
    @FindBy(xpath = "//b[text()='Completed Orders']")
    public WebElement userLoginDashboardCompletedOrdersText;

    // userLoginDashboardPage ===> Soldaki Dashboard ===> Dashboard Pending Orders yazisi
    @FindBy(xpath = "//*[text()='Pending Orders']")
    public WebElement userLoginDashboardPendingOrdersText;

    //***********************Payment History Sayfasi***********************

    // userLoginDashboardPage ===> Soldaki Payment History ===> View All Payments yazisi
    @FindBy(xpath = "//h1[text()='View All Payments']")
    public WebElement userLoginDashboardViewAllPaymentsText;

    // userLoginDashboardPage ===> Soldaki Payment History ===> Tablonun 1. satirindaki butun datalar
    @FindBy(xpath = "//tbody/tr[2]/td")
    public List<WebElement> userLoginDashboardTablonunBirinciSatirindakiDatalar;

    //***********************Update Profile Sayfasi***********************

    // userLoginDashboardPage ===> Soldaki Update Profile ===> Update Profile Yazisi
    @FindBy(xpath = "//h1[text()='Update Profile']")
    public WebElement userLoginDashboradUpdateProfileText;

    // userLoginDashboardPage ===> Soldaki Update Profile ===> Name textbox'i
    @FindBy(xpath = "//input[@name='traveller_name']")
    public WebElement userLoginDashboradNameTextBox;

    // userLoginDashboardPage ===> Soldaki Update Profile ===> Phone textbox'i
    @FindBy(xpath = "//input[@name='traveller_phone']")
    public WebElement userLoginDashboradPhoneTextBox;

    // userLoginDashboardPage ===> Soldaki Update Profile ===> Address textbox'i
    @FindBy(xpath = "//input[@name='traveller_address']")
    public WebElement userLoginDashboradAddressTextBox;

    // userLoginDashboardPage ===> Soldaki Update Profile ===> City textbox'i
    @FindBy(xpath = "//input[@name='traveller_city']")
    public WebElement userLoginDashboradCityTextBox;

    // userLoginDashboardPage ===> Soldaki Update Profile ===> Email Address textbox'i
    @FindBy(xpath = "//input[@name='traveller_email']")
    public WebElement userLoginDashboradEmailAddressTextBox;

    // userLoginDashboardPage ===> Soldaki Update Profile ===> Country textbox'i
    @FindBy(xpath = "//input[@name='traveller_country']")
    public WebElement userLoginDashboradCountryTextBox;

    // userLoginDashboardPage ===> Soldaki Update Profile ===> State textbox'i
    @FindBy(xpath = "//input[@name='traveller_state']")
    public WebElement userLoginDashboradStateTextBox;

    // userLoginDashboardPage ===> Soldaki Update Profile ===> Zip Code textbox'i
    @FindBy(xpath = "//input[@name='traveller_zip']")
    public WebElement userLoginDashboradZipCodeTextBox;

    // userLoginDashboardPage ===> Soldaki Update Profile ===> Update butonu
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement userLoginDashboradUpdateButton;

    //***********************Update Password Sayfasi***********************

    // userLoginDashboardPage ===> Soldaki Update Password ===> Update Password yazisi
    @FindBy(xpath ="//h1[text()='Update Password']")
    public WebElement userLoginDashboardUpdatePasswordText;

    // userLoginDashboardPage ===> Soldaki Update Password ===> New Password * yazisi
    @FindBy(xpath = "//label[text()='New Password *']")
    public WebElement userLoginDashboardNewPasswordText;

    // userLoginDashboardPage ===> Soldaki Update Password ===> New Password'un yazilacagi button
    @FindBy(xpath = "//input[@class='form-control']")
    public WebElement userLoginDashboardNewPasswordunYazilacagiButton;

    // userLoginDashboardPage ===> Soldaki Update Password ===> Update button
    @FindBy(xpath = "//button[@class=\"btn btn-primary\"]")
    public WebElement userLoginDashboardUpdateButton;

}
