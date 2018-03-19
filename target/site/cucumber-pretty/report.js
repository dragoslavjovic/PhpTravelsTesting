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
  "error_message": "org.openqa.selenium.WebDriverException: java.net.ConnectException: Failed to connect to localhost/0:0:0:0:0:0:0:1:9433\nBuild info: version: \u00273.9.1\u0027, revision: \u002763f7b50\u0027, time: \u00272018-02-07T22:25:02.294Z\u0027\nSystem info: host: \u0027INTERNSHIP01\u0027, ip: \u002710.1.195.46\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00279.0.4\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:92)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:658)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.quit(RemoteWebDriver.java:497)\r\n\tat helper.Drivers.exitBrowser(Drivers.java:47)\r\n\tat com.praksa.cucumber.steps.CommonSteps.closeBrowser(CommonSteps.java:16)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:564)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:31)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:25)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.HookDefinitionMatch.runStep(HookDefinitionMatch.java:17)\r\n\tat cucumber.runner.UnskipableStep.executeStep(UnskipableStep.java:22)\r\n\tat cucumber.api.TestStep.run(TestStep.java:83)\r\n\tat cucumber.api.TestCase.run(TestCase.java:58)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:80)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:140)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:118)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:56)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:127)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\r\n\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\r\nCaused by: java.net.ConnectException: Failed to connect to localhost/0:0:0:0:0:0:0:1:9433\r\n\tat okhttp3.internal.connection.RealConnection.connectSocket(RealConnection.java:240)\r\n\tat okhttp3.internal.connection.RealConnection.connect(RealConnection.java:158)\r\n\tat okhttp3.internal.connection.StreamAllocation.findConnection(StreamAllocation.java:256)\r\n\tat okhttp3.internal.connection.StreamAllocation.findHealthyConnection(StreamAllocation.java:134)\r\n\tat okhttp3.internal.connection.StreamAllocation.newStream(StreamAllocation.java:113)\r\n\tat okhttp3.internal.connection.ConnectInterceptor.intercept(ConnectInterceptor.java:42)\r\n\tat okhttp3.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:147)\r\n\tat okhttp3.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:121)\r\n\tat okhttp3.internal.cache.CacheInterceptor.intercept(CacheInterceptor.java:93)\r\n\tat okhttp3.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:147)\r\n\tat okhttp3.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:121)\r\n\tat okhttp3.internal.http.BridgeInterceptor.intercept(BridgeInterceptor.java:93)\r\n\tat okhttp3.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:147)\r\n\tat okhttp3.internal.http.RetryAndFollowUpInterceptor.intercept(RetryAndFollowUpInterceptor.java:125)\r\n\tat okhttp3.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:147)\r\n\tat okhttp3.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:121)\r\n\tat okhttp3.RealCall.getResponseWithInterceptorChain(RealCall.java:200)\r\n\tat okhttp3.RealCall.execute(RealCall.java:77)\r\n\tat org.openqa.selenium.remote.internal.OkHttpClient.execute(OkHttpClient.java:104)\r\n\tat org.openqa.selenium.remote.internal.OkHttpClient.execute(OkHttpClient.java:54)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:157)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\t... 42 more\r\nCaused by: java.net.ConnectException: Connection refused: connect\r\n\tat java.base/java.net.DualStackPlainSocketImpl.waitForConnect(Native Method)\r\n\tat java.base/java.net.DualStackPlainSocketImpl.socketConnect(DualStackPlainSocketImpl.java:85)\r\n\tat java.base/java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:400)\r\n\tat java.base/java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:243)\r\n\tat java.base/java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:225)\r\n\tat java.base/java.net.PlainSocketImpl.connect(PlainSocketImpl.java:148)\r\n\tat java.base/java.net.SocksSocketImpl.connect(SocksSocketImpl.java:402)\r\n\tat java.base/java.net.Socket.connect(Socket.java:591)\r\n\tat okhttp3.internal.platform.Platform.connectSocket(Platform.java:125)\r\n\tat okhttp3.internal.connection.RealConnection.connectSocket(RealConnection.java:238)\r\n\t... 63 more\r\n",
  "status": "failed"
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