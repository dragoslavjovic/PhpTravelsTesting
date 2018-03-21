package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderPage {
    public WebDriver driver;
    private final String LOGOHOME = ".//*[@id='li_myaccount']/ul/li[2]/a";
    private final String MY_ACCOUNT = "html/body/div[4]/div/div/div[2]/ul/li[1]/a"; // "html/body/div[4]/div/div/div[2]/ul/li[1]/a"  //
    private final String LOGOUT = "Logout";
    private final String ACCOUNT = "Account";
    private final String LOGIN = "Login";
    private final String SIGNUP = "html/body/div[4]/div/div/div[2]/ul/li[1]/ul/li[2]/a";
    private final String HOTELS = ".//*[@id='offcanvas-menu']/ul/li[1]/a";
    private final String FLIGHTS = ".//*[@id='offcanvas-menu']/ul/li[2]/a";
    private final String TOURS = ".//*[@id='offcanvas-menu']/ul/li[3]/a";
    private final String CARS = ".//*[@id='offcanvas-menu']/ul/li[4]/a";
    private final String OFFERS = ".//*[@id='offcanvas-menu']/ul/li[5]/a";
    private final String VISA = ".//*[@id='offcanvas-menu']/ul/li[6]/a";
    private final String BLOG = ".//*[@id='offcanvas-menu']/ul/li[7]/a";

    public HeaderPage() {}

    public HeaderPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getWebElement(By selectorElements) {
        return driver.findElement(selectorElements);
    }

    public HomePage clickHome() throws InterruptedException {
        WebElement home = driver.findElement(By.xpath(LOGOHOME));
        Thread.sleep(1000);
        home.click();
        return new HomePage(driver);
    }

    public LoginPage clickLogIn() throws InterruptedException {
        WebElement logIn = driver.findElement(By.linkText(LOGIN));
//        Thread.sleep(2000);
        logIn.click();
        return new LoginPage(driver);
    }

    public HeaderPage clickMyAccount() throws InterruptedException {
        By account = By.xpath(MY_ACCOUNT);
        WebElement myAccount = getWebElement(account);
        myAccount.click();
        return this;
    }

    public RegisterPage clickSignUp() throws InterruptedException {
//        Thread.sleep(1000);
        WebElement SignUp = driver.findElement(By.xpath(SIGNUP));
        Thread.sleep(1000);
        SignUp.click();
        return new RegisterPage(driver);
    }

    public LoginPage clickLogOut() throws InterruptedException {
        WebElement logOut = driver.findElement(By.linkText(LOGOUT));
        Thread.sleep(1000);
        logOut.click();
        return new LoginPage(driver);
    }

    public AccountPage clickAccount() throws InterruptedException {
        WebElement account = driver.findElement(By.linkText(ACCOUNT));
        Thread.sleep(1000);
        account.click();
        return new AccountPage(driver);
    }

    public HotelPage clickHotels() throws InterruptedException {
        WebElement hotel = driver.findElement(By.xpath(HOTELS));
        Thread.sleep(1000);
        hotel.click();
        return new HotelPage(driver);
    }

    public FlightsPage clickFlights() throws InterruptedException {
        WebElement fligths = driver.findElement(By.xpath(FLIGHTS));
        Thread.sleep(1000);
        fligths.click();
        return new FlightsPage(driver);
    }

    public ToursPage clickTours() throws InterruptedException {
        WebElement tours = driver.findElement(By.xpath(TOURS));
        Thread.sleep(1000);
        tours.click();
        return new ToursPage(driver);
    }

    public CarsPage clickCars() throws InterruptedException {
        WebElement cars = driver.findElement(By.xpath(CARS));
        Thread.sleep(1000);
        cars.click();
        return new CarsPage(driver);
    }

    public OffersPage clickOffers() throws InterruptedException {
        WebElement offers = driver.findElement(By.xpath(OFFERS));
        Thread.sleep(1000);
        offers.click();
        return new OffersPage(driver);
    }

    public VisaPage clickVisa() throws InterruptedException {
        WebElement visa = driver.findElement(By.xpath(VISA));
        Thread.sleep(1000);
        visa.click();
        return new VisaPage(driver);
    }

    public BlogPage clickBlog() throws InterruptedException {
        WebElement blog = driver.findElement(By.xpath(BLOG));
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
