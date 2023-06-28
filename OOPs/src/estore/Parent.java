package estore;

public class Parent extends  Object{
	
	int pid = 100;
	
	public Parent() {
		
			super();
		System.out.println("Parent class object created..");
		
	}
	
	
	public String toString() {
		
		return "I am parent";
	}
	
	
	public void m1() {
		
		System.out.println("m1() from Parent");
		
	}

}
