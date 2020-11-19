@tag
Feature: Validating Login screen

  Scenario: Validate sucessful Login with valid data
    Given User should hv launched application
    When valid userid and password entered
    And Click on login button
    Then homescreen should be displayed on sucessful login
