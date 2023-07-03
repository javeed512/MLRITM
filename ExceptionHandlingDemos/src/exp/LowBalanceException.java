package exp;

public class LowBalanceException extends Exception {

		@Override
		public void printStackTrace() {
			
			System.out.println(this);
		}
		
		@Override
		public String getMessage() {
		
		return "Balance is Low";
		}
	
}
