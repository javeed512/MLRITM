package list;

import java.util.Enumeration;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		
			stack.push(101);
			stack.push(102);
			stack.push(103);
			stack.push(104);
			
			System.out.println(stack);
			
			System.out.println(stack.peek());
			
		Enumeration<Integer> en =		stack.elements();
			
				while (en.hasMoreElements()) {
		Integer n = en.nextElement();
		
			System.out.println(n);
					
				}
			
				
		
		
				
	}

}



