<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: VanTT
  Date: 12/20/19
  Time: 9:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Success</title>
</head>
<body>
<h1>Account: ${message}</h1>
<h1>Account: ${user.email}</h1>

<form:form commandName="user">
    Email: <form:input path="email"/>
</form:form>
</body>
</html>
