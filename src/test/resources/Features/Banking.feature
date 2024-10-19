Feature: Digital Banking

  Scenario Outline: Ensure that a user can successful make a deposit on the first account
    Given The user is on the XYZ Banking home page
    And The user click customer login
    And The user validates that your name label is displayed
    And The user select a customer name
    And The user click login
    And The user validates that login is successful
    And The user select deposit
    And The user enters deposit<deposit>
    When The user click deposit
    Then The Deposit is successful
    Examples:
      | deposit |
      | 1500    |