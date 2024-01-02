package fr.houda.record;

public record PersonRecord(String FirstName , String LastName , int age ) {
    
	@Override
	public String toString() {
		return "votre nom :" + FirstName +"\n" + "Votre prenom :" + LastName+"\n" + "Votre age :" + age ;
	}
	// on peut ajoute d'autre méthode exemple :
	public void Age() {
		if (this.age < 18) {
			System.out.println("vous êtes mineur");
		}
		else System.out.println("vous êtes majeur");
	}

}
