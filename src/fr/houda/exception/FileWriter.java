package fr.houda.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileWriter {
	public static void Save(){
		try {
			FileInputStream fos = new FileInputStream("file.data");
			//fos.write("ok".getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) {
		Save();
	}

}
