package pages;

import helper.Helper;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class AccountPage extends HeaderPage {
    private static Properties propertiesFile = Helper.readProperties("linksPage.properties");

    public AccountPage(WebDriver driver){
        super(driver);
    }

    public String getUrl() {
        return propertiesFile.getProperty("accountPage", "");
    }

}
