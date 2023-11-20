package com.aurionpro.model;

public class InsufficientBalanceException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;

	public InsufficientBalanceException(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		return this.getClass().getName()+":"+message;
		
		
	}

	@Override
	public String toString() {
		return "InsufficientBalanceException [" + this.getClass().getName() + "]";
	}
	
	

}
