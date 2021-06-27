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
    <title>Hibernate Quiz</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="style.css" type="text/css">
</head>
<body>
<a href="index.jsp" class="link"> go to start page</a>
<h1> Please, answer the questions </h1>
<br>
<br>
<br>
<h2 align="center"> Hibernate quiz</h2>
<form action="resultTestServlet" method="POST" align="center">
    <h3 align="center">
        Вопрос 1. <br> Аннотация @... позволяет мапить таблицы на классы <br>
    <input name="Hibernate1" type="text" size="50px">
    <br>
    Вопрос 2. <br>
    Аннотация @.... позволяет создать связь "многие ко многим" <br>
    <input name="Hibernate2" type="text" size="50px">
    <br>
    Вопрос 3. <br>
    Главное преимущество JPA перед Hibernate Persistence API <br>
    <input name="Hibernate3" type="text" size="50px">
    <br>
    Вопрос 4. <br>
    Аннотация @... позволяет не прописывать геттеры и сеттеры <br>
    <input name="Hibernate4" type="text" size="50px">
    <br>
    Вопрос 5. <br>
    Главное преимущество Hibernate Persistence API перед JPA <br>
    <input name="Hibernate5" type="text" size="50px">
    <br>

    <input type="submit" value="submit" size="150px"/>
    </h3>
</form>
</body>
</html>