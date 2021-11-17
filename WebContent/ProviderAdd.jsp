<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Enter Provider Details</title>
</head>
<body>
<h1>Provider Details</h1>

<form method = "POST" action = "addProvider">
<table>
<tr>
<td>FirstName </td>
<td> <input type = "text" name = "fname"/></td>
</tr> 
<tr>
<td>LastName </td>
<td> <input type = "text" name = "lname"/></td>
</tr>
<tr>
<td>Gender </td>
<td> <input type = "text" name = "gender"/></td>
</tr>
<tr>
<td>Speciality </td>
<td> <input type = "text" name = "speciality"/></td>
</tr>
<tr>
<td>Experience </td>
<td> <input type = "text" name = "exp"/></td>
</tr>
<tr>
<td>Age </td>
<td> <input type = "text" name = "age"/></td>
</tr>
<tr>
<td>Provider Id </td>
<td> <input type = "text" name = "id"/></td>
</tr>
<tr>
<td>Dept</td>
<td> <input type = "text" name = "deptName"/></td>
</tr>

<tr>
<td><input type = "submit" value = "submit"/></td>
</table>
</form>
</body>
</html>