Feature: Login functionality

  Scenario: Successful login with valid credentials
    Given I am on the login page
    When I enter a valid username as "pravin.admin"
    And I enter a valid password "Pravin@963"
    And I click the login button
    Then I should be redirected to the profile page
    And I should see the "pravin.admin" on the profile page.

  Scenario: Unsuccessful login with invalid credentials
    Given I am on the login page
    When I enter an invalid username and password
    And I click the login button
    Then I should see an error message

  Scenario: Unsuccessful login with an empty username
    Given I am on the login page
    When I leave the username field empty
    And I enter a valid password
    And I click the login button
    Then I should see an error message indicating the username is required

  Scenario: Unsuccessful login with an empty password
    Given I am on the login page
    When I enter a valid username
    And I leave the password field empty
    And I click the login button
    Then I should see an error message indicating the password is required
