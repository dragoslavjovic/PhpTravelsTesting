package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends HeaderPage {

    private final String URL = "https://www.phptravels.net/login";
    private final String USERNAMEFILED = "username";
    private final String PASSWORDFIELD = "password";
    private final String LOGINBUTTON = ".//*[@id='loginfrm']/div[1]/div[5]/button";
    private final String SIGNUPBUTTON = ".//*[@id='loginfrm']/div[2]/div[1]/a";
    private final String FORGETPASSWORDBUTTON = ".//*[@id='loginfrm']/div[2]/div[3]/a";
    private final String ALERTRESETBUTTON = ".//*[@id='passresetfrm']/div[2]/span/button";
    private final String ALERTEXIT = ".//*[@id='ForgetPassword']/div/div/div[1]/button";
    private final String EMAILFIELD = "email";
    private final String REMEMBERME = "remember-me";

    public LoginPage(WebDriver driver){
        super(driver);
    }

    public String getUrl() {
        return URL;
    }

    public String getUsername() {
        return getWebElement(By.name(USERNAMEFILED)).getText();
    }

    public String getPassword() {
        return getWebElement(By.name(PASSWORDFIELD)).getText();
    }

    public LoginPage setUsername(String username) throws InterruptedException  {
        Thread.sleep(1000);
        getWebElement(By.name(USERNAMEFILED)).sendKeys(username);
        return this;
    }

    public LoginPage setPassword(String password) throws InterruptedException  {
        Thread.sleep(1000);
        getWebElement(By.name(PASSWORDFIELD)).sendKeys(password);
        return this;
    }

    public void clickRememberMe() throws InterruptedException {
        WebElement rememberMe = getWebElement(By.id(REMEMBERME));
        Thread.sleep(1000);
        rememberMe.click();
    }

    public void clickLoginButton() throws InterruptedException {
        WebElement clickLoginButton = getWebElement(By.xpath(LOGINBUTTON));
        Thread.sleep(1000);
        clickLoginButton.click();
        Thread.sleep(1000);
    }

    public void clickSignUpButton() throws InterruptedException {
        WebElement signUp = getWebElement(By.xpath(SIGNUPBUTTON));
        Thread.sleep(1000);
        signUp.click();
        Thread.sleep(2000);
    }

    public void clickForgetPasswordButton() throws InterruptedException {
        WebElement forgetPasswordButton = getWebElement(By.xpath(FORGETPASSWORDBUTTON));
        Thread.sleep(1000);
        forgetPasswordButton.click();
        Thread.sleep(2000);
    }

    public void clickAlertResetButton() throws InterruptedException {
        WebElement alertResetButton = getWebElement(By.xpath(ALERTRESETBUTTON));
        Thread.sleep(1000);
        alertResetButton.click();
        Thread.sleep(2000);
    }

    public void clickAlertExit() throws InterruptedException {
        WebElement clickAleretExit = getWebElement(By.xpath(ALERTEXIT));
        Thread.sleep(1000);
        clickAleretExit.click();
        Thread.sleep(2000);
    }

    public LoginPage setAlertMail(String username) {
        getWebElement(By.name(EMAILFIELD)).sendKeys(username);
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
        return new AccountPage(driver);
    }
}
