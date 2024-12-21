package com.CRUD.CRUD.exception;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	 @ExceptionHandler(ResourceNotFoundException.class)
	    public ResponseEntity<?> handleResourceNotFound(ResourceNotFoundException ex) {
	        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
	    }
	 
	    @ExceptionHandler(DataIntegrityViolationException.class)
	    public ResponseEntity<?> handleDataIntegrityViolationException(DataIntegrityViolationException ex) {
	        return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
	    }

	    @ExceptionHandler(Exception.class)
	    public ResponseEntity<?> handleGlobalException(Exception ex) {
	        return new ResponseEntity<>("An error occurred: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	    }

}
