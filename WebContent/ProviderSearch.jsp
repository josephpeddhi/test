<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Last Name Provider Search</title>
</head>
<body>
<h1>Provider Search</h1>
<form method = "post" action = "searchProvider" >
<table>
<tr>
<td><input type = "text" name = "ProvSearch" placeholder = "search by Last Name"/></td>
</tr>
<tr>
	<td><input name = "ProvSearch" placeholder = "search by Gender"></td>
</tr>
<tr>
<td><input type = "submit" name = "submit"></td>
</tr>
</table>
</form>
</body>
</html>