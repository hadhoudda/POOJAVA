package fr.houda.scealles;

//  public final class Circle extends Shape{
//  on ajouter final pas de class fille
	public non-sealed  class Circle extends Shape{ 
//	on ajouter non-sealed pour accepter aussi tous les class fille
//	public sealed  class Circle extends Shape permits ColorCircle LargeCircle{
//	on ajouter sealed pour accepter les class fille précise
	
	
	private Point centre;
	private double radius ;
	
	
	
	public Circle(Point centre, double radius) {
		super();
		this.centre = centre;
		this.radius = radius;
	}
	public Point getCentre() {
		return centre;
	}
	public void setCentre(Point centre) {
		this.centre = centre;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
}
