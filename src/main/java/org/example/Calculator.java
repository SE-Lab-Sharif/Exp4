package org.example;

public class Calculator {
    public double process(double number1, double number2, Operations operation) {
        switch (operation) {
            case MULTIPLY:
                return multiply(number1, number2);
            default:
                throw new IllegalArgumentException("Invalid operation: " + operation);
        }
    }

    private double multiply(double number1, double number2) {
        return number1 * number2;
    }
}
