package fr.houda.record;

import java.util.Objects;

public class Point {

	private final double x;
	private final double y;

	public Point() {
		this(0, 0);
	}

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	/*
	 * Cette méthode est utile si vous souhaitez utiliser des instances de points
	 * dans une table associative (type Hashtable ou HashMap). Elle permettra de
	 * calculer le "hashcode" (en gros, la position dans la collection) d'un point
	 * donné.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	/*
	 * Cette méthode permettra de comparer deux instances Java et d'indiquer si
	 * elles sont identiques ou non.
	 */
	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		} else if (object instanceof Point) {
			Point other = (Point) object;
			return x == other.x && y == other.y;
		} else {
			return false;
		}
	}

	/*
	 * Pour calculer la chaîne de caractères de représentative d'un point.
	 */
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	// TODO: imaginez d'autres méthodes relatives à la gestion de vos points.

}