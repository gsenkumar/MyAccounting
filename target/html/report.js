$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login to Nixon william page",
  "description": "",
  "id": "login-to-nixon-william-page",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Login Test New",
  "description": "",
  "id": "login-to-nixon-william-page;login-test-new",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Smoke1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "open the NixonWilliam login URL",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the valid \"\u003cusername\u003e\" and \"\u003cpassword\u003e\" provided",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the respective account home page opened",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "login-to-nixon-william-page;login-test-new;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 10,
      "id": "login-to-nixon-william-page;login-test-new;;1"
    },
    {
      "cells": [
        "senthilteck@gmail.com",
        "Nila1234"
      ],
      "line": 11,
      "id": "login-to-nixon-william-page;login-test-new;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Login Test New",
  "description": "",
  "id": "login-to-nixon-william-page;login-test-new;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Smoke1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "open the NixonWilliam login URL",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the valid \"senthilteck@gmail.com\" and \"Nila1234\" provided",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the respective account home page opened",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});