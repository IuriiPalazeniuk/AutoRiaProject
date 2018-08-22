$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/RiaSimpleTests.feature");
formatter.feature({
  "name": "check current result",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "check if logged user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "Main page is opened",
  "keyword": "Given "
});
formatter.step({
  "name": "login to account by \u003csocial\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "user is logged \u003cresult\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "social",
        "result"
      ]
    },
    {
      "cells": [
        "Facebook",
        "Юрий"
      ]
    }
  ]
});
formatter.scenario({
  "name": "check if logged user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "Main page is opened",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefs.main_page_is_opened()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login to account by Facebook",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefs.iOpenLogInWithUserNameAndPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is logged Юрий",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs.iAmLogedAndISeeMyNameResult(String)"
});
formatter.result({
  "status": "passed"
});
});