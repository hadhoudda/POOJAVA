package fr.houda.exception;

public class RationalException extends IllegalArgumentException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6376348457574965389L;

	public RationalException() {
		super("denominator cannot be null");
		
	}

	public RationalException(String message) {
		super(message);
		
	}
	//on choisi un constructor from superclass
}
