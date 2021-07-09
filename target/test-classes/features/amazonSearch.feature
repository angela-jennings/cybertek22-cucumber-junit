Feature: Amazon Search and Cart feature
  @wip
  Scenario: Amazon search and cart functionality
    Given User is on Amazon Home Page
    When User searches for hats for men
    And user adds the first hat appearing to the cart with quantity two
    Then the total price and quantity should be correct
    When user reduces the quantity from two to one
    Then total price and quantity will be correctly changed



