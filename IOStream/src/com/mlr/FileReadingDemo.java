package com.mlr;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadingDemo {

	public static void main(String[] args) {

		try {
			//FileReader reader = new FileReader("inputfile.txt");

			
	FileInputStream reader = new FileInputStream("inputfile.txt");

	FileWriter   writer = new FileWriter("outputfile.txt");	
			
			int n = 0;

			while ((n = reader.read()) != -1) {
 
					writer.write(n);
				
					writer.flush();
					
				System.out.print((char) n);

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
