package com.praksa.cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HeaderPage;
import pages.LoginPage;
import org.junit.Assert;

public class HeaderSteps {

    private HeaderPage headerPage;
    private LoginPage loginPage;
    private WebDriver driver;

    private final String URL = "https://www.phptravels.net/en";

    public HeaderSteps(HeaderPage headerPage, Drivers drivers) {
        this.headerPage = headerPage;
        this.driver = drivers.getDriver();
    }

    @Given("^user on home page$")
    public HeaderSteps goToHomePage(){
        driver.get(URL);
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
    public void validateOnLoginPage(){
        Assert.assertEquals("User is not on login page!", loginPage.getUrl(), driver.getCurrentUrl());
    }

}
