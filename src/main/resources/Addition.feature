Feature: addition operation

Scenario Outline: add two double numbers and give the correct result
  Given I have a calculator
  And I have two numbers <number1> and <number2>
  When I add them
  Then I should get the result <result> or an exception <exception>

  Examples:
    | number1 | number2 | result  | exception |
    | 2.0     | 3.0     | 5.0     | ""     |
    | 2.0     | 0.0     | 2.0     | ""     |
    | 0.0     | 2.0     | 2.0     | ""     |
    | 1.0     | 5.0     | 6.0     | ""     |
    | 5.0     | 1.0     | 6.0     | ""     |
    | -4.5    | 2.25    | -2.25   | ""     |
    | -1.0    | -1.0    | -2.0    | ""     |
    | -4.6    | 2.3     | -2.3    | ""     |