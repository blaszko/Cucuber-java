Feature: Menu Management
  Scenario: Add a menu item
    Given I have a menu item with name "Cucumber Sandwiches" and price 20
    When I add that menu item
    Then Menu Item with name "Cucumber Sandwiches" should be added