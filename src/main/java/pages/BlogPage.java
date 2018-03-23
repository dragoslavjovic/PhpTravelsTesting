package pages;

import helper.Helper;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class BlogPage extends HeaderPage {
    private static Properties propertiesFile = Helper.readProperties("linksPage.properties");

    public BlogPage(WebDriver driver){
        super(driver);
    }

    public String getUrl() {
        return propertiesFile.getProperty("blogPage", "");
    }
}
