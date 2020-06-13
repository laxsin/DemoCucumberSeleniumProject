$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("launchwebsite.feature");
formatter.feature({
  "line": 1,
  "name": "launch the google website",
  "description": "",
  "id": "launch-the-google-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "launch google",
  "description": "",
  "id": "launch-the-google-website;launch-google",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I launch Google website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I verify title",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TestlaunchwebsiteStepTest.launchGoogle()"
});
formatter.result({
  "duration": 20663907300,
  "status": "passed"
});
formatter.match({
  "location": "TestlaunchwebsiteStepTest.verifyTitle()"
});
formatter.result({
  "duration": 234500,
  "status": "passed"
});
formatter.match({
  "location": "TestlaunchwebsiteStepTest.closeBrowser()"
});
formatter.result({
  "duration": 1477698300,
  "status": "passed"
});
});