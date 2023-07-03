package exp;

public class ArrayDemo {

	public static void main(String[] args) {

		int ar[] = { 101, 102, 103, 104, 105 };

		System.out.println(ar);
		System.out.println(ar[0]);

		for (int i = 0; i < ar.length; i++) {

			System.out.println(ar[i]);

		}
		
		System.out.println("For Each Loop");
		
		for (int x : ar) {
			System.out.println(x);
		}
		
		

	}

}
