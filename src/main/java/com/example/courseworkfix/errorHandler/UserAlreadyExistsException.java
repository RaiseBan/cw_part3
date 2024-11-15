package com.example.courseworkfix.errorHandler;

public class UserAlreadyExistsException extends RuntimeException{
    public UserAlreadyExistsException (String message) {
        super(message);
    }
}
