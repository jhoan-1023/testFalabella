Feature: Buscar Categoria
  Yo como usuario de Falabella
  Quiero buscar una categoria
  Para comprar un producto

  Scenario: Buscar una categoria de un producto
    Given que el usuario esta en la plataforma
    When el usuario busca una categoria
    Then podra ver los productos de la categoria