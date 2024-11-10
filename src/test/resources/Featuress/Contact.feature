@Regression
Feature: Contact functionality

  Background:
    Given user should be login a page

  @Contact @Regression
  Scenario: TC_05_Create_Contact

    When user enter the valid credentials_theme and click on login button
    Then user should be naviagte to home page
    And user can see the logout link on right corner
    When user enters the mandatory fields on Contact page like Last name in String and click on save button