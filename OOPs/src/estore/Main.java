package estore;

public class Main {

	public static void main(String[] args) {

			Employee e1 = new Employee(111,"Raj",5000);
			
			
			System.out.println(e1);
			
			Employee e2 = new Employee(222,"Tom",30000);
		
			System.out.println(e2);
			
			
	Employee e3 = new Employee();
			e3.setEname("Satish");
			
			System.out.println(e3);
			
			Employee e4 = new Employee();
			
			e4.setEid(501);
			
			System.out.println(e4);
			
			System.out.println(e1.getEname());
			
			System.out.println(e2.getSalary());
		
			
			Customer c1 = new Customer();
			c1.setCid(201);
			c1.setCname("Adam");
			
			
			System.out.println(c1);
			System.out.println(c1.getCname());
			
			
			
			
			
			
			
			
		
	}

}
