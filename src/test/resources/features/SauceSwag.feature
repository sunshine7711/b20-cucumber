Feature: Sauce swag

  Scenario: Login with valid username
    Given I am on sauce swag login page
    When I login with valid username and password
    Then I should see items on the page

  Scenario: Login with locked user
    Given I am on sauce swag login page
    When I login with locked username and password
    Then I should get error message

  Scenario: Login with visual user
    Given I am on sauce swag login page
    When I login with visual user
    Then I should see "backpack" item
    Then I should see "onesie" item
    And the price should be $7.99
















