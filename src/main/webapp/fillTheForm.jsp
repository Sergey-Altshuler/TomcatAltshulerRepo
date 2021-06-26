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
<a href="index.jsp"> go to start page</a>
<h1> Please, fill in the form below </h1>
<br>
<form action="quizServlet" method="POST">
    Your name: <input name="name" type="text">
    <br>
    Your surname: <input name="surname" type="text">
    <br>
    <input type="submit"  value="submit"/>

</form>
</body>
</html>