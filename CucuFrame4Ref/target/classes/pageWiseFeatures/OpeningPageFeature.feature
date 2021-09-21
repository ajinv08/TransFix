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
@RegressionTest
Feature: Home Page Functionality of Demo Guru
  As a user, I should be able to use the Home Page Functionalities

  
  Scenario: Registered users should be able to sign in with valid credentials
    Given Registered user is in home page
    When Registered user inputs the valid username
    And Registered user inputs the valid password
    And Registered user clicks on SubmitButton in the HomePage
    Then Registered user should be able to SignOn successfully
    

  