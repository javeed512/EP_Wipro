<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Hello JSP Page</h1>

<%

Integer  amount = (Integer)	session.getAttribute("amount");

String city = (String)	application.getAttribute("city");



%>

Amount from session: <%= amount %>   <br>

City name from application: <%= city %>

Name from request obj : <%=  request.getAttribute("name") %>


</body>
</html>