package fr.houda.abstracts;

import java.awt.Point;

public class StartShapes {

	public static void main(String[] args) {
		//Shapes s1 = new Shapes();
		Cercle c1 = new Cercle();
		Cercle c2 = new Cercle(new Point(1,1),3);
		Shapes s2 = new Cercle();
		Square q1 = new Square();
		Square q2 = new Square(new Point(1,1),5);
		Triangle t1 = new Triangle(new Point(1,1),5,6,9);
		System.out.println("*******************");
		System.out.println(c1.aire());
		System.out.println(c1.perimeter());
		System.out.println(c2.aire());
		System.out.println(c2.perimeter());
		System.out.println("*******************");
		System.out.println(q1.aire());
		System.out.println(q1.perimeter());
		System.out.println(q2.aire());
		System.out.println(q2.perimeter());
		System.out.println("*******************");
		System.out.println(t1.aire());
		System.out.println(t1.perimeter());
		
	}

}
