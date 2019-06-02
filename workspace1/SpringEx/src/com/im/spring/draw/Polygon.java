package com.im.spring.draw;

import java.util.List;

public class Polygon implements Shape{
	
	private List<Point> points;
	
	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	@Override
	public double getArea() {
			
		return 0;
	}

}
