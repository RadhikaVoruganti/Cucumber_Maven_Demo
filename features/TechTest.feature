#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
## (Comments)

#Sample Feature Definition Template

Feature: Search for an Iphone on Google.co.uk
	I want to use this template for my feature file
	
	@TechTest

 Scenario: Search for an Iphone on google.co.uk
   Given A user is on Google UK Website
   When The user searches for Iphone
   And finds the link that points to Amazon UK
   And Navigates to the result with maximum memory
   Then print the name and price of the product
   And validate if the price is not greater that £800