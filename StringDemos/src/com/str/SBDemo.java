package com.str;

public class SBDemo {

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("hello");
		
		System.out.println(sb1);
		
		 sb1.append(" world");
		
		System.out.println(sb1);
		
		sb1.reverse();

		System.out.println(sb1);
		System.out.println(sb1.capacity());
		
		
		
		StringBuffer sb2 = new StringBuffer("JAVA");
		
			sb2.replace(0, 2, "KK");
		
			sb2.deleteCharAt(3);
			
			System.out.println(sb2);
		System.out.println(sb2);
		
		
		
		
		
		
	}

}
