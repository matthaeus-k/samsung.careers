package com.samsung.careers.exception;

import com.samsung.careers.common.BaseExceptionType;
import lombok.Getter;


public class CustomException extends RuntimeException {

    @Getter
    private BaseExceptionType exceptionType;

    public CustomException(BaseExceptionType exceptionType) {
        super(exceptionType.getErrorMessage());
        this.exceptionType = exceptionType;
    }
}
