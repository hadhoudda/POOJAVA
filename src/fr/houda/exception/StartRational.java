package fr.houda.exception;

public class StartRational {
	
	public static void main(String[] args) {
		try {
			Rational r1 = new Rational(12,57);
			Rational r2 = new Rational(5,0);
			System.out.println(r1);
			System.out.println(r2);
		} catch (RationalException e) {
			System.out.println("problem");
		}
		
		
	}
}
