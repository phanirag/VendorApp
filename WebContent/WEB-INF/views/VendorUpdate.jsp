<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Vendor</title>
</head>
<body>
<h2>Update Page...</h2>
<form action="updatedVendor" method="post">
<table>
	<tr>
	<td>id:</td><td><input type="text" name="vendorid" value="${venObj.vendorid}" readonly="readonly"/></td>
</tr>
<tr>
	<td>Code:</td><td><input type="text" name="vendorcode" value="${venObj.vendorcode}"/></td>
</tr>
<tr>
	<td>Name:</td><td><input type="text" name="vendorname" value="${venObj.vendorname}"/></td>
</tr>
<tr>
	<td>Type:</td><td><c:choose>
		<c:when test="${'Contract' eq venObj.vendortype}">
			<input type="radio" name="vendortype" value="Contract" checked="checked" />Contract<br>
			<input type="radio" name="vendortype" value="Full Time" />Full Time<br>
			<input type="radio" name="vendortype" value="Part Time" />Part Time<br>
		</c:when>
		<c:when test="${'Full Time' eq venObj.vendortype}">
			<input type="radio" name="vendortype" value="Contract"  />Contract<br>
			<input type="radio" name="vendortype" value="Full Time" checked="checked" />Full Time<br>
			<input type="radio" name="vendortype" value="Part Time" />Part Time<br>
		</c:when>
		<c:otherwise>
			<input type="radio" name="vendortype" value="Contract"  />Contract<br>
			<input type="radio" name="vendortype" value="Full Time"  />Full Time<br>
			<input type="radio" name="vendortype" value="Part Time" checked="checked"/>Part Time<br>
		</c:otherwise>
	</c:choose></td>
</tr>
<tr>
	<td>Address:</td><td><textarea name="vendoraddr" >${venObj.vendoraddr}</textarea></td>
</tr>
<tr>
	<td>ID Proof</td><td><select name="idtype" value="${venObj.idtype}">
		<option value="Pan">Pan</option>
		<option value="VoterID">VoterID</option>
		<option value="Other">Other</option>		
	</select>
</tr>
<tr>
	<td>id name:</td><td><input type="text" name="idname" value="${venObj.idname}"/></td>
</tr>
<tr>
	<td>Note:</td><td><textarea name="dsc" >${venObj.dsc}</textarea></td>
</tr>
		<td><input type="submit" value="Update"></td><td></td>
	</tr>
</table>
</form>
<h4>If you want to redirect to following pages below are the links</h4>
<a href="viewAllVendor">To view all records</a>
<a href="regVen">To Register Page</a>
</body>
</html>