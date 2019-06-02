package com.im.spring.draw;

public class Triangle implements Shape {
	public Triangle(double length,double height)
	{
		this.length=length;
		this.height=height;
		System.out.println("Constructor called");
	}

	private double length,height;
	@Override
	public double getArea() {
		
		return 1.0/2*length*height;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		System.out.println("Calling triangle setter ="+length);
		this.length = length;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		System.out.println("Calling triangle setter ="+height);
		this.height = height;
	}
	

}
