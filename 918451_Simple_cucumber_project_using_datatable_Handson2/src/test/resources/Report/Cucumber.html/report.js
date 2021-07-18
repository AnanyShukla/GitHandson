$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/com/cucumber/BasicContactForm.feature");
formatter.feature({
  "name": "To Verify Valid Registration on Basic Contact Form",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Registration with valid data",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Basic Contact Form Page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_on_Basic_Contact_Form_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on click here link",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_clicks_click_here_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters valid name and email",
  "rows": [
    {
      "cells": [
        "abc",
        "abcxyz@gmail.com"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_enters_the_name_and_email_address(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User fill other details",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_enters_other_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the Submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.clicks_the_Submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});