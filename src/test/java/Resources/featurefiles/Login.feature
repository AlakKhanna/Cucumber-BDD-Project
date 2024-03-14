Feature: verify the email & password

  Background:
    Given User navigates to Login Page

  Scenario Outline: Login with Valid Credentials
    When User enters valid email address <email>
    And Enters valid password <pass>
    And Clicks on Login button
    Then User Should login successfully
    Examples:
      | email                    | pass    |
      | "amotooricap9@gmail.com" | "12345" |

  Scenario Outline: Login with invalid Credentials
    When User enters valid email address <email>
    And Enters valid password <pass>
    And Clicks on Login button
    Then User Should get a proper warning message
    Examples:
      | email                         | pass        |
      | "amotooricap343434@gmail.com" | "123457890" |


  Scenario Outline: Login with valid email adddress and invalid password
    When User enters valid email address <email>
    And Enters valid password <pass>
    And Clicks on Login button
    Then User Should get a proper warning message
    Examples:
      | email                    | pass        |
      | "amotooricap9@gmail.com" | "123457890" |

  Scenario Outline: Login with invalid email adddress and valid password
    When User enters valid email address <email>
    And Enters valid password <pass>
    And Clicks on Login button
    Then User Should get a proper warning message
    Examples:
      | email                           | pass    |
      | "amotooricap34344343@gmail.com" | "12345" |

  Scenario: Login without providing any credentials

    When Clicks on Login button
    Then  User Should get a proper warning message