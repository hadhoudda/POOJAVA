package fr.houda.abstracts;

import java.awt.Point;

public class Cercle extends Shapes {
	private double radius;
	
	public Cercle() {
		super();
		this.radius=0;
	}
	
	public Cercle(Point centre, double radius) {
		super(centre);
		this.setRadius(radius);
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if(radius ==0 ) {
			throw new RuntimeException("raduis cannot be 0");
		}
			
		this.radius = radius;
	}
	
	@Override
	public double perimeter() {
		return 2*Math.PI*radius;
	}
	
	@Override
	public double aire() {
		return Math.PI*radius*radius;
	}
	
	
}
