package com.samsung.careers.exception;

import javax.servlet.http.HttpServletRequest;

public class InternalException extends RuntimeException{
    public InternalException(HttpServletRequest req, String msg){
        super(msg);
    }

    public InternalException(String message) {
        super(message);
    }
}
