package com.praksa.cucumber.steps;

import org.openqa.selenium.WebDriver;
import pages.HeaderPage;

public class AccountSteps {
    private HeaderPage headerPage;
    WebDriver driver;

    public AccountSteps(HeaderPage headerPage, CommonSteps commonSteps) {
        this.headerPage = headerPage;
//        this.driver = commonSteps.getDriver();
    }

}
