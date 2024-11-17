@Regression
Feature: New Vendor functionality

  Background:
    Given user should be login a page

  @Contact @Regression
  Scenario: TC_12_Validate New Vendor Page

    When user enter the valid credentials_theme and click on login button
    Then user should be naviagte to home page
    When user hover over << show subMenu icon and click on New Vendor option
    Then user should navigate to New Vendor page and add all mandatory fields and click on save
    And user should be able to see the New Vendor page