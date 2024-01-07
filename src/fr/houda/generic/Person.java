package fr.houda.generic;


public class Person {
	private String firstName;
	private String lastName;
	private String email;
	
	public Person() {
		this("houda", "ben", "tot@gmail.com");
	}
	
	
	public Person(String firstName, String lastName, String email) {
		super();
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setEmail(email);
	}


	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		if(firstName == null || firstName.trim().equals("")) {
			throw new RuntimeException("firstName cannot be null");
		}
		
		this.firstName = firstName.trim().toLowerCase();
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		if(lastName == null || lastName.trim().equals("")) {
			throw new RuntimeException("lastName cannot be null");
		}
		this.lastName = lastName.trim().toLowerCase();
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email==null || !isValidMailSecond(email)) {
			throw new RuntimeException("email cannot be accept");
		}
		this.email = email;
	}
	
	//--------- méthodes --------------//
	private static boolean isValidMailSecond(String email) {
		return email.matches("^[\\w.-]+@[\\w]+\\.[a-z]{2,}$");
	}
	
	@Override
	public String toString() {
		return "Prenom : " + this.firstName + "\n" +  "Nom : " +this.lastName + "\n" + "Mail : " +this.email;
	}
	
		
}
