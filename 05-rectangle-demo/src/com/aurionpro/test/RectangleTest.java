package com.aurionpro.test;

import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
       
		Rectangle rectangle =new Rectangle();
		rectangle.height=10;
		rectangle.Width=20;
//		rectangle.CalculateArea();
		
		System.out.println(rectangle.calculateArea());
		
//		Rectangle rectangle2 =new Rectangle();
//		rectangle2.height=30;
//		rectangle2.Width=50;
//		 
//		System.out.println(rectangle2.calculateArea());
//		
	}

}
