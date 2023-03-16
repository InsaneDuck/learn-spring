<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: satya
  Date: 11/03/2023
  Time: 09:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h2>Custom Login Page</h2>
<form:form action="${pageContext.request.contextPath}/auth" method="POST">
    <label>Username:
        <input type="text" name="username">
    </label>
    <label>Password:
        <input type="password" name="password">
    </label>
    <input type="submit" value="Login">
</form:form>
</body>
</html>
