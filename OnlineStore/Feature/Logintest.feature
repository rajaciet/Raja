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
@tag
Feature: Login Action
	

@tag1
Scenario Outline: Login successful with valid credentials
Given when user in homepage
	
When user click on signin link
	And user enter "<username>" and "<password>"
	Then message displayed login successfully
	
	Examples:
	| username | password |
	| testuser12@gmail.com | Password-1 |
	

@tag2
Scenario Outline: User is on search page
Given user is on home page1
When user is on searchpage and click search
Then search result displayed

Examples:
|productcode|
|THJACT20|

@tag3
Scenario Outline: user is on PLP and PDP
When user is on PLP and PDP
Then item added successfully to the basket

Examples:

|PLP and PDP|
|THJACT20|

@tag4

Scenario Outline: user is on Basketpage
When user is on Basketpage
Then item ready for payment

Examples:
|basket|
|THJACT20|

Scenario Outline: user is on finalreviewpage
When user is on finalreviewpage
Then product ready for delivery
Examples:
|Product|
|THJACT20|

