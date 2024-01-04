package fr.houda.lambda;

import java.util.ArrayList;
import java.util.List;

public class start {

	public static void main(String[] args)throws Exception {
		List<String> myList = new ArrayList<>();
		myList.add("Html5");
		myList.add("css3");
		myList.add("Javascript");
		myList.add("react.js");
		//********* trie la collection *****//
		System.out.println("******** triage de ma collection :");
		myList.sort((l1,l2)-> l1.compareTo(l2)); //trie alphabetique 
		for (String string : myList) {
			System.out.println(string);
		}
		//myList.sort((l1,l2)->{return l1.compareTo(l2);}); //donne meme resultat
		
		//********* filtre la collection *****//
		System.out.println("******** filtrage de ma collection :");
		myList.stream().filter((s)->s.length()>5).forEach(System.out::println);
		
		System.out.println("*************");
		
		//*** ecriture simplifie de boucle for ***** //
		
		myList.forEach(System.out::println);
		myList.sort((l1,l2)->l1.compareToIgnoreCase(l2));
		
		
	}

}
