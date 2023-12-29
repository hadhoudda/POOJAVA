package fr.houda.poojava;


public class Rational {
		// les attribus de class Rational
	private int numerator;
	private int denominator;
	
	//------------ Costructeur de classe -------------------//
	public Rational() {
		this(0, 1); //valeur de constructeur par défaut
		//this.setNumerator(0);
		//this.setDenominator(1);
	}
		
	public Rational(int numerator, int denominator) {
		super();
		this.setNumerator(numerator);
		this.setDenominator(denominator);
	}

	//------------ get et set des attributs du classe -------------------//
	
	public int getNumerator() {
		return this.numerator;
		//return numerator; normalement comme ça main on ajoute this c'est mieux
	}
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	
	public int getDenominator() {
		return this.denominator;
		//return denominator; normalement comme ça main on ajoute this c'est mieux
	}
	public void setDenominator(int denominator) {
		if(denominator == 0) {
			throw new RuntimeException("denominator cannot be null");
		}
		this.denominator = denominator;
	}
	
	//------------ Méthode de classe -------------------//

	@Override
	public String toString() {
	
		return String.format("[%d/%d]", this.numerator, this.denominator);
		// on ajoute this c'est mieux
	}
	
	public Rational add(Rational r2) {
		return new Rational(
				(this.numerator*r2.denominator+r2.numerator*this.denominator),
				(this.denominator*r2.denominator));	
	}
	
	public boolean maxi(Rational r2) {
		return(this.numerator*r2.denominator > r2.numerator*this.denominator);
	}
	
}
