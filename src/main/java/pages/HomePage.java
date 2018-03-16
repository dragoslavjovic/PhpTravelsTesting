package pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends HeaderPage {
    private final String url = "https://www.phptravels.net";

    public HomePage(WebDriver driver){
        super(driver);
    }

    public String getUrl() {
        return url;
    }
}
