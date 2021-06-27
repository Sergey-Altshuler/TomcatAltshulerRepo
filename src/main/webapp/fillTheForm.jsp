<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 26.06.2021
  Time: 18:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Fill in the form</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="style.css" type="text/css">
</head>
<body>
<a href="index.jsp" class="link"> go to start page</a>
<h1> Please, fill in the form below </h1>
<br>
<br>
<br>
<form action="quizServlet" method="POST" align="center">
    <h3>
    Your name: <br> <input required name="name" type="text" size="100px">
    <br>
    Your surname: <br> <input required name="surname" type="text" size="100px">
    <br>
    <input type="submit"  value="submit" size="150px"/>
  </h3>
</form>
</body>
</html>