package fr.houda.poojava;

public class Start {

	public static void main(String[] args) {
		Rational r = new Rational();
		r.setNumerator(3);
		r.setDenominator(8);
		Rational r1 = new Rational(2,7);
		//Rational r2 = new Rational(5,0);
		Rational r3 = new Rational();
		//System.out.printf("%d/%d\n", r.getNumerator(), r.getDenominator());
		//System.out.printf("%d/%d\n", r1.getNumerator(), r1.getDenominator());
		//System.out.printf("%d/%d\n", r2.getNumerator(), r2.getDenominator());
		//System.out.printf("%d/%d\n", r3.getNumerator(), r3.getDenominator());
		System.out.println(r.toString());
		System.out.println(r1.toString());
		//System.out.println(r2.toString());
		System.out.println(r3.toString());
		
		//----------- appel de méthode -----------//
		System.out.println("---------------------------------------");
		Rational r4 = new Rational(3, 6);
		System.out.println(r4.toString());
		Rational result = r4.add(r1);
		System.out.println(r4 + "+" + r1 + "=" + result);
		//System.out.println(r4.add(r1).toString());
		
		boolean res = r4.maxi(r1);
		System.out.println(r4 + ">" + r1 + ":" + res);
		
		
		}
	

}
