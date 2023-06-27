public class Employee{

	static int eid;
	static String ename;

	public static void main(String ar[]){

		Employee emp1 = new Employee();
		emp1.eid = 101;
		emp1.ename = "Raju";
		
		Employee emp2 = new Employee();

		emp2.eid = 102;
		emp2.ename = "Satish";
		System.out.println(emp2.eid);
		System.out.println(emp2.ename);

		System.out.println(Employee.eid);
		System.out.println(Employee.ename);











	}



}