Feature: Login tests

  Background:
    Given user on home page
    When user wants to login

  Scenario Outline: User is logging
    And user types <username> and <password>
    Then on login page user <result> logged
   Examples:
      | username     | password         | result |
      | valid.user   | valid.password   | is     |
      |              |                  | is not |
      |              | valid.password   | is not |
      | valid.user   |                  | is not |
      | invalid.user | invalid.password | is not |

  Scenario: User registration
    And user wants to singup
    Then user on singup page

  Scenario Outline: User is forget password
    When user is forget password
    And on forget page user types <email>
    Then user's <email> <results> send
   Examples:
    |email         |results |
    | valid.user   | is     |
    | invalid.user | is not |