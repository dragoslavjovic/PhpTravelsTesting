package pages;

import org.openqa.selenium.WebDriver;

public class OffersPage extends HeaderPage {
    private final String url = "https://www.phptravels.net/offers";

    public OffersPage(WebDriver driver){
        super(driver);
    }

    public String getUrl() {
        return url;
    }
}
