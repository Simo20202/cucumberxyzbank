Feature: Digital Banking

  Scenario Outline: Ensure that a user can successful make a deposit on the first account
    Given The user is on the XYZ Banking home page
    And The user click customer login
    And The user validate that your name label is displayed
    And The user select customer number one
    And The user click login
    And The user validate that login is successful
    And The user select deposit
    And The user enters the amount to be deposited<deposit>
    When The user click deposit
    Then Deposit is successful confirmation message should be displayed
    And The user Logout
    Examples:
      | deposit |
      | 1500    |


  Scenario Outline: Ensure that a user can successful make a deposit on all accounts
    Given The user is on the XYZ Banking home page
    And The user click customer login
    And The user validate that your name label is displayed
    And The user select customer number two
    And The user click login
    And The user validate that login is successful
    And The user select deposit
    And The user enters the amount to be deposited<deposit>
    When The user click deposit
    Then Deposit is successful confirmation message should be displayed
    And The user select the second account
    And The user enters the amount to be deposited<deposit>
    When The user click deposit
    Then Deposit is successful confirmation message should be displayed
    And The user select the third account
    And The user enters the amount to be deposited<deposit>
    When The user click deposit
    Then Deposit is successful confirmation message should be displayed
    And The user Logout
    Examples:
      | deposit |
      | 1500    |


  Scenario Outline: Ensure that a user can successful make a deposit and wthdrawl on the first account
    Given The user is on the XYZ Banking home page
    And The user click customer login
    And The user validate that your name label is displayed
    And The user select customer number three
    And The user click login
    And The user validate that login is successful
    And The user validate the current balance
    And The user select deposit
    And The user enters the amount to be deposited<deposit>
    When The user click deposit
    Then Deposit is successful confirmation message should be displayed
    And The user select Transactions
    And The user validate that the transaction appears
    When The user click Back button
    Then The user return to the account page
    And The user select withdrawl
    And The user enters the amount to be Withdrawn <withdraw>
    When The user click withdraw
    Then Transaction is successful confirmation message should be displayed
    Examples:
      | deposit |withdraw|
      | 31459   |31459   |

