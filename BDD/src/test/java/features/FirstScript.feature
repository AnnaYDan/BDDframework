@tag
Feature: test scenario to test login logout for Travel Portal

  @tag1
  Scenario: Login logout with correct credentials
		Given I am on the travel portal "http://newtours.demoaut.com/"
    When I type login = "d" and password = "d"
    And I click sing-in button
    Then I shoud get "SIGN-OFF" link