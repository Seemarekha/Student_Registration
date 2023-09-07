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
<h1>Student Registration Form</h1>
<form action="<%=request.getContextPath() %>/StdCtrl" method="POST">
<table >

<tr>
<td>Student_Name</td>
<td><input type="text" name="Name"/></td>
</tr>


<tr>
<td>Student_Age</td>
<td><input type="text" name="Age"/></td>
</tr>

<tr>
<td>Student_Id</td>
<td><input type="text" name="user_id"/></td>
</tr>

<tr>
<td>Student_Password</td>
<td><input type="password" name="Password"/></td>
</tr>

<tr>
<td>Student_Branch</td>
<td><input type="text" name="Branch"/></td>
</tr>

<tr>
<td>Student_Address</td>
<td><input type="text" name="Address"/></td>
</tr>

<tr>
<td>Student_Mobile</td>
<td><input type="text" name="Mobile"/></td>
</tr>
</table>

<input type="submit" value="Submit"/>

</form>

<p>Already have an account? <a href="Login.jsp">Login here</a></p>
</div>
</body>
</html>