package pages;

import helper.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Properties;

public class HeaderPage {
    public WebDriver driver;
    private static Properties propertiesFile = Helper.readProperties("locators/" + "header.properties");

    public HeaderPage() {}

    public HeaderPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getWebElement(By selectorElements) {
        return driver.findElement(selectorElements);
    }

    public HomePage clickHome() throws InterruptedException {
        WebElement home = driver.findElement(By.xpath(propertiesFile.getProperty("logohome", "")));
        Thread.sleep(1000);
        home.click();
        return new HomePage(driver);
    }

    public LoginPage clickLogIn() throws InterruptedException {
        WebElement logIn = driver.findElement(By.linkText(propertiesFile.getProperty("login", "")));
//        Thread.sleep(2000);
        logIn.click();
        return new LoginPage(driver);
    }

    public HeaderPage clickMyAccount() throws InterruptedException {
        By account = By.xpath(propertiesFile.getProperty("myaccount", ""));
        WebElement myAccount = getWebElement(account);
        myAccount.click();
        return this;
    }

    public RegisterPage clickSignUp() throws InterruptedException {
//        Thread.sleep(1000);
        WebElement SignUp = driver.findElement(By.xpath(propertiesFile.getProperty("signup", "")));
        Thread.sleep(1000);
        SignUp.click();
        return new RegisterPage(driver);
    }

    public LoginPage clickLogOut() throws InterruptedException {
        WebElement logOut = driver.findElement(By.xpath(propertiesFile.getProperty("logout", "")));
        Thread.sleep(1000);
        logOut.click();
        return new LoginPage(driver);
    }

    public AccountPage clickAccount() throws InterruptedException {
        WebElement account = driver.findElement(By.linkText(propertiesFile.getProperty("account", "")));
        Thread.sleep(1000);
        account.click();
        return new AccountPage(driver);
    }

    public HotelPage clickHotels() throws InterruptedException {
        WebElement hotel = driver.findElement(By.xpath(propertiesFile.getProperty("hotels", "")));
        Thread.sleep(1000);
        hotel.click();
        return new HotelPage(driver);
    }

    public FlightsPage clickFlights() throws InterruptedException {
        WebElement fligths = driver.findElement(By.xpath(propertiesFile.getProperty("flights", "")));
        Thread.sleep(1000);
        fligths.click();
        return new FlightsPage(driver);
    }

    public ToursPage clickTours() throws InterruptedException {
        WebElement tours = driver.findElement(By.xpath(propertiesFile.getProperty("tours", "")));
        Thread.sleep(1000);
        tours.click();
        return new ToursPage(driver);
    }

    public CarsPage clickCars() throws InterruptedException {
        WebElement cars = driver.findElement(By.xpath(propertiesFile.getProperty("cars", "")));
        Thread.sleep(1000);
        cars.click();
        return new CarsPage(driver);
    }

    public OffersPage clickOffers() throws InterruptedException {
        WebElement offers = driver.findElement(By.xpath(propertiesFile.getProperty("offers", "")));
        Thread.sleep(1000);
        offers.click();
        return new OffersPage(driver);
    }

    public VisaPage clickVisa() throws InterruptedException {
        WebElement visa = driver.findElement(By.xpath(propertiesFile.getProperty("visa", "")));
        Thread.sleep(1000);
        visa.click();
        return new VisaPage(driver);
    }

    public BlogPage clickBlog() throws InterruptedException {
        WebElement blog = driver.findElement(By.xpath(propertiesFile.getProperty("blog", "")));
        Thread.sleep(1000);
        blog.click();
        return new BlogPage(driver);
    }

    public LoginPage logOut() throws InterruptedException {
        clickMyAccount();
        clickLogOut();
        return new LoginPage(driver);
    }
}
