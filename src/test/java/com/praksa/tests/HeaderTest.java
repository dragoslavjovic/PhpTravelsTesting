package com.praksa.tests;

import helper.Helper;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import pages.AccountPage;
import pages.HeaderPage;
import pages.LoginPage;

public class HeaderTest {

//    private FirefoxOptions firefoxOptions = new FirefoxOptions();
//    protected WebDriver driver;
//    private HeaderPage headerPage;
//    private LoginPage loginPage;
//    private AccountPage accountPage;
//    private String username; //= Helper.getProperty("username");
//    private String password; //= Helper.getProperty("password");
//
//    private final String url = "https://www.phptravels.net";
//
//    public HeaderTest() {
//    }
//
//    @Test
//    public void loginPageDisplayed() throws InterruptedException {
//        headerPage = new HeaderPage(driver);
//        loginPage = headerPage.clickMyAccount()
//                            .clickLogIn();
//        Assert.assertEquals("User is not on login page!", loginPage.getUrl(), driver.getCurrentUrl());
//    }
//
//    @Test
//    public void successLogOut() throws InterruptedException {
//        headerPage = new HeaderPage(driver);
//        loginPage = new LoginPage(driver);
//        loginPageDisplayed();
//        accountPage = loginPage.login(username, password);  //user: user@phptravels.com   //password: demouser
//        Assert.assertEquals("User is not login!", accountPage.getURL(), driver.getCurrentUrl());
//        accountPage.clickMyAccount();
//        loginPage = accountPage.clickLogOut();
//        Assert.assertEquals("User did not loguot", loginPage.getUrl(), driver.getCurrentUrl());
//    }

}
