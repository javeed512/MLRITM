package set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Set<Employee> set = new TreeSet<Employee>(new MyComparator());

		set.add(new Employee(101, "king", 50000));
		set.add(new Employee(102, "scott",30000));
		set.add(new Employee(103, "ford", 20000));
		set.add(new Employee(104, "adam", 60000));
		
		System.out.println(set);
		
		
		
		

	}

}
