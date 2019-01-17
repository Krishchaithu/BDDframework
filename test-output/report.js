$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/Learning/java/BddFramework/src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "site login Feature",
  "description": "",
  "id": "site-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "user able to login to akamai",
  "description": "",
  "id": "site-login-feature;user-able-to-login-to-akamai",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on site page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of the page is akamai",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user enters username",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user enters password",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user click on submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user validates title page is Home",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination.user_is_on_site_page()"
});
formatter.result({
  "duration": 10018431265,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.title_of_the_page_is_akamai()"
});
formatter.result({
  "duration": 24844784,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_enters_username()"
});
formatter.result({
  "duration": 158375758,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_enters_password()"
});
formatter.result({
  "duration": 133723699,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_click_on_submit_button()"
});
formatter.result({
  "duration": 10881571130,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_validates_title_page_is_Home()"
});
formatter.result({
  "duration": 9056929,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.close_browse()"
});
formatter.result({
  "duration": 3213811722,
  "status": "passed"
});
});