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
Feature: login page with incorrect credentials by Anna D.

Background:
	Given I am on at newtours homepage "http://newtours.demoaut.com/"
  
  Scenario: Test unsuccessful login with incorrect credentials
    When I insert username = "a" and password ="bca"
    And click login button
    Then "SIGN-ON" link should be displayed
    
  

  Scenario Outline: Test unsuccessful login with incorrect credentials
    When I insert username = "<name>" and password ="<pass>"
    And click login button
    Then "<link>" link should be displayed
Examples: 
      | name | pass | link     |
      | a    | a    | SING-OFF |
      | a    | xsw  | SIGN-ON  |
      | a    |      | SIGN-ON  |
      |      | a    | SIGN-ON  |
      |      |      | SIGN-ON  |
      |      | CDE  | SIGN-ON  |
      | wsx  | xsw  | SIGN-ON  |
      | SWE  | a    | SIGN-ON  |
      | SWE  |      | SIGN-ON  |
