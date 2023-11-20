package com.aurionpro.model;

public class Rectangle {
	
	private double height;
	private double Width;
	
	public void setHeight(double Height){
		this.height= correctvalue(Height);
//		if(height<1) {
//			this.height= 1;
//		}
//			else if(height>100) {
//				this.height= 100;
//			}
//		

	}
	
	public void setWidth(double Width){
		this.Width= correctvalue(Width);
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWidth() {
		return Width;
	}
	
	
	
	public double calculateArea() {
		
		double area= height*Width;
		
		return area;
		
	}
	public double correctvalue(double value) {
		if(value<1) {
			value= 1;
		}
			else if(value>100) {
			 value= 100;
			}
			else {
				return value;
			}
		return value;
	}

}
