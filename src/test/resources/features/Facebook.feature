Feature: login functionality

  Scenario Outline:
    Given I am on Facebook login page
    And I enter invalid Facebook email "<email>"
    And I enter invalid Facebook password "<password>"
    Then I should get error message: "<error>"

    Examples:
      | email               | password  | error                                                                 |
      | test1341234@est.com | myFavPassword | The email or mobile number you entered isn’t connected to an account. |