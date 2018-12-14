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
 <th>LocID</th><th>LocName</th><th>LocCode</th><th>LocType</th><th>LocDesc</th>
</tr>
<c:forEach items="${list}" var="l">
<tr>
<td><a href="update?id=<c:out value='${l.locid}'/>"><c:out value="${l.locid}"/></a></td>
<td><c:out value="${l.locName}"/></td>
<td><c:out value="${l.loccode}"/></td>
<td><c:out value="${l.loctype}"/></td>
<td><c:out value="${l.locdesc}"/></td>
<td><a href="delete?id=<c:out value='${l.locid}'/>">Delete</a></td>
</tr>
</c:forEach>
</table>
<a href="locexeclexport"> Export Execl Sheet</a>
<a href="locpdfexport">Export Pdf Sheet</a>
</body>
<a href="regLoc">click here for Register Page</a>
</html>