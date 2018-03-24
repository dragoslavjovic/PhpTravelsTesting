package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Drivers {

    private static WebDriver driver;
    private static Properties propertiesFile = Helper.readProperties("environment.properties");

    public static void setDriver() {
        String browserName = System.getProperty("browser").toUpperCase();

        switch (browserName){
            case "FIREFOX":
                System.setProperty(propertiesFile.getProperty("firefox.driver", ""), propertiesFile.getProperty("firefox.location", ""));
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.setCapability("marionette", false);
                driver = new FirefoxDriver(firefoxOptions);
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;
            case "CHROME":
                System.setProperty(propertiesFile.getProperty("chrome.driver", ""), propertiesFile.getProperty("chrome.location", ""));
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;
            case "INTERNETEXPLORER":
                System.setProperty(propertiesFile.getProperty("ie.driver", ""), propertiesFile.getProperty("ie.location", ""));
                driver = new InternetExplorerDriver();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;
            default:
                break;
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void exitBrowser() {
        driver.quit();
    }
}
