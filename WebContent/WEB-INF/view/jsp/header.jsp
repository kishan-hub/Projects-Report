<link rel="stylesheet" href="../css/style.css"/>
 <div id="header">
 <div style="text-align: center;font-size: 35px;color: white;">Header</div>
 <div style="position: fixed; right: 10px; top:10px;color: white;">Hello <%=(String)session.getAttribute("username")%></div>
 <div style="position fixed; right: 10px; top:30px;color: white;"><a href="<%=request.getContextPath() %>/Logout">Logout</a></div>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
