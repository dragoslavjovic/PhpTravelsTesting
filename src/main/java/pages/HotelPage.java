package pages;

import org.openqa.selenium.WebDriver;

public class HotelPage extends HeaderPage {
    private final String url = "https://www.phptravels.net/hotels";

    public HotelPage(WebDriver driver){
        super(driver);
    }

    public String getUrl() {
        return url;
    }
}
