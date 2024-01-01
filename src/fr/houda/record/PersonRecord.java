package fr.houda.record;

public record PersonRecord(String FirstName , String LastName) {
    
	@Override
	public String toString() {
		return "votre nom :" + FirstName +"\n" + "Votre prenom :" + LastName ;
	}
	

}
