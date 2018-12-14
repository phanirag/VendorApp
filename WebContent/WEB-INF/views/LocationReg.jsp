<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Location Register Page</title>
</head>
<body>
<h1>Welcome to Location Register Page!!</h1>
<form action="insertloc" method="post">
<table>
<tr>
	<td>id:</td><td><input type="text" name="locid"/></td>
</tr>
<tr>
	<td>Name:</td><td><input type="text" name="locName"/></td>
</tr>
<tr>
	<td>Code:</td><td><input type="text" name="loccode"/></td>
</tr>
<tr>
	<td>Type:</td><td><input type="radio" name="loctype" value="Urban"/>Urban</td>
</tr>
<tr>	
	<td><td><input type="radio" name="loctype" value="Rural"/>Rural</td>
</tr>
<tr>
	<td>Desc:</td><td><textarea name="locdesc"></textarea></td>
</tr>
<tr>
	<td><input type="submit" value="submit"/></td>
</tr>
</table>
</form>
</body>
${msg}
<a href="viewAll">click here for all records</a>
</html>
