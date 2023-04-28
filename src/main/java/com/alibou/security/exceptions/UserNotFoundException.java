package com.alibou.security.exceptions;

public class UserNotFoundException extends RuntimeException {
    private static final long serialVerisionUID = 2;
    public UserNotFoundException(String message) {
        super(message);
    }
}
