package pages;

import org.openqa.selenium.WebDriver;

public class CarsPage extends HeaderPage {
    private final String url = "https://www.phptravels.net/car";

    public CarsPage(WebDriver driver){
        super(driver);
    }

    public String getUrl() {
        return url;
    }
}
