Feature: Lambda Input Form

  Scenario: Test input form 2
    Given I am on Lambda home page
    When I navigate to input form page
    And fill out the form with the following information
      | name     | John         |
      | email    | jc@gmail.com |
      | password | myFavPass    |
      | company  | Codefish     |
      | website  | Codefish.io  |
      | country  | United States          |
      | city     | Des Plaines  |
      | address1 | 2200 E Devon |
      | address2 | 351          |
      | state    | IL           |
      | zipCode  | 60018        |

    And click submit
    Then I should see success message

