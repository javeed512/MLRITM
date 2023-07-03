package exp;

public class ExpDemo {

	public static void main(String[] args) {

		System.out.println("Open File");
		System.out.println("Read Data");

		int x = 0;
		try {
			x = div(9, 9);

			System.out.println("Write Data " + x);
		} catch (ArithmeticException ae) {

			// ae.printStackTrace();

			System.err.println("Sorry! You can't div num by zero");
		} finally {

			System.out.println("Close File");

		}

	}

	public static int div(int a, int b) throws ArithmeticException {

		return a / b;

	}

}
