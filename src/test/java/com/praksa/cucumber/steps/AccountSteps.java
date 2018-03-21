package com.praksa.cucumber.steps;

import helper.Drivers;
import org.openqa.selenium.WebDriver;
import pages.HeaderPage;

public class AccountSteps {
    private HeaderPage headerPage;
    WebDriver driver;

    public AccountSteps(HeaderPage headerPage, Drivers drivers) {
        this.headerPage = headerPage;
        this.driver = drivers.getDriver();
    }

}
