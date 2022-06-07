package com.revature.exceptions;

public class NewUserHasNonZeroIdException extends RuntimeException {

    public NewUserHasNonZeroIdException() {
        super();
    }

    public NewUserHasNonZeroIdException(String message) {
        super(message);
    }

    public NewUserHasNonZeroIdException(String message, Throwable cause) {
        super(message, cause);
    }

    public NewUserHasNonZeroIdException(Throwable cause) {
        super(cause);
    }

    public NewUserHasNonZeroIdException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
