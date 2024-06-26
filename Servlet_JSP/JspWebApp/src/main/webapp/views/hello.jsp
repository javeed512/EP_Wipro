<%@ page language="java"  import="java.util.*,java.time.*,java.io.*"   contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

hello friends  <br>

<%  

int x = 99;  

out.print("X value is : "+x);

%>


<h1>WELCOME</h1> <br>

<%

 Date date =	new Date();

	//out.print(date);
%>

JSP Expression Date: <%=  date %>
<br>

JSP Declaration:

<%!

	int eid;
	String ename;
	static    double salary;
	
		void m1(){
			
			
		}
		
		

%>
<br>

Eid: <%= eid %>





</body>
</html>