package fr.houda.agenda;

public class Employe extends Person {
	private static final int SMIC = 1500;
	private double salary;

	
	public Employe() {
		super(); // appel de elements de constructer parent (ctrl + super() ==emplacement de super
		//this.salary = salary;
		this.setSalary(SMIC);//refoctor apres extract constant
	}
	public Employe(String firstName, String lastName, String email,double salary) {
		super(firstName, lastName, email);
		this.setSalary(salary);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if(salary < 0) {
			throw new RuntimeException("salary cannot be accept");
		}
		this.salary = salary;
	}
	
	//-----------methodes ------------------//
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() +"\n" + this.salary;
	}
	
}
