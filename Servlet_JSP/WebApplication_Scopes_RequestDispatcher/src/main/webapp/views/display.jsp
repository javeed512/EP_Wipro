<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Welcome to Display JSP</h1>


<% 

String name = (String)	request.getAttribute("name");

	//out.print(name);
	
	
	Integer amount =  (Integer)  session.getAttribute("amount");
	
	

%>

Data from FirstServlet to JSP:  <%= name %>

Data from FirstServlet in Session scope to JSP : <%= amount %>


</body>
</html>