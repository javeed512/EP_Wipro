package com.wipro.ems.presentation;

import java.sql.SQLException;
import java.util.Scanner;

import com.wipro.ems.entity.Employee;
import com.wipro.ems.service.EmployeeServiceImp;
import com.wipro.ems.service.IEmployeeService;

public class ClientUI {

	public static void main(String[] args) {

		IEmployeeService service = new EmployeeServiceImp();

		boolean flag = true;

		Scanner scanner = new Scanner(System.in);

		try {
		
		while (flag) {

			System.out.println("1. Add Employee");
			System.out.println("2. Update Employee");
			System.out.println("3. Delete Employee By Eid");
			System.out.println("4. Get Employee By Eid");
			System.out.println("5. Get All Employees");
			System.out.println("0. Exit");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:

				System.out.println("Enter Eid");
				int eid = scanner.nextInt();
				System.out.println("Enter EName");
				String ename = scanner.next();
				System.out.println("Enter Salary");
				double salary = scanner.nextDouble();

				Employee emp = new Employee(); // pojo or domain obj
				emp.setEid(eid);
				emp.setEname(ename);
				emp.setSalary(salary);

			int count =	service.addEmployee(emp);

					if(count > 0) {
						
						System.out.println("One Employee Inserted Successfully");
						
					}
			
				break;
				
			case 0:
				flag = false;
				
				System.out.println("Thank You Visit Again");
				break;

			default:
				break;
			}

		}
		
		}
		catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
