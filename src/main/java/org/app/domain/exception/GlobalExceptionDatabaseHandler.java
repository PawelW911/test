package org.app.domain.exception;


public class GlobalExceptionDatabaseHandler extends RuntimeException {

    public GlobalExceptionDatabaseHandler(String message) {
        super(message);
    }
}
