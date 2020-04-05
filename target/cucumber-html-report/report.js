$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/myOrder.feature");
formatter.feature({
  "line": 1,
  "name": "Update User details and Order T-Shirt",
  "description": "",
  "id": "update-user-details-and-order-t-shirt",
  "keyword": "Feature"
});
formatter.before({
  "duration": 26901639068,
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
  "location": "Steps.user_navigate_to_login_page()"
});
formatter.result({
  "duration": 4064639073,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_submits_username_and_password()"
});
formatter.result({
  "duration": 2874066743,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_is_able_to_login()"
});
formatter.result({
  "duration": 53232877,
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
  "location": "Steps.user_search_for_Tshirt()"
});
formatter.result({
  "duration": 7183526228,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_adds_T_Shirts_to_cart()"
});
formatter.result({
  "duration": 10930110014,
  "status": "passed"
});
formatter.match({
  "location": "Steps.place_order_after_making_payment()"
});
formatter.result({
  "duration": 4786473653,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_is_able_to_verify_order_in_order_history()"
});
formatter.result({
  "duration": 3131080721,
  "status": "passed"
});
formatter.after({
  "duration": 97703,
  "status": "passed"
});
formatter.after({
  "duration": 640989557,
  "status": "passed"
});
formatter.before({
  "duration": 15396966777,
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
  "location": "Steps.user_navigate_to_login_page()"
});
formatter.result({
  "duration": 3872979284,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_submits_username_and_password()"
});
formatter.result({
  "duration": 3144323156,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_is_able_to_login()"
});
formatter.result({
  "duration": 33872109,
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
  "name": "User changes first name as \"Nixon\"",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "User should be able to validate updated information",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_navigate_to_personal_info()"
});
formatter.result({
  "duration": 2014136539,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nixon",
      "offset": 28
    }
  ],
  "location": "Steps.user_changes_first_name_as(String)"
});
formatter.result({
  "duration": 2103292463,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_should_be_able_to_validate_updated_information()"
});
formatter.result({
  "duration": 36365995,
  "status": "passed"
});
formatter.after({
  "duration": 35304,
  "status": "passed"
});
formatter.after({
  "duration": 654912217,
  "status": "passed"
});
});