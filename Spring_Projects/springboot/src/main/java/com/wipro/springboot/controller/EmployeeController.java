package com.wipro.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wipro.springboot.entity.Employee;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/employees")
public class EmployeeController { // controller or servlet
	
	
	@Autowired
	Employee emp;
	
	@RequestMapping(value =  "/hello" , method = RequestMethod.GET)
	@ResponseBody
	public String   sayHello() {
		
		
		return "Hello friends";
		
	}
	
	
	//@RequestMapping(value="/get"  , method = RequestMethod.GET)
	@GetMapping("/get")
	@ResponseBody
	public  String  getData(HttpServletRequest request,HttpSession session) {
		
		return "<h1>This is Get Data method</h1>";
		
		
	}
	
	@RequestMapping(value="/add"  , method= RequestMethod.POST)
	@ResponseBody
	public String     addData(HttpServletRequest request, HttpServletResponse response,HttpSession session) {
		
		
				int eid = Integer.parseInt(request.getParameter("eid"));
				String ename = request.getParameter("ename");
				double salary = Double.parseDouble(request.getParameter("salary"));
		
				emp.setEid(eid);
				emp.setEname(ename);
				emp.setSalary(salary);
				

		return  emp.toString();
		
	}
	
	
	@PostMapping("/display")

	public String   display(@ModelAttribute Employee emp , HttpSession session) {
		
		
		System.out.println(emp);
		
			session.setAttribute("emp", emp);
		
		return "success";
		
	}
	
	
	@PostMapping("/insert")
	@ResponseBody
	public String   inserEmp(@ModelAttribute Employee emp , HttpSession session) {
		
			// serivce.addEmp(emp);
		
		
		return "Employee added successfully..";
		
	}
	
	
	@GetMapping("/getall")

	public String  getAll( HttpSession session) {
		
		
		
			//List empList = service.getAllEmp();
		
		//session.setAttribute("empList", empList);
		
		
		return  "success";
		
	}
	
	
	

}
