Feature: lead functionality

  Background:
    Given user should be on login page

  @Leads @Regression
  Scenario: TC_03_Create_Lead
    When user enter the valid credentials and click on login button
    Then user should be naviagte to home page
    And user can see the logout link on right corner
    When user enters the mandatory fields last name as String , Comapany name as String and click on save button

    Then lead should be created successfully



    @Leads @Multiple_User
    Scenario: TC_04_Create_Lead_Data from Page Factory
      When user enter the valid credentials and click on login button
      Then user should be naviagte to home page
      And user can see the logout link on right corner
      When user enters the mandatory fields and click on save button
      |lastname|company|
      |Modi    |BJP    |
      |Gandhi  |BJP    |
      |Pawar   |NCP    |
      |SHinde  |ShivSHena|

      Then lead should be created successfully



