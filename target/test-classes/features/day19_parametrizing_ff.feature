@google_search_parameters @regression
Feature: Finding product on google search
  Background: user is on the navigate to google page
    Given user in on the google page
    Scenario: TC01_iphone_search
      #test data= iphone ."" will parametize this data
      #this means this parameter can be any test data
      Given user search for "iPhone"
      Then  verify the result has "iPhone"
      Then close the application
  Scenario: TC02_tesla_search
    Given user search for "bmw"
    Then  verify the result has "bmw"
    Then close the application

  Scenario: TC03_tesla_search
    Given user search for "tesla"
    Then  verify the result has "tesla"
    Then close the application