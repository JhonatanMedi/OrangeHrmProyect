Feature: Leave hrm orange

  @Leave
  Scenario Outline: buscar en la lista
    Given the user open browser
    And the user fill out user <userName> password <password>
    When the user select from list leave <typesLeave>

    Examples: data para logueo
      | userName | password | typesLeave    |
      | Admin    | admin123 | US - Personal |