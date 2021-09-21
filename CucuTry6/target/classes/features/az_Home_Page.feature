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

Feature: Amazone Home Page
  Various Links and Options in the HomePage Testing

 
  Scenario: Search Text Entry Test in the Home Page
    Given The user is in Home Page
    When The user types text into the search text area
    And The user clicks on the search button
    Then The page should populate the search result

  
  Scenario: Customer Service Link Test
  	Given The user is in Home Page
    When The user clicks on the Customer Service Link
    Then The Customer Service Page should open