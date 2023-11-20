package com.aurionpro.model;


public class PrintValue<T extends Shape> {
	
	private T value;

	public PrintValue(T value) {
		super();
		this.value = value;
	}

	@Override
	public String toString() {
		return "PrintValue [value=" + value + "]";
	}

	
}
