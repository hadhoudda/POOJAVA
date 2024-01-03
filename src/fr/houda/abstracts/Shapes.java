package fr.houda.abstracts;

import java.awt.Point;

public abstract class Shapes {
	private Point centre ;
	
	public Shapes() {
		this(new Point(0, 0));
	}
	
	public Shapes(Point centre) {
		super();
		this.setCentre(centre);
	}

	public Point getCentre() {
		return centre;
	}

	public void setCentre(Point centre) {
		if(centre == null)
			throw new RuntimeException("centre cannot be null");
		this.centre = centre;
	}
	
	public abstract double perimeter();
	
	public abstract double aire();

}
