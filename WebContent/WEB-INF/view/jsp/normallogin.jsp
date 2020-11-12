<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div  class="bgr">
  <form action="<%=request.getContextPath() %>/login">
   <div class="container">
       <div class="row">
       <div class="col" style="width: 100px:">
         <b>User Name:</b>
       </div>
       <div class="col">
       <input type="text" placeholder="Enter your Username" name="username" required>
       </div>
       </div>
   </div>
   
  </form>

</div>
</body>
</html>