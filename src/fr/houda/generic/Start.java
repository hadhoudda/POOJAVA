package fr.houda.generic;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Start {

	public static void main(String[] args) {
		ArrayList<String> myListe = new ArrayList<String>();
		myListe.add("   selsabil");
		myListe.add("sajed");
		myListe.add("yassin");
		myListe.add("  assil");
		myListe.add("aymen");
				for (String string : myListe) {
			System.out.println(string.toUpperCase().trim());
		}
				
		ArrayList<Date> myDate = new ArrayList<>();
		myDate.add(new Date());
		for (Date date : myDate) {
			System.out.println(date);
		}
		
		HashMap<Integer, Person> client = new HashMap<>();
		//HashMap table a deux valeurs cle et valeur
		client.put(012, new Person("assil", "ben", "assil@gmail.fr"));
		client.put(057, new Person("aymen", "ben", "aymen@gmail.fr"));
		Person p = client.get(012);
		System.out.println(p);
	}

}
