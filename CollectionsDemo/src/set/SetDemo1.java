package set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {

	public static void main(String[] args) {
		
	Set<Integer> set =	new HashSet<Integer>();
		
		set.add(103);
		set.add(102);
		System.out.println(set.add(101));
		set.add(104);
		System.out.println(set.add(101));
		
		System.out.println(set);
		
	
	
	}

}
