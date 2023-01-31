package com.example.demo_springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(value=AgeException.class)
	public ResponseEntity<String> AgeException(AgeException user1){
		return new ResponseEntity<String>("Age cannot be more than 60", HttpStatus.CONFLICT);
	}
	@ExceptionHandler(value = CustomerAlreadyExistsException.class)
	public ResponseEntity<String> customerAlreadyExistsException(CustomerAlreadyExistsException user){
		return new ResponseEntity<String>("customer already exists in db. Please- try again", HttpStatus.CONFLICT);
				
	}			

}
