package com.str;

public class Demo {

	public static void main(String[] args) {

			Demo d1 = new Demo();
			
			Demo d2 = new Demo();
			
			System.out.println(d1.equals(d2));
			System.out.println(d1 == d2);
			
			String s1 = "java";
			String s2 = "java";
			
			String s3 = new String("java");
			String s4 = new String("java");
			System.out.println(s1 == s2 );
			System.out.println(s1.equals(s2));
			
			System.out.println(s3 == s4);
			
			
			
			
			
			
			
			
			
			
		

	}

}
