package com.wmeimob.custom.exception;

/**
 * Created by Shinez on 2017/6/7.
 */
public class CustomException extends RuntimeException {

    static final long serialVersionUID = -312124233541251251L;
    public CustomException() {
        super();
    }
    public CustomException(String message) {
        super(message);
    }
    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }
    public CustomException(Throwable cause) {
        super(cause);
    }
    protected CustomException(String message, Throwable cause,
                               boolean enableSuppression,
                               boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
