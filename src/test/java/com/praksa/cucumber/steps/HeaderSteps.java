package com.praksa.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.Drivers;
import helper.Helper;
import org.openqa.selenium.WebDriver;
import pages.*;
import org.junit.Assert;

import java.util.Properties;

public class HeaderSteps {
    private HeaderPage headerPage;
    private LoginPage loginPage;
    private HotelPage hotelPage;
    private FlightsPage flightsPage;
    private ToursPage toursPage;
    private CarsPage carsPage;
    private OffersPage offersPage;
    private VisaPage visaPage;
    private BlogPage blogPage;
    private RegisterPage registerPage;
    private AccountPage accountPage;
    private WebDriver driver;

    private static Properties propertiesFile = Helper.readProperties("linksPage.properties");

    public HeaderSteps(HeaderPage headerPage, Drivers drivers) {
        this.headerPage = headerPage;
        this.driver = drivers.getDriver();
    }

    @Given("^user on home page$")
    public HeaderSteps goToHomePage(){
        driver.get(propertiesFile.getProperty("homePage", ""));
        return this;
    }

    @When("^user wants to login$")
    public HeaderSteps goToLoginPage() throws InterruptedException {
        headerPage = new HeaderPage(driver);
        loginPage = headerPage.clickMyAccount()
                            .clickLogIn();
        return this;
    }

    @Then("^login page displayed$")
    public void validateOnLoginPage() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals("User is not on login page!", loginPage.getUrl(), driver.getCurrentUrl());
    }

    @When("^on header page user wants to sign up$")
    public HeaderSteps goToRegisterPage() throws InterruptedException {
        headerPage = new HeaderPage(driver);
        registerPage = headerPage.clickMyAccount()
                                .clickSignUp();
        return this;
    }

    @Then("^register page displayed$")
    public void validateOnRegisterPage(){
        Assert.assertEquals("User is not on register page!", registerPage.getUrl(), driver.getCurrentUrl());
    }

    @When("^user wants to open hotels page$")
    public HeaderSteps goToHotelsPage() throws InterruptedException {
        headerPage = new HeaderPage(driver);
        hotelPage = headerPage.clickHotels();
        return this;
    }

    @Then("^hotels page displayed$")
    public void validateOnHotelsPage(){
        Assert.assertEquals("User is not on hotels page!", hotelPage.getUrl(), driver.getCurrentUrl());
    }

    @When("^user wants to open flights page$")
    public HeaderSteps goToFlightsPage() throws InterruptedException {
        headerPage = new HeaderPage(driver);
        flightsPage = headerPage.clickFlights();
        Thread.sleep(1000);
        return this;
    }

    @Then("^flights page displayed$")
    public void validateOnFlightsPage(){
        Assert.assertEquals("User is not on flights page!", flightsPage.getUrl(), driver.getCurrentUrl());
    }

    @When("^user wants to open tours page$")
    public HeaderSteps goToToursPage() throws InterruptedException {
        headerPage = new HeaderPage(driver);
         toursPage = headerPage.clickTours();
        return this;
    }

    @Then("^tours page displayed$")
    public void validateOnToursPage(){
        Assert.assertEquals("User is not on tours page!", toursPage.getUrl(), driver.getCurrentUrl());
    }

    @When("^user wants to open cars page$")
    public HeaderSteps goToCarsPage() throws InterruptedException {
        headerPage = new HeaderPage(driver);
        carsPage = headerPage.clickCars();
        return this;
    }

    @Then("^cars page displayed$")
    public void validateOnCarsPage(){
        Assert.assertEquals("User is not on car page!", carsPage.getUrl(), driver.getCurrentUrl());
    }

    @When("^user wants to open offers page$")
    public HeaderSteps goToOffersPage() throws InterruptedException {
        headerPage = new HeaderPage(driver);
        offersPage = headerPage.clickOffers();
        return this;
    }

    @Then("^offers page displayed$")
    public void validateOnOffersPage(){
        Assert.assertEquals("User is not on offers page!", offersPage.getUrl(), driver.getCurrentUrl());
    }

    @When("^user wants to open visa page$")
    public HeaderSteps goToVisaPage() throws InterruptedException {
        headerPage = new HeaderPage(driver);
        visaPage = headerPage.clickVisa();
        Thread.sleep(1000);
        return this;
    }

    @Then("^visa page displayed$")
    public void validateOnVisaPage(){
        Assert.assertEquals("User is not on visa page!", visaPage.getUrl(), driver.getCurrentUrl());
    }

    @When("^user wants to open blog page$")
    public HeaderSteps goToBlogPage() throws InterruptedException {
        headerPage = new HeaderPage(driver);
        blogPage = headerPage.clickBlog();
        return this;
    }

    @And("^user wants to logout$")
    public HeaderSteps clickLogOut() throws InterruptedException {
        headerPage = new HeaderPage(driver);
        loginPage = headerPage.logOut();
        return this;
    }

    @Then("^blog page displayed$")
    public void validateOnBlogPage(){
        Assert.assertEquals("User is not on blog page!", blogPage.getUrl(), driver.getCurrentUrl());
    }
}
