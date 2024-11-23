package org.example;

import java.util.Scanner;

public class Main {
    private static double result;
    private static String exception;

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter the First operand: ");
            double number1 = Double.parseDouble(scanner.nextLine());
            System.out.println("Please enter the Second operand: ");
            double number2 = Double.parseDouble(scanner.nextLine());
            System.out.println("Please enter the Operation: (exit to quit)");
            String operationStr = scanner.nextLine();
            if (operationStr.equals("exit")) {
                break;
            }

            switch (operationStr) {
                case "*":
                    result = calculator.process(number1, number2, Operations.MULTIPLY);
                    break;
                case "/":
                    try {
                        result = calculator.process(number1, number2, Operations.DIVIDE);
                        exception = null;
                    } catch (InvalidOperation e) {
                        exception = e.getMessage();
                    }
                    break;
                case "+":
                    result = calculator.process(number1, number2, Operations.ADD);
                    break;
                case "-":
                    result = calculator.process(number1, number2, Operations.SUBTRACT);
                    break;
                default:
                    exception = new IllegalArgumentException("Invalid operation: " + operationStr).getMessage();
            }

            if (exception == null) {
                System.out.println("The result is: " + result);
            } else {
                System.out.println("An exception occurred: " + exception);
            }
        }

        scanner.close();
    }
}