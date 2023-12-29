package fr.houda.agenda;

public class StartPerson {

	public static void main(String[] args) {
		//------- class person ----------//
		Person p1 =  new Person("assil", "ben", "assil@gmail.fr");
		//System.out.println(p1.toString());
		System.out.println(p1);
				
		//------- class Employe ----------//
		
		System.out.println("-------- class Employe -------");
		Employe e1 = new  Employe();
		Employe e2= new  Employe("sajed", "ben", "sajed@gmail.fr", 800);
		Person e3 = new Employe("jawad", "ben", "jawad@gmail.fr", 2800);
		//System.out.println(e1.toString()); on peut on enleve toString()
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		//------- class client ----------//
		
		System.out.println("-------- class client -------");
		Client c1 = new Client();
		Client c2 = new Client("aymen", "aoun", "aymen@gmail.fr",2 );
		Person c3 = new Client("selsabil", "aoun", "Selsabil@gmail.fr",3 );
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		//************ tableau de person  ****************//
		System.out.println("************ tableau de person  ****************");
		Person [] persons = new Person[4];
		persons[0] = new Person();
		persons[1] = new Person("assil", "ben", "assil@gmail.fr");
		persons[2] = new Employe("sajed", "ben", "assil@gmail.fr", 1800);
		persons[3] = new Client("aymen", "aoun", "aymen@gmail.fr",2);
		// *********** affichage de tous les personnes ******//
		System.out.println("////////affichage de tous les personnes////////");
		for (Person person : persons) {
			System.out.println("Le person :");
			System.out.println(person);
		}
		
		// *********** affichage sauf les clients ******//
				System.out.println("////////affichage sauf les clients ////////");
				for (Person person : persons) {
					if(person instanceof Client) {
						System.out.println("Le client :");
						System.out.println(person);
					}
					
				}
		
		

	}

}
