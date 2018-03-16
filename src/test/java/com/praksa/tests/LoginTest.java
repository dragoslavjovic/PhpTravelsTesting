package com.praksa.tests;

import helper.Helper;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.AccountPage;
import pages.LoginPage;
import pages.RegisterPage;

public class LoginTest extends HeaderTest {

//    private LoginPage loginPage;
//    private AccountPage accountPage;
//    private RegisterPage registerPage;
//    private String username = Helper.getProperty("username");
//    private String password = Helper.getProperty("password");
//    private String invalidUsername = Helper.getProperty("invalid.username");
//    private String invalidPassword = Helper.getProperty("invalid.password");
//
//    @Test
//    public void successLogIn() throws InterruptedException {
//        loginPage = new LoginPage(driver);
//        loginPageDisplayed();
//        accountPage = loginPage.login(username, password);  //user: user@phptravels.com   //password: demouser
//        Assert.assertEquals("User is not login!", accountPage.getURL(), driver.getCurrentUrl());
//    }
//
//    @Test
//    public void noUsername() throws InterruptedException {
//        loginPage = new LoginPage(driver);
//        loginPageDisplayed();
//        accountPage = loginPage.login("", password);
//        Assert.assertEquals("It does not on the same page", loginPage.getUrl(), driver.getCurrentUrl());
//        Assert.assertEquals("User is login", "Invalid Email or Password", driver.findElement(By.xpath(".//*[@id='loginfrm']/div[1]/div[2]/div")).getText());
//    }
//
//    @Test
//    public void noPassword() throws InterruptedException {
//        loginPage = new LoginPage(driver);
//        loginPageDisplayed();
//        accountPage = loginPage.login(username, "");
//        Assert.assertEquals("It does not on the same page", loginPage.getUrl(), driver.getCurrentUrl());
//        Assert.assertEquals("User is login", "Invalid Email or Password", driver.findElement(By.xpath(".//*[@id='loginfrm']/div[1]/div[2]/div")).getText());
//    }
//
//    @Test
//    public void invalidUsernamePassword() throws InterruptedException {
//        loginPage = new LoginPage(driver);
//        loginPageDisplayed();
//        accountPage = loginPage.login(invalidUsername, invalidPassword);
//        Assert.assertEquals("It does not on the same page", loginPage.getUrl(), driver.getCurrentUrl());
//        Assert.assertEquals("User is login", "Invalid Email or Password", driver.findElement(By.xpath(".//*[@id='loginfrm']/div[1]/div[2]/div")).getText());
//    }
//
//    @Test
//    public void registration() throws InterruptedException { //It will form for registration user
//        loginPage = new LoginPage(driver);
//        loginPageDisplayed();
//        registerPage = new RegisterPage(driver);
//        loginPage.clickSignUpButton(); http://www.phptravels.net/register
//        Assert.assertEquals("User is not on register page!",registerPage.getUrl(), driver.getCurrentUrl());
//    }
//
//    @Test
//    public void forgetPassword() throws InterruptedException { //Forget password on Login page
//        loginPage = new LoginPage(driver);
//        loginPageDisplayed();
//        loginPage.clickForgetPasswordButton();
//        //Assert.assertTrue("aasdasd", loginPage.isAlertPresent());
//        String titlealert = driver.findElement(By.xpath(".//*[@id='ForgetPassword']/div/div/div[1]/h4")).getText();
//        Assert.assertEquals("Alert is not opened","Forget Password", titlealert);
//    }
//
//    @Test
//    public void openCloseAlert() throws InterruptedException {
//        loginPageDisplayed();
//        loginPage = new LoginPage(driver);
//        loginPage.clickForgetPasswordButton();
//        loginPage.clickAlertExit();
//        String title = driver.findElement(By.xpath(".//*[@id='ForgetPassword']/div/div/div[1]/h4")).getText();
//        Assert.assertFalse("Alert forget password is open!","Forget Password".equals(title));
//    }
//
//    @Test
//    public void incorrectlySetMail() throws InterruptedException {
//        loginPageDisplayed();
//        loginPage = new LoginPage(driver);
//        loginPage.clickForgetPasswordButton();
//        loginPage.sendAlertMail(invalidUsername);
//        String title = driver.findElement(By.xpath(".//*[@id='passresetfrm']/div[1]/div")).getText();
//        Assert.assertEquals("Mail is correct", title, "Email Not Found" );
//    }
//
//    @Test
//    public void correctlySetMail() throws InterruptedException {
//        loginPageDisplayed();
//        loginPage = new LoginPage(driver);
//        loginPage.clickForgetPasswordButton();
//        loginPage.sendAlertMail(username);
//        String title = driver.findElement(By.xpath(".//*[@id='passresetfrm']/div[1]/div")).getText();
//        Assert.assertEquals("Mail is not correct", title, "New Password sent to " + username + ", Kindly check email" );
//    }
}
