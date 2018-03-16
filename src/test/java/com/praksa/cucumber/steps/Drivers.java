package com.praksa.cucumber.steps;

import helper.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class Drivers {

    private static WebDriver driver;

    public static void setDriver() {
        String browserName = System.getProperty("browser").toUpperCase();
//        String browserName = "FIREFOX";
        
        switch (browserName){
            case "FIREFOX":
                System.setProperty(Helper.getProperty("firefox.driver"), Helper.getProperty("firefox.location"));
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.setCapability("marionette", false);
                driver = new FirefoxDriver(firefoxOptions);
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                break;
            case "CHROME":
                System.setProperty(Helper.getProperty("chrome.driver"), Helper.getProperty("chrome.location"));
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                break;
            case "INTERNETEXPLORER":
                System.setProperty(Helper.getProperty("ie.driver"), Helper.getProperty("ie.location"));
                driver = new InternetExplorerDriver();
                break;
            default:
                break;
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void exitBrowser() {
        driver.close();
        driver.quit();
    }
}
