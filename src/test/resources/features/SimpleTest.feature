@Tests
Feature: Simple Test

  Scenario: Login
    When login
    And select
    Then User reaches portal

  Scenario: Search
    When search


  Scenario: Select
    When select

  Scenario: Log Out
    When log out
    Then User logs out of the portal and see a successful logout message
    