package pages;

import org.openqa.selenium.WebDriver;

public class AccountPage extends HeaderPage {

    private final String URL = "https://www.phptravels.net/account/";

    public AccountPage(WebDriver driver){
        super(driver);
    }

    public String getURL() {
        return URL;
    }

}
