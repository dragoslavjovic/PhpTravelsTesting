package com.praksa.cucumber.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class CommonSteps {

    @Before
    public void openBrowser() {
        Drivers.setDriver();
    }

    @After
    public void closeBrowser() {
       Drivers.exitBrowser();
    }
}
