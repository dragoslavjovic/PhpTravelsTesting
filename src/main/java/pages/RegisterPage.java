package pages;

import helper.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Properties;

public class RegisterPage extends HeaderPage {
    private static Properties propertiesFile = Helper.readProperties("locators/" + "register.properties");
    private static Properties linkPropFile = Helper.readProperties("linksPage.properties");

    public RegisterPage(WebDriver driver){
        super(driver);
    }

    public String getUrl() {
        return linkPropFile.getProperty("registerPage", "");
    }

    public RegisterPage setFirstName(String username) throws InterruptedException  {
        Thread.sleep(1000);
        getWebElement(By.name(propertiesFile.getProperty("firstname", ""))).sendKeys(username);
        return this;
    }

    public RegisterPage setLastName(String password) throws InterruptedException {
        Thread.sleep(1000);
        getWebElement(By.name(propertiesFile.getProperty("lastname", ""))).sendKeys(password);
        return this;
    }

    public RegisterPage setMobileNumber(String password) throws InterruptedException {
        Thread.sleep(1000);
        getWebElement(By.name(propertiesFile.getProperty("mobilenumber", ""))).sendKeys(password);
        return this;
    }

    public RegisterPage setEmail(String email) throws InterruptedException {
        Thread.sleep(1000);
        getWebElement(By.name(propertiesFile.getProperty("email", ""))).sendKeys(email);
        return this;
    }

    public RegisterPage setPassword(String password) throws InterruptedException {
        Thread.sleep(1000);
        getWebElement(By.name(propertiesFile.getProperty("password", ""))).sendKeys(password);
        return this;
    }

    public RegisterPage setConfirmPassword(String password) throws InterruptedException {
        Thread.sleep(1000);
        getWebElement(By.name(propertiesFile.getProperty("confirmpassword", ""))).sendKeys(password);
        return this;
    }

    public AccountPage clickSignUpButton() throws InterruptedException {
        WebElement signUp = getWebElement(By.xpath(propertiesFile.getProperty("signup", "")));
        Thread.sleep(1000);
        signUp.click();
        return new AccountPage(driver);
    }
}
