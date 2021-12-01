package com.samsung.careers;

import com.samsung.careers.exception.BadRequestException;
import com.samsung.careers.exception.InternalException;
import com.samsung.careers.exception.NotFoundException;
import com.samsung.careers.exception.RequestException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.time.ZonedDateTime;


@ControllerAdvice
public class ExceptionControllerAdvice {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(InternalException.class)
    public ModelAndView InternalServerError(HttpServletRequest req , Exception e){
        String uri = req.getRequestURI();
        //String uri = (String) req.getAttribute("javax.servlet.error.request_uri");
        logger.error( uri + "--->" + e.getMessage());
        return new ModelAndView("error/500");
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NotFoundException.class)
    public ModelAndView NotFoundError(HttpServletRequest req , Exception e){

        String uri = req.getRequestURI();  //(String) req.getAttribute("javax.servlet.error.request_uri");
        logger.error(uri + "--->" +e.getMessage());
        return new ModelAndView("error/400");
    }

    @ExceptionHandler(RequestException.class)
    public ResponseEntity<Object> ExceptionRequestHandler(RequestException e){
        HttpStatus httpStatus = HttpStatus.BAD_REQUEST;

        BadRequestException badRequestException = new BadRequestException(
                e.getMessage(),
                e,
                httpStatus,
                ZonedDateTime.now()
        );

        return new ResponseEntity<>(badRequestException,httpStatus);
    }

}
