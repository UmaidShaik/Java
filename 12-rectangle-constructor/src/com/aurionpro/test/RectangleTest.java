package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Rectangle;
import com.aurionpro.model.color;

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle[] rectangles = new Rectangle[10];
		for (int i=0;i<rectangles.length;i++) {
		rectangles[i] = new Rectangle();
		setRectangleValue(rectangles[i]);
		getrectangledetail(rectangles[i]);
		}
		 Scanner sc=new Scanner(System.in);
		 
		 Rectangle rect1 = new Rectangle();
		 setRectangleValue(rect1);
		 getrectangledetail(rect1);
		 
		 System.out.println("***********");
		 
		 Rectangle rect2 = new Rectangle();
		 setRectangleValue(rect2);
		 getrectangledetail(rect2);
		 
		 Rectangle rect = new Rectangle(10,20);
		 setRectangleValue(rectangles[0]);
		 
//		 System.out.println("Enter the height");
//		 double height= sc.next();
//		 
//		 System.out.println("Enter the width");
//		  double width = sc.hasNext();
//		  
//		  System.out.println("Enter the color");
//		 color color = color.valueof(sc.next().toUpperCase(locale));
//		 
//		Rectangle rectangle = new Rectangle();
//	
//		System.out.println("Enter the Height");
//	    rectangle.setHeight(sc.nextDouble());
//	    System.out.println("Enter the Width");
//	    rectangle.setWidth(sc.nextDouble());
//	    System.out.println("Enter the color");
//	    try {
//		rectangle.setColor(color.valueOf(sc.next().toUpperCase()));
//	    }
//	    catch(Exception e)
//	    {
//	    	rectangle.setColor(color.RED);
//	    }
//		rectangle.CalculateArea();
//        private static void getrectangledetail(Rectangle rectangle) {
//		System.out.println("the height is" + rectangle.getHeight() + "The width is " + rectangle.getWidth()
//				+ "Area is  " + rectangle.calculateArea() + " the color is " + rectangle.getColor());
//		 }
//
//		Rectangle rectangle2 = new Rectangle();
//		System.out.println("Enter the Height");
//	    rectangle2.setHeight(sc.nextDouble());
//	    System.out.println("Enter the Width");
//	    rectangle2.setWidth(sc.nextDouble());
//	    System.out.println("Enter the color");
//	    try {
//		rectangle2.setColor(color.valueOf(sc.next().toUpperCase()));
//	    }
//	    catch(Exception e)
//	    {
//	    	rectangle2.setColor(color.RED);
//	    }
////		rectangle.CalculateArea();
//
//		System.out.println("the height is" + rectangle2.getHeight() + "The width is " + rectangle2.getWidth()
//				+ "Area is  " + rectangle2.calculateArea() + " the color is " + rectangle2.getColor());
		 
//	}
	}
	
	private static void setRectangleValue(Rectangle rectangle) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Height");
	    rectangle.setHeight(sc.nextDouble());
	    System.out.println("Enter the Width");
	    rectangle.setWidth(sc.nextDouble());
	    System.out.println("Enter the color");
	    try {
		rectangle.setColor(color.valueOf(sc.next().toUpperCase()));
	    }
	    catch(Exception e)
	    {
	    	rectangle.setColor(color.RED);
	    }
	}
	private static void getrectangledetail(Rectangle rectangle) {
		System.out.println("the height is" + rectangle.getHeight() + "The width is " + rectangle.getWidth()
				+ "Area is  " + rectangle.calculateArea() + " the color is " + rectangle.getColor());
		 }

}
