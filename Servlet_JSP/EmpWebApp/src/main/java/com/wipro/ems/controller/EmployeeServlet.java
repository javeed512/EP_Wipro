package com.wipro.ems.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
			service = new EmployeeServiceImp();
		
	PrintWriter out =	response.getWriter();
	
						response.setContentType("html/text");
	
						out.print("Hello");
						
				out.print("<h2>Adding Employee Data</h2>");
				
			int eid =	Integer.parseInt(request.getParameter("eid"));
			String ename =		request.getParameter("ename");
			double salary =		Double.parseDouble(request.getParameter("salary"));
				
			Employee emp = new Employee(eid,ename,salary);	
	
				try {
				
					
			int  count =		service.addEmployee(emp);
			
					if(count > 0) {
						

						out.print("<h2>Employee Added Successfully...</h2>");
						
					}
			
			
			
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
