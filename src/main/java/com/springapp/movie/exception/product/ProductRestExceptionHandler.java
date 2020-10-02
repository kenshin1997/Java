package com.springapp.movie.exception.product;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductRestExceptionHandler {
    //Add a handler exception for LocalNotFoundException
    //LocalErrorResponse - type of response body
    //LocalNotFoundException - exception type to catch/handle
    @ExceptionHandler
    public ResponseEntity<ProductErrorResponse> handleException(ProductNotFoundException exception){

        //create LocalErrorResponse
        ProductErrorResponse errorResponse = new ProductErrorResponse(HttpStatus.NOT_FOUND.value(),exception.getMessage(),System.currentTimeMillis());
        //return ResponseEntity
        return new ResponseEntity<>(errorResponse,HttpStatus.NOT_FOUND);
    }

    //All exception
    @ExceptionHandler
    public ResponseEntity<ProductErrorResponse> handleException(Exception exception){

        //create LocalErrorResponse
        ProductErrorResponse errorResponse = new ProductErrorResponse(HttpStatus.BAD_REQUEST.value(),exception.getMessage(),System.currentTimeMillis());
        //return ResponseEntity
        return new ResponseEntity<>(errorResponse,HttpStatus.BAD_REQUEST);
    }

}
