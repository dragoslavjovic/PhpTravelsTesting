package pages;

import helper.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Properties;

public class LoginPage extends HeaderPage {
    private static Properties propertiesFile = Helper.readProperties("locators/" + "login.properties");
    private static Properties linkPropFile = Helper.readProperties("linksPage.properties");

    public LoginPage(WebDriver driver){
        super(driver);
    }

    public String getUrl() {
        return linkPropFile.getProperty("loginPage", "");
    }

    public String getUsername() {
        return getWebElement(By.name(propertiesFile.getProperty("username",""))).getText();
    }

    public String getPassword() {
        return getWebElement(By.name(propertiesFile.getProperty("password", ""))).getText();
    }

    public LoginPage setUsername(String username) throws InterruptedException  {
        Thread.sleep(1000);
        getWebElement(By.name(propertiesFile.getProperty("username",""))).sendKeys(username);
        return this;
    }

    public LoginPage setPassword(String password) throws InterruptedException  {
        Thread.sleep(1000);
        getWebElement(By.name(propertiesFile.getProperty("password", ""))).sendKeys(password);
        return this;
    }

    public void clickRememberMe() throws InterruptedException {
        WebElement rememberMe = getWebElement(By.id(propertiesFile.getProperty("rememberme", "")));
        Thread.sleep(1000);
        rememberMe.click();
    }

    public void clickLoginButton() throws InterruptedException {
        WebElement clickLoginButton = getWebElement(By.xpath(propertiesFile.getProperty("login", "")));
        Thread.sleep(1000);
        clickLoginButton.click();
        Thread.sleep(1000);
    }

    public void clickSignUpButton() throws InterruptedException {
        WebElement signUp = getWebElement(By.xpath(propertiesFile.getProperty("signupbutton", "")));
        Thread.sleep(1000);
        signUp.click();
        Thread.sleep(2000);
    }

    public void clickForgetPasswordButton() throws InterruptedException {
        WebElement forgetPasswordButton = getWebElement(By.xpath(propertiesFile.getProperty("forgetpassword", "")));
        Thread.sleep(1000);
        forgetPasswordButton.click();
        Thread.sleep(2000);
    }

    public void clickAlertResetButton() throws InterruptedException {
        WebElement alertResetButton = getWebElement(By.xpath(propertiesFile.getProperty("alertresetbutton", "")));
        Thread.sleep(1000);
        alertResetButton.click();
        Thread.sleep(2000);
    }

    public void clickAlertExit() throws InterruptedException {
        WebElement clickAleretExit = getWebElement(By.xpath(propertiesFile.getProperty("alertexit", "")));
        Thread.sleep(1000);
        clickAleretExit.click();
        Thread.sleep(2000);
    }

    public LoginPage setAlertMail(String username) {
        getWebElement(By.id(propertiesFile.getProperty("alertemail", ""))).sendKeys(username);
        return this;
    }

    public LoginPage sendAlertMail(String username) throws InterruptedException {
        setAlertMail(username)
                .clickAlertResetButton();
        return new LoginPage(driver);
    }

    public LoginPage filledLogin(String username, String password) throws InterruptedException {
        setUsername(username)
                .setPassword(password);
        return this;
    }

    public AccountPage login(String username, String password) throws InterruptedException {
        filledLogin(username, password)
                .clickLoginButton();
        Thread.sleep(500);
        return new AccountPage(driver);
    }
}
