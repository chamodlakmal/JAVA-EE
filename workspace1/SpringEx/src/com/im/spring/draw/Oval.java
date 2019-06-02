package com.im.spring.draw;

public class Oval implements Shape {
	
	private double r;
	private Point point;
	
	public Point getPoint() {
		return point;
	}
	public void setPoint(Point point) {
		this.point = point;
	}
	@Override
	public double getArea() {
		
		return Math.PI*r*r;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	
	

}
