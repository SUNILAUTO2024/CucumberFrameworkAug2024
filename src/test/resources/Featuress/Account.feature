@Regression
Feature: Account functionality

  Background:
    Given user should be login a page

  @Account @Regression
  Scenario: TC_04_Create_Account

    When user enter the valid credentials_theme and click on login button
    Then user should be naviagte to home page
    And user can see the logout link on right corner
    When user enters the mandatory fields on Account page like Account name in String and click on save button