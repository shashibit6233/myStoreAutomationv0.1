$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/myOrder.feature");
formatter.feature({
  "line": 1,
  "name": "Update User details and Order T-Shirt",
  "description": "",
  "id": "update-user-details-and-order-t-shirt",
  "keyword": "Feature"
});
formatter.before({
  "duration": 25915114265,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "User is Logged In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User navigate to login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User submits username and password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User is able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "VerifyOrderSteps.user_navigate_to_login_page()"
});
formatter.result({
  "duration": 2508845599,
  "status": "passed"
});
formatter.match({
  "location": "VerifyOrderSteps.user_submits_username_and_password()"
});
formatter.result({
  "duration": 2071097725,
  "status": "passed"
});
formatter.match({
  "location": "VerifyOrderSteps.user_is_able_to_login()"
});
formatter.result({
  "duration": 62964987,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Order T-Shirt and verify Order history",
  "description": "",
  "id": "update-user-details-and-order-t-shirt;order-t-shirt-and-verify-order-history",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@End2End"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User search for Tshirt",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User adds T-Shirts to cart",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "place order after making payment",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user is able to verify order in order history",
  "keyword": "Then "
});
formatter.match({
  "location": "VerifyOrderSteps.user_search_for_Tshirt()"
});
formatter.result({
  "duration": 4960842495,
  "status": "passed"
});
formatter.match({
  "location": "VerifyOrderSteps.user_adds_T_Shirts_to_cart()"
});
formatter.result({
  "duration": 16546780998,
  "status": "passed"
});
formatter.match({
  "location": "VerifyOrderSteps.place_order_after_making_payment()"
});
formatter.result({
  "duration": 4210825150,
  "status": "passed"
});
formatter.match({
  "location": "VerifyOrderSteps.user_is_able_to_verify_order_in_order_history()"
});
formatter.result({
  "duration": 2141726229,
  "status": "passed"
});
formatter.after({
  "duration": 155996,
  "status": "passed"
});
formatter.after({
  "duration": 616349139,
  "status": "passed"
});
formatter.before({
  "duration": 13062448968,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "User is Logged In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User navigate to login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User submits username and password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User is able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "VerifyOrderSteps.user_navigate_to_login_page()"
});
formatter.result({
  "duration": 2453623360,
  "status": "passed"
});
formatter.match({
  "location": "VerifyOrderSteps.user_submits_username_and_password()"
});
formatter.result({
  "duration": 4104963676,
  "status": "passed"
});
formatter.match({
  "location": "VerifyOrderSteps.user_is_able_to_login()"
});
formatter.result({
  "duration": 40695299,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Update personal information in my account",
  "description": "",
  "id": "update-user-details-and-order-t-shirt;update-personal-information-in-my-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@End2End"
    },
    {
      "line": 15,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "User navigate to personal info",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "User changes first name as \"HalenDavos\"",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "User should be able to validate updated information",
  "keyword": "Then "
});
formatter.match({
  "location": "UpdatedPersonalInfoSteps.user_navigate_to_personal_info()"
});
formatter.result({
  "duration": 4453345851,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HalenDavos",
      "offset": 28
    }
  ],
  "location": "UpdatedPersonalInfoSteps.user_changes_first_name_as(String)"
});
formatter.result({
  "duration": 11519048981,
  "status": "passed"
});
formatter.match({
  "location": "UpdatedPersonalInfoSteps.user_should_be_able_to_validate_updated_information()"
});
formatter.result({
  "duration": 36414847,
  "status": "passed"
});
formatter.after({
  "duration": 38179,
  "status": "passed"
});
formatter.after({
  "duration": 597589366,
  "status": "passed"
});
});