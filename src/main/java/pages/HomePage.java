package pages;

import helper.Helper;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class HomePage extends HeaderPage {
    private static Properties propertiesFile = Helper.readProperties("linksPage.properties");

    public HomePage(WebDriver driver){
        super(driver);
    }

    public String getUrl() {
        return propertiesFile.getProperty("homePage", "");
    }
}
