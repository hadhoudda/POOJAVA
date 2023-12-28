package fr.houda.poojava;


public class Rational {
		// les attribus de class Rational
	private int numerator;
	private int denominator;
	
	public int getNumerator() {
		return numerator;
	}
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	public void setDenominator(int denominator) {
		if(denominator == 0) {
			throw new RuntimeException("denominator cannot be null");
		}
		this.denominator = denominator;
	}
	
	
	
//	// 
// pour créér class
//	public Rational() {
//		this(0, 1);
////		this.setNumerator(0);
////		this.setDenominator(1);
//	}
//	public Rational(int numerator, int denominator) {
//		//super();
//		this.setNumerator(numerator);
//		this.setDenominator(denominator);
//	}

//	public int getDenominator() {
//		return denominator;
//	}

//	@Override
//	public String toString() {
//		return String.format("%d/%d", this.numerator, this.denominator);
//	}
//	
//	


}
