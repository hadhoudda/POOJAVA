package fr.houda.exception;

public class Rational {
	private int numerator ;
	private int denominator;
	
	public Rational() {
		this(0,1);
	}
	
	
	public Rational(int numerator, int denominator) {
		super();
		this.setNumerator(numerator) ;
		this.setDenominator(denominator);
	}


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
		if(denominator == 0)
			//throw new RuntimeException("denominator cannot be null");//exception fourni par java
			throw new RationalException("denominateur ne peut pas 0 !!!");
		this.denominator = denominator;
	}
	
	public Rational add(Rational r) {
		return new Rational(this.numerator*r.denominator + r.numerator*this.denominator,
							this.denominator*r.denominator);
	}
	
}
