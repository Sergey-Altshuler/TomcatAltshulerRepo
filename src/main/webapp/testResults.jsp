<%@ page import="com.example.service.ResultController" %><%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 26.06.2021
  Time: 18:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Your Results</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="style.css" type="text/css">
</head>
<body>
<a href="index.jsp" class="link">go to start page</a>
<h1> Your results </h1>
<br>
<br>
<br>
<a href="totalResultServlet" class="link">click here and see all results</a>
<br>
<br>
<table>
    <tr>
        <th>Task1</th>
        <th>Task2</th>
        <th>Task3</th>
        <th>Task4</th>
        <th>Task5</th>
        <th>Total Mark</th>
        <th>Review</th>
    </tr>
    <tr>
        <td>${task1}</td>
        <td>${task2}</td>
        <td>${task3}</td>
        <td>${task4}</td>
        <td>${task5}</td>
        <td>${totalMark}</td>
        <td>${review}</td>
    </tr>

</table>
</body>

</html>