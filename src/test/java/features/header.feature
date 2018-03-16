Feature: Base test

  Scenario: Login page displayed
    Given user on home page
    When user wants to login
    Then login page displayed