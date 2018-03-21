package com.praksa.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.Drivers;
import helper.Helper;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.AccountPage;
import pages.HeaderPage;
import pages.LoginPage;
import pages.RegisterPage;

public class LoginSteps{
    private LoginPage loginPage;
    private HeaderPage headerPage;
    private HeaderSteps headerSteps;
    private AccountPage accountPage;
    private RegisterPage registerPage;
    private Helper helper;
    private WebDriver driver;
    private final String URL = "https://www.phptravels.net/login";

    public LoginSteps(HeaderPage headerPage, Drivers drivers, HeaderSteps headerSteps){
        this.headerPage = headerPage;
        this.headerSteps = headerSteps;
        this.driver = drivers.getDriver();
    }


    @And("^user types (.*) and (.*)$")
    public LoginSteps loginUser(String username, String password) throws InterruptedException {
        loginPage = new LoginPage(driver);
        accountPage = loginPage.login(username, password);
        return this;
    }

    @Then("^on login page user (.*) logged$")
    public void validationLogin(String isLogged) throws InterruptedException {
        if (("is").equals(isLogged)) {
            Assert.assertTrue("User is not logged!", accountPage.getURL().equals(driver.getCurrentUrl()));
        } else {
            Assert.assertFalse("User is logged!", accountPage.getURL().equals(driver.getCurrentUrl()));
        }
    }

    @And("^user wants to singup$")
    public LoginSteps goToSingupPage() throws InterruptedException {
        loginPage = new LoginPage(driver);
        loginPage.clickSignUpButton();
        return this;
    }

    @Then("^user on singup page$")
    public void validationSingUppage() {
        registerPage = new RegisterPage(driver);
        Assert.assertTrue("User is not singup page!", registerPage.getUrl().equals(driver.getCurrentUrl()));
    }

    @When("^user is forget password$")
    public  LoginSteps goToFPAlert() throws InterruptedException {
        loginPage = new LoginPage(driver);
        loginPage.clickForgetPasswordButton();
        return this;
    }

    @And("^on forget page user types (.*)$")
    public LoginSteps sendEmail (String email) throws InterruptedException {
        loginPage.sendAlertMail(email);
        return this;
    }

    @Then("^user's (.*) (.*) send$")
    public void validationSentEmail(String email, String isSent) throws InterruptedException {
        if (("is").equals(isSent)) {
            String title = driver.findElement(By.xpath(".//*[@id='passresetfrm']/div[1]/div")).getText();
            Assert.assertEquals("Mail is not correct", title, "New Password sent to " + email + ", Kindly check email" );
        } else {
            String title2 = driver.findElement(By.xpath(".//*[@id='passresetfrm']/div[1]/div")).getText();
            Assert.assertEquals("Mail is correct", title2, "Email Not Found" );
        }
        Thread.sleep(1000);
        loginPage.clickAlertExit();
        String title3 = driver.findElement(By.xpath(".//*[@id='ForgetPassword']/div/div/div[1]/h4")).getText();
        Assert.assertFalse("Alert forget password is open!","Forget Password".equals(title3));
    }

    @Given("^user is logged with username (.*) and password (.*)$")
    public void userIsLogged(String username, String password) throws InterruptedException {
        headerSteps.goToHomePage()
                .goToLoginPage();
        loginUser(username, password);
    }

}
