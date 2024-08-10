Feature: Outline example

  Scenario Outline: Verify <Username> menu is displayed based on user <MenuOption>
    Given User is on Login Page
    When User enter user name as "<Username>"
    And User enter password as "<Password>"
    And User click on Login button
    Then Verify user is navigated to Home page
    And Verify User is able to see "<MenuOption>"

    Examples: 
      | Username     | Password    | MenuOption               |
      | Manager      | password123 | Manager Menu option      |
      | Asst.Manager | password124 | Asst.Manager Menu option |
      | Accountant   | password125 | Accountant Menu option   |
      | Cashier      | password126 | Cashier Menu option      |
