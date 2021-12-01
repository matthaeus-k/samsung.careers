package com.samsung.careers.exception;

public class NotFoundException extends RuntimeException {

    public NotFoundException(String msg){
        super(msg);
    }

    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
