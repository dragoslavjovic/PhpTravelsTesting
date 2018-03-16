package pages;

import org.openqa.selenium.WebDriver;

public class RegisterPage extends HeaderPage {
    private final String url = "https://www.phptravels.net/register";

    public RegisterPage(WebDriver driver){
        super(driver);
    }

    public String getUrl() {
        return url;
    }
}
