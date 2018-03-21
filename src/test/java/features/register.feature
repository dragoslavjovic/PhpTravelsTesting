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
    Then user <results> sgned up
    Examples:
    | firstname       | lastname       | mobilenumber        | email       | password                | confirmpassword                 | results |
    | valid.firstname | valid.lastname | valid.mobile.number | valid.email | valid.register.password | valid.register.confirm.password | is      |
    |                 |                |                     |             |                         |                                 | is not  |

#  Scenario: User is success signed up
#    And rp user filled fields valid.firstname, valid.lastname, valid.mobile.number, valid.email, valid.register.password, valid.register.confirm.password
#    Then rp account page displayed