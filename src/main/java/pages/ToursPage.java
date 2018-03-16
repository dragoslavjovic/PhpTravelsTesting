package pages;

import org.openqa.selenium.WebDriver;

public class ToursPage extends HeaderPage {
    private final String url = "https://www.phptravels.net/tours";

    public ToursPage(WebDriver driver){
        super(driver);
    }

    public String getUrl() {
        return url;
    }
}
