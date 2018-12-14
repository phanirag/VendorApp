<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
table tr th {
	color: black;
	background-color: lime;
}
</style>
</head>
<body>
<h1>View All Records...</h1>
<table border="1">
<tr>
 <th>CustomerID</th><th>CustomerName</th><th>CustomerEmail</th><th>CustomerType</th><th>CustomerAddress</th><th>Address</th><th>Password</th><th>Token</th>
</tr>
<c:forEach items="${list}" var="l">
<tr>
<td><a href="updatecust?id=<c:out value='${l.custId}'/>"><c:out value="${l.custId}"/></a></td>
<td><c:out value="${l.custName}"/></td>
<td><c:out value="${l.custEmail}"/></td>
<td><c:out value="${l.custType}"/></td>
<td><c:out value="${l.custAddr}"/></td>
<td><c:out value="${l.password}"/></td>
<td><c:out value="${l.accToken}"/></td>
<td><a href="deletecust?id=<c:out value='${l.custId}'/>">Delete</a></td>
</tr>
</c:forEach>
</table>
<button><a href="custexeclexport">Download In Excel</a></button>
<button><a href="custpdfexport">Download In Pdf</a></button>
</body>
<a href="regCust">click here for Register Page</a>
</html>