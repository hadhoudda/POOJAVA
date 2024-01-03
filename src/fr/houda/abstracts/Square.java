package fr.houda.abstracts;

import java.awt.Point;

public class Square extends Shapes {
	private double side;
	
	public Square() {
		super();
		this.side=0;
	}
	
	public Square(Point centre, double side) {
		super(centre);
		this.setSide(side);
	}
	
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		if(side ==0 ) {
			throw new RuntimeException("side cannot be 0");
		}
		this.side = side ;
	}
	
	@Override
	public double perimeter() {
		return this.side*4;
	}
	
	@Override
	public double aire() {
		return this.side*this.side;
	}
}
