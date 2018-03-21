package com.praksa.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import helper.Drivers;
import helper.Helper;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.AccountPage;
import pages.HeaderPage;
import pages.RegisterPage;

public class RegisterSteps {
    private final String URL = "https://www.phptravels.net/register";
    private HeaderPage headerPage;
    private RegisterPage registerPage;
    private AccountPage accountPage;
    private WebDriver driver;

    public RegisterSteps(HeaderPage headerPage, Drivers drivers){
        this.headerPage = headerPage;
        this.driver = drivers.getDriver();
    }

    @And("^rp user type firstname as (.*)$")
    public RegisterSteps filledFirstname(String firstname) throws InterruptedException {
        registerPage = new RegisterPage(driver);
        registerPage.setFirstName(Helper.getProperty(firstname));
        return this;
    }

    @And("^rp user type lastname as (.*)$")
    public RegisterSteps filledLastname(String lastname) throws InterruptedException {
        registerPage = new RegisterPage(driver);
        registerPage.setLastName(Helper.getProperty(lastname));
        return this;
    }

    @And("^rp user type mobile number as (.*)$")
    public RegisterSteps filledMobileNumber(String mobileNumber) throws InterruptedException {
        registerPage = new RegisterPage(driver);
        registerPage.setMobileNumber(Helper.getProperty(mobileNumber));
        return this;
    }

    @And("^rp user type email as (.*)$")
    public RegisterSteps filledEmail(String email) throws InterruptedException {
        registerPage = new RegisterPage(driver);
        registerPage.setEmail(Helper.getProperty(email));
        return this;
    }

    @And("^rp user type password as (.*)$")
    public RegisterSteps filledPassword(String password) throws InterruptedException {
        registerPage = new RegisterPage(driver);
        registerPage.setPassword(Helper.getProperty(password));
        return this;
    }

    @And("^rp user type confirm password as (.*)$")
    public RegisterSteps filledConfirmPassword(String confirmPassword) throws InterruptedException {
        registerPage = new RegisterPage(driver);
        registerPage.setConfirmPassword(Helper.getProperty(confirmPassword));
        return this;
    }

    @And("^rp user press button sign up$")
    public AccountPage clickButtonSignUp() throws InterruptedException {
        registerPage = new RegisterPage(driver);
        accountPage = registerPage.clickSignUpButton();
        return new AccountPage(driver);
    }

    @Then("^user (.*) sgned up$")
    public void validationRegistration(String isRegistered) throws InterruptedException {
        Thread.sleep(1000);
        if (("is").equals(isRegistered)) {
            Assert.assertTrue("User is not registered!", accountPage.getURL().equals(driver.getCurrentUrl()));
        } else {
            Assert.assertFalse("User is logged!", accountPage.getURL().equals(driver.getCurrentUrl()));
        }
    }

    @And("^rp user filled fields (.*), (.*), (.*), (.*), (.*), (.*)$")
    public AccountPage successedRegistered(String firstname, String lastname, String mobileNumber, String email, String password, String confirmpassword) throws InterruptedException {
        registerPage = new RegisterPage(driver);
        accountPage = registerPage.setFirstName(Helper.getProperty(firstname))
                                .setLastName(Helper.getProperty(lastname))
                                .setMobileNumber(Helper.getProperty(mobileNumber))
                                .setEmail(Helper.getProperty(email))
                                .setPassword(Helper.getProperty(password))
                                .setConfirmPassword(Helper.getProperty(confirmpassword))
                                .clickSignUpButton();
        return new AccountPage(driver);
    }

    @Then("^rp account page displayed$")
    public void accountPageDisplayed(String isRegistered) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals("User is not registered!", accountPage.getURL(), driver.getCurrentUrl());
    }
}
