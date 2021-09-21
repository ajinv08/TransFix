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
Feature: Home Page Funactionalities of Demo Guru
 As a user, I can access various links provided in the home page.

  @RegressionTest
  Scenario: Sign-On Link Test
    Given I am in home page
    
    When I click on the Sign-On Link
    
    Then I should land in Sign-On Page
    

  @SmokeTest
  Scenario Outline: Find A Flight Functionality Test - Positive Test
    Given I am in home page
    When I enter valid username <username>, valid password <password> as credentials 
    And I click submit button
    Then I should be able to login successfully
 Examples: 
      | name       | password |
      | test123    |      123 | 
      | K@Name785  |      swdf|
      |suretest    |  surepass|
 
   
      
   @SmokeTest
  Scenario Outline: Find A Flight Functionality Test - Negative Test
    Given I am in home page
    When I enter invalid username <username> or invalid password <password> as credentials 
    And I click submit button
    Then I should not be able to login
Examples: 
      | name        | password	 | 
      |negative1		|pass1			 |
      |test123      |swdf 			 | 
      |K@Name785    |surepass		 |
      |suretest     |k123 			 |