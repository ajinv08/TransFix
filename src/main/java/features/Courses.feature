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
@Regression
Feature: Courses
  As a user,  I should be able to view various course details offered, by accessing the courses link from the Home Page

 
  Scenario: Courses Link Display&Enabled Test
    Given The user in home page
		Then The user should be able to view the  Courses link as enabled

  Scenario: Courses Link Drop Down Menu Display Test
  	Given The user in home page
		When The user hover mouse  on Courses Link
		Then The user should be able to view list of courses through drop down menu
		
	
	Scenario Outline: Courses Link Drop Down Menu Selection Test
		Given The user in home page
		When The user clicks on Courses Link
		And The user selects any of the Courses listed  from the drop down menu "<course>"
		Then The corresponding course page should be displayed "<urlpage>"
		
		Examples: 
		 |course|urlpage|
		 |Data Analytics & Visualization|https://transfotechacademy.com/course/data-analytics/|
		 |Cyber Security Professional|https://transfotechacademy.com/course/cyber-security-professional/|
		 |Cloud Engineering|https://transfotechacademy.com/course/cloud-engineering/|
		 |Full Stack QA Engineering|https://transfotechacademy.com/qa-engineer/|
		 |Business Analyst|https://transfotechacademy.com/course/business-analyst/|
		 |Full Stack QA Engineering|https://transfotechacademy.com/qa-engineer/|

	
	
	
	
	
	
	
	