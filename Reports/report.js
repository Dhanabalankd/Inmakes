$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/amazon.feature");
formatter.feature({
  "name": "To validate login functionality of Amazon application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Feature1"
    }
  ]
});
formatter.scenario({
  "name": "To validate Login process",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature1"
    },
    {
      "name": "@First"
    }
  ]
});
formatter.step({
  "name": "To launch browser and maximize",
  "keyword": "Given "
});
formatter.match({
  "location": "Amazon.to_launch_browser_and_maximize()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch Amazon url",
  "keyword": "When "
});
formatter.match({
  "location": "Amazon.to_launch_Amazon_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click signin tab",
  "keyword": "And "
});
formatter.match({
  "location": "Amazon.click_signin_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass email or ph no in text box",
  "keyword": "And "
});
formatter.match({
  "location": "Amazon.to_pass_email_or_ph_no_in_text_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click countinue button",
  "keyword": "And "
});
formatter.match({
  "location": "Amazon.to_click_countinue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass password in password text box",
  "keyword": "And "
});
formatter.match({
  "location": "Amazon.to_pass_password_in_password_text_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Click submit button",
  "keyword": "And "
});
formatter.match({
  "location": "Amazon.to_Click_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Amazon.close_the_Browser()"
});
formatter.result({
  "status": "passed"
});
});