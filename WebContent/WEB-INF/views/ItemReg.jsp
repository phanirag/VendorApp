<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>    
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>        
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Item Register Page</title>
</head>
<body>
<h1 align="center">Welcome to Item Register Page!!</h1>
<form:form action="insertItem" method="post" modelAttribute="itemregs">
<table align="center"  border="1">
<tr>
	<td>id:</td><td><input type="text" name="itemId"/></td>
</tr>
<tr>
	<td>Name:</td><td><input type="text" name="itemName"/></td>
</tr>
<tr>
	<td>Cost:</td><td><input type="text" name="itemCost"/></td>
</tr>
<tr>
	<td>Discount:</td><td><input type="text" name="itemDiscount"/></td>
</tr>
<tr>
	<td>CustomerId:</td>
		<td>
                  <form:select path = "insertItem">
                     <form:option value = "NONE" label = "Select"/>
                     <form:options items = "${list}" />
                  </form:select>     	
 	    </td>
 </tr>
<tr>
	<td><input type="submit" value="submit"/></td>
</tr>
<tr><td>${msg}</td></tr>
<tr><td><h3><a href="viewAllItem">click here for all records</a></h3></td></tr>
</table>
</form:form>
</body>
</html>
