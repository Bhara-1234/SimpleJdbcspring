<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% List<Employee> employees=(List<Employee>) request.getAttribute("employeeList"); %>
<h1>hai</h1>
<h1>${size}</h1>
<table><tr><th>Emp id</th><th>Name</th><th>job</th><th>Salary</th><th>Dept</tr></table>
<c: forEach items="${employeeList}" var="item">
<tr><td>${item.getEmpno()}</td>
<td>${item.getEmpname()}</td>
<td>${ item.getJob()}</td>
<td>${item.getSal()}</td>
<td>${item.getDept()}</td>
</tr>
</c:>
</body>
</html>