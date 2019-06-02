package com.im.spring.draw;

public class Rectangle implements Shape {
	
	private double width,height;
	@Override
	public double getArea() {
		
		return width*height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	

}
