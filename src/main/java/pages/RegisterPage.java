package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage extends HeaderPage {
    private final String url = "https://www.phptravels.net/register";
    private final String FIRSTNAME = "firstname";
    private final String LASTNAME = "lastname";
    private final String MOBILENUMBER = "phone";
    private final String EMAIL = "email";
    private final String PASSWORD = "password";
    private final String CONFIRMPASSWORD = "confirmpassword";
    private final String SIGNUPBUTTON = ".//*[@id='headersignupform']/div[9]/button";

    public RegisterPage(WebDriver driver){
        super(driver);
    }

    public String getUrl() {
        return url;
    }

    public RegisterPage setFirstName(String username) throws InterruptedException  {
        Thread.sleep(1000);
        getWebElement(By.name(FIRSTNAME)).sendKeys(username);
        return this;
    }

    public RegisterPage setLastName(String password) throws InterruptedException {
        Thread.sleep(1000);
        getWebElement(By.name(LASTNAME)).sendKeys(password);
        return this;
    }

    public RegisterPage setMobileNumber(String password) throws InterruptedException {
        Thread.sleep(1000);
        getWebElement(By.name(MOBILENUMBER)).sendKeys(password);
        return this;
    }

    public RegisterPage setEmail(String password) throws InterruptedException {
        Thread.sleep(1000);
        getWebElement(By.name(EMAIL)).sendKeys(password);
        return this;
    }

    public RegisterPage setPassword(String password) throws InterruptedException {
        Thread.sleep(1000);
        getWebElement(By.name(PASSWORD)).sendKeys(password);
        return this;
    }

    public RegisterPage setConfirmPassword(String password) throws InterruptedException {
        Thread.sleep(1000);
        getWebElement(By.name(CONFIRMPASSWORD)).sendKeys(password);
        return this;
    }

    public AccountPage clickSignUpButton() throws InterruptedException {
        WebElement signUp = getWebElement(By.xpath(SIGNUPBUTTON));
        Thread.sleep(1000);
        signUp.click();
        return new AccountPage(driver);
    }
}
