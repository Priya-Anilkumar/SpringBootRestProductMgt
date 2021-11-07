package com.cogent.Controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;


@ControllerAdvice
public class GlobalExceptionHandler {

	  @ExceptionHandler(ResourceNotFoundExceptions.class)
	
	public ResponseEntity<?>  resourceNotFoundException(ResourceNotFoundExceptions ex,WebRequest request ){
		
		System.out.println("Exception handling for resource");
        ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	}
	
	
	
}
