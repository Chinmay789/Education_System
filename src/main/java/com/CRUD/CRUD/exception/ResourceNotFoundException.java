package com.CRUD.CRUD.exception;

public class ResourceNotFoundException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 4599379025489590117L;

	public ResourceNotFoundException(String message) {
        super(message);
    }
}
