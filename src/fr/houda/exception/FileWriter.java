package fr.houda.exception;


import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter {
	public static void Save(){
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("./file.data");
			fos.write("ok".getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("le bloc est fini");
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("écriture termine");
	}
	
	public static void main(String[] args) {
		Save();
	}

}
