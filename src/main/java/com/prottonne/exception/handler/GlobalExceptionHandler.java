package com.prottonne.exception.handler;

import com.prottonne.exception.dto.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public GlobalExceptionHandler() {
        super();
    }

    @ExceptionHandler(value = SomeException.class)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Response someExceptionHandler(Exception ex) {

        // TODO      
        SomeException someException = (SomeException) ex;

        logger.error(
                "GUID={};CODE={};MESSAGE={};ERROR={}",
                someException.getGuid(),
                someException.getCode(),
                someException.getMessage(),
                someException
        );

        Response response = new Response();
        response.setMessage(ex.getMessage());

        return response;
    }

    @ExceptionHandler(value = Throwable.class)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Response defaultHandler(Exception ex) {

        // TODO
        return new Response();
    }

}
