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
<h1>Student Details</h1><br/>
<% Student std=(Student)request.getAttribute("User_Data");
       //out.print(std);
%>
<table border="2">
<tr>
<th>Name</th>
<th>Age</th>
<th>user_id</th>
<th>Branch</th>
<th>Address</th>
<th>Mobile</th>

</tr>
  
              <tr>
              <td><%=std.getName() %></td>
              <td><%=std.getAge() %></td>
              <td><%=std.getUser_id() %></td>
              <td><%=std.getBranch() %></td>
              <td><%=std.getAddress() %></td>
              <td><%=std.getMobile() %></td>
              </tr>
              
</table>
</div>
</body>
</html>