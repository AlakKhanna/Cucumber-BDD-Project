Feature: User registration

  Background:
    Given user navigate to register account home

  Scenario: Register with mandatory fields

    When User enter first name "Alak" into the First Name field
    And  enters last name "Khanna" in the Last Name field
    And enters email address "alak.khanna@gmail.com" into the EMail field
    And enters password "12345" into the Password field
    And enters password "12345" into the Password Confirm field
    And Selects Privacy Policy Field
    And Clicks on Continue Button
    Then Account should get successfully created

  Scenario: Register with all fields

      When User enter first name "Alak" into the First Name field
      And  enters last name "Khanna" in the Last Name field
      And enters email address "alak.khanna@gmail.com" into the EMail field
      And enters password "12345" into the Password field
      And enters password "12345" into the Password Confirm field
      And Select Yes for Newsletter
      And Selects Privacy Policy Field
      And Clicks on Continue Button
      Then Account should get successfully created

  Scenario: Register without providing any field

        When User don't enter any fields
        And Clicks on Continue Button
        Then warning message should be displayed for the mandatory fields

  Scenario: Register with duplicate email address

    When User enter first name "Alak" into the First Name field
    And  enters last name "Khanna" in the Last Name field
    And enters email address "alak.khanna@gmail.com" into the EMail field
    And enters password "12345" into the Password field
    And enters password "12345" into the Password Confirm field
    And Selects Privacy Policy Field
    And Clicks on Continue Button
    Then Warning message informing the user about duplicate email should be displayed

