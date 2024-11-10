@Regression @Ticket
Feature: Ticket functionality

  Background:
    Given user should be login a page

   @PriorityDD
  Scenario: TC_07_Check Priority, Severity and Category DD in New Ticket page

    When user enter the valid credentials_theme and click on login button
    Then user should be naviagte to home page
    And user can see the logout link on right corner
    When user clicks on New Ticket page link

    Then user verify the Priority DD and its values in New Ticket page
    Then verify default selection of priority DD in New Ticket page
    And user select the priority from dropdown
    Then  user verify the selected Priority in New Ticket page

    Then user verify severity DD and its values in New Ticket page
    Then verify default selection of severity DD in New Ticket page
    And user select the severity from dropdown
    Then  user verify the selected severity in New Ticket page

    And user verify category DD and its values in New Ticket page
    Then verify default selection of category DD in New Ticket page
    And user select the category from dropdown
    Then  user verify the selected category in New Ticket page





  @Alert
  Scenario: TC_08_Check Alert for Mandatory Fields and save mandatory fields in New Ticket page
    When user enter the valid credentials_theme and click on login button
    Then user should be naviagte to home page
    And user can see the logout link on right corner
    When user clicks on New Ticket page link
    Then user verify the Alert for mandatory fields in New Ticket page
    And user Accept the Alert
    Then user enter details in mandatory fields and clicked on save button in New Ticket page

   @CategoryDD
  Scenario: TC_09_Check category DD in New Ticket page
    When user enter the valid credentials_theme and click on login button
    Then user should be naviagte to home page
    And user can see the logout link on right corner
    When user clicks on New Ticket page link
    Then user verify category DD and its values in New Ticket page
    Then verify default selection of category DD in New Ticket page
