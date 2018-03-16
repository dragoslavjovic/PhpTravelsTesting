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
  "error_message": "org.openqa.selenium.ElementNotVisibleException: element not visible\n  (Session info: chrome\u003d64.0.3282.186)\n  (Driver info: chromedriver\u003d2.36.540470 (e522d04694c7ebea4ba8821272dbef4f9b818c91),platform\u003dWindows NT 10.0.16299 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.9.1\u0027, revision: \u002763f7b50\u0027, time: \u00272018-02-07T22:25:02.294Z\u0027\nSystem info: host: \u0027INTERNSHIP01\u0027, ip: \u002710.1.192.83\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00279.0.4\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.36.540470 (e522d04694c7eb..., userDataDir: C:\\WINDOWS\\TEMP\\scoped_dir1...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 64.0.3282.186, webStorageEnabled: true}\nSession ID: c5f203fcaa08d8fdbc0f4b637154a419\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:488)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:160)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:279)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat pages.LoginPage.clickSignUpButton(LoginPage.java:64)\r\n\tat com.praksa.cucumber.steps.LoginSteps.goToSingupPage(LoginSteps.java:47)\r\n\tat ✽.user wants to singup(src/test/java/features/login.feature:19)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user on singup page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.validationSingUppage()"
});
formatter.result({
  "status": "skipped"
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
  "error_message": "org.openqa.selenium.ElementNotVisibleException: element not visible\n  (Session info: chrome\u003d64.0.3282.186)\n  (Driver info: chromedriver\u003d2.36.540470 (e522d04694c7ebea4ba8821272dbef4f9b818c91),platform\u003dWindows NT 10.0.16299 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.9.1\u0027, revision: \u002763f7b50\u0027, time: \u00272018-02-07T22:25:02.294Z\u0027\nSystem info: host: \u0027INTERNSHIP01\u0027, ip: \u002710.1.192.83\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00279.0.4\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.36.540470 (e522d04694c7eb..., userDataDir: C:\\WINDOWS\\TEMP\\scoped_dir9...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 64.0.3282.186, webStorageEnabled: true}\nSession ID: b0c661c65e850dcf9b88d9c100f52e77\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:488)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:160)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:279)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat pages.LoginPage.clickForgetPasswordButton(LoginPage.java:71)\r\n\tat com.praksa.cucumber.steps.LoginSteps.goToFPAlert(LoginSteps.java:60)\r\n\tat ✽.user is forget password(src/test/java/features/login.feature:23)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "on forget page user types user@phptravels.com",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.sendEmail(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user\u0027s user@phptravels.com is send",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.validationSentEmail(String,String)"
});
formatter.result({
  "status": "skipped"
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
  "error_message": "org.openqa.selenium.ElementNotVisibleException: element not visible\n  (Session info: chrome\u003d64.0.3282.186)\n  (Driver info: chromedriver\u003d2.36.540470 (e522d04694c7ebea4ba8821272dbef4f9b818c91),platform\u003dWindows NT 10.0.16299 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.9.1\u0027, revision: \u002763f7b50\u0027, time: \u00272018-02-07T22:25:02.294Z\u0027\nSystem info: host: \u0027INTERNSHIP01\u0027, ip: \u002710.1.192.83\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00279.0.4\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.36.540470 (e522d04694c7eb..., userDataDir: C:\\WINDOWS\\TEMP\\scoped_dir1...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 64.0.3282.186, webStorageEnabled: true}\nSession ID: 320ae6373f0eb7d205d5779c9ae4167d\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:488)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:160)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:279)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat pages.LoginPage.clickForgetPasswordButton(LoginPage.java:71)\r\n\tat com.praksa.cucumber.steps.LoginSteps.goToFPAlert(LoginSteps.java:60)\r\n\tat ✽.user is forget password(src/test/java/features/login.feature:23)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "on forget page user types user123@phptravels.com",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.sendEmail(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user\u0027s user123@phptravels.com is not send",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.validationSentEmail(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});