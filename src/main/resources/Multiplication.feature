# Created by amirhossein at 22/11/2024
Feature: multiplication operation

Scenario Outline: multiply two double numbers and give the correct result
  Given I have a calculator
  And I have two numbers <number1> and <number2>
  When I multiply them
  Then I should get the result <result> or an exception <exception>

  Examples:
     | number1 | number2 | result | exception |
     | 2.0     | 3.0     | 6.0    |    ""       |
     | 2.0     | 0.0     | 0.0    |    ""       |
     | 0.0     | 2.0     | 0.0    |    ""       |
     | 1.0     | 5.0     | 5.0    |    ""       |
     | 5.0     | 1.0     | 5.0    |    ""       |
     | -4.5    | 2.25    | -10.125|    ""       |
     | -1.0    | -1.0    | 1.0    |    ""       |
     | -4.6    | 2.3     | -10.58 |    ""       |