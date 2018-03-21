Feature: Base test

  Background:
    Given user on home page

  Scenario: Login page displayed
    When user wants to login
    Then login page displayed

   Scenario: Register page displayed
     When on header page user wants to sign up
     Then register page displayed

  Scenario: Hotels page displayed
    When user wants to open hotels page
    Then hotels page displayed

  Scenario: Flights page displayed
    When user wants to open flights page
    Then flights page displayed

  Scenario: Tours page displayed
    When user wants to open tours page
    Then tours page displayed

  Scenario: Cars page displayed
    When user wants to open cars page
    Then cars page displayed

  Scenario: Offers page displayed
    When user wants to open offers page
    Then offers page displayed

  Scenario: Visa page displayed
    When user wants to open visa page
    Then visa page displayed

  Scenario: Blog page displayed
    When user wants to open blog page
    Then blog page displayed

  Scenario: User logged out
    Given user is logged with username valid.user and password valid.password
    When user wants to logout
    Then login page displayed

