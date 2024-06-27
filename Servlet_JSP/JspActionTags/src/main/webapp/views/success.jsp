<%@ page language="java" import="com.wipro.bean.Employee" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Success Page</h1>

Using Scriplet in JSP: 
<%

Employee emp = (Employee)	session.getAttribute("emp");

	out.print(emp);
%>
<br>

Emp Details from Employee JSP Page: using JPS EXP <%= session.getAttribute("emp")  %>  <br>

<%-- 
Emp Details using Jsp getProperty Action Tag: <br>
<jsp:getProperty property="eid" name="emp"/>
<jsp:getProperty property="ename" name="emp"/>
<jsp:getProperty property="salary" name="emp"/> --%>

<br>

Emp Details using EL-Expression :

${emp}  <!--   session.getAttribute("emp"); -->



</body>
</html>