package com.aurionpro.model;

import java.util.Scanner;

public class Circletest {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

	Circle circle = new Circle();
	
	circle.setColor(color.WHITE);
	System.out.println("Enter the Radius");
	circle.setRadius(sc.nextDouble());
	circle.setBorder(border.DOTTED);

    circle.calculatePerimeter();
    System.out.println("the perimeter of circle is"+Circle.getRadius()+"  the Border is "+Circle.getborder()+"  the color is  "+Circle.getColor());
	
}
}
