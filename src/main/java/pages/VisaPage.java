package pages;

import org.openqa.selenium.WebDriver;

public class VisaPage extends HeaderPage {
    private final String url = "https://www.phptravels.net/visa";

    public VisaPage(WebDriver driver){
        super(driver);
    }

    public String getUrl() {
        return url;
    }
}
