package com.samsung.careers;

import com.samsung.careers.exception.InternalException;
import com.samsung.careers.exception.NotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


@ControllerAdvice
public class ExceptionControllerAdvice {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(InternalException.class)
    public ModelAndView InternalServerError(HttpServletRequest req , Exception e){
        String uri = (String) req.getAttribute("javax.servlet.error.request_uri");
        logger.error( uri + "--->" + e.getMessage());
        return new ModelAndView("error/500");
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NotFoundException.class)
    public ModelAndView NotFoundError(HttpServletRequest req , Exception e){
        String uri = (String) req.getAttribute("javax.servlet.error.request_uri");
        logger.error(uri + "--->" +e.getMessage());
        return new ModelAndView("error/400");
    }

}
