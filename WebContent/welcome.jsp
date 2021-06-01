<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome to My Login Appication</title>
</head>
<body>

<div id="errors">
<c:if test="${not empty authFailedError}"></c:if>

<h1 style="color:red">
<c:out value="${authFailedError}"></c:out>
</h1>

</div>


<div>
<form action = "login" method = "POST">
         User Name: <input type = "text" name = "userName">
         <br />
         password: <input type = "password" name = "password" />
         <br />
         <input type = "submit" value = "Submit" />
      </form>
</div>




</body>
</html>