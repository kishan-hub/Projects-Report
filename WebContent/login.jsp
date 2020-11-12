<html>
<head>
</head>
<body>
<form name="loginform" method="post" action="<%=request.getContextPath()%>/LoginServlet">
<br><br>
<table align="center"><tr><td><h2>Login Authentication</h2></td></tr></table>
<table width="300px" align="center" style="border:1px solid #000000;background-color:#efefef;">
<tr><td colspan=2></td></tr>
<tr><td colspan=2>&nbsp;</td></tr>
  <tr>
  <td><b>user Id</b></td>
  <td><input type="text" name="userid" required  placeholder="Enter your User ID" value=""></td>
  </tr>
  <tr>
  <td><b>Password</b></td>
  <td><input type="password" name="password" required placeholder="Enter your Password" value=""></td>
  </tr>
  <tr>
  <td><input type="submit" name="Submit" value="Submit"></td>
  </tr>
  <tr><td colspan=2>&nbsp;</td></tr>
</table>
 <div class="row">
 <div class="col"></div>
 <div class="col">
 <p class="login_error"><%=request.getAttribute("err") == null ? "" : (String)request.getAttribute("err") %>
 </p>
 </div>

 </div>
</form>
</body>
</html>