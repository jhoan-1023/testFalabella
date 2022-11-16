Feature: Loguearse
  Yo como usuario de Falabella
  Quiero poder iniciar sesion
  Para poder comprar un producto

  Scenario: Iniciar Sesion
    Given que el usuario esta en la pagina de Falabella
    When el usuario se loguea con las credenciales
      | correo     | jhoan-1023@hotmail.com |
      | contrasena | Jhoan1023              |
    Then el usuario podra ver los productos de falabella

  @negativo
  Scenario: Iniciar Sesion con correo no registrado
    Given que el usuario esta en la pagina de Falabella
    When el usuario se loguea con las credenciales incorrectas
      | correo     | pepitomarquez@hotmail.com |
      | contrasena | Jhoan1023                 |
    Then el usuario no se podra loguear

  @negativo
  Scenario: Iniciar Sesion con contrasena invalida
    Given que el usuario esta en la pagina de Falabella
    When el usuario se loguea con las credenciales incorrectas
      | correo     | jhoan-1023@hotmail.com |
      | contrasena | Jhoan123456789         |
    Then el usuario no se podra loguear