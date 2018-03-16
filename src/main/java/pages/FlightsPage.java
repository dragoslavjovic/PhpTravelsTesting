package pages;

import org.openqa.selenium.WebDriver;

public class FlightsPage extends HeaderPage {
    private final String url = "https://www.phptravels.net/flightst";

    public FlightsPage(WebDriver driver){
        super(driver);
    }

    public String getUrl() {
        return url;
    }
}
