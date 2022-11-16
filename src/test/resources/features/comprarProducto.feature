Feature: Comprar Producto
  Yo como usuario de Falabella
  Quiero ver un producto disponible
  Para poderlo comprar

  Scenario: Comprar Producto
    Given que el usuario inicia sesion en la pagina de falabella
      | correo     | jhoan-1023@hotmail.com |
      | contrasena | Jhoan1023              |
    When el usuario selecciona un producto disponible
      | producto | funda iphone 13 pro |
    Then el usuario podra comprar el producto