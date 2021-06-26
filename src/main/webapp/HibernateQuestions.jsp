<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 26.06.2021
  Time: 18:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Java Quiz</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="style.css" type="text/css">
</head>
<body>
<a href="index.jsp"> go to start page</a>
<h1> Please, answer the questions </h1>
<br>
<h4> Hibernate quiz</h4>
<form action="resultTestServlet" method="POST">
    Вопрос 1.
    Аннотация @... позволяет мапить таблицы на классы
    <input name="Hibernate1" type="text">
    <br>
    Вопрос 2.
    Аннотация @.... позволяет создать связь "многие ко многим"
    <input name="Hibernate2" type="text">
    <br>
    Вопрос 3.
    Главное преимущество JPA перед Hibernate Persistence API
    <input name="Hibernate3" type="text">
    <br>
    Вопрос 4.
    Аннотация @... позволяет не прописывать геттеры и сеттеры
    <input name="Hibernate4" type="text">
    <br>
    Вопрос 5.
    Главное преимущество Hibernate Persistence API перед JPA
    <input name="Hibernate5" type="text">
    <br>

    <input type="submit" value="submit"/>

</form>
</body>
</html>