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
Feature: test scenario to test login logout for Travel Portal

  Background: 
    Given I am on the travel portal "http://newtours.demoaut.com/"

  @tag1
  Scenario Outline: Login logout with different credentials
    When I type login = "<userName>" and password = "<password>"
    And I click sing-in button
    Then I shoud get "<link>" link

    Examples: 
      | userName  | password      | link     |
      | a         | a             | SIGN-OFF |
      | b         |               | SIGN-ON  |
      | b         | wrongPassword | SIGN-ON  |
      | wrongUser | b             | SIGN-ON  |
      | wrongUser | wrongPassword | SIGN-ON  |
      | wrongUser |               | SIGN-ON  |
      |           | b             | SIGN-ON  |
      |           | wrongPassword | SIGN-ON  |
      |           |               | SIGN-ON  |
