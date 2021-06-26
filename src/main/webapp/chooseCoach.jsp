<%@ page import="com.example.model.Coach" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.dao.DAOCoach" %>
<%@ page import="com.example.dao.DAOCoachImpl" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="com.example.service.BuildReportCard" %>
<%@ page import="com.example.util.Admin" %><%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 26.06.2021
  Time: 17:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Choose a coach</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="style.css" type="text/css">
</head>
<body>
<%! List<Coach> finalList=Admin.getCoaches();
    Coach coach1;
    Coach coach2;
    Coach coach3;

%>
<% if
(BuildReportCard.getReportCard().getCourse_name().equals("Java")) {
    coach1 = finalList.get(0);
    coach2 = finalList.get(2);
    coach3 = finalList.get(4);
}
else {
    coach1 = finalList.get(1);
    coach2 = finalList.get(3);
    coach3 = finalList.get(5);
}
%>
<a href="index.jsp">go to start page</a>
<h1> Choose coach you want to be taught: </h1>

<form action="fillTheFormServlet" method="POST">
    <select name="coach">
        <option selected value="none"> Please choose a coach </option>
        <option value=<%=coach1.getNameAndSurname()%>> <%=coach1.getNameAndSurname()%> </option>
        <option value=<%=coach2.getNameAndSurname()%>> <%=coach2.getNameAndSurname()%> </option>
        <option value=<%=coach3.getNameAndSurname()%>> <%=coach3.getNameAndSurname()%> </option>
    </select>
    <br>

    <input type="submit"  value="submit"/>

</form>
</body>
</html>
