package com.wipro.ems.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import com.wipro.ems.entity.Employee;
import com.wipro.ems.service.EmployeeServiceImp;
import com.wipro.ems.service.IEmployeeService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/employee")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	IEmployeeService service;

	public EmployeeServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		service = new EmployeeServiceImp();

		PrintWriter out = response.getWriter();

		response.setContentType("text/html");

		String choice = request.getParameter("action");

		switch (choice) {
		case "add": {

			int eid = Integer.parseInt(request.getParameter("eid"));
			String ename = request.getParameter("ename");
			double salary = Double.parseDouble(request.getParameter("salary"));

			Employee emp = new Employee(eid, ename, salary);

			try {

				int count = service.addEmployee(emp);

				if (count > 0) {

					out.print("<h2>Employee Added Successfully...</h2>");

				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
			break;

		case "update": {

			int eid = Integer.parseInt(request.getParameter("eid"));
			String ename = request.getParameter("ename");
			double salary = Double.parseDouble(request.getParameter("salary"));

			Employee emp = new Employee(eid, ename, salary);

			try {

				int count = service.updateEmployee(emp);

				if (count > 0) {

					out.print("<h2>Employee Updated Successfully...</h2>");

				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
			break;

		case "delete": {

			int eid = Integer.parseInt(request.getParameter("eid"));

			try {
				int count = service.deleteEmployee(eid);

				if (count > 0) {

					out.print("<h2 style='color:red'>Employee Deleted Successfully...</h2>");

				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
			break;

		case "getOne": {

			int eid = Integer.parseInt(request.getParameter("eid"));

			try {
				Employee emp = service.getEmployeeById(eid);

				if (emp != null) {

					out.print("<h2 style='color:green'>" + emp + " </h2>");

				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
			break;

		case "getAll": {

			try {
				List<Employee> list = service.getAllEmployees();
				
				out.print("<table border='1'>");
				
				for (Employee emp : list) {
					
		out.print("<tr><td>"+emp.getEid()  +"</td> <td>"+ emp.getEname()  +" </td> <td>"+ emp.getSalary() +"</td> </tr>");
					
					
				}
				
				out.print("</table>");
				
	

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
			break;

		default:

		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
