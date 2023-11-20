package com.aurionpro.model;

public class Circle {

	private static color color;
	private static double radius;
	private static border border;

	public void setColor(color color) {
		this.color = color;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void setBorder(border border) {
		this.border = border;
	}

	public static color getColor() {
		return color;
	}

	public static border getborder() {
		return border;
	}

	public static double getRadius() {
		return radius;
	}

	public double calculatePerimeter() {

		radius = 2 * Math.PI * radius;
		return radius;

	}

}
