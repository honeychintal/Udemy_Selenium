Feature: Application Login

  @smoketest
  Scenario: Successful Login with Valid Credentials
    Given User is on Home Page
    When User Navigate to LogIn Page
    And User enters UserName "Rahul" and Password "KingRahul123"
    Then Message displayed Login Successfully
