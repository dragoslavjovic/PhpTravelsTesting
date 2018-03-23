package com.praksa.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import helper.Drivers;
import helper.Helper;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.AccountPage;
import pages.HeaderPage;
import pages.LoginPage;
import pages.RegisterPage;

import java.util.Properties;

public class RegisterSteps {
    private HeaderPage headerPage;
    private RegisterPage registerPage;
    private AccountPage accountPage;
    private LoginPage loginPage;
    private WebDriver driver;
    private static Properties propertiesFile = Helper.readProperties("data.properties");

    public RegisterSteps(HeaderPage headerPage, Drivers drivers){
        this.headerPage = headerPage;
        this.driver = drivers.getDriver();
    }

    @And("^rp user type firstname as (.*)$")
    public RegisterSteps filledFirstname(String firstname) throws InterruptedException {
        registerPage = new RegisterPage(driver);
        registerPage.setFirstName(propertiesFile.getProperty(firstname+".firstname", ""));
        return this;
    }

    @And("^rp user type lastname as (.*)$")
    public RegisterSteps filledLastname(String lastname) throws InterruptedException {
        registerPage = new RegisterPage(driver);
        registerPage.setLastName(propertiesFile.getProperty(lastname+".lastname", ""));
        return this;
    }

    @And("^rp user type mobile number as (.*)$")
    public RegisterSteps filledMobileNumber(String mobileNumber) throws InterruptedException {
        registerPage = new RegisterPage(driver);
        registerPage.setMobileNumber(propertiesFile.getProperty(mobileNumber+".mobile.number", ""));
        return this;
    }

    @And("^rp user type email as (.*)$")
    public String randomFilledEmail(String email) throws InterruptedException {
        registerPage = new RegisterPage(driver);
        if (("").equals(email)) {
            registerPage.setEmail("");
        } else {
            registerPage.setEmail(System.currentTimeMillis() + propertiesFile.getProperty(email + ".email.random"));
        }
        return String.valueOf(this);
    }

    @And("^$")
    public RegisterSteps filledEmail(String email) throws InterruptedException {
        registerPage = new RegisterPage(driver);
        registerPage.setEmail(propertiesFile.getProperty(email + ".email.final", ""));
        return this;
    }

    @And("^rp user type password as (.*)$")
    public RegisterSteps filledPassword(String password) throws InterruptedException {
        registerPage = new RegisterPage(driver);
        registerPage.setPassword(propertiesFile.getProperty(password + ".register.password", ""));
        return this;
    }

    @And("^rp user type confirm password as (.*)$")
    public RegisterSteps filledConfirmPassword(String confirmPassword) throws InterruptedException {
        registerPage = new RegisterPage(driver);
        registerPage.setConfirmPassword(propertiesFile.getProperty(confirmPassword + ".register.confirm.password", ""));
        return this;
    }

    @And("^rp user press button sign up$")
    public AccountPage clickButtonSignUp() throws InterruptedException {
        registerPage = new RegisterPage(driver);
        accountPage = registerPage.clickSignUpButton();
        return new AccountPage(driver);
    }

    @Then("^user (.*) signed up$")
    public void validationRegistration(String isRegistered) throws InterruptedException {
        Thread.sleep(1000);
        if (("is").equals(isRegistered)) {
            Assert.assertTrue("User is not registered!", accountPage.getUrl().equals(driver.getCurrentUrl()));
        } else {
            Assert.assertFalse("User is logged!", accountPage.getUrl().equals(driver.getCurrentUrl()));
        }
    }

    @And("^rp user filled required fields firstname, lastname, mobile number and email as (.*) without password and confirm password$")
    public RegisterSteps filledFieldWithoutPasswords(String valid) throws InterruptedException {
        filledFirstname(valid);
        filledLastname(valid);
        filledMobileNumber(valid);
        filledEmail(valid);
        return this;
    }

    @And("^rp user required fields filled (.*) without password and confirm password$")
    public RegisterSteps filledFieldWithoutPasswordRandom(String valid) throws InterruptedException {
        filledFirstname(valid);
        filledLastname(valid);
        filledMobileNumber(valid);
        randomFilledEmail(valid);
        return this;
    }

    @And("^rp (.*) user registered$")
    public RegisterSteps userRegistered(String valid) throws InterruptedException {
        filledFieldWithoutPasswords(valid);
        filledFieldPasswords(valid, valid);
        clickButtonSignUp();
        Thread.sleep(2000);
        return this;
    }

    @And("^rp user wants to logout$")
    public RegisterSteps logoutRegisteredUser() throws InterruptedException {
        headerPage = new HeaderPage(driver);
        loginPage = headerPage.clickMyAccount()
                            .clickLogOut();
        return this;
    }

    @And("^rp user filled password (.*) and confirm password (.*)$")
    public RegisterSteps filledFieldPasswords(String password, String confirm) throws InterruptedException {
        filledPassword(password);
        filledConfirmPassword(confirm);
        return this;
    }

    @Then("^rp password (.*) accept$")
    public void validationPassword(String isAccepted) throws InterruptedException {
        Thread.sleep(1000);
        if (("is").equals(isAccepted)) {
            Assert.assertTrue("User is not registered!", accountPage.getUrl().equals(driver.getCurrentUrl()));
        } else {
            Assert.assertFalse("User is logged!", accountPage.getUrl().equals(driver.getCurrentUrl()));
        }
    }

    @Then("^rp account page displayed$")
    public void accountPageDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals("User is not registered!", accountPage.getUrl(), driver.getCurrentUrl());
    }

    @Then("^rp user did not register again$")
    public void validationRegistrationUser() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertFalse("User is registered!", accountPage.getUrl().equals(driver.getCurrentUrl()));
    }
}
