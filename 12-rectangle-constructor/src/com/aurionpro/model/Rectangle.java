package com.aurionpro.model;

public class Rectangle {

	private double height;
	private double Width;
	private color color;
	
	public Rectangle(double height, double width) {
		this.height = height;
		this.Width = width;
	}

	public Rectangle() {
		this.height = 10;
		this.Width = 20;
	}
	public void setHeight(double Height) {
		this.height = correctvalue(Height);

	}

	public void setWidth(double Width) {
		this.Width = correctvalue(Width);
	}

	public void setColor(color color) {
		this.color = color;
//		if (color.equalsIgnoreCase("red") || color.equalsIgnoreCase("Blue") || color.equalsIgnoreCase("Green")) {
//			this.color = color;
//		} else {
//			this.color = "red";
//		}

	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return Width;
	}

	public color getColor() {
		return color;
	}

	public double calculateArea() {

		double area = height * Width;

		return area;

	}

	public double correctvalue(double value) {
		if (value < 1) {
			value = 1;
		} else if (value > 100) {
			value = 100;
		} else {
			return value;
		}
		return value;
	}

}
