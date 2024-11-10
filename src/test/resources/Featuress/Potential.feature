@Regression
Feature: Potential functionality

  Background:
    Given user should be login a page

  @Potential @Regression
  Scenario: TC_06_Create_Potential

    When user enter the valid credentials_theme and click on login button

    And user can see the logout link on right corner

    Then user click on New Potential link

    When user enters the mandatory fields on New Potential page Potential name in String, Select Account and click on save button