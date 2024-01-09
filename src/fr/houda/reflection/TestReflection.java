package fr.houda.reflection;

import java.util.Date;

public class TestReflection {
	
	private int aNumericValue;
    protected String aString;
    double aPrice;      // Visibilité "package" par défaut
    public Date aDate;
	
	public static void main( String[] args ) throws Exception {
	
		// 1er méthode Récupération des méta-données à partir de la classe.
	    Class<TestReflection> metadata = TestReflection.class;
	    
	    // 2eme méthode Récupération des méta-données à partir d'une instance.
	    TestReflection object = new TestReflection();
	    Class<? extends TestReflection> metadata2 = object.getClass();
	    /*
	     * ? extends TestReflection == signifie que envoye quelque chose qu'herite de TestReflection 
	     */
	    // Dans les deux cas, nous avons les mêmes informations
	    System.out.println( metadata == metadata2 );
	    System.out.println(metadata);
	    System.out.println(metadata2);
	    
	}
}