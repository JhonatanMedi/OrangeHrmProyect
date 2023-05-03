Feature: Login hrm orange

  @Login
  Scenario Outline: login exitoso
    Given the user open browser
    When the user fill out user <userName> password <password>
    Then the user is on the page dashboard

    Examples: data para logueo
      | userName | password |
      | Jhonatan | Prueba   |
      | Admin    | admin123 |

  @Login2
  Scenario Outline: login exitoso
    Given the user open browser
    When the user fill out user <userName> password <password>
    Then the user is on the page dashboard

    Examples: data para logueo
      | userName | password |
      | pepito   | Prueba   |
