package com.example.bookstore.exception;

public class SpecificationNotFoundException extends RuntimeException {
    public SpecificationNotFoundException(String message) {
        super(message);
    }
}
