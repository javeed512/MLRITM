package estore;

public class Employee {
	
	private int eid =100;
	private String ename = "javeed";
	private double salary = 9000;
	
	public Employee() {
		
		
	}
	
	public Employee(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	
	
	public String toString() {
		
		
		
		return this.eid+" "+this.ename+" "+this.salary;
	}
	
	
	public void  setEname(String ename) {
		
		this.ename = ename;
		
	}
	
	
	public String   getEname() {
		
		return this.ename;
	}
	
	
	public double getSalary() {
		
		return this.salary;
		
	}
	
	
	
	
	public void  setEid(int eid) {
		
		this.eid = eid;
		
	}
	
	

}
