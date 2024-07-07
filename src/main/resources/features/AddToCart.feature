@smoke
Feature: users can shop from pet store


  Scenario: users can shop any animal
    Given user can  signin
    When user select a category
    And user select a product
    Then user can change amount of products