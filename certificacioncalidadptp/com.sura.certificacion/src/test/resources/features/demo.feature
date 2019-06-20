

Feature: Searching by keyword

  In order to find items that I would like to purchase
  As a potential buyer
  I want to be able to search for items containing certain words

  Scenario: Should list Colombian items related to a specified keyword
    Given I want to buy any wool product
    When I search for items containing 'wool'
    Then I should see all items that include to 'wool' into name product

