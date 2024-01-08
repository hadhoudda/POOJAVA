package fr.houda.generic;

public class GenericBox <ELEMENT>{
	private ELEMENT element ;
	
	public GenericBox(ELEMENT element) {
		this.setElement(element);
	}
	public ELEMENT getElement() {
		return element;
	}

	public void setElement(ELEMENT element) {
		if(element == null)
			throw new NullPointerException("element ne peut pas zero");
		this.element = element;
	}
	
	
}
