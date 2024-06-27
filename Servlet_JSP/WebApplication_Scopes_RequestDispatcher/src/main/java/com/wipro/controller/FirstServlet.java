package com.wipro.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public FirstServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 PrintWriter out =   response.getWriter();
		 
		 	
		 
		 	out.print("<h1>Welcome To FirstServlet<h1>");
		 	
		 	System.out.println("Firstservlet executed and called secondservlet");
		 
		 	
		 	request.setAttribute("name", "javeed"); // value can be any data in java like string,integer,empobj ,list ,array etc
		 	
		 	
		 	HttpSession session =	request.getSession();
		 	
		 		session.setAttribute("amount", 50000);
		 		
		 
		 	ServletContext  application =	request.getServletContext();
		 	
		 			application.setAttribute("city", "Hyderabad");
		 	
		 	
		 	
		 RequestDispatcher  rd =	request.getRequestDispatcher("/SecondServlet"); // destination resource can be servlet,jsp,html
		 
		 						//rd.forward(request, response);    
		 
		 			 rd.include(request, response);
		 
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
