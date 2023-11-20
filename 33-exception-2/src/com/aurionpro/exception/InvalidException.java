package com.aurionpro.exception;

import java.util.Arrays;

public class InvalidException extends RuntimeException {
     String message;

	public InvalidException(String message) {
		super(message);
		this.message=message;
	}

	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return this.getClass().getName()+":"+message;
		}

	@Override
	public String toString() {
		return "InvalidException [message=" + message + "]";
	}

	

}
