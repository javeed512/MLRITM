package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		list.add(20);
		list.add(40);
		list.add(10);
		list.add(30);
		list.add(50);

		System.out.println(list);

		List<Integer> synList = Collections.synchronizedList(list);

		System.out.println(synList);

		Collections.sort(list);

		System.out.println(list);
		
	int index =	Collections.binarySearch(list,30);
		
		System.out.println(index);

		
		Object[] arr =	list.toArray();
		
		for (Object object : arr) {
			
			Integer i = (Integer) object;
			
			System.out.println(i);
		}
		
		
		
		
	}

}
