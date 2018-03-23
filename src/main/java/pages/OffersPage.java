package pages;

import helper.Helper;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class OffersPage extends HeaderPage {
    private static Properties propertiesFile = Helper.readProperties("linksPage.properties");

    public OffersPage(WebDriver driver){
        super(driver);
    }

    public String getUrl() {
        return propertiesFile.getProperty("offersPage", "");
    }
}
