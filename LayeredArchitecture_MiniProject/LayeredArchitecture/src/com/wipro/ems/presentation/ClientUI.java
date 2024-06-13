package com.wipro.ems.presentation;


import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;


import com.wipro.ems.entity.Employee;
import com.wipro.ems.exceptions.EmployeeNotFoundException;
import com.wipro.ems.service.EmployeeServiceImp;
import com.wipro.ems.service.IEmployeeService;

public class ClientUI {
	
	
	static	Logger log = Logger.getRootLogger();
	
					
	  
	    
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
			
		
		  log.trace("Trace Message!");
	      log.debug("Debug Message!");
	      log.info("Info Message!");
	      log.warn("Warn Message!");
	      log.error("Error Message!");
	      log.fatal("Fatal Message!");
		  
		  
		  	
		  
		IEmployeeService service = new EmployeeServiceImp();

		boolean flag = true;

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

						
						
					Employee emp = acceptInputs();

					int count = service.addEmployee(emp);

					if (count > 0) {

						System.out.println("One Employee Inserted Successfully");

					}

					break;

				case 2:

					Employee emp1 = acceptInputs();

					int count1 = service.updateEmployee(emp1);

					System.out.println(count1 + " record updated");

					if (count1 > 0) {

						System.out.println("Employee Record Updated Successfully");

					}

					break;

				case 3:

					System.out.println("Enter Eid to Delete Record");
					int deleteID = scanner.nextInt();
					int count2 = service.deleteEmployee(deleteID);
					if (count2 > 0) {

						System.out.println(deleteID + " Employee Record Deleted Successfully");

					}

					break;

				case 4:

					System.out.println("Enter Eid to fetch Record");
					int selectID = scanner.nextInt();

					Employee employee = service.getEmployeeById(selectID);

					if (employee != null) {

						System.out.println(employee);

					} else {

						try {	
						throw new EmployeeNotFoundException();
						}catch (EmployeeNotFoundException e) {

								System.err.println("Sorry! Employee Not Found "+selectID);
							
						}
					}

					break;

				case 5:

					List<Employee> list = service.getAllEmployees();

					for (Employee e1 : list) {

						System.out.println(e1);

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

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static Employee acceptInputs() {
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

		return emp;

	}

}
