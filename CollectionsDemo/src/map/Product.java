package map;

public class Product {

	private int pid;
	private String pname;
	private double price;

	public Product() {

	}

	public Product(int pid, String pname, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}

	@Override
	public String toString() {
		return this.pid+"";
	}

	
		
	
}
