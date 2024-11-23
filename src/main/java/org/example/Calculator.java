package org.example;

public class Calculator {
    public double process(double number1, double number2, Operations operation) {
        switch (operation) {
            case MULTIPLY:
                return multiply(number1, number2);
            case DIVIDE:
                return divide(number1, number2);
            case ADD:
                return add(number1, number2);
            default:
                throw new IllegalArgumentException("Invalid operation: " + operation);
        }
    }

    private double multiply(double number1, double number2) {
        return number1 * number2;
    }

    private double divide(double number1, double number2) {
        if (number2 == 0) {
            throw new InvalidOperation("Invalid operation: Division By Zero is invalid");
        }
        return number1 / number2;
    }

    private double add(double number1, double number2) {
        return number1 + number2;
    }

    private double subtract(double number1, double number2){
        return number1 - number2;
    }
}
