@Regresion
Feature: Descuentos navidegnos en las compras de productos
  a los ganadores del concurso de la empresa SWAGLABS

  @CheckOutExitoso
  Scenario Outline: CheckOut exitoso de la compra de dos productos
    Given que ingreso a la URL con usuario  y contrasegna
      | <Usuario> | <Contrasegna> |
    When selecciono los productos
      | <CantidadProductos> | <ProductoUno> | <ProductoDos> | <ProductoTres> |
    And hago checkout en el carrito de compras
    And diligencio el formulario
      | <Nombre> | <Apellido> | <CodigoPostal> |
    Then verifico la informacion del checkout
      | <Porcentaje> | <Ganador> | <CantidadProductos> | <ProductoUno> | <ProductoDos> |
    And finalizo la compra

    Examples: 
      | Usuario       | Contrasegna  | CantidadProductos | ProductoUno         | ProductoDos             | ProductoTres      | Nombre   | Apellido | CodigoPostal | Ganador | Porcentaje |
      | standard_user | secret_sauce |                 3 | Sauce Labs Backpack | Sauce Labs Bolt T-Shirt | Sauce Labs Onesie | Mauricio | Ramirez  |     05001000 | true    |         25 |
