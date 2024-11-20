package com.taraktech.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalEMployeeException {
	@ExceptionHandler(EmployeeNotExits.class)
	public ResponseEntity<?> handleEmployeeNotExitsException(EmployeeNotExits empNotExits) {
		String errorMessage = empNotExits.getMessage();
		return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
	}

	
	  @ExceptionHandler(EmployeeAlreadyExits.class) public ResponseEntity<String>
	  handleEmployeeAlreadyExitsException(EmployeeAlreadyExits exception) { String
	  errorMessage = exception.getMessage(); return new
	  ResponseEntity<>(errorMessage, HttpStatus.CONFLICT); }
	 
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handleGlobalException(Exception e){
		String message = e.getMessage();
		return new ResponseEntity<>(message,HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
