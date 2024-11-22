# Created by amirhossein at 22/11/2024
Feature: Division operation

  Scenario Outline: Divide two numbers and get the result
    Given I have a calculator
    And I have two numbers <number1> and <number2>
    When I divide them
    Then I should get the result <result> or an exception <exception>

    Examples:
      | number1 | number2 | result | exception                                        |
      | 10      | 2       | 5      |               ""                                 |
      | 10      | 0       | 00     | "Invalid operation: Division By Zero is invalid" |
      | 0       | 10      | 0      |               ""                                 |
      | 0       | 0       | 00     | "Invalid operation: Division By Zero is invalid" |
      | 10      | 3       | 3.33333333 |           ""                                 |
      | 9       | -3      | -3     |               ""                                 |
      | -9      | 3       | -3     |               ""                                 |
      | -9      | -3      | 3      |               ""                                 |
      | 1       | 2       | 0.5    |               ""                                 |
      | 1       | 3       | 0.33333333 |           ""                                 |
      | 1       | 4       | 0.25   |               ""                                 |
      | -1      | 5       | -0.2   |               ""                                 |
      | -1      | 6       | -0.16666667 |          ""                                 |
      | 1000000 | 1000000 | 1      |               ""                                 |
      | 50      | 1       | 50     |               ""                                 |
      | 50      | 2       | 25     |               ""                                 |
      | 50      | -1      | -50    |               ""                                 |