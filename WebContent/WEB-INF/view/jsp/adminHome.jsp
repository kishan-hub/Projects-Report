<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>This is the Dashboard page</h1><br>
<h1>This is userid</h1>

<%
  String  username=(String)session.getAttribute("username");
out.println(username);
%>
</body>
</html>