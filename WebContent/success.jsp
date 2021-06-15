<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%

response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
%>

<c:if test="${not empty user}">

Welcome <c:out value='${sessionScope.user}'/>
<br>
<a href="/search">Search For Providers</a><br>
<a href="/search">Add a Provider</a>
<br>


<form action = "logout" method = "POST">
<input type = "submit" value = "logout" />
</form>
</c:if>

<c:if test="${ empty user}">

Please use login : 
<form action = "login" method = "POST">
         User Name: <input type = "text" name = "userName">
         <br />
         password: <input type = "password" name = "password" />
         <br />
         <input type = "submit" value = "Submit" />
      </form>

</c:if>

</body>
</html>