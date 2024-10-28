@Regression
Feature: login functionality
Background:
  Given user should be login a page

  @Login_Valid @Regression
  Scenario: TC01_Valid_Login

    When user enter the valid credentials and click on login button
    Then user should be naviagte to home page
    And user can see the logout link on right corner

    When user enter the valid credentials and click on login button
    Then user should be naviagte to home page
    And user can see the logout link on right corner


  @Login_InValid @Regression
  Scenario: TC_02_Invalid_Login
    When user enter the invalid credentials username as String and password as String & click on login button
    Then user should be see error on home page
    And user can see the login link on right corner

  @Login_InValid @Regression
    Scenario Outline: TC_02.2_Invalid_Login_Multiple_Users
      When user enter the invalid credentials username as "<uid>" and password as "<pwd>" & click on login button
      Then user should be see error on home page

      Examples:
      | uid   | pwd     |
      | add1  | pass1   |
      | add34 | pass334 |

