$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/header.feature");
formatter.feature({
  "name": "Base test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login page displayed",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HeaderSteps.goToHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user wants to login",
  "keyword": "When "
});
formatter.match({
  "location": "HeaderSteps.goToLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login page displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "HeaderSteps.validateOnLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/java/features/login.feature");
formatter.feature({
  "name": "Login tests",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User is logging",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user types \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "user \u003cresult\u003e logged",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "result"
      ]
    },
    {
      "cells": [
        "user@phptravels.com",
        "demouser",
        "is"
      ]
    },
    {
      "cells": [
        "",
        "",
        "is not"
      ]
    },
    {
      "cells": [
        "",
        "demouser",
        "is not"
      ]
    },
    {
      "cells": [
        "user@phptravels.com",
        "",
        "is not"
      ]
    },
    {
      "cells": [
        "user123@phptravels.com",
        "demouser123",
        "is not"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HeaderSteps.goToHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user wants to login",
  "keyword": "When "
});
formatter.match({
  "location": "HeaderSteps.goToLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User is logging",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user types user@phptravels.com and demouser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.loginUser(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is logged",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.validationLogin(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HeaderSteps.goToHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user wants to login",
  "keyword": "When "
});
formatter.match({
  "location": "HeaderSteps.goToLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User is logging",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user types  and ",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.loginUser(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is not logged",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.validationLogin(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HeaderSteps.goToHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user wants to login",
  "keyword": "When "
});
formatter.match({
  "location": "HeaderSteps.goToLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User is logging",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user types  and demouser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.loginUser(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is not logged",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.validationLogin(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HeaderSteps.goToHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user wants to login",
  "keyword": "When "
});
formatter.match({
  "location": "HeaderSteps.goToLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User is logging",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user types user@phptravels.com and ",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.loginUser(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is not logged",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.validationLogin(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HeaderSteps.goToHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user wants to login",
  "keyword": "When "
});
formatter.match({
  "location": "HeaderSteps.goToLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User is logging",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user types user123@phptravels.com and demouser123",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.loginUser(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is not logged",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.validationLogin(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HeaderSteps.goToHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user wants to login",
  "keyword": "When "
});
formatter.match({
  "location": "HeaderSteps.goToLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User registration",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user wants to singup",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.goToSingupPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user on singup page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.validationSingUppage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User is forget password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is forget password",
  "keyword": "When "
});
formatter.step({
  "name": "on forget page user types \u003cemail\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "user\u0027s \u003cemail\u003e \u003cresults\u003e send",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "results"
      ]
    },
    {
      "cells": [
        "user@phptravels.com",
        "is"
      ]
    },
    {
      "cells": [
        "user123@phptravels.com",
        "is not"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HeaderSteps.goToHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user wants to login",
  "keyword": "When "
});
formatter.match({
  "location": "HeaderSteps.goToLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User is forget password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is forget password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.goToFPAlert()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "on forget page user types user@phptravels.com",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.sendEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user\u0027s user@phptravels.com is send",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.validationSentEmail(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HeaderSteps.goToHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user wants to login",
  "keyword": "When "
});
formatter.match({
  "location": "HeaderSteps.goToLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User is forget password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is forget password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.goToFPAlert()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "on forget page user types user123@phptravels.com",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.sendEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user\u0027s user123@phptravels.com is not send",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.validationSentEmail(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});