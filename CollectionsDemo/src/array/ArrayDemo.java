package array;

import java.util.Arrays;
import java.util.List;

public class ArrayDemo {

	public static void main(String[] args) {

		int arr[] = { 23, 15, 10, 9, 45, 17, 5 };

		System.out.println("Before sorting ");

		for (int i : arr) {

			System.out.print(i + " ");
		}

		Arrays.sort(arr);

		System.out.println();
		System.out.println("After sorting ");

		for (int x : arr) {

			System.out.print(x + " ");
		}
		int n = Arrays.binarySearch(arr, 45);

			
		System.out.println("\n Element found at index "+n);

		
		String[] names = {"tom","smith","ford","adam"};
		
		List<String> list =	Arrays.asList(names);
	
			System.out.println(list);
	}

	
					
	
}
