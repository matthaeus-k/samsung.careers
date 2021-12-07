package com.samsung.careers.common;

public interface BaseExceptionType {
    int getErrorCode();
    int getHttpStatus();
    String getErrorMessage();
}
