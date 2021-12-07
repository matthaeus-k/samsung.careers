package com.samsung.careers.common;

import lombok.Getter;

@Getter
public enum CommonExceptionType implements  BaseExceptionType{

    NOT_FOUN(404, 200, "Not fund error."),
    INTERNAL_SERCER(500, 200, "internal server error."),
    SESSION_TIMEOUT(500,200,"SESSION TIMEOUT")
    ;


    private int errorCode;
    private int httpStatus;
    private String errorMessage;

    CommonExceptionType(int errorCode, int httpStatus, String errorMessage) {
        this.errorCode = errorCode;
        this.httpStatus = httpStatus;
        this.errorMessage = errorMessage;
    }
}
