package com.str;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpressionDemo {

	public static void main(String[] args) {
		
Pattern p=Pattern.compile("[7-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]");
		 //Pattern p=Pattern.compile("[7-9][0-9]{9}");
		
	Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Mobile Number for validation");
	
		String mobileNo = 	scanner.next(); 
			
			

	Matcher m=p.matcher(mobileNo);
		 if(m.find()&&m.group().equals(mobileNo))
		 {
		 System.out.println("valid number");
		 }
		 else
		 {
		 System.out.println("invalid number");
		 } 
		
		
	}
	
	
}
