<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Location</title>
</head>
<body>
<h2>Update Page...</h2>
<form action="updateLocation" method="post">
<table>
	<tr>
		<td>Id</td><td><input type="text" name="locid" value="${Locobj.locid}" readonly="readonly"></td>
	</tr>
	<tr>
		<td>Name</td><td><input type="text" name="locName" value="${Locobj.locName}"></td>
	</tr>
	<tr>
		<td>Code</td><td><input type="text" name="loccode" value="${Locobj.loccode}"></td>
	</tr>
	<tr>
		<td>Type</td><td><c:choose>
			<c:when test="${'Urban' eq Locobj.loctype}">
				<input type="radio" name="loctype" value="Urban" checked="checked" />Urban<br>
				<input type="radio" name="loctype" value="Rural" />Rural<br>
			</c:when>
			<c:otherwise>
				<input type="radio" name="loctype" value="Urban" />Urban<br>
				<input type="radio" name="loctype" value="Rural" checked="checked" />Rural<br>
			</c:otherwise>
		</c:choose></td>
	</tr>
	<tr>
		<td>Desc</td><td><textarea name="locdesc" >${Locobj.locdesc}</textarea></td>
	</tr>
	<tr>
		<td><input type="submit" value="Update"></td><td></td>
	</tr>
</table>
</form>
<h4>If you want to redirect to following pages below are the links</h4>
<a href="viewAll">To view all records</a>
<a href="regLoc">To Register Page</a>
</body>
</html>