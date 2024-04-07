Feature: Tumbr login

  Scenario Outline: Invalid login
    Given I am on Tumblr home page
    When I click login button
    And I click continue with email
    And I enter "<email>" email
    And I enter "<password>" password
    Then I should get "Oops. There was an error. Try again." error

    Examples:
      | email         | password |
      | test@test.com | abcabc   |
      | test@test.com | 123456   |
