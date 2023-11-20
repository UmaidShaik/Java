package com.aurionpro.model;

public class Rectangle {

	private double height;
	private double Width;
	private String color;

	public void setHeight(double Height) {
		this.height = correctvalue(Height);

	}

	public void setWidth(double Width) {
		this.Width = correctvalue(Width);
	}

	public void setColor(String color) {
		if (color.equalsIgnoreCase("red") || color.equalsIgnoreCase("Blue") || color.equalsIgnoreCase("Green")) {
			this.color = color;
		} else {
			this.color = "red";
		}

	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return Width;
	}

	public String getColor() {
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
