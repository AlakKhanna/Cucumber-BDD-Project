Feature: search functionality

Background:
  Given user opens the application

  Scenario: search for the valid product
    When user enters the valid product in the search field
    And user clicks on Search button
    Then valid product should get displayed in search results

  Scenario: search for non existing product
    When user enters non-existing product in the search field
    And user clicks on Search button
    And proper text informing the user about no product matching should be displayed

  Scenario: search without providing any product
    When user dont enter any product in the search field
    And user clicks on Search button
    And proper text informing the user about no product matching should be displayed

