Feature: Pim

  @AddEmployee
  Scenario Outline: new employee
    Given the user open browser
    And the user fill out user <userName> password <password>
    When the user fill out new employee first name <firstName> last name <lastName>
    And the user create user <user> password <pass> confirm password <confirmPass>
    Then the user validate new employee <firstName> <lastName>


    Examples: data new employee
      | userName | password | firstName | lastName | user     | pass     | confirmPass |
      | Admin    | admin123 | jhonatan  | Medina   | jhome57 | Prueba*1 | Prueba*1    |