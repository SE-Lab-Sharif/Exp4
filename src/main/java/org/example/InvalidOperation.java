package org.example;

public class InvalidOperation extends RuntimeException {
    public InvalidOperation(String message) {
        super(message);
    }
}
