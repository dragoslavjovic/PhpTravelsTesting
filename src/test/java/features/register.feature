Feature: Register user

  Background:
    Given user on home page
    When on header page user wants to sign up

  Scenario Outline: User is sign up
    And rp user type firstname as <firstname>
    And rp user type lastname as <lastname>
    And rp user type mobile number as <mobilenumber>
    And rp user type email as <email>
    And rp user type password as <password>
    And rp user type confirm password as <confirmpassword>
    And rp user press button sign up
    Then user <results> signed up
    Examples:
    | firstname | lastname | mobilenumber | email | password | confirmpassword | results |
    |           |          |              |       |          |                 | is not  |
    | valid     | valid    | valid        | valid | valid    |                 | is not  |
    | valid     | valid    | valid        | valid |          | valid           | is not  |
    | valid     | valid    | valid        |       | valid    | valid           | is not  |
    | valid     |          | valid        | valid | valid    | valid           | is not  |
    |           | valid    | valid        | valid | valid    | valid           | is not  |
    | valid     | valid    |              | valid | valid    | valid           | is      |
    | valid     | valid    | valid        | valid | valid    | valid           | is      |


  Scenario: User tries to register in twice with same data
    And rp valid user registered
    And rp user wants to logout
    And on header page user wants to sign up
    And rp valid user registered
    Then rp user did not register again

  Scenario Outline: User writes passwords during registration
    And rp user required fields filled valid without password and confirm password
    And rp user filled password <password> and confirm password <confirmpassword>
    And rp user press button sign up
    Then rp password <result> accept
   Examples:
    | password | confirmpassword | result |
    | <6       | <6              | is not |
    | valid    | invalid         | is not |
    | valid    | valid           | is     |