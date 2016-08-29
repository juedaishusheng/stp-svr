package com.el;

/**
 * 应用异常
 *
 * Created on 16/3/21.
 *
 * @author panlw
 */
public class ApplicationException extends RuntimeException {

    public ApplicationException(String message) {
        super(message);
    }

    public ApplicationException(String message, Throwable cause) {
        super(message, cause);
    }
}
