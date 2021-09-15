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

Feature: Brief presentation of all Courses Offered by Transfotech Academy
The user should be able to view the icons of various courses displayed in Home Page and view the 
presentation of various courses through clicking the link Explore all Courses

Scenario: Courses Icons Display & Enabled Test
Given The user in home page
Then The user should be able to view Icons of few selected courses, displayed under the section header - Courses We Offer
And The user should be able to view Explore all Courses link as enabled

Scenario Outline: Courses Icon Link Test
Given The user in home page
When The user clicks on any course icon <course>
Then The corresponding course page should be displayed
Examples:
|course|
|Data Analytics & Visualization|
|Cyber Security Professional|
|Cloud Engineering|
|Business Analyst|
|Full Stack QA Engineering Course|

Scenario: Explore All Courses Link Test
Given The user in home page
When The user clicks on Explore all Courses Link
Then All the  individual Course's icons Data Analytics & Visualization,Cyber Security Professional,
Cloud Engineering, Business Analyst, Full Stack QA Engineering Course should be displayed in home page

Scenario Outline: Explore All Courses Link to Corresponding Page Test
Given The user in home page
When The user clicks on Explore all Courses Link
When The user clicks on any course icon <course>
Then The corresponding course page should be displayed
Examples:
|course|
|Data Analytics & Visualization|
|Cyber Security Professional|
|Cloud Engineering|
|Business Analyst|
|Full Stack QA Engineering Course|
