package com.cg.onlineshopping_application.exception;

public class ValidateCartException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public ValidateCartException() {
		super();
	}

	public ValidateCartException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ValidateCartException(String message, Throwable cause) {
		super(message, cause);
	}

	public ValidateCartException(String message) {
		super(message);
	}

	public ValidateCartException(Throwable cause) {
		super(cause);
	}
	

}
