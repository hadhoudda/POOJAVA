package fr.houda.agenda;

public class Client extends Person {
	private int iden ;

	
	
	public Client() {
		super();
		this.iden = 1;
	}
	

	public Client(String firstName, String lastName, String email , int iden) {
		super(firstName, lastName, email);
		this.setIden(iden);
	}


	public int getIden() {
		return iden;
	}

	public void setIden(int iden) {
		if(iden <= 0) {
			throw new RuntimeException("identifer cannot be accept");
		}
		this.iden = iden;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" +"identifiant client :" + this.iden;
	}
	
}
