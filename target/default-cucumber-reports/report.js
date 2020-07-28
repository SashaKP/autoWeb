$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/featuresAT/ATHomePage.feature");
formatter.feature({
  "name": "Verifying HP search windows Make, Model, ZipCode",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User opens the given URL and verifies Make, Model, Zip Code, AdvancedSearch, Search",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Verify"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "User opens Autotraders Website and verifies Title",
  "keyword": "Given "
});
formatter.match({
  "location": "ATHomePageSteps.user_opens_Autotraders_Website_and_verifies_Title()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User verifies link \"Browse by Make\" is present",
  "keyword": "Then "
});
formatter.match({
  "location": "ATHomePageSteps.user_verifies_link_is_present(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User verifies link \"Browse by Style\" is present",
  "keyword": "Then "
});
formatter.match({
  "location": "ATHomePageSteps.user_verifies_link_is_present(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User verifies link \"Advanced Search\" is present",
  "keyword": "Then "
});
formatter.match({
  "location": "ATHomePageSteps.user_verifies_link_is_present(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User verifies dropDown \"Any Make\" is present",
  "keyword": "And "
});
formatter.match({
  "location": "ATHomePageSteps.user_verifies_dropDown_is_present(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User verifies dropDown \"Any Model\" is present",
  "keyword": "And "
});
formatter.match({
  "location": "ATHomePageSteps.user_verifies_dropDown_is_present(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User verifies \"ZipCode\" window is present",
  "keyword": "And "
});
formatter.match({
  "location": "ATHomePageSteps.user_verifies_window_is_present(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User verifies Search button is present",
  "keyword": "And "
});
formatter.match({
  "location": "ATHomePageSteps.user_verifies_Search_button_is_present()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
});