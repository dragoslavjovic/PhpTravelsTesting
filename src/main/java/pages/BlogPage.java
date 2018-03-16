package pages;

import org.openqa.selenium.WebDriver;

public class BlogPage extends HeaderPage {
    private final String url = "https://www.phptravels.net/blog";

    public BlogPage(WebDriver driver){
        super(driver);
    }

    public String getUrl() {
        return url;
    }
}
