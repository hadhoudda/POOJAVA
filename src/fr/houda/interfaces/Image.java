package fr.houda.interfaces;

import java.security.MessageDigest;

public interface Image {
	/*public static */ String PNG_extension = ".png";
	/*
	 * on peut enlever public static car c'est un interface 
	 * et tous les variable sont statique mais c'est mieux que on le mets
	 */
	public static  String JPEG_extension = ".jpeg";
	public static  String GIF_extension = ".gif";
	
	public abstract void load();
	/*public abstract*/ void save();
	/*
	 * on peut enleve public abstract car c'est interface
	 */
	
	//===== type des méthode qu'on peut ajouter à un interface ======//
	public static Image createImage() {
		return null;
	}
	public default void test() {
		System.out.println("test");
	}
	private void Message(String message) {
		System.out.println(message);
	}
	
	
}
