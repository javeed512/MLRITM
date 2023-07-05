package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo2 {

	public static void main(String[] args) {

		Set<Integer> set = new LinkedHashSet<Integer>();

		set.add(103);
		set.add(104);
		set.add(101);
		set.add(102);
		set.add(null);
		set.add(101);

		System.out.println(set);
	}

}
