<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Vendor Register Page</title>
</head>
<body>
<h1 align="center">Welcome to Vendor Register Page!!</h1>
<form action="insertven" method="post">
<table align="center" bgcolor="white" border="1">
<tr>
	<td>id:</td><td><input type="text" name="vendorid"/></td>
</tr>
<tr>
	<td>Code:</td><td><input type="text" name="vendorcode"/></td>
</tr>
<tr>
	<td>Name:</td><td><input type="text" name="vendorname"/></td>
</tr>
<tr>
	<td>Type:</td><td><input type="radio" name="vendortype" value="Contract"/>Contract</td>
</tr>
<tr>	
	<td><td><input type="radio" name="vendortype" value="Full Time"/>Full Time</td>
</tr>
<tr>	
	<td><td><input type="radio" name="vendortype" value="Part Time"/>Part Time</td>
</tr>
<tr>
	<td>Address:</td><td><textarea name="vendoraddr"></textarea></td>
</tr>
<tr>
	<td>ID Proof</td><td><select name="idtype">
		<option value="Pan">Pan</option>
		<option value="VoterID">VoterID</option>
		<option value="Other">Other</option>		
	</select>
</tr>
<tr>
	<td>id name:</td><td><input type="text" name="idname"/></td>
</tr>
<tr>
	<td>Note:</td><td><textarea name="dsc"></textarea></td>
</tr>
<tr>
	<td><input type="submit" value="submit"/></td>
</tr>
</table>
</form>
</body>
${msg}
<a href="viewAllVendor">click here for all records</a>
</html>
