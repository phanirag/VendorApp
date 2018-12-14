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
 <th>VendorID</th><th>VendorCode</th><th>VendorName</th><th>VendorType</th><th>VendorAddress</th><th>IDType</th><th>IDName</th><th>Description</th>
</tr>
<c:forEach items="${list}" var="l">
<tr>
<td><a href="updateven?id=<c:out value='${l.vendorid}'/>"><c:out value="${l.vendorid}"/></a></td>
<td><c:out value="${l.vendorcode}"/></td>
<td><c:out value="${l.vendorname}"/></td>
<td><c:out value="${l.vendortype}"/></td>
<td><c:out value="${l.vendoraddr}"/></td>
<td><c:out value="${l.idtype}"/></td>
<td><c:out value="${l.idname}"/></td>
<td><c:out value="${l.dsc}"/></td>
<td><a href="deleteven?id=<c:out value='${l.vendorid}'/>">Delete</a></td>
</tr>
</c:forEach>
</table>
<button><a href="Venexeclexport">Download In Excel</a></button>
<button><a href="Venpdfexport">Export Pdf Sheet</a></button>
</body>
<a href="regVen">click here for Register Page</a>
</html>