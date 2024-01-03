package fr.houda.abstracts;

import java.awt.Point;

public class Triangle extends Shapes {
	private double a;
	private double b;
	private double c;
	
	public Triangle() {
		super();
		this.a = 0;
		this.b = 0;
		this.c = 0;
	}
	

	public Triangle(Point centre, double a, double b, double c) {
		super(centre);
		this.a = a;
		this.b = b;
		this.c = c;
	}

		public double getA() {
		return a;
	}

	public void setA(double a) {
		if(a ==0 ) {
			throw new RuntimeException("a cannot be 0");
		}
		this.setA(a);
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		if(b ==0 ) {
			throw new RuntimeException("b cannot be 0");
		}
		this.setB(b);
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		if(c ==0 ) {
			throw new RuntimeException("c cannot be 0");
		}
		this.setC(c);
	}

	@Override
	public double perimeter() {
		return this.a + this.b+ this.c;
	}
	
	@Override
	public double aire() {
		double p = perimeter()/2;
		return Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c)) ;
	}

}
