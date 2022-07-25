Feature: Crear

  Scenario: verify the crear usuario is successfully

    Given la paginaweb "http://todo.ly/" este abierta
    When yo quiero iniciar el login
      | nombre    | usuario de prueba |
      | email    | usuario1@maestria.com |
      | password | 12345                 |
    Then yo deberia acceder a la app web