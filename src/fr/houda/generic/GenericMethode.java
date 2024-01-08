package fr.houda.generic;

public class GenericMethode {
	public static void main(String[] args) {
		Integer [] interArry = {1,5,8,989,5};
		Double [] doubleArry = {2.5, 58.3, 2.01};
		String [] stringArry = {"houda" ,"selsabil", "sajed"};
		Display(interArry);
		System.out.println("\n");
		Display(doubleArry);
		System.out.println("\n");
		Display(stringArry);
		System.out.println("\n*************************");
		find(interArry, 4);
		find(doubleArry,"\ntoto");
		find(stringArry, "\nhello");
		
	}
	//******** exemple 1 méthode generic **********//
	public static <TYPE> void Display (TYPE [] T) {
		for (TYPE type : T) {
			System.out.printf("%s  ",type);
		}
	} 
	//******** exemple 2 méthode generic **********//
	public static <TYPE, TYPE2> void find (TYPE [] T,TYPE2 T2 ) {
		System.out.println(T2);
		for (TYPE type : T) {
			System.out.printf("%s  ",type);
		}
	}
	
}
