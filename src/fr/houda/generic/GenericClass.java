package fr.houda.generic;

//******** exemple class generic **********//
public class GenericClass<T1, T2>{


	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Integer [] interArry = {1,5,8,989,5};
		Double [] doubleArry = {2.5, 58.3, 2.01};
		String [] stringArry = {"houda" ,"selsabil", "sajed"};
		
		new GenericClass().Display(interArry, null);
		
		new GenericClass().Display(doubleArry,"\ntoto");
		new GenericClass().Display(stringArry, "\nhello");
		
	}
	
	//******** exemple 2 méthode generic **********//
	public void Display (T1[] arry,T2 var ) {
		System.out.println(var);
		for (T1 t1 : arry) {
			System.out.printf("%s  ",t1);
		}
	}
	
}
