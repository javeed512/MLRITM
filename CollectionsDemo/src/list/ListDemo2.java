package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>(5);

		list.add(105);
		list.add(103);
		list.add(104);
		list.add(101);

		list.add(1, 102);
		list.remove(0);

		System.out.println(list);

		System.out.println(list.get(2));

		System.out.println("Display elements using For Each");

		for (Integer i : list) {

			System.out.println(i);
		}

		System.out.println("Display elements using Iterator ");

		Iterator it = list.iterator();

		while (it.hasNext()) {

			Object obj = it.next();

			Integer x = (Integer) obj;

			System.out.println(x);

		}

		
		System.out.println("Iterator with generic type");
		
		
		Iterator<Integer> it1 = list.iterator();

			while (it1.hasNext()) {
				Integer element =  it1.next();
				
				System.out.println(element);
			}
		
		
		
		
		
		
	}

}
