package com.aurionpro.model;

public class Rectangle<T> {
	
	private T width;
	private T height;
	public Rectangle(T width, T height) {
		super();
		this.width = width;
		this.height = height;
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	

}
