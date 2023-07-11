package com.crud;

import java.util.List;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {

		boolean flag = true;

		Scanner scanner = new Scanner(System.in);

		IDepartmentService service = new DepartmentServiceImp();

		while (flag) {

			System.out.println("WELCOME TO DMS");
			System.out.println("1. ADD Department");
			System.out.println("2. UPDATE Department");
			System.out.println("3. DELETE Department");
			System.out.println("4. SELECT Department");
			System.out.println("5. SELECT ALL");
			System.out.println("0. EXIT");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:

				System.out.println("Enter Dept No.");
				int dno1 = scanner.nextInt();
				System.out.println("Enter Dept Name");
				String dname1 = scanner.next();
				System.out.println("Enter Location");
				String location1 = scanner.next();

				Department dept1 = new Department();

				dept1.setDno(dno1);
				dept1.setDname(dname1);
				dept1.setLocation(location1);

				boolean isValid = DepartmentServiceImp.dataValidation(dept1);

				if (isValid == true) {

					int count = service.addDept(dept1);

					System.out.println(count + " records inserted");
				} else {

		System.err.println("Invalid Inputs , Please Enter Correct Data");

				}

				break;
			case 2:

				System.out.println("Enter Dept No.");
				int dno2 = scanner.nextInt();
				System.out.println("Enter Dept Name");
				String dname2 = scanner.next();
				System.out.println("Enter Location");
				String location2 = scanner.next();

				Department dept2 = new Department();

				dept2.setDno(dno2);
				dept2.setDname(dname2);
				dept2.setLocation(location2);
				int count1 = service.updateDept(dept2);

				System.out.println(count1 + " records updated");

				break;
			case 3:

				System.out.println("Enter DeptNo to delete one record");

				int dno3 = scanner.nextInt();

				int count3 = service.deleteDeptByNo(dno3);

				System.out.println(count3 + " record deleted");

				if(count3 == 0) {
					
					try {
					throw new DeptNotFoundException();
					}
					catch (Exception e) {

					System.err.println("Dept Not Found , Cant delete record");
					}
				}
				
				
				break;
			case 4:

				System.out.println("Enter Dno to select record");
				int dno4 = scanner.nextInt();

				Department deptObj = service.getDeptByNo(dno4);

				System.out.println(deptObj);

					if(deptObj  == null) {
					
					try {
					throw new DeptNotFoundException();
					}
					catch (Exception e) {

	System.err.println("Dept Not Found , Can't search record");
					}
				
					}
				break;

			case 5:

				List<Department> list = service.getAll();

				for (Department department : list) {
					System.out.println(department);

				}

				break;

			case 0:

				flag = false;
				
				DBUtil.closeConncetion();
				System.out.println("Thank you visit again..");

				break;

			default:
				System.err.println("Invalid input");
				break;
			}

		}

	}

}
