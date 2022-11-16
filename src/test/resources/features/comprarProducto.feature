Feature: Comprar Producto
  Yo como usuario de Falabella
  Quiero ver un producto disponible
  Para poderlo comprar

  Scenario: Comprar Producto
    Given que el usuario inicia sesion en la pagina de falabella
    When el usuario selecciona un producto disponible
      | producto    | funda iphone 13 pro    |
      | correo      | jhoan-1023@hotmail.com |
      | direccion   | Carrera 65 F # 31 - 40 |
      | apartamento | 812                    |
    Then el usuario podra comprar el producto