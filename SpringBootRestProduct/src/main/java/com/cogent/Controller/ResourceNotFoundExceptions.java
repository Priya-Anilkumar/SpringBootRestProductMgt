package com.cogent.Controller;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;


@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundExceptions extends Exception {
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundExceptions(String message){
		System.out.println("Message is "+message);    }
}
