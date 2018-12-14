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
 <th>ItemID</th><th>ItemName</th><th>Cost</th><th>Discount</th><th>CustomerID</th>
</tr>
<c:forEach items="${list}" var="l">
<tr>
<td><a href="updateID?id=<c:out value='${l.itemId}'/>"><c:out value="${l.itemId}"/></a></td>
<td><c:out value="${l.itemName}"/></td>
<td><c:out value="${l.itemCost}"/></td>
<td><c:out value="${l.itemDiscount}"/></td>
<td><c:out value="${l.custId}"/></td>
<td><a href="deleteItem?id=<c:out value='${l.itemId}'/>">Delete</a></td>
</tr>
</c:forEach>
</table>
<button><a href="Itemexeclexport">Download In Excel</a></button>
<button><a href="Itempdfexport">Download In Pdf</a></button>
</body>
<a href="regItem">click here for Register Page</a>
</html>