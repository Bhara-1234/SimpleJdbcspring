<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% List<Employee> empos =(List<Employee>) request.getAttribute("employeeList"); %>
<table>
<tr>
<th>Emp id</th>
<th>Name</th>
<th>job</th>
<th>Salary</th>
<th>Dept</th>
</tr>
<% for(Employee employee :empos ){ %>
<tr>
<td><%= employee.getEmpno() %></td>
<td><%= employee.getEmpname() %></td>
<td><%= employee.getJob() %></td>
<td><%= employee.getSal() %></td>
<td><%= employee.getDept() %></td>
</tr>
<% } %>

</table>
</body>
</html>
