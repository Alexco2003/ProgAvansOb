package org.example.lab9.src.jdbc.exception;

public class InvalidPersonException extends Exception {
    public InvalidPersonException() {
    }

    public InvalidPersonException(String message) {
        super(message);
    }
}
