<%@page import="std.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div align="center">
<h1>Student Login</h1>
<form action="<%=request.getContextPath() %>/LoginCtrl" method="Post">
<table >


<tr>
<td>Student_Id</td>
<td><input type="text" name="user_id"/></td>
</tr>

<tr>
<td>Student_Password</td>
<td><input type="password" name="Password"/></td>
</tr>
</table>

<input type="submit" value="Login"/>

</form>
 <%-- Display error message if present --%>
    <if test="${not empty ErrorMessage}">
        <p style="color: red;">${ErrorMessage}</p>
    </if>

<p>Don't have an account? <a href="Registration.jsp">Register here</a></p>
</div>
</body>
</html>