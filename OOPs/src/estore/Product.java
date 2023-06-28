package estore;

public class Product  extends Object{
	
	private int productId;
	private String productName;
	private double price;

	public Product() {
			super(); // Object();
		
		System.out.println("Product object created..");
		
	}
	
	
	public Product(int productId, String productName, double price) {
		
			this.productId = productId;
			this.productName = productName;
			this.price = price;
		
	}
	
	
	
	public static void main(String[] args) {
		
		
	Product	product1 = new Product();
	
		System.out.println(product1);
		
	Product p1 = 	new Product(101	, "Laptop", 80000);
	
	Product p2 = 	new Product(102	, "Mobile", 12000);
	
	
	System.out.println(p1.productId +" "+p1.productName+" "+p1.price);
	
	System.out.println(p2.productId +" "+p2.productName+" "+p2.price);
	
	
	
	
	
		
	}
	

}
