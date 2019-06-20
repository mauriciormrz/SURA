# language: es

Característica: Searching by keyword

  In order to find items that I would like to purchase
  As a potential buyer
  I want to be able to search for items containing certain words

  Escenario: Should list Colombian items related to a specified keyword
    Dado I want to buy any wool product
    Cuando I search for items containing 'wool'
    Entonces I should see all items that include to 'wool' into name product