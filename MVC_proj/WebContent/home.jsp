<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 // <%@ include file="logoutform.jsp" %>
  
   <jsp:useBean id="user" class="com.dto.User" scope="page"></jsp:useBean>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>

<h1>Welcome<%=request.getParameter("name") %> </h1>


 


</body>
</html>