$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Scenario%231.feature");
formatter.feature({
  "name": "",
  "description": "\tWe need a login screen for authenticated the user that want to use the web site features.",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@PROJ-01"
    }
  ]
});
formatter.scenario({
  "name": "TC- Validate the authentication of a valid user.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@PROJ-01"
    },
    {
      "name": "@Login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "On Browser I access demo web",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.on_Browser_I_access_demo_web()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on login icon locate at menu screen",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.i_click_on_login_icon_locate_at_menu_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Put the credentials",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.put_the_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "We click button login",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.we_click_button_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "We reach the home page of a signed user",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.we_reach_the_home_page_of_a_signed_user()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "TC- Validate system deny login of a invalid user.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@PROJ-01"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "On Browser I access demo web",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.on_Browser_I_access_demo_web()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on login icon locate at menu screen",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.i_click_on_login_icon_locate_at_menu_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Put user invalid credentials",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.put_user_invalid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "We click button login",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.we_click_button_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "System show message of invalid user",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.system_show_message_of_invalid_user()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});