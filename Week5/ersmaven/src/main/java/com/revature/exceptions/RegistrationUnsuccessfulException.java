package com.revature.exceptions;

public class RegistrationUnsuccessfulException extends RuntimeException {

    public RegistrationUnsuccessfulException() {
        super();
    }

    public RegistrationUnsuccessfulException(String message) {
        super(message);
    }

    public RegistrationUnsuccessfulException(String message, Throwable cause) {
        super(message, cause);
    }

    public RegistrationUnsuccessfulException(Throwable cause) {
        super(cause);
    }

    public RegistrationUnsuccessfulException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
