package fr.houda.scealles;

public final class Square extends Shape { //on ajouter final 
	
	private Point centre;
	private double cote ;
		
	
	public Square(Point centre, double cote) {
		super();
		this.centre = centre;
		this.cote = cote;
	}
	public Point getCentre() {
		return centre;
	}
	public void setCentre(Point centre) {
		this.centre = centre;
	}
	public double getCote() {
		return cote;
	}
	public void setCote(double cote) {
		this.cote = cote;
	}
	
	
}
