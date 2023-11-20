package com.aurionpro.test;

import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(-67);
		rectangle.setWidth(1000);
		rectangle.setColor("blue");
//		rectangle.CalculateArea();

		System.out.println("the height is" + rectangle.getHeight() + "The width is " + rectangle.getWidth()
				+ "Area is  " + rectangle.calculateArea() + " the color is " + rectangle.getColor());

		// Rectangle rectangle2 =new Rectangle();
		// rectangle2.height=30;
		// rectangle2.Width=50;

		// System.out.println(rectangle2.calculateArea());

	}

}
