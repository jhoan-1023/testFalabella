Feature: Restablecer contrasena
  Yo como usuario de Falabella
  Quiero poder restablecer mi contrasena
  Para poder comprar un producto

  Scenario: Restablecer contrasena
    Given que el usuario esta en la pagina de inicio de sesion
    When el usuario restablece la contrasena
    | correo | jhoan-1023@hotmail.com |
    Then el usuario recibira un correo con las indicaciones para cambiarla