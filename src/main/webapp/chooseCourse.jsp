<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 26.06.2021
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
    <head>
        <title>Choose a course</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="style.css" type="text/css">
    </head>
<body>
<a href="index.jsp">go to start page</a>
<h1> Choose course you want to complete: </h1>

<form action="coachServlet" method="POST">

<select name="course">
    <option selected value="none"> Please choose a course </option>
    <option value="Java"> Java </option>
    <option value="Hibernate"> Hibernate</option>
</select>
<br>

<input type="submit"  value="submit"/>

</form>
</body>
</html>
