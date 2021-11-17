<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Results</title>
</head>
<body>

  
       
        
        <table>
	
		<tr>
			<th>Id</th>
			<th>First name</th>
			<th>last name</th>
			
		</tr>
	 <c:forEach items="${searchVal}" var="item" varStatus="status">
		<tr>
		<td>${item.id }</td>
		<td>${item.firstName}</td>
		<td>${item.lastName}</td>
		</tr>
	  </c:forEach>
	
	</table>
  
	
</body>
</html>