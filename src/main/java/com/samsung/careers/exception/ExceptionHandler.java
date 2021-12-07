package com.samsung.careers.exception;

import com.samsung.careers.common.BaseExceptionType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandler {

    @ResponseBody
    @org.springframework.web.bind.annotation.ExceptionHandler(CustomException.class)
    public ResponseEntity<Error> exception(CustomException exception){
        return new ResponseEntity<>(Error.create(exception.getExceptionType()), HttpStatus.OK);
    }

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    static class Error{
        private int code;
        private int status;
        private String message;


        static Error create(BaseExceptionType exception){
            return new Error(exception.getErrorCode(), exception.getHttpStatus(), exception.getErrorMessage());
        }
    }

}
