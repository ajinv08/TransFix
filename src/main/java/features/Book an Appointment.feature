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

@Regression @Smoke @EndToEnd

Feature: Book an Appointment
As a user when open the home page, the Book an Appointment Link should be displayed and enabled and when the user clicks on the link Book an Appointment window should open with UI elements to accept required details

Scenario: Book An Appointment Link Display & Enable Test
Given The new user in home page
Then The Book an Appointment Link  should be displayed
And The Book an Appointment Link should be enabled

Scenario: Book an Appointment Link -Opening Test
Given The new user in home page
When The user clicks on Book an Appointment Link
Then The Book an Appointment Window should Open

Scenario: Book An Appointment Link UI Validation Test - Happy Test
Given The user selects the Book an Appointment Window
When The user provides the required and valid details such as 
<Your Name - Can not be blank>,
<Phone Number - Cannot be blank>, 
<Email - cannot be blank and should be in Valid format>, 
<Appointment Subject - Cannot be blank>,
<Date - Cannot be blank and cannot be previous to current date > and 
<Message - Cannot be blank>
And The user clicks the Send Message Link
Then The message should be sent and the Confirmation Message(Thank you for your message. It has been sent.) should be displayed

