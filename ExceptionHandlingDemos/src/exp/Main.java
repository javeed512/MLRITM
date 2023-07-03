package exp;

public class Main {

	public static void main(String[] args) {


		int accounts[] = {501,502,503,504,505};		
		String names[] = {"Adam","Smith","Ford","Tom","Scott"};
		double  balance[] = {3000,50,7000,4000,9000};
		
		for(int i=0;i<accounts.length;i++) {
			
		System.out.println(accounts[i]+ "  "+names[i]+" "+balance[i]);
		
		if(balance[i] < 1000) {
			try {
			throw  new LowBalanceException();
			}catch (LowBalanceException e) {
				
				//System.er nr.println(names[i]+ " your balance is low , please keep min balance in account");
			
				//e.printStackTrace();
				System.err.println(e.getMessage());
			}
		}
		
			
		}
		
		
	}

}
