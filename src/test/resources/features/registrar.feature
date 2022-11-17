Feature: Registrar Usuario
  Yo como cliente de Falabella
  Quiero poder registrarme
  Para poder iniciar sesion y comprar productos

  Scenario: Registrar usuario
    Given que el usuario se encuentra en la pagina de Falabella
    When el usuario se registra con los datos
      | nombre     | jhoan                           |
      | apellido   | marquez                         |
      | cedula     | 1214714600                      |
      | celular    | 3165795488                      |
      | correo     | jhoanmarquez1023111@hotmail.com |
      | contrasena | Jhoan1023                       |
    Then el usuerio podra iniciar sesion en el portal de Falabella

  @negativo
  Scenario: Usuario ya registrado
    Given que el usuario se encuentra en la pagina de Falabella
    When el usuario se registra con los datos
      | nombre     | jhoan                  |
      | apellido   | marquez                |
      | cedula     | 1214714600             |
      | celular    | 3165795488             |
      | correo     | jhoan-1023@hotmail.com |
      | contrasena | Jhoan1023              |
    Then no se puede registrar por que ya el usuario se encuentra registrado
