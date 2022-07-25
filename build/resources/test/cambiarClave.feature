Feature: Cambiar

  Scenario: verify the inico login is successfully

    Given la paginacambiarweb "http://todo.ly/" este abierta
    When yo quiero iniciar el login y cambiar Clave
      | email       | alvarod745@gmail.com |
      | password    | 123456               |
      | newpassword | 123456               |
    Then yo deberia acceder a la app web y cambiar de clave