package fr.houda.exception;

import java.io.FileOutputStream;

public class TestException {

	public static void method3() {
        System.out.println( "BEGIN method3" );
        try {
			FileOutputStream fos = new FileOutputStream("./test.data");
			fos.write("ok\n".getBytes());
			fos.close();
			
		} catch (Exception e) {
			System.out.println("problem d'écriture");
		}
        
        try {
            int divisor = (int) (Math.random() * 3);
            int value = 1 / divisor;
            System.out.println( "Value == " + value );
		} catch (Exception e) {
			 e.printStackTrace();
		}
        System.out.println( "END method3" );
    }

    public static void method2() {
        System.out.println( "BEGIN method2" );
        method3();
        System.out.println( "END method2" );
    }
    
    public static void method1() {
        System.out.println( "BEGIN method1" );
        method2();
        System.out.println( "END method1" );
    }

    public static void main(String[] args) {
        System.out.println( "BEGIN main" );
        method1();
        System.out.println( "END main" );
    }
}
