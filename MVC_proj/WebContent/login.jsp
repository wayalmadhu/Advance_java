<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

  <form action = "validate.jsp" method="post">
	<table align="center" style="background-color: gray;font-size: 25px"></table>
    UserName : <input type = "text" name = "userName"> <br> <br>
    
	Password :  <input type = "password" name = "userpass"> <br> <br>
    
     <input type = "submit" value = "Login"> &nbsp; &nbsp;
     
     <a href ="regform.jsp">Register</a>
    
  </form>

</body>
</html>