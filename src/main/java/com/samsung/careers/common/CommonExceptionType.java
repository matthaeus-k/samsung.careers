package com.samsung.careers.common;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
public enum CommonExceptionType implements  BaseExceptionType{


    NOT_FOUN(404, 999, "Not fund error."),
    INTERNAL_SERCER(500, 999, "internal server error."),
    SESSION_TIMEOUT(500,999,"session timeout"),
    FILE_SIZE(500,999,"Don't allow files size"),
    FILE_TYPE(500,999,"Don't allow files type")
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
