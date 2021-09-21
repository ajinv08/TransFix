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

Feature: Toys&Games Page Functionalities
  As a user, I should be able to use the various functialities of Toys&Games Page

  @Regression @Smoke
  Scenario: Toys_Games Page Link Test
    Given The user is in Home Page
    When The user clicks on the Toys&Games Page Link
    Then The Toys&Games Page should open

  @Smoke
  Scenario Outline: Shop by Age Option in the Toys&Games Page Link Test
    Given The user is in Toys&Games Page
    When The user clicks any of the options under the Shop by Age <Age>
    Then The page should populate with items belonging to the age group <AgeClass>

    Examples: 
      |Age  			         | AgeClass|
      |"Birth to 24 Months"|1|
      |"2 to 4 Years"      |2|
   
