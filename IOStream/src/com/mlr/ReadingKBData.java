package com.mlr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingKBData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			System.out.println("Enter your namne");
			String name = br.readLine();
			
			System.out.println("Enter your city  name");
			String city = br.readLine();
			
			
			System.out.println(name);
			System.out.println(city);
			
			
			System.out.println("Enter salary");
			
			
			String str =	br.readLine();
			
			
			int sal =Integer.parseInt(str);
			
			System.out.println(sal+100);
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
