$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TechTest.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 19,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 21,
  "name": "Search for an Iphone on Google.co.uk",
  "description": "I want to use this template for my feature file",
  "id": "search-for-an-iphone-on-google.co.uk",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2244342658,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Search for an Iphone on google.co.uk",
  "description": "",
  "id": "search-for-an-iphone-on-google.co.uk;search-for-an-iphone-on-google.co.uk",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@TechTest"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "A user is on Google UK Website",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "The user searches for Iphone",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "finds the link that points to Amazon UK",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Navigates to the result with maximum memory",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "print the name and price of the product",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "validate if the price is not greater that £800",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition_TectTest.a_user_is_on_Google_UK_Website()"
});
formatter.result({
  "duration": 3349464783,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition_TectTest.the_user_searches_for_Iphone()"
});
formatter.result({
  "duration": 119631067,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition_TectTest.finds_the_link_that_points_to_amazon_co_uk()"
});
formatter.result({
  "duration": 7823284801,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition_TectTest.navigates_to_the_result_with_maximum_memory()"
});
formatter.result({
  "duration": 465276435,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition_TectTest.print_the_name_and_price_of_the_product()"
});
formatter.result({
  "duration": 44009659,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "800",
      "offset": 43
    }
  ],
  "location": "StepDefinition_TectTest.validate_if_the_price_is_not_greater_that_£(int)"
});
formatter.result({
  "duration": 32408330,
  "status": "passed"
});
formatter.after({
  "duration": 264957648,
  "status": "passed"
});
});