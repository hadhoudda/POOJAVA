package fr.houda.abstracts;

import java.awt.Point;

public class Shapes {
	private Point centre ;

	public Point getCentre() {
		return centre;
	}

	public void setCentre(Point centre) {
		if(centre == null)
			throw new RuntimeException("centre cannot be null");
		this.centre = centre;
	}
	
}
