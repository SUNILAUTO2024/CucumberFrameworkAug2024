Feature: Ticket functionality

  Background:
    Given user should be login a page

  @Ticket @Regression @PriorityDD
  Scenario: TC_07_Check Priority DD in New Ticket page

    When user enter the valid credentials_theme and click on login button
    Then user should be naviagte to home page
    And user can see the logout link on right corner
    When user clicks on New Ticket page link
    Then user verify the Priority DD and its values in New Ticket page

  @Ticket @Regression @SeverityDD
  Scenario: TC_08_Check Severity DD in New Ticket page

    When user enter the valid credentials_theme and click on login button
    Then user should be naviagte to home page
    And user can see the logout link on right corner
    When user clicks on New Ticket page link
    Then user verify severity DD and its values in New Ticket page

  @Ticket @Regression @CategoryDD
  Scenario: TC_09_Check category DD in New Ticket page
    When user enter the valid credentials_theme and click on login button
    Then user should be naviagte to home page
    And user can see the logout link on right corner
    When user clicks on New Ticket page link
    Then user verify category DD and its values in New Ticket page
