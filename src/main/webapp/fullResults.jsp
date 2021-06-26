<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.model.ReportCard" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<html>
<head>
    <title>Choose a course</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="style.css" type="text/css">
</head>
<body>
<a href="index.jsp">go to start page</a>
<h1> Result list </h1>
<table>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>surname</th>
        <th>mark</th>
        <th>review</th>
        <th>course</th>
        <th>coach</th>
    </tr>
    <c:forEach var="table" items="${table}">
        <tr>
            <td>${table.id}</td>
            <td>${table.student_name}</td>
            <td>${table.student_surname}</td>
            <td>${table.mark}</td>
            <td>${table.review}</td>
            <td>${table.course_name}</td>
            <td>${table.coachYouHaveWorked}</td>
        </tr>
    </c:forEach>
</table>
</body>

</html>